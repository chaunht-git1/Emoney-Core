package Controler;

import static ConnectBean.AlertCustom.duLieuKhongTimThay;
import static SystemFunc.XulydataimportDao.laysotientuchuoi;
import SystemFunc.SystemBean;
import ModelDao.BarcodeListDao;
import ModelDao.DoitacListDao;
import ModelDao.KieuhoiListDao;
import ModelDao.TableImportdataApiDao;
import ModelDao.VwDsDoitacQldsWebDao;
import ModelDao.VwTableImportdataApiMasterDao;
import ModelDao.VwdoitaccnttDao;
import LocalModel.KieuhoiList;
import LocalModel.VwDoitacCntt;
import LocalModel.TableImportdataApiModel;
import LocalModel.VwTableImportdataApiMasterModel;
import java.io.IOException;
import java.io.InputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.Part;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import SystemFunc.XulydataimportDao;
import LocalModel.Vwdsqldswebchuakhop;
import ModelDao.VwDsQldsWebchuakhopDao;
import ModelDao.VwKiemtratrungmaImportDao;
import ModelDao.VwSolieutongImportDao;
import ModelDao.VwSolieutongSauImportDao;
import ModelDao.VwsolieussqldsDao;
import LocalModel.Vwsolieussqlds;
import LocalModel.DoitacList;
import LocalModel.HienthiDulieuDocFile;
import LocalModel.VwDsDoitacQldsWeb;
import LocalModel.VwKiemtratrungmaImport;
import LocalModel.VwSolieutongImport;
import LocalModel.VwSolieutongSauImport;
import SystemFunc.FunctionGlobal;
import SystemFunc.SessionBean;
import SystemFunc.XulydataXmldoitac;
import java.math.BigDecimal;
import java.util.Date;

import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

@Named(value = "importFileManagedBean")
@SessionScoped
public class ImportFileManagedBean implements Serializable {

    public ImportFileManagedBean() throws SQLException {
        VwDsDoitacQldsWebDao dao1 = new VwDsDoitacQldsWebDao();
        vwDsDoitacQldsWebs = dao1.findAll();
    }
    private Part file;
    private TableImportdataApiModel detail;
    private List<TableImportdataApiModel> details;
    private VwTableImportdataApiMasterModel master;
    private List<VwTableImportdataApiMasterModel> masters;
    private String iddoitac;
    private List<VwDoitacCntt> dstendoitac;
    private String sophieu;
    private String iddoitackiemtra;
    private String trangthaikiemtra;
    private List<TableImportdataApiModel> detailskiemtra;
    private String maqldskiemtra;
    private List<Vwdsqldswebchuakhop> dsMaqldss = new ArrayList<>();
    private Vwdsqldswebchuakhop vwdsqldswebchuakhop = new Vwdsqldswebchuakhop();
    private List<Vwsolieussqlds> vwsolieussqldses;
    private Boolean disButtonLuu = true;
    private List<VwSolieutongImport> vwSolieutongImports;
    private VwSolieutongImport vwSolieutongImport;
    private String iddoitactimkiem;
    private String idtrangthaitimkiem;
    private String maqldstimkiem;
    private List<VwDsDoitacQldsWeb> vwDsDoitacQldsWebs = new ArrayList<>();
    private VwSolieutongSauImport vwSolieutongSauImport;
    private List<VwSolieutongSauImport> vwSolieutongSauImports;
    private List<Vwsolieussqlds> vwsolieussqldsauimport;
    private List<KieuhoiList> kieuhoiLists;
    private String keyapi;
    private String maloaifile;
    private HienthiDulieuDocFile hienthiDulieuDocFile;
    private List<HienthiDulieuDocFile> hienthiDulieuDocFiles;

    //Khai báo biến lấy giá trị chuỗi master convert
    private double usd;
    private double aud;
    private double vnd;
    private double gbp;
    private double eur;
    private double cad;
    private double shs;

    private List<VwKiemtratrungmaImport> vwKiemtratrungmaImports;
    private String shstrungma;

    public void postProcessXLS(Object document) {
        HSSFWorkbook wb = (HSSFWorkbook) document;
        HSSFSheet sheet = wb.getSheetAt(0);
        HSSFRow header = sheet.getRow(0);

        HSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setFillForegroundColor(HSSFColor.GREEN.index);
         
        for (int i = 0; i < header.getPhysicalNumberOfCells(); i++) {
            HSSFCell cell = header.getCell(i);

            cell.setCellStyle(cellStyle);
        }
    }

    public String chuyentranglaydulieuapi() {
        return "laydulieuapi" + "?faces-redirect=true";
    }

