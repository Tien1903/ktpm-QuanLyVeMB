/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Models.DanhMucDAO;
import static UI.quanly.listItem;
import helper.Xcontrol;

/**
 *
 * @author FPT
 */
public class ManHinhChinh extends javax.swing.JPanel {

    /**
     * Creates new form ManHinhChinh
     */
   
     public ManHinhChinh() {
        initComponents();
        listItem.add(new DanhMucDAO("NhanVien", pnlQLNV));
        listItem.add(new DanhMucDAO("KhachHang", pnlQLKH));
        listItem.add(new DanhMucDAO("QLMayBay", pnlQLMB));
        listItem.add(new DanhMucDAO("QLChuyenBay", pnlQLCB));
        listItem.add(new DanhMucDAO("QLVe", pnlQLV));
        listItem.add(new DanhMucDAO("ThongKe", pnlThongKe));
        Xcontrol x = new Xcontrol(this);
        x.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRight = new javax.swing.JPanel();
        pnlQLNV = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlQLKH = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pnlQLMB = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnlQLV = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        pnlQLCB = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        pnlRight.setBackground(new java.awt.Color(27, 27, 54));

        pnlQLNV.setBackground(new java.awt.Color(51, 51, 89));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/profile64.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quản lý nhân viên");

        jLabel1.setFont(new java.awt.Font("Dosis Light", 0, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("I");

        javax.swing.GroupLayout pnlQLNVLayout = new javax.swing.GroupLayout(pnlQLNV);
        pnlQLNV.setLayout(pnlQLNVLayout);
        pnlQLNVLayout.setHorizontalGroup(
            pnlQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLNVLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        pnlQLNVLayout.setVerticalGroup(
            pnlQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLNVLayout.createSequentialGroup()
                .addGroup(pnlQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQLNVLayout.createSequentialGroup()
                        .addGroup(pnlQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlQLNVLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlQLNVLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQLNVLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        pnlQLKH.setBackground(new java.awt.Color(51, 51, 89));
        pnlQLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlQLKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlQLKHMouseExited(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/client64.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Quản lý khách hàng");

        jLabel25.setFont(new java.awt.Font("Dosis Light", 0, 80)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("I");

        javax.swing.GroupLayout pnlQLKHLayout = new javax.swing.GroupLayout(pnlQLKH);
        pnlQLKH.setLayout(pnlQLKHLayout);
        pnlQLKHLayout.setHorizontalGroup(
            pnlQLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlQLKHLayout.setVerticalGroup(
            pnlQLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLKHLayout.createSequentialGroup()
                .addGroup(pnlQLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addGroup(pnlQLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlQLKHLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlQLKHLayout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jLabel24))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlQLMB.setBackground(new java.awt.Color(51, 51, 89));
        pnlQLMB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlQLMBMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/plane64.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Quản lý máy bay");

        jLabel18.setFont(new java.awt.Font("Dosis Light", 0, 80)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("I");

        javax.swing.GroupLayout pnlQLMBLayout = new javax.swing.GroupLayout(pnlQLMB);
        pnlQLMB.setLayout(pnlQLMBLayout);
        pnlQLMBLayout.setHorizontalGroup(
            pnlQLMBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLMBLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlQLMBLayout.setVerticalGroup(
            pnlQLMBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLMBLayout.createSequentialGroup()
                .addGroup(pnlQLMBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQLMBLayout.createSequentialGroup()
                        .addGroup(pnlQLMBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlQLMBLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlQLMBLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel13)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQLMBLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );

        pnlQLV.setBackground(new java.awt.Color(51, 51, 89));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ticket64.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Quản lý vé                ");

        jLabel28.setFont(new java.awt.Font("Dosis Light", 0, 80)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("I");

        javax.swing.GroupLayout pnlQLVLayout = new javax.swing.GroupLayout(pnlQLV);
        pnlQLV.setLayout(pnlQLVLayout);
        pnlQLVLayout.setHorizontalGroup(
            pnlQLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLVLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlQLVLayout.setVerticalGroup(
            pnlQLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLVLayout.createSequentialGroup()
                .addGroup(pnlQLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQLVLayout.createSequentialGroup()
                        .addGroup(pnlQLVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlQLVLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlQLVLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel27)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQLVLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel26)))
                .addContainerGap())
        );

        pnlQLCB.setBackground(new java.awt.Color(51, 51, 89));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/flight-route64.png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Quản lý chuyến bay");

        jLabel34.setFont(new java.awt.Font("Dosis Light", 0, 80)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("I");

        javax.swing.GroupLayout pnlQLCBLayout = new javax.swing.GroupLayout(pnlQLCB);
        pnlQLCB.setLayout(pnlQLCBLayout);
        pnlQLCBLayout.setHorizontalGroup(
            pnlQLCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLCBLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnlQLCBLayout.setVerticalGroup(
            pnlQLCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLCBLayout.createSequentialGroup()
                .addGroup(pnlQLCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlQLCBLayout.createSequentialGroup()
                        .addGroup(pnlQLCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlQLCBLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlQLCBLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel33)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQLCBLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel32)))
                .addContainerGap())
        );

        pnlThongKe.setBackground(new java.awt.Color(51, 51, 89));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bar-chart64.png"))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Thống kê");

        jLabel37.setFont(new java.awt.Font("Dosis Light", 0, 80)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("I");

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlThongKeLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlThongKeLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel36))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRightLayout.createSequentialGroup()
                        .addComponent(pnlQLV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRightLayout.createSequentialGroup()
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlQLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlQLMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlQLCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlQLKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlQLKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlQLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlQLCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlQLMB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlQLV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnlQLKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQLKHMouseEntered
    }//GEN-LAST:event_pnlQLKHMouseEntered

    private void pnlQLKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQLKHMouseExited
    }//GEN-LAST:event_pnlQLKHMouseExited

    private void pnlQLMBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlQLMBMouseExited
    }//GEN-LAST:event_pnlQLMBMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnlQLCB;
    private javax.swing.JPanel pnlQLKH;
    private javax.swing.JPanel pnlQLMB;
    private javax.swing.JPanel pnlQLNV;
    private javax.swing.JPanel pnlQLV;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlThongKe;
    // End of variables declaration//GEN-END:variables
}
