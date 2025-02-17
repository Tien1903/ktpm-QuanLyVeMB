/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Models.DanhMucDAO;
import helper.Auth;
import helper.Xcontrol;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FPT
 */
public class quanly extends javax.swing.JFrame {

    public static Color mainColor = new Color(51, 51, 89);
    public static Color colorChange = new Color(241, 134, 39);
    public static List<DanhMucDAO> listItem = new ArrayList<>();
    public static Xcontrol menu;

    public quanly() {
        initComponents();
        setLocationRelativeTo(null);
        menu = new Xcontrol(pnlRoot);
        listItem.add(new DanhMucDAO("HeThong", pnlHeThong));
        listItem.add(new DanhMucDAO("Main", pnlMain));
        listItem.add(new DanhMucDAO("NhanVien", pnlQLNV1));
        listItem.add(new DanhMucDAO("KhachHang", pnlQLKH1));
        listItem.add(new DanhMucDAO("QLMayBay", pnlQLMB1));
        listItem.add(new DanhMucDAO("QLChuyenBay", pnlQLCB1));
        listItem.add(new DanhMucDAO("QLVe", pnlQLV1));
        listItem.add(new DanhMucDAO("ThongKe", pnlThongKe1));
        menu.setEvent(listItem);
        showView();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlMain = new javax.swing.JPanel();
        lblHeThong = new javax.swing.JLabel();
        pnlQLKH1 = new javax.swing.JPanel();
        lblHeThong2 = new javax.swing.JLabel();
        pnlQLNV1 = new javax.swing.JPanel();
        lblHeThong3 = new javax.swing.JLabel();
        pnlQLMB1 = new javax.swing.JPanel();
        lblHeThong4 = new javax.swing.JLabel();
        pnlQLCB1 = new javax.swing.JPanel();
        lblHeThong5 = new javax.swing.JLabel();
        pnlQLV1 = new javax.swing.JPanel();
        lblHeThong7 = new javax.swing.JLabel();
        pnlThongKe1 = new javax.swing.JPanel();
        lblHeThong8 = new javax.swing.JLabel();
        pnlHeThong = new javax.swing.JPanel();
        lblHeThong9 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        pnlDangNhap = new javax.swing.JPanel();
        lblHoTen = new javax.swing.JLabel();
        pnlRoot = new javax.swing.JPanel();

        jPanel6.setBackground(new java.awt.Color(51, 51, 89));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/profile64.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setText("Quản lý nhân viên");

        jLabel21.setFont(new java.awt.Font("Dosis Light", 0, 80)); // NOI18N
        jLabel21.setText("I");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel20)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel19)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý vé máy bay ");

        jPanel14.setBackground(new java.awt.Color(27, 27, 54));

        jPanel1.setBackground(new java.awt.Color(51, 51, 89));

        pnlMain.setBackground(new java.awt.Color(51, 51, 89));
        pnlMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblHeThong.setBackground(new java.awt.Color(51, 51, 89));
        lblHeThong.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHeThong.setForeground(new java.awt.Color(255, 255, 255));
        lblHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/main-menu32.png"))); // NOI18N
        lblHeThong.setText("Màn hình chính ");

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlQLKH1.setBackground(new java.awt.Color(51, 51, 89));
        pnlQLKH1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblHeThong2.setBackground(new java.awt.Color(51, 51, 89));
        lblHeThong2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHeThong2.setForeground(new java.awt.Color(255, 255, 255));
        lblHeThong2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/client32.png"))); // NOI18N
        lblHeThong2.setText("Quản lý khách hàng ");

        javax.swing.GroupLayout pnlQLKH1Layout = new javax.swing.GroupLayout(pnlQLKH1);
        pnlQLKH1.setLayout(pnlQLKH1Layout);
        pnlQLKH1Layout.setHorizontalGroup(
            pnlQLKH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLKH1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong2)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnlQLKH1Layout.setVerticalGroup(
            pnlQLKH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLKH1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlQLNV1.setBackground(new java.awt.Color(51, 51, 89));
        pnlQLNV1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblHeThong3.setBackground(new java.awt.Color(51, 51, 89));
        lblHeThong3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHeThong3.setForeground(new java.awt.Color(255, 255, 255));
        lblHeThong3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/profile32.png"))); // NOI18N
        lblHeThong3.setText("Quản lý nhân viên");

        javax.swing.GroupLayout pnlQLNV1Layout = new javax.swing.GroupLayout(pnlQLNV1);
        pnlQLNV1.setLayout(pnlQLNV1Layout);
        pnlQLNV1Layout.setHorizontalGroup(
            pnlQLNV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLNV1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong3)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnlQLNV1Layout.setVerticalGroup(
            pnlQLNV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLNV1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlQLMB1.setBackground(new java.awt.Color(51, 51, 89));
        pnlQLMB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblHeThong4.setBackground(new java.awt.Color(51, 51, 89));
        lblHeThong4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHeThong4.setForeground(new java.awt.Color(255, 255, 255));
        lblHeThong4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/plane32.png"))); // NOI18N
        lblHeThong4.setText("Quản lý máy bay");

        javax.swing.GroupLayout pnlQLMB1Layout = new javax.swing.GroupLayout(pnlQLMB1);
        pnlQLMB1.setLayout(pnlQLMB1Layout);
        pnlQLMB1Layout.setHorizontalGroup(
            pnlQLMB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLMB1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlQLMB1Layout.setVerticalGroup(
            pnlQLMB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLMB1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlQLCB1.setBackground(new java.awt.Color(51, 51, 89));
        pnlQLCB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblHeThong5.setBackground(new java.awt.Color(51, 51, 89));
        lblHeThong5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHeThong5.setForeground(new java.awt.Color(255, 255, 255));
        lblHeThong5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/flight-route32.png"))); // NOI18N
        lblHeThong5.setText("Quản lý chuyến bay ");

        javax.swing.GroupLayout pnlQLCB1Layout = new javax.swing.GroupLayout(pnlQLCB1);
        pnlQLCB1.setLayout(pnlQLCB1Layout);
        pnlQLCB1Layout.setHorizontalGroup(
            pnlQLCB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLCB1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong5)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnlQLCB1Layout.setVerticalGroup(
            pnlQLCB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLCB1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlQLV1.setBackground(new java.awt.Color(51, 51, 89));
        pnlQLV1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblHeThong7.setBackground(new java.awt.Color(51, 51, 89));
        lblHeThong7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHeThong7.setForeground(new java.awt.Color(255, 255, 255));
        lblHeThong7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ticket32.png"))); // NOI18N
        lblHeThong7.setText("Quản lý vé ");

        javax.swing.GroupLayout pnlQLV1Layout = new javax.swing.GroupLayout(pnlQLV1);
        pnlQLV1.setLayout(pnlQLV1Layout);
        pnlQLV1Layout.setHorizontalGroup(
            pnlQLV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLV1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnlQLV1Layout.setVerticalGroup(
            pnlQLV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLV1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlThongKe1.setBackground(new java.awt.Color(51, 51, 89));
        pnlThongKe1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblHeThong8.setBackground(new java.awt.Color(51, 51, 89));
        lblHeThong8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHeThong8.setForeground(new java.awt.Color(255, 255, 255));
        lblHeThong8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bar-chart32.png"))); // NOI18N
        lblHeThong8.setText("Thống kê");

        javax.swing.GroupLayout pnlThongKe1Layout = new javax.swing.GroupLayout(pnlThongKe1);
        pnlThongKe1.setLayout(pnlThongKe1Layout);
        pnlThongKe1Layout.setHorizontalGroup(
            pnlThongKe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKe1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pnlThongKe1Layout.setVerticalGroup(
            pnlThongKe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKe1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHeThong.setBackground(new java.awt.Color(51, 51, 89));
        pnlHeThong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblHeThong9.setBackground(new java.awt.Color(51, 51, 89));
        lblHeThong9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblHeThong9.setForeground(new java.awt.Color(255, 255, 255));
        lblHeThong9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/system-update32.png"))); // NOI18N
        lblHeThong9.setText("Hệ thống");

        javax.swing.GroupLayout pnlHeThongLayout = new javax.swing.GroupLayout(pnlHeThong);
        pnlHeThong.setLayout(pnlHeThongLayout);
        pnlHeThongLayout.setHorizontalGroup(
            pnlHeThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeThongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        pnlHeThongLayout.setVerticalGroup(
            pnlHeThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeThongLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblHeThong9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlQLKH1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlQLNV1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlQLMB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlQLCB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlQLV1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlThongKe1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlHeThong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pnlHeThong, pnlMain, pnlQLCB1, pnlQLKH1, pnlQLMB1, pnlQLNV1, pnlQLV1, pnlThongKe1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlQLNV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlQLKH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlQLMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlQLCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlQLV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlThongKe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlHeThong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pnlMain, pnlQLCB1, pnlQLKH1, pnlQLMB1, pnlQLNV1, pnlQLV1, pnlThongKe1});

        jPanel13.setBackground(new java.awt.Color(36, 4, 66));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Screenshot 2023-02-16 184412.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PHẦN MỀM QUẢN LÝ VÉ MÁY BAY");

        jLabel40.setFont(new java.awt.Font("Dosis Light", 0, 80)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setText("I");

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user 32.png"))); // NOI18N

        pnlDangNhap.setBackground(new java.awt.Color(36, 4, 66));

        lblHoTen.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblHoTen.setForeground(new java.awt.Color(200, 165, 75));
        lblHoTen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoTen.setText("Đăng nhập");
        lblHoTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHoTenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHoTenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHoTenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlDangNhapLayout = new javax.swing.GroupLayout(pnlDangNhap);
        pnlDangNhap.setLayout(pnlDangNhapLayout);
        pnlDangNhapLayout.setHorizontalGroup(
            pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDangNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDangNhapLayout.setVerticalGroup(
            pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangNhapLayout.createSequentialGroup()
                .addComponent(lblHoTen)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(pnlDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlRoot.setBackground(new java.awt.Color(27, 27, 54));

        javax.swing.GroupLayout pnlRootLayout = new javax.swing.GroupLayout(pnlRoot);
        pnlRoot.setLayout(pnlRootLayout);
        pnlRootLayout.setHorizontalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        pnlRootLayout.setVerticalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHoTenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoTenMouseEntered
        lblHoTen.setForeground(new Color(63,114,232)); 
    }//GEN-LAST:event_lblHoTenMouseEntered

    private void lblHoTenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoTenMouseExited
        lblHoTen.setForeground(new Color(200,165,75)); 
    }//GEN-LAST:event_lblHoTenMouseExited

    private void lblHoTenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoTenMouseClicked
        menu.setView(new dn());
    }//GEN-LAST:event_lblHoTenMouseClicked

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
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChaoJdialog().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblHeThong;
    private javax.swing.JLabel lblHeThong2;
    private javax.swing.JLabel lblHeThong3;
    private javax.swing.JLabel lblHeThong4;
    private javax.swing.JLabel lblHeThong5;
    private javax.swing.JLabel lblHeThong7;
    private javax.swing.JLabel lblHeThong8;
    private javax.swing.JLabel lblHeThong9;
    public static javax.swing.JLabel lblHoTen;
    private javax.swing.JPanel pnlDangNhap;
    private javax.swing.JPanel pnlHeThong;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlQLCB1;
    private javax.swing.JPanel pnlQLKH1;
    private javax.swing.JPanel pnlQLMB1;
    private javax.swing.JPanel pnlQLNV1;
    private javax.swing.JPanel pnlQLV1;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlThongKe1;
    // End of variables declaration//GEN-END:variables
public static void showView() {
        if (Auth.user == null) {
            lblHoTen.setText("Đăng nhập");
            menu.setView(new dn());
        } else {
            String hoTen = Auth.user.getTenNV();
            lblHoTen.setText(hoTen);
            menu.setView(new ManHinhChinh());
        }
    }

}
