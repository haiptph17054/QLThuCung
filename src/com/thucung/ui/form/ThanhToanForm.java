package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.thucung.dao.DAOService;
import com.thucung.models.GioHang;
import com.thucung.models.HoaDon;
import com.thucung.models.HoaDonChiTiet_SanPham_PhuKien;
import com.thucung.models.HoaDonChiTiet_ThuCung;
import com.thucung.models.Huyen;
import com.thucung.models.KhachHang;
import com.thucung.models.MaGiamGia;
import com.thucung.models.NhanVien;
import com.thucung.models.SanPham_PhuKien;
import com.thucung.models.ThanhPho;
import com.thucung.models.ThuCung;
import com.thucung.models.Xa_Phuong;
import com.thucung.util.DateUtil;
import com.thucung.util.DialogUtil;
import com.thucung.util.ExportHoaDon;
import com.thucung.util.ImageUtil;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import com.thucung.event.IEventControI;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class ThanhToanForm extends javax.swing.JFrame {

    private IEventControI event;
    public JFrame parent;

    public ThanhToanForm(JFrame parent) {
        this.parent = parent;
        this.nhanVien = ((GioHangForm) parent).main.nhanVien;

        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        roundPanel1 = new com.girlkun.panel.RoundPanel();
        header = new com.thucung.ui.components.Header();
        roundPanel2 = new com.girlkun.panel.RoundPanel();
        txtTenKhachHang = new com.girlkun.textfield.TextField();
        jPanel1 = new javax.swing.JPanel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        txtSoDienThoai = new com.girlkun.textfield.TextField();
        txtEmail = new com.girlkun.textfield.TextField();
        txtDiaChi = new com.girlkun.textfield.TextField();
        cboThanhPho = new com.girlkun.combobox.Combobox();
        cboHuyen = new com.girlkun.combobox.Combobox();
        cboXaPhuong = new com.girlkun.combobox.Combobox();
        txtMaGiamGia = new com.girlkun.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();
        panelControl = new com.girlkun.panel.RoundPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 0));

        roundPanel2.setBackground(new java.awt.Color(100, 100, 100));

        txtTenKhachHang.setBackground(new java.awt.Color(65, 65, 65));
        txtTenKhachHang.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtTenKhachHang.setLabelText("Tên khách hàng");

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));

        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rdoNu.setText("Nữ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(rdoNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(rdoNu)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        txtSoDienThoai.setBackground(new java.awt.Color(65, 65, 65));
        txtSoDienThoai.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtSoDienThoai.setLabelText("Số điện thoại");

        txtEmail.setBackground(new java.awt.Color(65, 65, 65));
        txtEmail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtEmail.setLabelText("Email");

        txtDiaChi.setBackground(new java.awt.Color(65, 65, 65));
        txtDiaChi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtDiaChi.setLabelText("Địa chỉ");

        cboThanhPho.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cboThanhPho.setLabeText("Thành phố");
        cboThanhPho.setLineChooseColor(new java.awt.Color(100, 100, 100));

        cboHuyen.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cboHuyen.setLabeText("Quận - Huyện");
        cboHuyen.setLineChooseColor(new java.awt.Color(100, 100, 100));

        cboXaPhuong.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cboXaPhuong.setLabeText("Xã - Phường");
        cboXaPhuong.setLineChooseColor(new java.awt.Color(100, 100, 100));

        txtMaGiamGia.setBackground(new java.awt.Color(65, 65, 65));
        txtMaGiamGia.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtMaGiamGia.setLabelText("Mã giảm giá");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thanh toán");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboThanhPho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboHuyen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboXaPhuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cboThanhPho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cboHuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cboXaPhuong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        panelControl.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initEvent() {
        event = new IEventControI() {
            @Override
            public void selected(IEventControI.Chose chose) {
                switch (chose) {
                    case ACCEPT:
                        pay();
                        break;
                }
            }
        };
    }

    private void initButton() {
        Font font = new Font("SansSerif", Font.BOLD, 12);
        Button button = new Button();
        button.setText("Xác nhận");
        button.setBackground(new Color(100, 100, 100));
        button.setForeground(Color.WHITE);
        button.setIcon(ImageUtil.getInstance().getIcon("accept"));
        button.setFont(font);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.selected(IEventControI.Chose.ACCEPT);
            }
        });
        panelControl.add(button);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.girlkun.combobox.Combobox cboHuyen;
    private com.girlkun.combobox.Combobox cboThanhPho;
    private com.girlkun.combobox.Combobox cboXaPhuong;
    private com.thucung.ui.components.Header header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.girlkun.panel.RoundPanel panelControl;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private com.girlkun.panel.RoundPanel roundPanel2;
    private com.girlkun.textfield.TextField txtDiaChi;
    private com.girlkun.textfield.TextField txtEmail;
    private com.girlkun.textfield.TextField txtMaGiamGia;
    private com.girlkun.textfield.TextField txtSoDienThoai;
    private com.girlkun.textfield.TextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables

    private void setup() {
        this.setIconImage(ImageUtil.getInstance().getIcon("icon").getImage());
        this.setLocationRelativeTo(parent);
        this.setResizable(false);
        this.setBackground(new Color(0, 0, 0, 0));
        header.setButton(this);

        setOther();
        initEvent();
        initButton();
        setupEventInput();
        setupCombobox();
        setEventCombobox();
    }

    private void setupEventInput() {
        txtSoDienThoai.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                khachHang = DAOService.khachHang.selectBySoDienThoai(txtSoDienThoai.getText());
                if (khachHang != null) {
                    txtTenKhachHang.setText(khachHang.getTenKhachHang());
                    txtEmail.setText(khachHang.getEmail());
                    txtDiaChi.setText(khachHang.getDiaChi());
                }
            }
        });
        txtMaGiamGia.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                maGiamGia = DAOService.maGiamGia.selectMa(txtMaGiamGia.getText());
            }
        });
    }

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill, wrap, inset 10", "[fill]", "[fill,grow]"));
    }

    private void pay() {
        if (checkAllInput()) {
            if (setupKhachHang()) {
                HoaDon hoaDon = getHoaDon();
                if (hoaDon != null) {
                    float giamGia = getGiamGia();
                    initHoaDonChiTiet(hoaDon.getIdHoaDon(), giamGia);
                    DAOService.hoaDonChiTiet_ThuCung.insertList(listHoaDonChiTiet_ThuCung);
                    DAOService.hoaDonChiTiet_SanPham_PhuKien.insertList(listHoaDonChiTiet_SanPham_PhuKien);
                    ExportHoaDon.createPDF(hoaDon);
                    clearGioHang();
                    closeTab();
                }
            }
        }
    }

    private void clearGioHang() {
        GioHang.getInstance().removeAll();
        ((GioHangForm) parent).main.reload();
    }

    private void closeTab() {
        ((GioHangForm) parent).main.setEnabled(true);
        this.dispose();
        ((GioHangForm) parent).dispose();
    }

    private boolean setupKhachHang() {
        if (khachHang == null) {
            KhachHang kh1 = DAOService.khachHang.selectByEmail(txtEmail.getText());
            KhachHang kh2 = DAOService.khachHang.selectBySoDienThoai(txtSoDienThoai.getText());
            if (kh1 != null && !txtEmail.getText().trim().endsWith("")) {
                DialogUtil.showAlert("Email đã tồn tại!\nVui lòng nhập email khác!", this);
                return false;
            }
            if (kh2 != null) {
                DialogUtil.showAlert("Số điện thoại đã tồn tại!\nVui lòng nhập số điện thoại khác!", this);
                return false;
            }
            khachHang = new KhachHang(0, txtTenKhachHang.getText(), rdoNam.isSelected() ? 0 : 1,
                    txtDiaChi.getText(), txtSoDienThoai.getText(), txtEmail.getText());
            DAOService.khachHang.insertHaveOutput(khachHang);
            return true;
        } else {
            if (DAOService.hoaDon.selectCountByKhachHang(khachHang.getIdKhachHang()) >= KhachHang.KHACHHANGTHANTHIET) {
                isKhachHangThanThiet = true;
            } else {
                soDonHangCanMua = KhachHang.KHACHHANGTHANTHIET - DAOService.hoaDon.selectCountByKhachHang(khachHang.getIdKhachHang());
            }
            return true;
        }
    }

    private HoaDon getHoaDon() {
        HoaDon hoaDon = null;
        if (maGiamGia != null && isKhachHangThanThiet) {
            hoaDon = new HoaDon(0, khachHang.getIdKhachHang(), nhanVien != null ? nhanVien.getIdNhanVien() : 0,
                    maGiamGia.getIdMaGiamGia(), DateUtil.getTimeNowUS());
        } else if (maGiamGia != null && !isKhachHangThanThiet) {
            boolean choose = DialogUtil.showConfirm("Hóa đơn này chưa thể áp dụng mã giảm giá do\n"
                    + "khách hàng hiện tại chưa phải là khách hàng thân thiết!\n"
                    + "Vui lòng mua thêm " + soDonHangCanMua + " đơn hàng thì mới có thể dùng mã giảm giá!\n"
                    + "Bạn vẫn xác nhận mua hóa đơn này?", this);
            if (choose) {
                hoaDon = new HoaDon(0, khachHang.getIdKhachHang(), nhanVien != null ? nhanVien.getIdNhanVien() : 0, 0,
                        DateUtil.getTimeNowUS());
            } else {
                return null;
            }
        } else {
            hoaDon = new HoaDon(0, khachHang.getIdKhachHang(), nhanVien != null ? nhanVien.getIdNhanVien() : 0, 0,
                    DateUtil.getTimeNowUS());
        }
        DAOService.hoaDon.insertHaveOutput(hoaDon);
        return hoaDon;
    }

    private float getGiamGia() {
        float giamGia = 0;
        if (maGiamGia != null && isKhachHangThanThiet) {
            DAOService.maGiamGia.truSoLuong(maGiamGia);
            giamGia = maGiamGia.getGiaTri();
            DialogUtil.showSuccessfully("Giảm giá " + giamGia + " %", this);
        }
        return (float) giamGia / 100;
    }

    private void initHoaDonChiTiet(int idHoaDon, float giamGia) {
        listHoaDonChiTiet_ThuCung = new ArrayList<HoaDonChiTiet_ThuCung>();
        listHoaDonChiTiet_SanPham_PhuKien = new ArrayList<HoaDonChiTiet_SanPham_PhuKien>();

        List<ThuCung> listThuCung = GioHang.getInstance().getListThuCung();
        List<SanPham_PhuKien> listSanPham_PhuKien = GioHang.getInstance().getListSanPham_PhuKien();
        List<Integer> listSoLuongSanPham_PhuKien = GioHang.getInstance().getSoLuongSanPham_PhuKien();

        for (ThuCung thuCung : listThuCung) {
            listHoaDonChiTiet_ThuCung.add(new HoaDonChiTiet_ThuCung(idHoaDon,
                    thuCung.getIdThuCung(), thuCung.getDonGia() - thuCung.getDonGia() * giamGia));
        }
        for (int i = 0; i < listSanPham_PhuKien.size(); i++) {
            int soLuong = listSoLuongSanPham_PhuKien.get(i);
            double donGia = listSanPham_PhuKien.get(i).getDonGia();
            double tongGia = (soLuong * donGia) - (soLuong * donGia) * giamGia;
            listHoaDonChiTiet_SanPham_PhuKien.add(new HoaDonChiTiet_SanPham_PhuKien(idHoaDon,
                    listSanPham_PhuKien.get(i).getIdSanPham_PhuKien(), soLuong, tongGia));
        }

    }

    private boolean checkAllInput() {
        if (txtTenKhachHang.getText().trim().equals("") || txtDiaChi.getText().trim().equals("")
                || txtSoDienThoai.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập đầy đủ thông tin!", this);
            return false;
        } else {
            if (!txtSoDienThoai.getText().trim().matches("0\\d{9,10}")) {
                DialogUtil.showAlert("Vui lòng nhập đúng số điện thoại!", this);
                return false;
            }
            if (!txtEmail.getText().trim().equals("")
                    && !txtEmail.getText().trim().matches("\\w+@\\w+(\\.\\w+){1,2}")) {
                DialogUtil.showAlert("Vui lòng nhập đúng email!", this);
                return false;
            }
            return true;
        }
    }

    private void setupCombobox() {
        listThanhPho = DAOService.thanhPho.selectAll();
        for (ThanhPho thanhPho : listThanhPho) {
            cboThanhPho.addItem(thanhPho.getTenThanhPho());
        }
        cboThanhPho.setSelectedItem(-1);
    }

    private void setEventCombobox() {
        cboThanhPho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = cboThanhPho.getSelectedIndex();
                if (index == -1) {
                    return;
                }
                listHuyen = DAOService.huyen.selectByThanhPho(listThanhPho.get(index).getIdThanhPho());
                cboHuyen.removeAllItems();
                for (Huyen huyen : listHuyen) {
                    cboHuyen.addItem(huyen.getTenHuyen());
                }
                cboHuyen.setSelectedIndex(-1);
                txtDiaChi.setText(listThanhPho.get(index).getTenThanhPho());
            }
        });
        cboHuyen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = cboHuyen.getSelectedIndex();
                if (index == -1) {
                    return;
                }
                listXa_Phuong = DAOService.xa_Phuong.
                        selectByHuyenThanhPho(listHuyen.get(index).getIdHuyen(), listHuyen.get(index).getIdThanhPho());
                cboXaPhuong.removeAllItems();
                for (Xa_Phuong xa_Phuong : listXa_Phuong) {
                    cboXaPhuong.addItem(xa_Phuong.getTenXa_Phuong());
                }
                cboXaPhuong.setSelectedIndex(-1);
                txtDiaChi.setText(listHuyen.get(index).getTenHuyen() + " - "
                        + listThanhPho.get(cboThanhPho.getSelectedIndex()).getTenThanhPho());
            }
        });
        cboXaPhuong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = cboXaPhuong.getSelectedIndex();
                if (index == -1) {
                    return;
                }
                txtDiaChi.setText(listXa_Phuong.get(index).getTenXa_Phuong() + " - "
                        + listHuyen.get(cboHuyen.getSelectedIndex()).getTenHuyen() + " - "
                        + listThanhPho.get(cboThanhPho.getSelectedIndex()).getTenThanhPho());
            }
        });
    }

    private boolean isKhachHangThanThiet = false;
    private int soDonHangCanMua;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private MaGiamGia maGiamGia;
    private List<ThanhPho> listThanhPho;
    private List<Huyen> listHuyen;
    private List<Xa_Phuong> listXa_Phuong;
    private List<HoaDonChiTiet_ThuCung> listHoaDonChiTiet_ThuCung;
    private List<HoaDonChiTiet_SanPham_PhuKien> listHoaDonChiTiet_SanPham_PhuKien;
}