    private String getFileName(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                return cd.substring(cd.indexOf('=') + 1).trim()
                        .replace("\"", "");
            }
        }
        return null;
    }

    public void readfileexcle() throws SAXException, ParserConfigurationException, IOException {

        try {

            if (file == null) {
                SystemBean.proMessError("Dữ liệu không tồn tại");

            } else {
                // String tenfile = this.getFileName(file);
                // File fXmlFile = new File(rootpathimage + tenfile);
                // File fXmlFile = new File(file.getFilepart);

      
                InputStream fileout = file.getInputStream();
                Workbook workbook = new HSSFWorkbook(fileout);
                Sheet firstSheet = workbook.getSheetAt(0);
                Iterator<Row> iterator = firstSheet.iterator();
                String chuoiimp = "";
                Boolean dkthoat = false;
                Number soimp ;
                details = new ArrayList<>();
                //Khởi tạo class chứa dữ liệu hiển thị khi bấm nút đọc file
                hienthiDulieuDocFiles = new ArrayList<>();
                // Xu lý row .

                while (iterator.hasNext()) {
                    Row nextRow = iterator.next();
                    Iterator<Cell> cellIterator = nextRow.cellIterator();
                    detail = new TableImportdataApiModel();
                    // Xử lý Cell.
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        int sttcol = cell.getColumnIndex();
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_STRING:
                                chuoiimp = cell.getStringCellValue();
                                break;
                            case Cell.CELL_TYPE_BOOLEAN:
                                System.out.print(cell.getBooleanCellValue());
                                break;
                            case Cell.CELL_TYPE_NUMERIC:
                                soimp = cell.getNumericCellValue();
//                                chuoiimp = XulydataimportDao.laysochinhxac(soimp.toString());
                                chuoiimp = soimp.toString();
                                break;

                        }

                        detail.setSttcol(sttcol + 1);
                        switch (sttcol) {
                            case 0:
                                detail.setCot1(chuoiimp);
                                break;
                            case 1:
                                detail.setCot2(chuoiimp);
                                break;
                            case 2:
                                detail.setCot3(chuoiimp);
                                break;
                            case 3:
                                detail.setCot4(chuoiimp);
                                break;
                            case 4:
                                detail.setCot5(chuoiimp);
                                break;
                            case 5:
                                detail.setCot6(chuoiimp.toUpperCase());
                                break;
                            case 6:
                                detail.setCot7(chuoiimp.toUpperCase());
                                break;
                            case 7:
                                detail.setCot8(chuoiimp.toUpperCase());
                                break;
                            case 8:
                                detail.setCot9(chuoiimp.toUpperCase());
                                break;
                            case 9:
                                detail.setCot10(chuoiimp);
                                break;
                            case 10:
                                detail.setCot11(chuoiimp);
                                break;
                            case 11:
                                detail.setCot12(chuoiimp);
                                break;
                            case 12:
                                detail.setCot13(chuoiimp);
                                break;
                            case 13:
                                detail.setCot14(chuoiimp);
                                break;
                            case 14:
                                detail.setCot15(chuoiimp);
                                break;
                            case 15:
                                detail.setCot16(chuoiimp);
                                break;
                            case 16:
                                detail.setCot17(chuoiimp);
                                break;
                            case 17:
                                detail.setCot18(chuoiimp);
                                break;
                            case 18:
                                detail.setCot19(chuoiimp);
                                break;
                            case 19:
                                detail.setCot20(chuoiimp);
                                break;
                            case 20:
                                detail.setCot21(chuoiimp);
                                break;
                        }

                        chuoiimp = "";

                    }

                    //Viết lại phần xử lý file excel theo từng đối tác
                    switch (iddoitac) {
                        case "20091"://TA TONG HE
                            if (detail.getCot1() == null || detail.getCot1().trim().equalsIgnoreCase("")) {
                                break;
                            } else {
                                if (nextRow.getRowNum() > 2) {
                                    details.add(detail);

                                    //Đưa dữ liệu vào class hiển thị dữ liệu khi bấm nút đọc file
                                    hienthiDulieuDocFile = new HienthiDulieuDocFile();

                                    hienthiDulieuDocFile.setManguoinhan(detail.getCot2());
                                    hienthiDulieuDocFile.setHotennguoinhan(detail.getCot4());
                                    //Nếu cột P (VNĐ) có giá trị, gán loại tiền = VND,
                                    //lấy giá trị cột P làm số tiền gởi, thành tiền, gán tỷ giá =1
                                    //Ngược lại lấy cột H làm loại tiền, cột G làm số tiền gởi
                                    if (detail.getCot16() == null || detail.getCot16().isEmpty()) {
                                        hienthiDulieuDocFile.setLoaitiengoi(detail.getCot8());
                                        hienthiDulieuDocFile.setLoaitienchitra(detail.getCot8());
                                        BigDecimal sotiengoi = new BigDecimal(detail.getCot7());
                                        hienthiDulieuDocFile.setSotiengoi(sotiengoi);
                                        hienthiDulieuDocFile.setTygia(null);
                                        hienthiDulieuDocFile.setThanhtien(null);
                                    } else {
                                        hienthiDulieuDocFile.setLoaitiengoi("VND");
                                        hienthiDulieuDocFile.setLoaitienchitra("VND");
                                        BigDecimal tienVND = new BigDecimal(detail.getCot16());
                                        hienthiDulieuDocFile.setSotiengoi(tienVND);
                                        hienthiDulieuDocFile.setTygia(1);
                                        hienthiDulieuDocFile.setThanhtien(tienVND);
                                    }

                                    hienthiDulieuDocFile.setDienthoai(detail.getCot6());
                                    hienthiDulieuDocFile.setDiachi(detail.getCot5());
                                    hienthiDulieuDocFile.setChinhanh(detail.getCot17());

                                    hienthiDulieuDocFiles.add(hienthiDulieuDocFile);
                                }
                            }
                            break;
                        case "20086"://ZHONGGUO
                            if (detail.getCot1() == null || detail.getCot1().trim().equalsIgnoreCase("")) {
                                break;
                            } else {
                                if (nextRow.getRowNum() > 0) {
                                    details.add(detail);

                                    //Đưa dữ liệu vào class hiển thị dữ liệu khi bấm nút đọc file
                                    hienthiDulieuDocFile = new HienthiDulieuDocFile();

                                    hienthiDulieuDocFile.setManguoinhan(detail.getCot3());
                                    hienthiDulieuDocFile.setHotennguoinhan(detail.getCot4());
                                    String loaitiengoi = detail.getCot2().split("-")[1];
                                    hienthiDulieuDocFile.setLoaitiengoi(loaitiengoi);
                                    hienthiDulieuDocFile.setLoaitienchitra(loaitiengoi);
                                    BigDecimal sotiengoi = new BigDecimal(detail.getCot8());
                                    hienthiDulieuDocFile.setSotiengoi(sotiengoi);
                                    //Nếu tiền chi trả là VND, gán tỷ giá = 1, thành tiền = tiền gởi
                                    if (loaitiengoi.equalsIgnoreCase("VND")) {
                                        hienthiDulieuDocFile.setTygia(1);
                                        hienthiDulieuDocFile.setThanhtien(sotiengoi);
                                    } else {
                                        hienthiDulieuDocFile.setTygia(null);
                                        hienthiDulieuDocFile.setThanhtien(null);
                                    }
                                    hienthiDulieuDocFile.setDienthoai(detail.getCot6());
                                    hienthiDulieuDocFile.setDiachi(detail.getCot5());
                                    hienthiDulieuDocFile.setChinhanh(detail.getCot11());

                                    hienthiDulieuDocFiles.add(hienthiDulieuDocFile);
                                }
                            }
                            break;
                        case "11475"://RIA
                            if (detail.getCot1() == null || detail.getCot1().trim().equalsIgnoreCase("")) {
                                break;
                            } else {
                                if (nextRow.getRowNum() > 0) {
                                    details.add(detail);

                                    //Đưa dữ liệu vào class hiển thị dữ liệu khi bấm nút đọc file
                                    hienthiDulieuDocFile = new HienthiDulieuDocFile();

                                    hienthiDulieuDocFile.setManguoinhan(detail.getCot3());
                                    hienthiDulieuDocFile.setHotennguoinhan(detail.getCot7());
                                    hienthiDulieuDocFile.setLoaitiengoi(detail.getCot13());
                                    hienthiDulieuDocFile.setLoaitienchitra(detail.getCot13());
                                    BigDecimal sotiengoi = new BigDecimal(detail.getCot11());
                                    hienthiDulieuDocFile.setSotiengoi(sotiengoi);
                                    //Nếu tiền chi trả là VND, gán tỷ giá = 1, thành tiền = tiền gởi
                                    if (detail.getCot13().equalsIgnoreCase("VND")) {
                                        hienthiDulieuDocFile.setTygia(1);
                                        hienthiDulieuDocFile.setThanhtien(sotiengoi);
                                    } else {
                                        hienthiDulieuDocFile.setTygia(null);
                                        hienthiDulieuDocFile.setThanhtien(null);
                                    }
                                    hienthiDulieuDocFile.setDienthoai(detail.getCot15());
                                    hienthiDulieuDocFile.setDiachi(detail.getCot8() + " " + detail.getCot9());
                                    hienthiDulieuDocFile.setChinhanh(null);

                                    hienthiDulieuDocFiles.add(hienthiDulieuDocFile);
                                }
                            }
                            break;

                        case "85683"://SAIGON CENTRAL POST
                            if (detail.getCot1() == null || detail.getCot1().trim().equalsIgnoreCase("")) {
                                break;
                            } else {
                                if (nextRow.getRowNum() > 1) {
                                    detail.setCot1(new Date().toString());
                                    //XU LY DIA CHI
                                    detail.setCot10(detail.getCot10().toUpperCase() + " " + detail.getCot11().toUpperCase() + " " + detail.getCot12().toUpperCase());
                                    //XU LY SO DIEN THOAI
                                    String sodienthoai2 = detail.getCot14().replace("*", "");
                                    String sodienthoai1 = detail.getCot13().replace("OR", "/").replace(",", "/").replace("&", "/");
                                    if (!sodienthoai2.equalsIgnoreCase("")) {
                                        detail.setCot13(sodienthoai1 + "/" + sodienthoai2);
                                    } else {
                                        detail.setCot13(sodienthoai1);
                                    }
                                    detail.setCot14(sodienthoai2);
                                    //XU LY GHI CHU GOI
                                    String ghichugoi = detail.getCot15() + " " + detail.getCot16();
                                    detail.setCot15(ghichugoi);
                                    detail.setCot17("USD");

                                    //XU LY LAY AGENT         
                                        /*
                                     Lấy mảng chuỗi theo ký tự /, ví dụ: A/49163/S sẽ ra mảng [A,49163,S]
                                     */
                                    String[] parts = detail.getCot2().split("/");
                                    /*
                                     Lấy giá trị đầu tiên của mảng chuỗi, đó là giá trị cột Agent
                                     */
                                    detail.setCot18(parts[0]);

                                    details.add(detail);

                                    //Đưa dữ liệu vào class hiển thị dữ liệu khi bấm nút đọc file
                                    hienthiDulieuDocFile = new HienthiDulieuDocFile();

                                    hienthiDulieuDocFile.setManguoinhan(detail.getCot2());
                                    hienthiDulieuDocFile.setHotennguoinhan(detail.getCot7());
                                    hienthiDulieuDocFile.setLoaitiengoi(detail.getCot17());
                                    hienthiDulieuDocFile.setLoaitienchitra(detail.getCot17());
                                    BigDecimal sotiengoi = new BigDecimal(detail.getCot3());
                                    hienthiDulieuDocFile.setSotiengoi(sotiengoi);
                                    //Nếu tiền chi trả là VND, gán tỷ giá = 1, thành tiền = tiền gởi
                                    if (detail.getCot17().equalsIgnoreCase("VND")) {
                                        hienthiDulieuDocFile.setTygia(1);
                                        hienthiDulieuDocFile.setThanhtien(sotiengoi);
                                    } else {
                                        hienthiDulieuDocFile.setTygia(null);
                                        hienthiDulieuDocFile.setThanhtien(null);
                                    }
                                    hienthiDulieuDocFile.setDienthoai(detail.getCot13());
                                    hienthiDulieuDocFile.setDiachi(detail.getCot10());
                                    hienthiDulieuDocFile.setChinhanh(null);

                                    hienthiDulieuDocFiles.add(hienthiDulieuDocFile);
                                }
                            }
                            break;
                        case "20057"://TIN NGHIA
                            if (nextRow.getRowNum() > 0) {
                                if ((detail.getCot1() != null && detail.getCot1().trim().equalsIgnoreCase("TOTAL AMOUNT"))
                                        || detail.getCot1() == null || detail.getCot1().trim().equalsIgnoreCase("")) {
                                    break;
                                } else {
                                    details.add(detail);

                                    //Đưa dữ liệu vào class hiển thị dữ liệu khi bấm nút đọc file
                                    hienthiDulieuDocFile = new HienthiDulieuDocFile();

                                    hienthiDulieuDocFile.setManguoinhan(detail.getCot2());
                                    hienthiDulieuDocFile.setHotennguoinhan(detail.getCot4());
                                    hienthiDulieuDocFile.setLoaitiengoi("USD");
                                    String loaitienchitra = detail.getCot6().replaceAll("[^a-zA-Z]", "");
                                    hienthiDulieuDocFile.setLoaitienchitra(loaitienchitra);
                                    float laysotien = laysotientuchuoi(detail.getCot6());
                                    BigDecimal sotiengoi = new BigDecimal(laysotien);
                                    hienthiDulieuDocFile.setSotiengoi(sotiengoi);
                                    //Nếu tiền chi trả là VND, gán tỷ giá = 1, thành tiền = tiền gởi
                                    if (loaitienchitra.equalsIgnoreCase("VND")) {
                                        hienthiDulieuDocFile.setTygia(1);
                                        hienthiDulieuDocFile.setThanhtien(sotiengoi);
                                    } else {
                                        hienthiDulieuDocFile.setTygia(null);
                                        hienthiDulieuDocFile.setThanhtien(null);
                                    }
                                    hienthiDulieuDocFile.setDienthoai(detail.getCot7());
                                    hienthiDulieuDocFile.setDiachi(detail.getCot5());
                                    hienthiDulieuDocFile.setChinhanh(null);

                                    hienthiDulieuDocFiles.add(hienthiDulieuDocFile);
                                }
                            }
                            break;
                        case "03624"://MONEY POLO
                            if (nextRow.getRowNum() >= 0) {
                                if (detail.getCot1() == null || detail.getCot1().trim().equalsIgnoreCase("") || detail.getCot1().toUpperCase().contains("TỔNG")) {
                                    break;
                                } else {
                                    details.add(detail);

                                    //Đưa dữ liệu vào class hiển thị dữ liệu khi bấm nút đọc file
                                    hienthiDulieuDocFile = new HienthiDulieuDocFile();

                                    hienthiDulieuDocFile.setManguoinhan(detail.getCot1());
                                    hienthiDulieuDocFile.setHotennguoinhan(detail.getCot3());
                                    hienthiDulieuDocFile.setLoaitiengoi(detail.getCot6());
                                    hienthiDulieuDocFile.setLoaitienchitra(detail.getCot6());
                                    BigDecimal sotiengoi;
                                    try {
                                        sotiengoi = new BigDecimal(detail.getCot4());
                                    } catch (Exception e) {
                                        sotiengoi = new BigDecimal(detail.getCot5());
                                    }
                                    hienthiDulieuDocFile.setSotiengoi(sotiengoi);
                                    //Nếu tiền chi trả là VND, gán tỷ giá = 1, thành tiền = tiền gởi
                                    if (detail.getCot6().equalsIgnoreCase("VND")) {
                                        hienthiDulieuDocFile.setTygia(1);
                                        hienthiDulieuDocFile.setThanhtien(sotiengoi);
                                    } else {
                                        hienthiDulieuDocFile.setTygia(null);
                                        hienthiDulieuDocFile.setThanhtien(null);
                                    }
                                    hienthiDulieuDocFile.setDienthoai(detail.getCot8());
                                    hienthiDulieuDocFile.setDiachi(detail.getCot9());
                                    hienthiDulieuDocFile.setChinhanh(null);

                                    hienthiDulieuDocFiles.add(hienthiDulieuDocFile);
                                }
                            }
                            break;
                        default://Các đối tác sử dụng chung mẫu import
                            if (nextRow.getRowNum() > 1) {
                                if (detail.getCot1() == null || detail.getCot1().trim().equalsIgnoreCase("")
                                        || detail.getCot1().trim().equalsIgnoreCase("Total Amount")) {
                                    break;
                                } else {
                                    details.add(detail);

                                    //Đưa dữ liệu vào class hiển thị dữ liệu khi bấm nút đọc file
                                    hienthiDulieuDocFile = new HienthiDulieuDocFile();

                                    hienthiDulieuDocFile.setManguoinhan(detail.getCot1());
                                    hienthiDulieuDocFile.setHotennguoinhan(detail.getCot3());
                                    hienthiDulieuDocFile.setLoaitiengoi(detail.getCot8());
                                    hienthiDulieuDocFile.setLoaitienchitra(detail.getCot8());
                                    BigDecimal sotiengoi = new BigDecimal(detail.getCot6());
                                    hienthiDulieuDocFile.setSotiengoi(sotiengoi);
                                    //Nếu tiền chi trả là VND, gán tỷ giá = 1, thành tiền = tiền gởi
                                    if (detail.getCot8().equalsIgnoreCase("VND")) {
                                        hienthiDulieuDocFile.setTygia(1);
                                        hienthiDulieuDocFile.setThanhtien(sotiengoi);
                                    } else {
                                        hienthiDulieuDocFile.setTygia(null);
                                        hienthiDulieuDocFile.setThanhtien(null);
                                    }
                                    hienthiDulieuDocFile.setDienthoai(detail.getCot10());
                                    hienthiDulieuDocFile.setDiachi(detail.getCot4());
                                    hienthiDulieuDocFile.setChinhanh(detail.getCot15());

                                    hienthiDulieuDocFiles.add(hienthiDulieuDocFile);
                                }
                            }
                            break;
                    }

                    System.out.println(chuoiimp);
                }

                workbook.close();
                fileout.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readfilexml() throws SAXException, ParserConfigurationException, IOException {
 
        
        
        try {

            if (file == null) {
                SystemBean.proMessError("Dữ liệu không tồn tại");

            } else {

                InputStream fileout = file.getInputStream();
                //khởi tạo danh sách chứa dữ liệu hiển thị khi bấm nút đọc file
                hienthiDulieuDocFiles = new ArrayList<>();
                XulydataimportDao dao=new XulydataimportDao();
                details = XulydataXmldoitac.xulydataMoneygramTong(fileout);
                hienthiDulieuDocFiles = XulydataXmldoitac.getHienthiDulieuDocFiles();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Hàm đọc file xml
//    public void readfilexml() throws SAXException, ParserConfigurationException, IOException {
// 
//
//        try {
//
//            if (file == null) {
//                SystemBean.proMessError("Dữ liệu không tồn tại");
//
//            } else {
//               // String tenfile = this.getFileName(file);
//               // File fXmlFile = new File(rootpathimage + tenfile);
//               // File fXmlFile = new File(file.getFilepart);
//                
//                String madaily = null;
//                String transmitDateTime =null ;
//                String batchSequence =null ;
//                
//                InputStream fileout=file.getInputStream();
//                
//                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//                Document doc = dBuilder.parse(fileout);
//
//                doc.getDocumentElement().normalize();
//
//                NodeList nList = doc.getElementsByTagName("tns:moneyTransferRequest");
//
//                NodeList nListHeader = doc.getElementsByTagName("tns:batchHeader");
//                
//                if(nListHeader.getLength()>0){
//                    
//                    Node nNode = nListHeader.item(0);
//                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                        
//                        Element eElement = (Element) nNode;
//                        madaily= eElement.getElementsByTagName("tns:agentGroupId").item(0).getTextContent();
//                        transmitDateTime =eElement.getElementsByTagName("tns:transmitDateTime").item(0).getTextContent();
//                        batchSequence =eElement.getElementsByTagName("tns:batchSequence").item(0).getTextContent();
//                    }
//                    
//                    
//                    
//                    
//                }
//                
//                details = new ArrayList<>();
//                
//
//                for (int i = 0; i < nList.getLength(); i++) {
//                    detail = new TableImportdataApiModel();
//                    Node nNode = nList.item(i);
// 
//                     detail=XulydataXmldoitac.xulydataMoneygram(i, nNode, madaily, transmitDateTime, batchSequence);
//                     details.add(detail);
//                    }
//                }
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public String importfile() {
        details = null;
        masters = null;
        return "importfile" + "?faces-redirect=true";
    }

    //Hàm lưu dữ liệu của file xml vào bảng tạm TABLE_IMPORTDATA_API
    public String luudulieuvaobangtam() {
        
        String a=null;
        if (iddoitac == null || iddoitac.equalsIgnoreCase("")) {
            SystemBean.proMessError("Vui lòng chọn đối tác trước khi lưu file");
            return null;
        } else {
            if (details == null || details.size() == 0) {
                SystemBean.proMessError("File không có dữ liệu, vui lòng kiểm tra lại");
                return null;
            } else {
                //Lấy số phiếu
                TableImportdataApiDao dao = new TableImportdataApiDao();
                sophieu = dao.laysophieu();
//        sophieu = "1234567890";

                //Lưu dữ liệu file  vào bảng tạm:
                List<KieuhoiList> kieuhoiLists = new ArrayList<>();
                switch (iddoitac) {
                    case "20091"://TA TONG HE
                        kieuhoiLists = XulydataimportDao.xulydataTatonghe(details, sophieu);
                        break;
                    case "20086"://ZHONGGUO
                        kieuhoiLists = XulydataimportDao.xulydataZhongguo(details, sophieu);
                        break;
                    case "42689"://MONEY GRAM
                        kieuhoiLists = XulydataimportDao.xulydataMoneygram(details, sophieu);
                        break;
                    case "11475"://RIA
                        kieuhoiLists = XulydataimportDao.xulydataRia(details, sophieu);
                        break;
                    case "85683"://SAIGON CENTRAL POST
                        kieuhoiLists = XulydataimportDao.xulydataSaigonCentralPost(details, sophieu);
                        break;
                    case "20057"://TINNGHIA
                        kieuhoiLists = XulydataimportDao.xulydataTinnghia(details, sophieu);
                        break;
                    case "03624"://MONEY POLO
                        kieuhoiLists = XulydataimportDao.xulydataMoneyPolo(details, sophieu);
                        break;
                    default://Đối tác sử dụng chung file import
                        kieuhoiLists = XulydataimportDao.xulyDoitacChung(details, sophieu);
                        break;

                }

                //2. Lưu dữ liệu trong class KieuhoiList vào bảng Detail
                String kqinsert = null;
                String userid = SessionBean.getUserId();
                for (int i = 0; i < kieuhoiLists.size(); i++) {
                    kqinsert = dao.insertDataDetail(kieuhoiLists.get(i), iddoitac, sophieu, kieuhoiLists.size(), userid);
                }

                // Insert barcode
                BarcodeListDao dao1 = new BarcodeListDao();
                dao1.insertbarcode(iddoitac, sophieu, userid, kieuhoiLists);

                //Xu ly du lieu sau khi import vao bang tam
                Boolean b1 = dao.xulydulieusauimportbangtam(sophieu, iddoitac);

                //3. Cập nhật dữ liệu bảng Master 
                // String kqupdate = null;
                //  VwTableImportdataApiMasterDao dao1 = new VwTableImportdataApiMasterDao();
                // kqupdate = dao1.updateDataMaster(sophieu);
                return "quanlyimportdulieu" + "?faces-redirect=true";
            }
        }
    }

    public List<VwDoitacCntt> dstendoitac() throws SQLException {

        VwdoitaccnttDao dmDa = new VwdoitaccnttDao();
        List<VwDoitacCntt> dstendt = new ArrayList<>();
        dstendt = dmDa.findAll();

        return dstendt;
    }

    public void hienthongtinMaster() throws SQLException {
        masters = new ArrayList<>();
        VwTableImportdataApiMasterDao dao = new VwTableImportdataApiMasterDao();
        masters = dao.showAll();
      //  idtrangthaitimkiem="O";
       // this.masters = dao.findOneParam("STATUS", idtrangthaitimkiem);
        VwDsDoitacQldsWebDao dao1 = new VwDsDoitacQldsWebDao();
       // vwDsDoitacQldsWebs = dao1.findAll();
    }

    public String kiemtraMaster() throws SQLException {
        iddoitackiemtra = master.getIddoitac();

        //Lấy mã loại file,keyapi,catchuoi để kiểm tra xử lý cắt chuỗi import api
        maloaifile = master.getMaloaifile();
        keyapi = master.getKeyapi();
        String catchuoi = master.getCatchuoi();
        String idcode = master.getIdcode();
        String madoitac = master.getIddoitac();

        //Hiển thị mã quản lý danh sách chưa được duyệt
        VwDsQldsWebchuakhopDao dsQldsWebchuakhopDao = new VwDsQldsWebchuakhopDao();
        dsMaqldss = dsQldsWebchuakhopDao.findAll();
        this.laydanhsachmaster();
        //Thuc hien cat chuoi dataimport neu loai file la API
        /*if (maloaifile.equalsIgnoreCase("001063")) {
         //Nếu catchuoi = N, tiến hành cắt chuỗi và gán lại catchuoi = Y
         if (catchuoi.equalsIgnoreCase("N")) {
         TableImportdataApiDao dao = new TableImportdataApiDao();
         VwTableImportdataApiMasterDao dao1 = new VwTableImportdataApiMasterDao();
         String kqxuly = null;
         for (int i = 0; i < detailskiemtra.size(); i++) {
         kqxuly = dao.xulychuoidataimportapi(detailskiemtra.get(i).getDataimport(), keyapi, master.getIdcode(), i + 1);
         }
         //gán lại catchuoi = Y
         kqxuly = dao1.gantrangthaicatchuoiapimaster(keyapi, madoitac, idcode, "Y");
         //lay va hien thi lai du lieu cho list detailskiemtra sau khi cat chuoi
         this.laydanhsachmaster();
         }
         }*/
        sophieu = master.getIdcode();
        vwSolieutongImports = new ArrayList<>();
        vwSolieutongImport = new VwSolieutongImport();
        //hàm lấy vwSolieutongImports theo số phiếu
        this.laysolieutongimport(sophieu);
        try {
            if (!vwSolieutongImports.isEmpty()) {
                vwSolieutongImport = vwSolieutongImports.get(0);
            }
        } catch (Exception e) {
            vwSolieutongImports = null;
        }

        //Xử lý chuỗi sang kiểu số để sử dụng được f:convertNumber
        usd = Double.valueOf(master.getUsd());
        aud = Double.valueOf(master.getAud());
        vnd = Double.valueOf(master.getVnd());
        gbp = Double.valueOf(master.getGbp());
        eur = Double.valueOf(master.getEur());
        cad = Double.valueOf(master.getCad());
        shs = Double.valueOf(master.getShs());

        //làm mới dữ liệu của bảng so sánh
        vwsolieussqldses = new ArrayList<>();
        //gán lại thanh trạng thái
        this.trangthaikiemtra = "";
        this.shstrungma = "";
        iddoitackiemtra = master.getIddoitac();
        return "kiemtradulieuimport" + "?faces-redirect=true";

    }

    public void sosanhdulieu() throws SQLException {
        //Kiểm tra đợt hồ sơ vừa import có trùng mã với bảng KIEUHOI_LIST
        VwKiemtratrungmaImportDao dao1 = new VwKiemtratrungmaImportDao();
        vwKiemtratrungmaImports = dao1.timtheodieukien(master.getIdcode(), master.getIddoitac());
        //Nếu danh sách vwKiemtratrungmaImports có dữ liệu (size > 0)
        //thì thông báo số hồ sơ trùng mã
        //ngược lại tiếp tục kiểm tra mã quản lý danh sách
        if (vwKiemtratrungmaImports.size() > 0) {
            shstrungma = "" + vwKiemtratrungmaImports.size();
        } else {
            shstrungma = "" + vwKiemtratrungmaImports.size();

            if (maqldskiemtra == null || maqldskiemtra.equalsIgnoreCase("")) {
                SystemBean.proMessError("Vui lòng chọn mã Quản lý danh sách");
            } else {

//        PKS_PRINT_REPORT.FUN_SOLIEU_SSQLDS_CHUAKHOP(USEID VARCHAR2,MAQLDS VARCHAR2,SPHIEU VARCHAR2)
                FunctionGlobal functionGlobal = new FunctionGlobal();
                String ketqua = null;
                String userid = SessionBean.getUserId();

                //Thêm dữ liệu vào bảng KH.PRINT_TEMP      
                if (maloaifile.equalsIgnoreCase("001063")) {
                    //Nếu loại file là API - 001063, gọi biến keyapi vào hàm solieusosanhqldschuakhop
                    ketqua = functionGlobal.solieusosanhqldschuakhop(userid, maqldskiemtra, keyapi);
                } else {
                    //Nếu loại file là file - 002063, gọi biến sophieu vào hàm solieusosanhqldschuakhop
                    ketqua = functionGlobal.solieusosanhqldschuakhop(userid, maqldskiemtra, sophieu);
                }
                if (ketqua.equalsIgnoreCase("T")) {

                    //Hiển thị dữ liệu so sánh theo mã QLDS
                    VwsolieussqldsDao dao = new VwsolieussqldsDao();
                    vwsolieussqldses = dao.findTwoParaString("MA_QLDS", maqldskiemtra, "USERID", userid);

                    //Thông báo trạng thái hồ sơ
                    String ketquathongbao = null;
//        sophieu = "16081842689016";
                    ketquathongbao = functionGlobal.kiemtrakhopsolieuchuaimport(maqldskiemtra, userid);
                    if (ketquathongbao.equalsIgnoreCase("T")) {
                        trangthaikiemtra = "Khớp số liệu";
                        this.disButtonLuu = false;
                    } else {
                        trangthaikiemtra = "Không khớp số liệu";
                        this.disButtonLuu = true;
                    }

                    //Hiển thị lại thanh trạng thái
                    //hàm lấy vwSolieutongImports theo số phiếu
                    this.laysolieutongimport(sophieu);
                    if (vwSolieutongImports != null) {
                        vwSolieutongImport = vwSolieutongImports.get(0);
                    }
                } else {
                    SystemBean.proMessError(duLieuKhongTimThay);
                }
            }

        }
    }

    public String quanlyimportdulieu() {
        //Ẩn nút Lưu và Hủy trước khi trở về trang quản lý
        this.disButtonLuu = true;
        return "quanlyimportdulieu" + "?faces-redirect=true";
    }

    public String insertDataKieuhoiList() throws SQLException {

        String userid = null;
        String idchinhanh = null;
        userid = SessionBean.getUserId();
        idchinhanh = SessionBean.getChinhanhId();
        TableImportdataApiDao dao = new TableImportdataApiDao();
        String kq = null;
        String sp = this.master.getIdcode();
        String doitac = this.master.getIddoitac();
        //Nếu loại file là api(001063, lấy keyapi truyền vào biến khi gọi hàm insertDataKieuhoiList
        //Tạo barcode cho loại api
        if (maloaifile.equalsIgnoreCase("001063")) {
            kq = dao.insertDataKieuhoiList(userid, keyapi, idchinhanh, maqldskiemtra, iddoitackiemtra, maloaifile);
            //tạo barcode api
            //lay danh sach kieuhoiLists theo sophieu
            laysolieuchitietsauimport(sp);
            //Tao barcode
            BarcodeListDao dao1 = new BarcodeListDao();
            dao1.insertbarcode(doitac, sp, userid, kieuhoiLists);
        } else {
            kq = dao.insertDataKieuhoiList(userid, this.master.getIdcode(), idchinhanh, maqldskiemtra, iddoitackiemtra, this.master.getMaloaifile());
        }
        if (kq.equalsIgnoreCase("T")) {

            // TAO BARCODE 
            //Ẩn nút Lưu và Hủy trước khi trở về trang quản lý
            this.disButtonLuu = true;
            //Load lại dữ liệu trang quanlyimportdulieu
            this.hienthongtinMaster();
            return "quanlyimportdulieu" + "?faces-redirect=true";
        } else {
            return null;
        }
    }

    public String huydotimport() throws SQLException {
        String ketqua = null;
        FunctionGlobal functionGlobal = new FunctionGlobal();

        ketqua = functionGlobal.huydotimport(sophieu);
        if (ketqua.equalsIgnoreCase("T")) {
            //Load lại dữ liệu trang quanlyimportdulieu
            this.hienthongtinMaster();
            //Ẩn nút Lưu và Hủy trước khi trở về trang quản lý
            this.disButtonLuu = true;
            return "quanlyimportdulieu" + "?faces-redirect=true";
        } else {
            SystemBean.proMessError(duLieuKhongTimThay);
            return null;
        }
    }

    public void laysolieutongimport(String sophieu) {
        VwSolieutongImportDao dao = new VwSolieutongImportDao();
        this.vwSolieutongImports = dao.findOneParam("SOPHIEU", sophieu);
    }

    public void timmastertheomadoitac() {
        VwTableImportdataApiMasterDao dao = new VwTableImportdataApiMasterDao();
        if (iddoitactimkiem == null || iddoitactimkiem.equalsIgnoreCase("")) {
            SystemBean.proMessError("Vui lòng chọn đối tác trước khi tìm kiếm");
        } else {
            this.masters = dao.findOneParam("ID_DOITAC", iddoitactimkiem);
            if (masters.size() > 0) {
                SystemBean.proMessage("Tìm thấy " + masters.size() + " kết quả");
            } else {
                SystemBean.proMessError("Không tìm thấy kết quả");
            }
        }
    }

    public void timmastertheomatrangthai() {
        VwTableImportdataApiMasterDao dao = new VwTableImportdataApiMasterDao();
        
        if (idtrangthaitimkiem == null || idtrangthaitimkiem.equalsIgnoreCase("")) {
            SystemBean.proMessError("Vui lòng chọn trạng thái trước khi tìm kiếm");
        } else {
            this.masters = dao.findOneParam("STATUS", idtrangthaitimkiem);
            if (masters.size() > 0) {
                SystemBean.proMessage("Tìm thấy " + masters.size() + " kết quả");
            } else {
                SystemBean.proMessError("Không tìm thấy kết quả");
            }
        }
    }
    
        public void timmastertheomatrangthai2(String trangthai) {
        VwTableImportdataApiMasterDao dao = new VwTableImportdataApiMasterDao();
        
        if (trangthai == null || trangthai.equalsIgnoreCase("")) {
            SystemBean.proMessError("Vui lòng chọn trạng thái trước khi tìm kiếm");
        } else {
            this.masters = dao.findOneParam("STATUS", trangthai);
            if (masters.size() > 0) {
                SystemBean.proMessage("Tìm thấy " + masters.size() + " kết quả");
            } else {
                SystemBean.proMessError("Không tìm thấy kết quả");
            }
        }
    }

    public void timmastertheomaqlds() {
        VwTableImportdataApiMasterDao dao = new VwTableImportdataApiMasterDao();
        if (idtrangthaitimkiem == null || idtrangthaitimkiem.equalsIgnoreCase("")) {
            SystemBean.proMessError("Vui lòng chọn mã QLDS trước khi tìm kiếm");
        } else {
            this.masters = dao.findOneParam("STATUS", idtrangthaitimkiem);
            if (masters.size() > 0) {
                SystemBean.proMessage("Tìm thấy " + masters.size() + " kết quả");
            } else {
                SystemBean.proMessError("Không tìm thấy kết quả");
            }
        }
    }

    public String chitietdulieusauimport() throws SQLException {
        vwSolieutongSauImport = new VwSolieutongSauImport();
        vwSolieutongSauImports = new ArrayList<>();
//        sophieu = master.getKeyapi();
        sophieu = master.getIdcode();
        maqldskiemtra = this.master.getMaqlds();
        iddoitackiemtra = this.master.getIddoitac();
        //Lấy dữ liệu cho thanh trạng thái
        this.laysolieutongsauimport(sophieu);
        if (vwSolieutongSauImports != null) {
            vwSolieutongSauImport = vwSolieutongSauImports.get(0);
        }

        //Lấy dữ liệu cho bảng chi tiết
        this.laysolieuchitietsauimport(sophieu);
        //Lấy dữ liệu cho bảng kiểm tra
        String kq = null;
        String userid = SessionBean.getUserId();
        FunctionGlobal global = new FunctionGlobal();
        //a. Thêm dữ liệu vào bảng PRINT_TEMP
        kq = global.solieusosanhqldssauimport(userid, maqldskiemtra, sophieu);
        //b. Lấy dữ liệu cho bảng kiểm tra
        VwsolieussqldsDao dao = new VwsolieussqldsDao();
        vwsolieussqldsauimport = dao.findTwoParaString("MA_QLDS", maqldskiemtra, "USERID", userid);
        return "chitietdulieusauimport" + "?faces-redirect=true";
    }

    public void laysolieutongsauimport(String sophieu) {
        VwSolieutongSauImportDao dao = new VwSolieutongSauImportDao();
        this.vwSolieutongSauImports = dao.findOneParam("SOPHIEU", sophieu);
    }

    public void laysolieuchitietsauimport(String sophieu) throws SQLException {
        KieuhoiListDao dao = new KieuhoiListDao();
        kieuhoiLists = new ArrayList<>();
        kieuhoiLists = dao.findOneParaString("SOPHIEU", sophieu);
    }

    public void laydanhsachmaster() {
        detailskiemtra = new ArrayList<>();
        TableImportdataApiDao dao = new TableImportdataApiDao();
        detailskiemtra = dao.findOneParam("COT_1", "'" + master.getIdcode() + "'");
    }

    public void laytheoloaitienmat() {
        detailskiemtra = new ArrayList<>();
        TableImportdataApiDao dao = new TableImportdataApiDao();
        detailskiemtra = dao.findTwoParam("COT_23", "'TM'", "COT_1", "'" + master.getIdcode() + "'");
    }

    public void laytheoloaichuyenkhoan() {
        detailskiemtra = new ArrayList<>();
        TableImportdataApiDao dao = new TableImportdataApiDao();
        detailskiemtra = dao.findTwoParam("COT_23", "'CK'", "COT_1", "'" + master.getIdcode() + "'");
    }

    public void laytheohosotainha() {
        detailskiemtra = new ArrayList<>();
        TableImportdataApiDao dao = new TableImportdataApiDao();
        detailskiemtra = dao.findTwoParam("COT_3", "'TN'", "COT_1", "'" + master.getIdcode() + "'");
    }

    public void laytheohosotaiquay() {
        detailskiemtra = new ArrayList<>();
        TableImportdataApiDao dao = new TableImportdataApiDao();
        detailskiemtra = dao.findTwoParam("COT_3", "'TQ'", "COT_1", "'" + master.getIdcode() + "'");
    }

    public List<DoitacList> dsdoitacimport() throws SQLException {

        DoitacListDao dao = new DoitacListDao();
        List<DoitacList> dsdoitac = new ArrayList<>();
        dsdoitac = dao.getdoitacimportweb();

        return dsdoitac;
    }

    // get/set
    public HienthiDulieuDocFile getHienthiDulieuDocFile() {
        return hienthiDulieuDocFile;
    }

    public void setHienthiDulieuDocFile(HienthiDulieuDocFile hienthiDulieuDocFile) {
        this.hienthiDulieuDocFile = hienthiDulieuDocFile;
    }

    public List<HienthiDulieuDocFile> getHienthiDulieuDocFiles() {
        return hienthiDulieuDocFiles;
    }

    public void setHienthiDulieuDocFiles(List<HienthiDulieuDocFile> hienthiDulieuDocFiles) {
        this.hienthiDulieuDocFiles = hienthiDulieuDocFiles;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getAud() {
        return aud;
    }

    public void setAud(double aud) {
        this.aud = aud;
    }

    public double getVnd() {
        return vnd;
    }

    public void setVnd(double vnd) {
        this.vnd = vnd;
    }

    public double getGbp() {
        return gbp;
    }

    public void setGbp(double gbp) {
        this.gbp = gbp;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    public double getCad() {
        return cad;
    }

    public void setCad(double cad) {
        this.cad = cad;
    }

    public double getShs() {
        return shs;
    }

    public void setShs(double shs) {
        this.shs = shs;
    }

    public List<VwKiemtratrungmaImport> getVwKiemtratrungmaImports() {
        return vwKiemtratrungmaImports;
    }

    public void setVwKiemtratrungmaImports(List<VwKiemtratrungmaImport> vwKiemtratrungmaImports) {
        this.vwKiemtratrungmaImports = vwKiemtratrungmaImports;
    }

    public String getShstrungma() {
        return shstrungma;
    }

    public void setShstrungma(String shstrungma) {
        this.shstrungma = shstrungma;
    }

    public String getKeyapi() {
        return keyapi;
    }

    public void setKeyapi(String keyapi) {
        this.keyapi = keyapi;
    }

    public String getMaloaifile() {
        return maloaifile;
    }

    public void setMaloaifile(String maloaifile) {
        this.maloaifile = maloaifile;
    }

    public List<KieuhoiList> getKieuhoiLists() {
        return kieuhoiLists;
    }

    public void setKieuhoiLists(List<KieuhoiList> kieuhoiLists) {
        this.kieuhoiLists = kieuhoiLists;
    }

    public List<Vwsolieussqlds> getVwsolieussqldsauimport() {
        return vwsolieussqldsauimport;
    }

    public void setVwsolieussqldsauimport(List<Vwsolieussqlds> vwsolieussqldsauimport) {
        this.vwsolieussqldsauimport = vwsolieussqldsauimport;
    }

    public VwSolieutongSauImport getVwSolieutongSauImport() {
        return vwSolieutongSauImport;
    }

    public void setVwSolieutongSauImport(VwSolieutongSauImport vwSolieutongSauImport) {
        this.vwSolieutongSauImport = vwSolieutongSauImport;
    }

    public List<VwSolieutongSauImport> getVwSolieutongSauImports() {
        return vwSolieutongSauImports;
    }

    public void setVwSolieutongSauImports(List<VwSolieutongSauImport> vwSolieutongSauImports) {
        this.vwSolieutongSauImports = vwSolieutongSauImports;
    }

    public List<VwDsDoitacQldsWeb> getVwDsDoitacQldsWebs() {
        return vwDsDoitacQldsWebs;
    }

    public void setVwDsDoitacQldsWebs(List<VwDsDoitacQldsWeb> vwDsDoitacQldsWebs) {
        this.vwDsDoitacQldsWebs = vwDsDoitacQldsWebs;
    }

    public String getMaqldstimkiem() {
        return maqldstimkiem;
    }

    public void setMaqldstimkiem(String maqldstimkiem) {
        this.maqldstimkiem = maqldstimkiem;
    }

    public String getIdtrangthaitimkiem() {
        return idtrangthaitimkiem;
    }

    public void setIdtrangthaitimkiem(String idtrangthaitimkiem) {
        this.idtrangthaitimkiem = idtrangthaitimkiem;
    }

    public String getIddoitactimkiem() {
        return iddoitactimkiem;
    }

    public void setIddoitactimkiem(String iddoitactimkiem) {
        this.iddoitactimkiem = iddoitactimkiem;
    }

    public VwSolieutongImport getVwSolieutongImport() {
        return vwSolieutongImport;
    }

    public void setVwSolieutongImport(VwSolieutongImport vwSolieutongImport) {
        this.vwSolieutongImport = vwSolieutongImport;
    }

    public List<VwSolieutongImport> getVwSolieutongImports() {
        return vwSolieutongImports;
    }

    public void setVwSolieutongImports(List<VwSolieutongImport> vwSolieutongImports) {
        this.vwSolieutongImports = vwSolieutongImports;
    }

    public Boolean getDisButtonLuu() {
        return disButtonLuu;
    }

    public void setDisButtonLuu(Boolean disButtonLuu) {
        this.disButtonLuu = disButtonLuu;
    }

    public List<Vwsolieussqlds> getVwsolieussqldses() {
        return vwsolieussqldses;
    }

    public void setVwsolieussqldses(List<Vwsolieussqlds> vwsolieussqldses) {
        this.vwsolieussqldses = vwsolieussqldses;
    }

    public Vwdsqldswebchuakhop getVwdsqldswebchuakhop() {
        return vwdsqldswebchuakhop;
    }

    public void setVwdsqldswebchuakhop(Vwdsqldswebchuakhop vwdsqldswebchuakhop) {
        this.vwdsqldswebchuakhop = vwdsqldswebchuakhop;
    }

    public List<Vwdsqldswebchuakhop> getDsMaqldss() {
        return dsMaqldss;
    }

    public void setDsMaqldss(List<Vwdsqldswebchuakhop> dsMaqldss) {
        this.dsMaqldss = dsMaqldss;
    }

    public String getMaqldskiemtra() {
        return maqldskiemtra;
    }

    public void setMaqldskiemtra(String maqldskiemtra) {
        this.maqldskiemtra = maqldskiemtra;
    }

    public List<TableImportdataApiModel> getDetailskiemtra() {
        return detailskiemtra;
    }

    public void setDetailskiemtra(List<TableImportdataApiModel> detailskiemtra) {
        this.detailskiemtra = detailskiemtra;
    }

    public String getTrangthaikiemtra() {
        return trangthaikiemtra;
    }

    public void setTrangthaikiemtra(String trangthaikiemtra) {
        this.trangthaikiemtra = trangthaikiemtra;
    }

    public String getIddoitackiemtra() {
        return iddoitackiemtra;
    }

    public void setIddoitackiemtra(String iddoitackiemtra) {
        this.iddoitackiemtra = iddoitackiemtra;
    }

    public VwTableImportdataApiMasterModel getMaster() {
        return master;
    }

    public void setMaster(VwTableImportdataApiMasterModel master) {
        this.master = master;
    }

    public List<VwTableImportdataApiMasterModel> getMasters() {
        return masters;
    }

    public void setMasters(List<VwTableImportdataApiMasterModel> masters) {
        this.masters = masters;
    }

    public String getSophieu() {
        return sophieu;
    }

    public void setSophieu(String sophieu) {
        this.sophieu = sophieu;
    }

    public List<VwDoitacCntt> getDstendoitac() throws SQLException {
        return dstendoitac = this.dstendoitac();
    }

    public void setDstendoitac(List<VwDoitacCntt> dstendoitac) {
        this.dstendoitac = dstendoitac;
    }

    public String getIddoitac() {
        return iddoitac;
    }

    public void setIddoitac(String iddoitac) {
        this.iddoitac = iddoitac;
    }

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }

    public TableImportdataApiModel getDetail() {
        return detail;
    }

    public void setDetail(TableImportdataApiModel detail) {
        this.detail = detail;
    }

    public List<TableImportdataApiModel> getDetails() {
        return details;
    }

    public void setDetails(List<TableImportdataApiModel> details) {
        this.details = details;
    }
    
      
    
}
