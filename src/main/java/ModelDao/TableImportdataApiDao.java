package ModelDao;

import ConnectBean.ConnectionProvider;
import LocalModel.KieuhoiList;
import LocalModel.TableImportDataApi;
import LocalModel.TableImportdataApiModel;
import LocalModel.VwApiDetailChualaydulieu;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TableImportdataApiDao {

    private String sql = " SELECT * FROM KH.TABLE_IMPORTDATA_API ";
    private List<TableImportdataApiModel> tableImportdataApiModels = new ArrayList<>();

    public String laysophieu() {
        String kq = null;
        Connection con = ConnectionProvider.getCon();
        String fnCall = "{?=call KH.PKS_TAOKHOA.taosophieutructuyen}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            kq = e.getMessage();
            return kq;
        }
    }

    public String insertDataDetail(KieuhoiList model, String iddoitac, String sophieu, Number tongshs, String username) {
        String kq = null;
        Connection con = ConnectionProvider.getCon();
        String fnCall = "{?=call KH.PKS_IMP_DOITAC_WEB.IMPORT_RECORD_DATA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(43, oracle.jdbc.OracleTypes.INTEGER);
            stm.registerOutParameter(45, oracle.jdbc.OracleTypes.INTEGER);
            stm.registerOutParameter(44, oracle.jdbc.OracleTypes.VARCHAR);

            stm.setString(2, model.getSoPhieu());
            stm.setString(3, model.getMaNguoinhan());
            stm.setString(4, model.getIdDiadiemchitra());
            stm.setString(5, model.getIdLoaitienchitra());
            stm.setString(6, model.getHoten());
            stm.setString(7, model.getDiachi());
            stm.setString(8, model.getDienthoai());
            stm.setString(9, model.getIdLoaitiengoi());
            try {
                stm.setString(10, model.getTygia().toString());
                stm.setString(12, model.getThanhtien().toString());
            } catch (Exception e) {
                stm.setString(10, null);
                stm.setString(12, null);
            }

            stm.setString(11, model.getSotiengoi().toString());
            stm.setString(13, model.getNguoigoi());
            stm.setString(14, model.getIdCity());
            stm.setString(15, iddoitac);
            stm.setString(16, model.getDiachigoc());
            stm.setString(17, model.getAgent());
            stm.setString(18, model.getIdAgent());
            stm.setString(19, model.getExtOrder());
            stm.setString(20, model.getGhichuPhCtTam());
            stm.setString(21, model.getRecordNote());
            stm.setString(22, model.getGhichu());
            stm.setString(23, null);
            stm.setString(24, null);
            stm.setString(25, null);
            stm.setString(26, model.getSotaikhoankh());
            stm.setString(27, null);
            stm.setString(28, model.getGhichuGoi());
            stm.setString(29, null);
            stm.setString(30, null);
            stm.setString(31, model.getPinNo());
            stm.setString(32, model.getPayagentseq());
            stm.setString(33, model.getHoten1());
            stm.setString(34, model.getIdDistrict());
            stm.setString(35, null);
            stm.setString(36, model.getIdChiNhanh());
            stm.setString(37, model.getGiaytoHoten());
            stm.setString(38, null);
            stm.setString(39, null);
            stm.setString(40, null);
            stm.setString(41, null);
            stm.setString(42, iddoitac);
            stm.setInt(43, model.getStt().intValue());
            stm.setString(44, sophieu);
            stm.setInt(45, tongshs.intValue());
            stm.setString(46, username);
            stm.setString(47, null);
            ////Nếu xử lý import từ file,để giá trị = "Y": tạo master cho dữ liệu
            stm.setString(48, "Y");
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            kq = e.getMessage();
            return kq;
        }

    }

    public List<TableImportdataApiModel> findOneParam(String param, String value) {
        Connection con = ConnectionProvider.getCon();
        sql += " WHERE " + param + " = " + value;
        try {

            PreparedStatement pstm = con.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                TableImportdataApiModel d = new TableImportdataApiModel();

                String loaitien = rs.getString("COT_4");
                String sotien = rs.getString("COT_10");

                d.setIdcode(rs.getString("ID_CODE"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDataimport(rs.getString("DATA_IMPORT"));
                d.setCot1(rs.getString("COT_1"));
                d.setCot2(rs.getString("COT_2"));
                d.setCot3(rs.getString("COT_3"));
                d.setCot4(rs.getString("COT_4"));
                d.setCot5(rs.getString("COT_5"));
                d.setCot6(rs.getString("COT_6"));
                d.setCot7(rs.getString("COT_7"));
                d.setSttcol(rs.getInt("STT_COL"));
                d.setCot8(rs.getString("COT_8"));
                d.setCot9(rs.getString("COT_9"));
                d.setCot10(rs.getString("COT_10"));
                d.setCot11(rs.getString("COT_11"));
                d.setCot12(rs.getString("COT_12"));
                d.setCot13(rs.getString("COT_13"));
                d.setCot14(rs.getString("COT_14"));
                d.setCot15(rs.getString("COT_15"));
                d.setCot16(rs.getString("COT_16"));
                d.setCot17(rs.getString("COT_17"));
                d.setCot18(rs.getString("COT_18"));
                d.setCot19(rs.getString("COT_19"));
                d.setCot20(rs.getString("COT_20"));
                d.setCot21(rs.getString("COT_21"));
                d.setCot22(rs.getString("COT_22"));
                d.setCot23(rs.getString("COT_23"));
                d.setCot24(rs.getString("COT_24"));
                d.setCot25(rs.getString("COT_25"));
                d.setCot26(rs.getString("COT_26"));
                d.setCot27(rs.getString("COT_27"));
                d.setCot28(rs.getString("COT_28"));
                d.setCot29(rs.getString("COT_29"));
                d.setCot30(rs.getString("COT_30"));
                d.setCot31(rs.getString("COT_31"));
                d.setCot32(rs.getString("COT_32"));
                d.setCot33(rs.getString("COT_33"));
                d.setCot34(rs.getString("COT_34"));
                d.setCot35(rs.getString("COT_35"));
                d.setCot36(rs.getString("COT_36"));
                d.setCot37(rs.getString("COT_37"));
                d.setCot38(rs.getString("COT_38"));
                d.setCot39(rs.getString("COT_39"));
                d.setCot40(rs.getString("COT_40"));
                d.setApikey(rs.getString("APIKEY"));
                d.setMaqlds(rs.getString("MA_QLDS"));
                if (loaitien != null || sotien != null) {
                    d.setRedcolor(this.redcolorrow(loaitien, sotien));
                }

                this.tableImportdataApiModels.add(d);
            }

            return tableImportdataApiModels;
        } catch (Exception e) {
            return null;
        }
    }

    private Boolean redcolorrow(String loaitien, String sotien) {

        if ((loaitien.equalsIgnoreCase("VND") && Double.parseDouble(sotien) >= 100000000)
                || (!loaitien.equalsIgnoreCase("VND") && Double.parseDouble(sotien) >= 5000)) {
            return true;
        }

        return false;
    }

//    Thêm dữ liệu từ bảng Detail vào bảng Kieuhoi_List
    public String insertDataKieuhoiList(String user, String sophieu, String chinhanh, String maqldskiemtra, String doitac, String loaifile) {
        String kq = null;
        Connection con = ConnectionProvider.getCon();
        String fnCall = "{?=call KH.PKS_IMP_DOITAC_WEB.TRANFER_DATATO_KIEUHOILIST(?,?,?,?,?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            int dodai = maqldskiemtra.length();

            stm.setString(2, user);
            stm.setString(3, sophieu);
            stm.setString(4, chinhanh);
            stm.setString(5, maqldskiemtra);
            stm.setString(6, doitac);
            stm.setString(7, loaifile);
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            kq = e.getMessage();
            return kq;
        }

    }

    public List<TableImportdataApiModel> findTwoParam(String param1, String value1, String param2, String value2) {
        Connection con = ConnectionProvider.getCon();
        sql += " WHERE " + param1 + " = " + value1 + " AND " + param2 + " = " + value2;
        try {

            PreparedStatement pstm = con.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                TableImportdataApiModel d = new TableImportdataApiModel();

                String loaitien = rs.getString("COT_4");
                String sotien = rs.getString("COT_10");

                d.setIdcode(rs.getString("ID_CODE"));
                d.setIddoitac(rs.getString("ID_DOITAC"));
                d.setDataimport(rs.getString("DATA_IMPORT"));
                d.setCot1(rs.getString("COT_1"));
                d.setCot2(rs.getString("COT_2"));
                d.setCot3(rs.getString("COT_3"));
                d.setCot4(rs.getString("COT_4"));
                d.setCot5(rs.getString("COT_5"));
                d.setCot6(rs.getString("COT_6"));
                d.setCot7(rs.getString("COT_7"));
                d.setSttcol(rs.getInt("STT_COL"));
                d.setCot8(rs.getString("COT_8"));
                d.setCot9(rs.getString("COT_9"));
                d.setCot10(rs.getString("COT_10"));
                d.setCot11(rs.getString("COT_11"));
                d.setCot12(rs.getString("COT_12"));
                d.setCot13(rs.getString("COT_13"));
                d.setCot14(rs.getString("COT_14"));
                d.setCot15(rs.getString("COT_15"));
                d.setCot16(rs.getString("COT_16"));
                d.setCot17(rs.getString("COT_17"));
                d.setCot18(rs.getString("COT_18"));
                d.setCot19(rs.getString("COT_19"));
                d.setCot20(rs.getString("COT_20"));
                d.setCot21(rs.getString("COT_21"));
                d.setCot22(rs.getString("COT_22"));
                d.setCot23(rs.getString("COT_23"));
                d.setCot24(rs.getString("COT_24"));
                d.setCot25(rs.getString("COT_25"));
                d.setCot26(rs.getString("COT_26"));
                d.setCot27(rs.getString("COT_27"));
                d.setCot28(rs.getString("COT_28"));
                d.setCot29(rs.getString("COT_29"));
                d.setCot30(rs.getString("COT_30"));
                d.setCot31(rs.getString("COT_31"));
                d.setCot32(rs.getString("COT_32"));
                d.setCot33(rs.getString("COT_33"));
                d.setCot34(rs.getString("COT_34"));
                d.setCot35(rs.getString("COT_35"));
                d.setCot36(rs.getString("COT_36"));
                d.setCot37(rs.getString("COT_37"));
                d.setCot38(rs.getString("COT_38"));
                d.setCot39(rs.getString("COT_39"));
                d.setCot40(rs.getString("COT_40"));
                d.setApikey(rs.getString("APIKEY"));
                d.setMaqlds(rs.getString("MA_QLDS"));
                if (loaitien != null || sotien != null) {
                    d.setRedcolor(this.redcolorrow(loaitien, sotien));
                }

                this.tableImportdataApiModels.add(d);
            }

            return tableImportdataApiModels;
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean xulydulieusauimportbangtam(String sophieu, String doitac) {
        String kq = null;
        Connection con = ConnectionProvider.getCon();
        String fnCall = "{?=call KH.PKS_IMP_DOITAC_WEB.XULY_DULIEUSAUIMPORT_BANGTAM(?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

            stm.setString(2, sophieu);
            stm.setString(3, doitac);

            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();
            if (kq.equalsIgnoreCase("T")) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    public String xulychuoidataimportapi(String dataimport, String keyapi, String sophieu, int sott) {
        Connection con = ConnectionProvider.getCon();

        String fnCall = "{?=call KH.PKS_API_SERVICE.FUNC_INSERT_DATA_DETAIL(?,?,?,?)}";
        String kq = null;

        try {
            CallableStatement cs = con.prepareCall(fnCall);
            cs.setQueryTimeout(1800);

            cs.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

            cs.setString(2, dataimport);
            cs.setString(3, keyapi);
            cs.setString(4, sophieu);
            cs.setInt(5, sott);

            cs.executeUpdate();
            kq = cs.getString(1);
            return kq;

        } catch (Exception e) {
            kq = e.getMessage();
            return kq;
        }
    }

    public String laytrangthaiapi(String keyapi) {
        Connection con = ConnectionProvider.getCon();

        String fnCall = "?=call KH.PKS_API_SERVICE.FUNC_CHECK_STATUS_API(?)";
        String kq = null;

        try {
            CallableStatement cs = con.prepareCall(fnCall);
            cs.setQueryTimeout(1800);

            cs.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);

            cs.executeUpdate();

            kq = cs.getString(1);
            return kq;
        } catch (Exception e) {
            kq = e.getMessage();
            return kq;
        }
    }

    public String insertDataDetailFromApi(String sophieu, int stt, VwApiDetailChualaydulieu model, String apikey) {
        String kq = null;
        Connection con = ConnectionProvider.getCon();
        String fnCall = "{?=call KH.PKS_IMP_DOITAC_WEB.FUNC_INS_DATADETAIL_FROM_API(?,?,?,?,?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(6, oracle.jdbc.OracleTypes.INTEGER);

            String idcode = sophieu + stt;
            stm.setString(2, idcode);
            stm.setString(3, model.getIddoitac());
            stm.setString(4, model.getDataimport());
            stm.setString(5, sophieu);
            stm.setInt(6, stt);
            stm.setString(7, apikey);

            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            kq = e.getMessage();
            return kq;
        }
    }

    //Lấy dữ liệu detail vừa cắt chuỗi bên con 11 insert vào bảng tạm con 70
    public String insertdata11catchuoivao70(TableImportDataApi model, String iddoitac, String apikey,String sophieu, Number tongshs, Integer stt, String username,String dataimport) {
        String kq = null;
        Connection con = ConnectionProvider.getCon();
        String fnCall = "{?=call KH.PKS_IMP_DOITAC_WEB.IMPORT_RECORD_DATA(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        try {
            CallableStatement stm = con.prepareCall(fnCall);

            stm.setQueryTimeout(1800);
            stm.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            stm.registerOutParameter(43, oracle.jdbc.OracleTypes.INTEGER);
            stm.registerOutParameter(45, oracle.jdbc.OracleTypes.INTEGER);

            stm.setString(2, sophieu);
            stm.setString(3, model.getCot2());
            stm.setString(4, model.getCot3());
            stm.setString(5, model.getCot4());
            stm.setString(6, model.getCot5());
            stm.setString(7, model.getCot6());
            stm.setString(8, model.getCot7());
            stm.setString(9, model.getCot8());
            stm.setString(10, model.getCot9());
            stm.setString(11, model.getCot10());
            stm.setString(12, model.getCot11());
            stm.setString(13, model.getCot12());
            stm.setString(14, model.getCot13());
            stm.setString(15, model.getCot14());
            stm.setString(16, model.getCot15());
            stm.setString(17, model.getCot16());
            stm.setString(18, model.getCot17());
            stm.setString(19, model.getCot18());
            stm.setString(20, model.getCot19());
            stm.setString(21, model.getCot20());
            stm.setString(22, model.getCot21());
            stm.setString(23, model.getCot22());
            stm.setString(24, model.getCot23());
            stm.setString(25, model.getCot24());
            stm.setString(26, model.getCot25());
            stm.setString(27, model.getCot26());
            stm.setString(28, model.getCot27());
            stm.setString(29, model.getCot28());
            stm.setString(30, model.getCot29());
            stm.setString(31, model.getCot30());
            stm.setString(32, model.getCot31());
            stm.setString(33, model.getCot32());
            stm.setString(34, model.getCot33());
            stm.setString(35, model.getCot34());
            stm.setString(36, model.getCot35());
            stm.setString(37, model.getCot36());
            stm.setString(38, model.getCot37());
            stm.setString(39, model.getCot38());
            stm.setString(40, model.getCot39());
            stm.setString(41, model.getCot40());
            stm.setString(42, iddoitac);
            stm.setInt(43, stt);
            stm.setString(44, apikey);
            stm.setInt(45, tongshs.intValue());
            stm.setString(46, username);
            stm.setString(47, dataimport);
            //Nếu xử lý import từ API,để giá trị = "N": không tạo master cho dữ liệu
            stm.setString(48, "N");
            
            stm.executeUpdate();
            kq = stm.getString(1);
            stm.close();

            return kq;
        } catch (Exception e) {
            kq = e.getMessage();
            return kq;
        }

    }

}
