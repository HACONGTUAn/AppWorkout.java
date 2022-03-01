/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;
import controller.DAO;
import javax.swing.JOptionPane;
import controller.DAO_lich_tap;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.chi_so_khach_hang;
import model.lich_tap;
import model.tenkhach_hangtl;

/**
 *
 * @author ThinkPro
 */
public class giao_dien_lich_tap extends javax.swing.JFrame {
    private ArrayList<lich_tap> list;
    private ArrayList<lich_tap> list_2;
    private ArrayList<lich_tap> list_3;
    private ArrayList<tenkhach_hangtl> list_4;
    private ArrayList<tenkhach_hangtl> list_5;
     private ArrayList<tenkhach_hangtl> list_6;
     private ArrayList<chi_so_khach_hang> listkh;
   DAO dao = new DAO();
   String strFind ="";
    String strFind_2 ="";
    String strFind_3 ="";
     String strFind_4 ="";
    String strFind_5 ="";
    int tuoi_truoc;
    int tuoi_sau;
 DefaultTableModel model;
 DefaultTableModel model_2;
 DefaultTableModel model_3;


    /**
     * Creates new form giao_dien_lich_tap
     */
    public giao_dien_lich_tap() {
       
        initComponents();
         list = new DAO_lich_tap().get_lich_tap();
         list_2 = new DAO_lich_tap().get_lich_tap_2();
         list_3 = new DAO_lich_tap().get_lich_tap_3();
         list_4 = new DAO_lich_tap().get_khach_hang_tl();
         list_5 = new DAO_lich_tap().get_khach_hang_t2();
         list_6 = new DAO_lich_tap().get_khach_hang_t3();
         listkh = new DAO().getListchi_so_khach_hang();
        model = (DefaultTableModel) jTable1.getModel();
        model_2 = (DefaultTableModel) jTable2.getModel();
        model_3=(DefaultTableModel) jTable3.getModel();
       fillTable();
    
    }
  public void fillTable(){
  DefaultTableModel tbModel = (DefaultTableModel) tbtim_kiem.getModel();
  tbModel.setRowCount(0);//xoa data trong table
  for(chi_so_khach_hang st: dao.tim_kiem_ten(strFind)){
  Object dataRow[] = new Object[6];
  dataRow[0] = st.getMakh();
  dataRow[1] = st.getTen();
  dataRow[2] = st.getTuoi();
  dataRow[3] = st.getChieu_cao();
  dataRow[4] = st.getCan_nang();
  dataRow[5] = st.getBody();
 tbModel.addRow(dataRow);
     
  }
  }
  public void fillTable_makh(){
 DefaultTableModel tbModel = (DefaultTableModel) tbtim_kiem.getModel();
  tbModel.setRowCount(0);//xoa data trong table
  for(chi_so_khach_hang st: dao.tim_makh(strFind_2)){
  Object dataRow[] = new Object[6];
  dataRow[0] = st.getMakh();
  dataRow[1] = st.getTen();
  dataRow[2] = st.getTuoi();
  dataRow[3] = st.getChieu_cao();
  dataRow[4] = st.getCan_nang();
  dataRow[5] = st.getBody();
 tbModel.addRow(dataRow);
 }
  }  
    public void fillTable_body(){
 DefaultTableModel tbModel = (DefaultTableModel) tbtim_kiem.getModel();
  tbModel.setRowCount(0);//xoa data trong table
  for(chi_so_khach_hang st: dao.tim_body(strFind_3)){
  Object dataRow[] = new Object[6];
  dataRow[0] = st.getMakh();
  dataRow[1] = st.getTen();
  dataRow[2] = st.getTuoi();
  dataRow[3] = st.getChieu_cao();
  dataRow[4] = st.getCan_nang();
  dataRow[5] = st.getBody();
 tbModel.addRow(dataRow);
 }
  } 
    
