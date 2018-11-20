package SystemFunc;

import SystemFunc.SystemBean;
import LocalModel.HienthiDulieuDocFile;
import LocalModel.TableImportdataApiModel;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XulydataXmldoitac {

    //tạo biến chứa dữ liệu đọc file hiển thị ra màn hình 
    private static HienthiDulieuDocFile hienthiDulieuDocFile;
    private static List<HienthiDulieuDocFile> hienthiDulieuDocFiles;

    public static TableImportdataApiModel xulydataMoneygram(Number stt, Node nNode, String madaily, String transmitDateTime, String batchSequence) {

        TableImportdataApiModel ketqua = new TableImportdataApiModel();

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {

            Element eElement = (Element) nNode;
            //Lấy Element con
            Element element2 = (Element) eElement.getElementsByTagName("tns:customField").item(0);

            String cot1, cot2, cot3, cot4, cot5, cot6, cot7, cot8, cot9, cot10, cot11, cot12, cot13, cot14, cot15, cot16, cot17,
                    cot18, cot19, cot20, cot21, cot22, cot23, cot24, cot25, cot26, cot27, cot28, cot29, cot30, cot31, cot32,
                    cot33, cot34, cot35, cot36, cot37, cot38, cot39, cot40;

            cot1 = eElement.getElementsByTagName("tns:processDateTime").item(0).getTextContent();
            cot2 = eElement.getElementsByTagName("tns:agentId").item(0).getTextContent();
            cot3 = eElement.getElementsByTagName("tns:mgReferenceNumber").item(0).getTextContent();
            cot4 = eElement.getElementsByTagName("tns:mgReceiverRegistrationNumber").item(0).getTextContent();
            cot5 = eElement.getElementsByTagName("tns:receiveOption").item(0).getTextContent();
            cot6 = eElement.getElementsByTagName("tns:receiveISOCurrency").item(0).getTextContent();
            cot7 = madaily;
            cot8 = eElement.getElementsByTagName("tns:receiverFirstName").item(0).getTextContent().toUpperCase();
            try {
                cot9 = " " + eElement.getElementsByTagName("tns:receiverMiddleName").item(0).getTextContent().toUpperCase() + " ";
            } catch (Exception e) {
                cot9 = " ";
            }
            cot10 = eElement.getElementsByTagName("tns:receiverLastName").item(0).getTextContent().toUpperCase();
            cot11 = eElement.getElementsByTagName("tns:receiverAddress1").item(0).getTextContent().toUpperCase();
            String cot121;
            String cot122;
            try {
                cot121 = " " + eElement.getElementsByTagName("tns:receiverAddress2").item(0).getTextContent().toUpperCase();
            } catch (Exception e) {
                cot121 = " ";
            }
            try {
                cot122 = " " + eElement.getElementsByTagName("tns:receiverAddress3").item(0).getTextContent().toUpperCase();
            } catch (Exception e) {
                cot122 = " ";
            }
            cot12 = cot121 + cot122;
            cot13 = " " + eElement.getElementsByTagName("tns:receiverCity").item(0).getTextContent().toUpperCase();
            cot14 = eElement.getElementsByTagName("tns:receiverPhoneNumber").item(0).getTextContent();
            cot15 = eElement.getElementsByTagName("tns:expectedReceiveDate").item(0).getTextContent();
            cot16 = eElement.getElementsByTagName("tns:sendISOCurrency").item(0).getTextContent();
            cot17 = eElement.getElementsByTagName("tns:sendISOCountry").item(0).getTextContent();
            cot18 = eElement.getElementsByTagName("tns:sendFxRate").item(0).getTextContent();
            cot19 = eElement.getElementsByTagName("tns:sendAmount").item(0).getTextContent();
            cot20 = eElement.getElementsByTagName("tns:feeAmount").item(0).getTextContent();
            cot21 = eElement.getElementsByTagName("tns:receiveAmount").item(0).getTextContent();
            cot22 = eElement.getElementsByTagName("tns:senderFirstName").item(0).getTextContent().toUpperCase();
            try {
                cot23 = " " + eElement.getElementsByTagName("tns:senderMiddleName").item(0).getTextContent().toUpperCase() + " ";
            } catch (Exception e) {
                cot23 = " ";
            }
            cot24 = eElement.getElementsByTagName("tns:senderLastName").item(0).getTextContent().toUpperCase();
            cot25 = eElement.getElementsByTagName("tns:senderAddress1").item(0).getTextContent();
            cot26 = eElement.getElementsByTagName("tns:senderCity").item(0).getTextContent();
            try {
                cot27 = eElement.getElementsByTagName("tns:senderStateProvince").item(0).getTextContent();
            } catch (Exception e) {
                cot27 = null;
            }
            cot28 = eElement.getElementsByTagName("tns:senderCountry").item(0).getTextContent();
            cot29 = eElement.getElementsByTagName("tns:senderZipPostalCode").item(0).getTextContent();
            cot30 = eElement.getElementsByTagName("tns:senderPhoneNumber").item(0).getTextContent();
            try {
                cot31 = eElement.getElementsByTagName("tns:senderDateOfBirth").item(0).getTextContent();
            } catch (Exception e) {
                cot31 = null;
            }
            try {
                cot32 = eElement.getElementsByTagName("tns:senderPhotoIdType").item(0).getTextContent();
            } catch (Exception e) {
                cot32 = null;
            }
            try {
                cot33 = eElement.getElementsByTagName("tns:senderPhotoIdNumber").item(0).getTextContent();
            } catch (Exception e) {
                cot33 = null;
            }
            try {
                cot34 = eElement.getElementsByTagName("tns:senderPhotoIdCountry").item(0).getTextContent();
            } catch (Exception e) {
                cot34 = null;
            }
//            cot35 = eElement.getElementsByTagName("tns:sendAgentZipCode").item(0).getTextContent();
            cot36 = eElement.getElementsByTagName("tns:receiveAccountSwipe").item(0).getTextContent();
            cot37 = element2.getElementsByTagName("tns:name").item(0).getTextContent();
            cot38 = element2.getElementsByTagName("tns:value").item(0).getTextContent();
            cot39 = transmitDateTime;
            cot40 = batchSequence;
            ////////////////

            ketqua.setSttcol(stt.intValue() + 1);

            ketqua.setCot1(cot1);
            ketqua.setCot2(cot2);
            ketqua.setCot3(cot3);
            ketqua.setCot4(cot4);
            ketqua.setCot5(cot5);
            ketqua.setCot6(cot6);
            ketqua.setCot7(cot7);
            ketqua.setCot8(cot8);
            ketqua.setCot9(cot9);
            ketqua.setCot10(cot10);
            ketqua.setCot11(cot11);
            ketqua.setCot12(cot12);
            ketqua.setCot13(cot13);
            ketqua.setCot14(cot14);
            ketqua.setCot15(cot15);
            ketqua.setCot16(cot16);
            ketqua.setCot17(cot17);
            ketqua.setCot18(cot18);
            ketqua.setCot19(cot19);
            ketqua.setCot20(cot20);
            ketqua.setCot21(cot21);
            ketqua.setCot22(cot22);
            ketqua.setCot23(cot23);
            ketqua.setCot24(cot24);
            ketqua.setCot25(cot25);
            ketqua.setCot26(cot26);
            ketqua.setCot27(cot27);
            ketqua.setCot28(cot28);
            ketqua.setCot29(cot29);
            ketqua.setCot30(cot30);
            ketqua.setCot31(cot31);
            ketqua.setCot32(cot32);
            ketqua.setCot33(cot33);
            ketqua.setCot34(cot34);
//                        ketqua.setCot35(cot35);
            ketqua.setCot36(cot36);
            ketqua.setCot37(cot37);
            ketqua.setCot38(cot38);
            ketqua.setCot39(cot39);
            ketqua.setCot40(cot40);

            //Đưa dữ liệu vào class chứa dữ liệu để hiển thị khi đọc file
            hienthiDulieuDocFile = new HienthiDulieuDocFile();
            hienthiDulieuDocFile.setManguoinhan(cot3);
            hienthiDulieuDocFile.setHotennguoinhan(cot10 + cot9 + cot8);
            hienthiDulieuDocFile.setLoaitiengoi(cot6);
            hienthiDulieuDocFile.setLoaitienchitra(cot6);
            BigDecimal sotiengoi = new BigDecimal(cot21);
            hienthiDulieuDocFile.setSotiengoi(sotiengoi);
            //Nếu tiền gởi là VND, gán tỷ giá = 1, thành tiền = tiền gởi
            if (cot6.equalsIgnoreCase("VND")) {
                hienthiDulieuDocFile.setTygia(1);
                hienthiDulieuDocFile.setThanhtien(sotiengoi);
            } else {
                hienthiDulieuDocFile.setTygia(null);
                hienthiDulieuDocFile.setThanhtien(null);
            }

            hienthiDulieuDocFile.setDienthoai(cot14);
            hienthiDulieuDocFile.setDiachi(cot11 + cot12 + cot13);
            hienthiDulieuDocFile.setChinhanh(cot38);

        }

        return ketqua;

    }

    public static List<TableImportdataApiModel> xulydataMoneygramTong(InputStream fileout) throws ParserConfigurationException {

        List<TableImportdataApiModel> ketqua = new ArrayList<>();

        // String tenfile = this.getFileName(file);
        // File fXmlFile = new File(rootpathimage + tenfile);
        // File fXmlFile = new File(file.getFilepart);
        try {
            String madaily = null;
            String transmitDateTime = null;
            String batchSequence = null;

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fileout);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("tns:moneyTransferRequest");

            NodeList nListHeader = doc.getElementsByTagName("tns:batchHeader");

            if (nListHeader.getLength() > 0) {

                Node nNode = nListHeader.item(0);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    madaily = eElement.getElementsByTagName("tns:agentGroupId").item(0).getTextContent();
                    transmitDateTime = eElement.getElementsByTagName("tns:transmitDateTime").item(0).getTextContent();
                    batchSequence = eElement.getElementsByTagName("tns:batchSequence").item(0).getTextContent();
                }

            }

            List<TableImportdataApiModel> details = new ArrayList<>();
            //Tạo danh sách chứa dữ liệu hiển thị khi bấm nút đọc file
            hienthiDulieuDocFiles = new ArrayList<>();

            for (int i = 0; i < nList.getLength(); i++) {
                TableImportdataApiModel detail = new TableImportdataApiModel();
                Node nNode = nList.item(i);
                try {
                    detail = xulydataMoneygram(i, nNode, madaily, transmitDateTime, batchSequence);
                    details.add(detail);
                    //Đưa dữ liệu vào class hiển thị dữ liệu
                    hienthiDulieuDocFiles.add(hienthiDulieuDocFile);
                } catch (Exception e) {
                    int numerr = i + 1;
                    SystemBean.proMessError("Hồ sơ số " + numerr + " của file bị lỗi, vui lòng kiểm tra lại");
                }

            }
            ketqua = details;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ketqua;

    }

    //get/set
    public static HienthiDulieuDocFile getHienthiDulieuDocFile() {
        return hienthiDulieuDocFile;
    }

    public static void setHienthiDulieuDocFile(HienthiDulieuDocFile hienthiDulieuDocFile) {
        XulydataXmldoitac.hienthiDulieuDocFile = hienthiDulieuDocFile;
    }

    public static List<HienthiDulieuDocFile> getHienthiDulieuDocFiles() {
        return hienthiDulieuDocFiles;
    }

    public static void setHienthiDulieuDocFiles(List<HienthiDulieuDocFile> hienthiDulieuDocFiles) {
        XulydataXmldoitac.hienthiDulieuDocFiles = hienthiDulieuDocFiles;
    }

}