        public void fillTable_cao(){
 DefaultTableModel tbModel = (DefaultTableModel) tbtim_kiem.getModel();
  tbModel.setRowCount(0);//xoa data trong table
  for(chi_so_khach_hang st: dao.tim_chieu_cao(strFind_4)){
  Object dataRow[] = new Object[6];
  dataRow[0] = st.getMakh();
  dataRow[1] = st.getTen();
  dataRow[2] = st.getTuoi();
  dataRow[3] = st.getChieu_cao();
  dataRow[4] = st.getCan_nang();
  dataRow[5] = st.getBody();
 tbModel.addRow(dataRow);
 }
  } 
            public void fillTable_nang(){
 DefaultTableModel tbModel = (DefaultTableModel) tbtim_kiem.getModel();
  tbModel.setRowCount(0);//xoa data trong table
  for(chi_so_khach_hang st: dao.tim_can_nang(strFind_5)){
  Object dataRow[] = new Object[6];
  dataRow[0] = st.getMakh();
  dataRow[1] = st.getTen();
  dataRow[2] = st.getTuoi();
  dataRow[3] = st.getChieu_cao();
  dataRow[4] = st.getCan_nang();
  dataRow[5] = st.getBody();
 tbModel.addRow(dataRow);
 }
  } 
        public void fillTable_tuoi(){
 DefaultTableModel tbModel = (DefaultTableModel) tbtim_kiem.getModel();
  tbModel.setRowCount(0);//xoa data trong table
  for(chi_so_khach_hang st: dao.tim_tuoi(tuoi_truoc,tuoi_sau)){
  Object dataRow[] = new Object[6];
  dataRow[0] = st.getMakh();
  dataRow[1] = st.getTen();
  dataRow[2] = st.getTuoi();
  dataRow[3] = st.getChieu_cao();
  dataRow[4] = st.getCan_nang();
  dataRow[5] = st.getBody();
 tbModel.addRow(dataRow);
 }
  } 
 public void showTable(){
  DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
  tbModel.setRowCount(0);//xoa data trong table
  for(lich_tap st: list){
  Object dataRow[] = new Object[2];
  dataRow[0] = st.getThu();
  dataRow[1] = st.getNoi_dung();
  
 tbModel.addRow(dataRow);
 
    }
 }
  public void showTable_2(){
  DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
  tbModel.setRowCount(0);//xoa data trong table
  for(lich_tap st: list_2){
  Object dataRow[] = new Object[2];
  dataRow[0] = st.getThu();
  dataRow[1] = st.getNoi_dung();
  
 tbModel.addRow(dataRow);
 
    }
    }
    public void showTable_3(){
DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
  tbModel.setRowCount(0);//xoa data trong table
  for(lich_tap st: list_3){
  Object dataRow[] = new Object[2];
  dataRow[0] = st.getThu();
  dataRow[1] = st.getNoi_dung();
  
 tbModel.addRow(dataRow);
 
    }
        }
    
      public void showTable_xem(){
          model_2.setRowCount(0);
 for(tenkhach_hangtl s: list_4){
        model_2.addRow(new Object[]{
             s.getTen()
                });
    
}

        
    }
      
           public void showTable_xem2(){
               model_2.setRowCount(0);
 for(tenkhach_hangtl s: list_5){
        model_2.addRow(new Object[]{
             s.getTen()
                });
    
}

       }
           
            public void showTable_xem3(){
                model_2.setRowCount(0);
 for(tenkhach_hangtl s: list_6){
        model_2.addRow(new Object[]{
             s.getTen()
                });
    
}

       }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nhapbody = new javax.swing.JLabel();
        nhap_ma_khach = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        combolichtap = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        ma_bt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tim_kiem_ten = new javax.swing.JTextField();
        tuoi_t = new javax.swing.JTextField();
        tim_body = new javax.swing.JTextField();
        tim_cao = new javax.swing.JTextField();
        tim_nang = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbtim_kiem = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        tim_makh = new javax.swing.JTextField();
        tuoi_s = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thứ", "Nội Dung"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        nhapbody.setText("MÃ KHÁCH HÀNG");

        nhap_ma_khach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhap_ma_khachActionPerformed(evt);
            }
        });

        jButton1.setText("xếp lịch");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(nhapbody)
                        .addGap(69, 69, 69)
                        .addComponent(nhap_ma_khach, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton4)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhapbody, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhap_ma_khach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Xếp lịch tập", jPanel1);

        jLabel2.setText("MÃ BÀI TẬP :");

        jButton5.setText("TÌM KIẾM");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày Tập", "Nội Dung"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        combolichtap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BT01", "BT02", "BT03" }));

        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.setText("Thoát");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel2)
                .addGap(66, 66, 66)
                .addComponent(combolichtap, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton5)
                    .addComponent(combolichtap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Xem bài tập", jPanel3);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nhóm khách hàng theo lịch"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton2.setText("xem");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ma_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ma_btActionPerformed(evt);
            }
        });

        jLabel1.setText("nhập mã Bài Tập");

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setText("thoát");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(ma_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ma_bt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Danh sách khách hàng theo lịch", jPanel2);

        jLabel5.setText("Tìm kiếm theo tên :");

        jLabel6.setText("Tìm kiếm theo Tuổi :");

        jLabel7.setText("Tìm kiếm theo % body fat :");

        jLabel9.setText("Tìm kiêm theo chiều cao :");

        jLabel10.setText("Tìm Kiếm theo cân nặng :");

        tim_kiem_ten.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tim_kiem_tenCaretUpdate(evt);
            }
        });

        tbtim_kiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên", "Tuổi", "Chiều Cao", "Cân nặng", "% body fat"
            }
        ));
        jScrollPane4.setViewportView(tbtim_kiem);

        jButton6.setText("Tìm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Tìm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Tìm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Tìm");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setText("Tìm");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel11.setText("Mã Khách Hàng :");

        jButton12.setText("Tìm");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel3.setText("Đến");

        jButton13.setBackground(new java.awt.Color(255, 0, 51));
        jButton13.setText("Thoát");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tim_kiem_ten)
                                .addComponent(tim_makh, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(tuoi_t, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tuoi_s, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tim_body, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tim_cao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tim_nang, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jLabel11)
                            .addComponent(tim_makh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jLabel5)
                            .addComponent(tim_kiem_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jLabel6)
                            .addComponent(tuoi_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tuoi_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(tim_body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tim_cao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tim_nang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("Tìm kiếm khách hàng", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        lich_tap s = new lich_tap();
        for( chi_so_khach_hang z : listkh){
    if(nhap_ma_khach.getText().compareTo(z.getMakh())==0){
     if(z.getBody()>0 && 10 >= z.getBody()){
     if(new DAO_lich_tap().update_BT_3(nhap_ma_khach.getText())){
        JOptionPane.showMessageDialog(rootPane, "bạn đã xếp lịch 03 cho khách hàng");
            showTable_3();
       }else{
        JOptionPane.showMessageDialog(rootPane, "xep lich that bai");
        }
                
                
     }
     
     if(z.getBody() > 10 && 20 >= z.getBody()){
         if(new DAO_lich_tap().update_BT_2(nhap_ma_khach.getText())){
        JOptionPane.showMessageDialog(rootPane, "bạn đã xếp lịch 02 cho khách hàng");
            showTable_2();
       }else{
        JOptionPane.showMessageDialog(rootPane, "xep lich that bai");
        }
         
         
           
            }
     
     if(z.getBody()>20){
          if(new DAO_lich_tap().update_BT_1(nhap_ma_khach.getText())){
        JOptionPane.showMessageDialog(rootPane, "bạn đã xếp lịch 01 cho khách hàng");
            showTable();
       }else{
        JOptionPane.showMessageDialog(rootPane, "xep lich that bai");
        }
              
            }
        
    }
    
    
}
       
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ma_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ma_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ma_btActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
       
       if(ma_bt.getText().compareTo("BT01") == 0){
        showTable_xem();
       }
      
         if(ma_bt.getText().compareTo("BT02") == 0){
        showTable_xem2();
       }
          if(ma_bt.getText().compareTo("BT03") == 0){
        showTable_xem3();
       }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
new giao_dien_dang_nhap().setVisible(true); 
this.dispose();  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         strFind_2 = tim_makh.getText();
      fillTable_makh();
            
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      String loai_bt =  (String) combolichtap.getSelectedItem();
     model_3.setRowCount(0);
        if(loai_bt.compareTo("BT01") == 0){
           for(lich_tap s: list){
        model_3.addRow(new Object[]{
              s.getThu(), s.getNoi_dung()
        });
}
        }
        if(loai_bt.compareTo("BT02") == 0){
              for(lich_tap s: list_2){
        model_3.addRow(new Object[]{
              s.getThu(), s.getNoi_dung()
        });
}
   
        }
        if(loai_bt.compareTo("BT03") == 0){
                for(lich_tap s: list_3){
        model_3.addRow(new Object[]{
              s.getThu(), s.getNoi_dung()
        });
}
  
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        strFind = tim_kiem_ten.getText();
        fillTable();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        strFind_3 =tim_body.getText();
        fillTable_body();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        strFind_4 = tim_cao.getText();
       fillTable_cao();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         strFind_5 = tim_nang.getText();
       fillTable_nang();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        tuoi_truoc = Integer.parseInt(tuoi_t.getText());
        tuoi_sau = Integer.parseInt(tuoi_s.getText());
        fillTable_tuoi();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void nhap_ma_khachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhap_ma_khachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhap_ma_khachActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        new giao_dien_dang_nhap().setVisible(true); 
this.dispose();  
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        new giao_dien_dang_nhap().setVisible(true); 
this.dispose();  
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
new giao_dien_dang_nhap().setVisible(true); 
this.dispose();  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tim_kiem_tenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tim_kiem_tenCaretUpdate
        // TODO add your handling code here:
           strFind = tim_kiem_ten.getText();
        fillTable();
    }//GEN-LAST:event_tim_kiem_tenCaretUpdate

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(giao_dien_lich_tap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(giao_dien_lich_tap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(giao_dien_lich_tap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(giao_dien_lich_tap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giao_dien_lich_tap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combolichtap;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField ma_bt;
    private javax.swing.JTextField nhap_ma_khach;
    private javax.swing.JLabel nhapbody;
    private javax.swing.JTable tbtim_kiem;
    private javax.swing.JTextField tim_body;
    private javax.swing.JTextField tim_cao;
    private javax.swing.JTextField tim_kiem_ten;
    private javax.swing.JTextField tim_makh;
    private javax.swing.JTextField tim_nang;
    private javax.swing.JTextField tuoi_s;
    private javax.swing.JTextField tuoi_t;
    // End of variables declaration//GEN-END:variables

   
}
