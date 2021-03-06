USE [test]
GO
SET IDENTITY_INSERT [dbo].[thanhpho] ON 

INSERT [dbo].[thanhpho] ([idthanhpho], [tenthanhpho]) VALUES (1, N'Hà Nội')
INSERT [dbo].[thanhpho] ([idthanhpho], [tenthanhpho]) VALUES (2, N'Đà Nẵng')
INSERT [dbo].[thanhpho] ([idthanhpho], [tenthanhpho]) VALUES (3, N'Thanh Hóa')
INSERT [dbo].[thanhpho] ([idthanhpho], [tenthanhpho]) VALUES (4, N'Nghệ An')
INSERT [dbo].[thanhpho] ([idthanhpho], [tenthanhpho]) VALUES (5, N'Hồ Chí Minh')
SET IDENTITY_INSERT [dbo].[thanhpho] OFF
GO
SET IDENTITY_INSERT [dbo].[huyen] ON 

INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (1, 1, N'Mê Linh')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (2, 1, N'Sóc Sơn')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (3, 1, N'Ba Đình')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (4, 1, N'Cầu Giấy')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (5, 1, N'Đống Đa')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (6, 1, N'Hà Đông')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (7, 1, N'Bắc Từ Niêm')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (8, 1, N'Nam Từ Niêm')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (9, 1, N'Hoàn Kiếm')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (10, 1, N'Long Biên')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (11, 2, N'Hải Châu')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (12, 2, N'Cẩm Lệ')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (13, 2, N'Thanh Khê')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (14, 2, N'Liên Chiểu')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (15, 2, N'Sơn Trà')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (16, 2, N'Hoàng Sa')
INSERT [dbo].[huyen] ([idhuyen], [idthanhpho], [tenhuyen]) VALUES (17, 2, N'Hòa Vang')
SET IDENTITY_INSERT [dbo].[huyen] OFF
GO
SET IDENTITY_INSERT [dbo].[xa_phuong] ON 

INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (1, 1, 1, N'Quang Minh')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (2, 1, 1, N'Chi Đông')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (3, 1, 1, N'Đại Thịnh')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (4, 1, 1, N'Thanh Lâm')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (5, 1, 1, N'Tự Lập')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (6, 1, 1, N'Tiền Phong')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (7, 1, 1, N'Thạch Đà')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (8, 1, 1, N'Kim Hoa')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (9, 1, 1, N'Liên Mạc')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (10, 2, 1, N'Thanh Xuân')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (11, 2, 1, N'Minh Phú')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (12, 2, 1, N'Quang Tiến')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (13, 2, 1, N'Phú Minh')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (14, 2, 1, N'Phù Lỗ')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (15, 2, 1, N'Nam Sơn')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (16, 2, 1, N'Hồng Kỳ')
INSERT [dbo].[xa_phuong] ([idxa_phuong], [idhuyen], [idthanhpho], [tenxa_phuong]) VALUES (17, 2, 1, N'Tân Hưng')
SET IDENTITY_INSERT [dbo].[xa_phuong] OFF
GO
SET IDENTITY_INSERT [dbo].[nhanvien] ON 

INSERT [dbo].[nhanvien] ([idnhanvien], [tennhanvien], [ngaysinh], [gioitinh], [diachi], [sodienthoai], [email], [hinhanh]) VALUES (1, N'Lại Lùn', CAST(N'2002-05-07T00:00:00.000' AS DateTime), 0, N'Quang Minh - Mê Linh - Hà Nội', N'0974264451', N'75wouldbeperfect@gmail.com', N'D:\Image\pig.png')
INSERT [dbo].[nhanvien] ([idnhanvien], [tennhanvien], [ngaysinh], [gioitinh], [diachi], [sodienthoai], [email], [hinhanh]) VALUES (2, N'Phan Thanh Hải', CAST(N'2002-09-29T00:00:00.000' AS DateTime), 0, N'Sóc Sơn - Hà Nội', N'0987123123', N'haiptph17054@fpt.edu.vn', N'C:\Users\adm\Pictures\Camera Roll\WIN_20201204_15_53_51_Pro.jpg')
INSERT [dbo].[nhanvien] ([idnhanvien], [tennhanvien], [ngaysinh], [gioitinh], [diachi], [sodienthoai], [email], [hinhanh]) VALUES (3, N'Girl kuN', CAST(N'2002-05-07T00:00:00.000' AS DateTime), 1, N'Quang Minh - Mê Linh - Hà Nội', N'0352668392', N'7zkun5@gmail.com', N'D:\Image\Girl\a1.jpg')
SET IDENTITY_INSERT [dbo].[nhanvien] OFF
GO
INSERT [dbo].[taikhoan] ([taikhoan], [matkhau], [nhanvien], [vaitro], [trangthai]) VALUES (N'admin', N'$2a$07$7oBYvKdPfCpoW7bDiKaF7.hmo9y0zxjKuCjrpJ4BEzHNxH1f8Et.C', NULL, 0, 1)
INSERT [dbo].[taikhoan] ([taikhoan], [matkhau], [nhanvien], [vaitro], [trangthai]) VALUES (N'haiptgk2', N'$2a$07$L09pDmlkf1m2oW.tdT8j1eDdt3DvjZLlKE5Au/3x9vd6RtPRC0NZi', 2, 1, 1)
INSERT [dbo].[taikhoan] ([taikhoan], [matkhau], [nhanvien], [vaitro], [trangthai]) VALUES (N'kunggk3', N'$2a$07$Ep6aXjO1G4fBbB70WFELX.ZJvH8swXFosy6UIUg9Hcyn0g1VrccTa', 3, 1, 1)
INSERT [dbo].[taikhoan] ([taikhoan], [matkhau], [nhanvien], [vaitro], [trangthai]) VALUES (N'lunlgk1', N'$2a$07$fIHfs02nHNsRh89r3O5vju6btnCnkDAtxVhlXbSkrFtvJ11SMLkmu', 1, 1, 1)
GO
SET IDENTITY_INSERT [dbo].[khachhang] ON 

INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (1, N'Ngô Đình Tiệp', 0, N'Quang Minh - Mê Linh - Hà Nội', N'0974314483', N'tiepndph14025@fpt.edu.vn')
INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (2, N'Tạ Thị Hiền', 1, N'Sóc Sơn - Hà Nội', N'0975312468', N'tth@gmail.com')
INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (3, N'Bé Kẹo Mút', 1, N'Quang Minh - Mê Linh - Hà Nội', N'0974264451', N'75wouldbeperfect@gmail.com')
INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (4, N'Nguyễn Minh Quân', 0, N'Sóc Sơn - Hà Nội', N'09784516244', N'quan@gmail.com')
INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (5, N'Nguyễn Chí Công', 0, N'Sóc Sơn - Hà Nội', N'03448323232', N'hainaichuoixanh@gmail.com')
INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (6, N'Nguyễn Minh Phương', 1, N'Nghệ An', N'09823232323', N'phuong@gmail.com')
INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (7, N'Tạ Thanh Xuân', 1, N'Nghệ An', N'09237253343', N'xuan@gmail.com')
INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (8, N'Trần Việt Dũng', 0, N'Hà Nội', N'02312312312', N'dung@gmail.com')
INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (9, N'Nguyễn Hoàng Linh', 1, N'Thanh Hóa', N'07242949242', N'linh@gmail.com')
INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (10, N'Hoàng Văn Nhân', 0, N'Nghệ An', N'09537852385', N'nhan@gmail.com')
INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (11, N'Trần Minh Vợ Tiệp', 1, N'Quang Minh - Mê Linh - Hà Nội', N'0123456789', N'votiep@gmail.com')
INSERT [dbo].[khachhang] ([idkhachhang], [tenkhachhang], [gioitinh], [diachi], [sodienthoai], [email]) VALUES (12, N'Đặng Hoàng Hải', 0, N'Thanh Hóa', N'09427724722', N'hai@gmail.com')
SET IDENTITY_INSERT [dbo].[khachhang] OFF
GO
SET IDENTITY_INSERT [dbo].[magiamgia] ON 

INSERT [dbo].[magiamgia] ([idmagiamgia], [magiamgia], [giatri], [soluong], [ngaybatdau], [ngayketthuc]) VALUES (1, N'BKM75', 30, 10, CAST(N'2021-11-30T00:00:00.000' AS DateTime), CAST(N'2021-12-02T00:00:00.000' AS DateTime))
INSERT [dbo].[magiamgia] ([idmagiamgia], [magiamgia], [giatri], [soluong], [ngaybatdau], [ngayketthuc]) VALUES (2, N'OIZOIOI', 75, 11, CAST(N'2021-11-30T00:00:00.000' AS DateTime), CAST(N'2021-12-01T00:00:00.000' AS DateTime))
SET IDENTITY_INSERT [dbo].[magiamgia] OFF
GO
SET IDENTITY_INSERT [dbo].[hoadon] ON 

INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (1, 1, 1, NULL, CAST(N'2021-01-29T06:25:23.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (2, 2, 1, NULL, CAST(N'2021-03-29T06:27:09.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (3, 2, 1, NULL, CAST(N'2021-06-29T06:28:03.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (4, 2, 1, NULL, CAST(N'2021-01-29T06:28:26.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (5, 3, NULL, NULL, CAST(N'2021-03-30T08:29:25.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (6, 3, 2, NULL, CAST(N'2021-11-20T08:35:51.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (7, 3, 2, NULL, CAST(N'2021-08-30T08:36:17.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (8, 4, 2, NULL, CAST(N'2021-10-10T08:37:22.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (9, 5, 2, NULL, CAST(N'2021-08-30T08:38:14.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (10, 6, 2, NULL, CAST(N'2021-11-30T08:39:22.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (11, 7, 3, NULL, CAST(N'2021-02-14T08:40:17.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (12, 8, NULL, NULL, CAST(N'2021-11-30T04:09:31.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (13, 9, NULL, NULL, CAST(N'2021-02-01T04:10:42.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (14, 10, NULL, NULL, CAST(N'2021-11-30T04:11:24.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (15, 3, NULL, NULL, CAST(N'2021-11-30T04:13:49.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (16, 2, NULL, 2, CAST(N'2021-10-16T04:14:20.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (17, 11, 1, 2, CAST(N'2021-02-15T04:16:07.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (18, 11, 3, NULL, CAST(N'2021-03-30T04:17:55.000' AS DateTime))
INSERT [dbo].[hoadon] ([idhoadon], [khachhang], [nhanvien], [magiamgia], [ngayxuathoadon]) VALUES (19, 12, 1, NULL, CAST(N'2021-11-30T04:42:51.000' AS DateTime))
SET IDENTITY_INSERT [dbo].[hoadon] OFF
GO
SET IDENTITY_INSERT [dbo].[nhacungcap] ON 

INSERT [dbo].[nhacungcap] ([idnhacungcap], [tennhacungcap], [ngayhoptac], [diachi], [sodienthoai], [trangthai]) VALUES (1, N'Pet xinh', CAST(N'2021-11-28T00:00:00.000' AS DateTime), N'Hồ Chí Minh', N'02873040479', 1)
INSERT [dbo].[nhacungcap] ([idnhacungcap], [tennhacungcap], [ngayhoptac], [diachi], [sodienthoai], [trangthai]) VALUES (2, N'Thú Kiểng', CAST(N'2021-11-28T00:00:00.000' AS DateTime), N'Hà Nội', N'01239853946', 1)
INSERT [dbo].[nhacungcap] ([idnhacungcap], [tennhacungcap], [ngayhoptac], [diachi], [sodienthoai], [trangthai]) VALUES (3, N'AZPet', CAST(N'2021-11-28T00:00:00.000' AS DateTime), N'Hà Nội', N'0888083388', 1)
INSERT [dbo].[nhacungcap] ([idnhacungcap], [tennhacungcap], [ngayhoptac], [diachi], [sodienthoai], [trangthai]) VALUES (4, N'Dog Paradise', CAST(N'2021-11-28T00:00:00.000' AS DateTime), N'Hồ Chí Minh', N'0902360086', 1)
INSERT [dbo].[nhacungcap] ([idnhacungcap], [tennhacungcap], [ngayhoptac], [diachi], [sodienthoai], [trangthai]) VALUES (5, N'J&Pet', CAST(N'2021-11-28T00:00:00.000' AS DateTime), N'Hà Nội', N'0944555881', 1)
INSERT [dbo].[nhacungcap] ([idnhacungcap], [tennhacungcap], [ngayhoptac], [diachi], [sodienthoai], [trangthai]) VALUES (6, N'Lolipet', CAST(N'2021-11-28T00:00:00.000' AS DateTime), N'Hà Nội', N'0919981000', 1)
INSERT [dbo].[nhacungcap] ([idnhacungcap], [tennhacungcap], [ngayhoptac], [diachi], [sodienthoai], [trangthai]) VALUES (7, N'Trại chó Lê Trung', CAST(N'2021-11-28T00:00:00.000' AS DateTime), N'Hồ Chí Minh', N'0934068670', 1)
INSERT [dbo].[nhacungcap] ([idnhacungcap], [tennhacungcap], [ngayhoptac], [diachi], [sodienthoai], [trangthai]) VALUES (8, N'Pet House', CAST(N'2021-11-28T00:00:00.000' AS DateTime), N'Đà Nẵng', N'02862719893', 1)
INSERT [dbo].[nhacungcap] ([idnhacungcap], [tennhacungcap], [ngayhoptac], [diachi], [sodienthoai], [trangthai]) VALUES (9, N'SC Dog Shop', CAST(N'2021-11-28T00:00:00.000' AS DateTime), N'Hồ Chí Minh', N'0933789888', 1)
SET IDENTITY_INSERT [dbo].[nhacungcap] OFF
GO
SET IDENTITY_INSERT [dbo].[loaisanpham_phukien] ON 

INSERT [dbo].[loaisanpham_phukien] ([idloaisanpham_phukien], [tenloaisanpham_phukien]) VALUES (1, N'Đồ ăn')
INSERT [dbo].[loaisanpham_phukien] ([idloaisanpham_phukien], [tenloaisanpham_phukien]) VALUES (2, N'Đồ chơi')
INSERT [dbo].[loaisanpham_phukien] ([idloaisanpham_phukien], [tenloaisanpham_phukien]) VALUES (3, N'Dây cổ')
INSERT [dbo].[loaisanpham_phukien] ([idloaisanpham_phukien], [tenloaisanpham_phukien]) VALUES (4, N'Chuồng')
SET IDENTITY_INSERT [dbo].[loaisanpham_phukien] OFF
GO
SET IDENTITY_INSERT [dbo].[sanpham_phukien] ON 

INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (1, 1, N'Thức ăn cho chó lớn CP Classic Vị bò  ', 4, 1785, N'Túi', 50.0000, N'Thể tích: 2kg
Xuất xứ: Thái Lan', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\thucanchocholoncpclassicvibo29112021044134.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (2, 1, N'Royal canin – Chihuahua junior', 6, 2000, N'Túi', 40.0000, N'Thể tích: 500gr
Xuất xứ: Pháp', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\royalcanin–chihuahuajunior29112021044210.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (3, 1, N'Thức ăn chó Pedigree vị gà & rau củ dạng túi   ', 5, 2000, N'Túi', 50.0000, N'Thể tích: 1.5kg
Xuất xứ: Mỹ', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\thucanchopedigreeviga&raucudangtui29112021044238.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (4, 1, N'Thức ăn cho chó nhỏ SmartHeart Gold Puppy', 4, 1500, N'Túi', 80.0000, N'Thể tích: 1kg
Xuất xứ: Thái Lan', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\thucanchochonhosmartheartgoldpuppy29112021044312.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (5, 1, N'Thức ăn cao cấp NutriSource thịt gà, đậu Hà Lan (cho chó nhỏ)   ', 5, 2488, N'Túi', 40.0000, N'Thể tích: 142g
Xuất xứ: Tuffy’s Pet Foods, Inc. USA', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\thucancaocapnutrisourcethitgaddauhalan(chochonho)29112021044910.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (6, 1, N'Thức ăn cao cấp NutriSource thịt cá hồi tươi (cho chó nhỏ)  ', 6, 1900, N'Túi', 30.0000, N'Thể tích: 142g
Xuất xứ: Tuffy’s Pet Foods, Inc. USA', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\thucancaocapnutrisourcethitcahoituoi(chochonho)29112021051627.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (7, 1, N'Thức ăn cao cấp Pure Vita cá hồi, đậu Hà Lan   ', 5, 939, N'Túi', 50.0000, N'Thể tích: 2.3kg
Xuất xứ: Tuffy’s Pet Foods, Inc. USA', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\thucancaocappurevitacahoiddauhalan29112021051702.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (8, 1, N'Thức ăn cao cấp Pure Vita gà tây, khoai lang', 8, 1500, N'Túi', 55.0000, N'Thể tích: 2.3kg
Xuất xứ: Tuffy’s Pet Foods, Inc. USA', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\thucancaocappurevitagataydkhoailang29112021051730.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (9, 1, N'Thịt Meat Jerky hương vị bò xông khói ', 5, 2360, N'Túi', 19.0000, N'Thể tích: 80g
Xuất xứ: Hoa Kỳ', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\thitmeatjerkyhuongviboxongkhoi29112021051805.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (10, 1, N'Thức ăn cho chó lớn Smart Heart Vị Bò ', 3, 480, N'Túi', 30.0000, N'Thể tích: 400g
Xuất xứ: Thái Lan', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\thucanchocholonsmartheartvibo29112021051836.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (11, 1, N'Thức Ăn Cho Chó Pedigree Beef', 5, 2980, N'Túi', 30.0000, N'Thể tích: 130g
Xuất xứ: Thái Lan', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\thucanchochopedigreebeef29112021051919.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (12, 1, N'Thức ăn cho chó Classic Puppy', 7, 1869, N'Túi', 60.0000, N'Thể tích: 400g (bao 10kg)
Xuất xứ: Thái Lan', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\thucanchochoclassicpuppy29112021052002.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (13, 1, N'Pate cho mèo vị cá ngừ và gà IRIS Tuna Chicken Cat Food', 5, 2980, N'Hộp', 25.0000, N'Pate cho mèo vị cá ngừ và gà IRIS Tuna Chicken Cat Food bao gồm cá ngừ, thịt gà, Protein thực vật, Xylooligosaccharides, taurine. Phân tích thành phần: hơn 9% Protein, chất béo trên 1%, chất xơ thô dưới 0,5%. Độ ẩm dưới 82%.

', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\patechomeovicanguvagairistunachickencatfood29112021052215.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (14, 1, N' Pate cho mèo vị cá ngừ IRIS Bonito Tuna', 2, 989, N'Túi', 50.0000, N'Pate cho mèo vị cá ngừ IRIS Bonito Tuna Wet Cat Food bao gồm: cá ngừ, muối, Taurine, Carrageenan. Phân tích thành phần Protein thô trên 7%, chất béo thô > 1,5%, xơ thô > 0,3%, tro thô < 0,5%, độ ẩm < 84%.

', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\patechomeovicanguirisbonitotuna29112021052309.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (15, 1, N'Xương cho chó gặm vị thịt bò VEGEBRAND Meat Beef Bone Small ', 4, 248, N'Túi', 75.0000, N'Xương cho chó gặm vị thịt bò VEGEBRAND  Meat Beef Bone Small là thức ăn dinh dưỡng dành cho mọi kích cỡ và lứa tuổi chó cưng.

', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\xuongchochogamvithitbovegebrandmeatbeefbonesmall29112021052402.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (16, 2, N'Đồ chơi chuột tròn Stripe (cho mèo) ', 6, 300, N'Túi combo 4 chiếc', 90.0000, N'(Thông tin chi tiết...)', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\dochoichuottronstripe(chomeo)29112021052600.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (17, 2, N'Đồ chơi hình đùi gà ', 6, 400, N'Chiếc', 70.0000, N'Đồ chơi có thể phát ra âm thanh "chút chít" mỗi lần cún chơi giúp kích thích sự tò mò, vui thích cho cún cưng.
Được làm từ nhựa không độc hại, an toàn cho thú cưng khi cắn và vui chơi, kiểu dáng và màu sắc tươi tắn, bền đẹp
Giúp cho thú cưng không còn nhai hoặc cắn các vật dụng trong nhà. 
', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\dochoihinhduiga29112021052736.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (18, 2, N'Đồ chơi hình con gà', 7, 1000, N'Chiếc', 55.0000, N'Đối tượng: Thú lớn hay nhỏ đều được
Mô tả: Đồ chơi có khả năng phát ra tiếng la hét giúp vui nhộn, thú cưng rất thích chơi, ôm cả ngày không chán.
Công dụng: Sản phẩm có thể dùng để huấn luyện, vui đùa cùng thú cưng rất tiện dụng.
Màu sắc: Vàng

Chất liệu: Nhựa

Có 3 size

Size S 17cm
Size M 34cm
Size L 40cm', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\dochoihinhconga29112021052828.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (19, 2, N'Banh nhựa gai có tiếng ', 7, 1000, N'Combo 2 cái', 65.0000, N'Khi nuôi thú cưng, việc chơi đùa với chúng là vô cùng quan trọng.

Một là bạn giúp cho chúng được vận động, giải tỏa năng lượng, giảm stress, việc này giúp bạn hạn chế tối đa việc đùa nghịch phá phách của cún trong nhà
Hai là trong quá trình chơi đùa sẽ làm tăng khả năng kết nối giữa người và vật nuôi, giúp sợi dây tình cảm giữa chủ nuôi và thú cưng ngày càng bền chặt, sâu sắc.
Đồ chơi làm từ cao su thiên nhiên không độc hại, phát ra tiếng kêu giúp thu hút thú cưng, tăng sự hứng thú với đồ chơi
Đường kính: 6cm

Màu sắc: Vàng, hồng, cam, xanh', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\banhnhuagaicotieng29112021052916.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (20, 2, N'Vòng gai cho cún', 5, 1497, N'Chiếc', 66.0000, N'Công dụng: Giúp cho chúng được vận động, xả năng lượng, giảm stress.
Nguyên liệu: Đồ chơi làm từ cao su thiên nhiên không độc hại, phát ra tiếng kêu giúp thu hút thú cưng, tăng sự hứng thú với đồ chơi
Đường kính: 9cm

Màu sắc: hồng, xanh', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\vonggaichocun29112021052948.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (21, 2, N'Đĩa bay cho chó ', 5, 3000, N'Chiếc', 90.0000, N'Công dụng: Dùng để ném xa cho chú chó chạy theo chụp lại, rèn luyện được khả năng bắt đồ vật và nhảy cao của chú chó, chắc chắn sẽ giúp bạn và thú cưng có thời gian thư giãn tốt nhất
Kích thước : 20cm

Trọng lượng : 120g

Vật liệu: nhựa PP

Màu sắc: Hồng, vàng, xanh', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\diabaychocho29112021053019.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (22, 2, N'Đồ Chơi Cao Su Xiên Bánh Gặm ', 7, 3000, N'Chiếc', 10.0000, N'Chất liệu: cao su dẻo

Màu sắc: Nhiều màu sắc bắt mắt

Kích thước

3 Bánh: Dài 8cm
4 Bánh: Dài 9cm
5 Bánh: Dài 11cm
6 Bánh: Dài 13cm
7 Bánh: Dài 14cm', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\dochoicaosuxienbanhgam29112021053120.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (23, 2, N'Đồ chơi Hotdog cho chó', 6, 100, N'Chiếc', 150.0000, N'Thích hợp cho thú cưng gặm để sạch răng, không cắn đồ lung tung
Khi thú gặm sẽ làm sạch mảng bám trên răng
Cao su rất dai và bền, sẽ chơi được lâu
Có thể dùng để huấn luyện, vui đùa cùng thú cưng
Tiện dụng, tận hưởng niềm vui
', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\dochoihotdogchocho29112021053201.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (24, 2, N'Đồ chơi chút chít hamburger cho chó ', 6, 2599, N'Chiếc', 35.0000, N'Đồ chơi cho chó được sản xuất từ cao su mềm không gây độc hại cho thú cưng .
Với màu sắc như thật, âm thanh chút chít đáng yêu sẽ khiến cho cún cưng không cảm thấy cô đơn khi ở nhà một mình.
Kích thước 4.5 x 8 (cm)

Chất liệu cao su cao cấp,

', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\dochoichutchithamburgerchocho29112021053259.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (25, 2, N'Đồ chơi xương giả cho chó – đồ chơi xương chút chít – Xương vàng dài ', 4, 855, N'Chiếc', 30.0000, N'Giúp cho thú cưng không còn nhai hoặc cắn các vật dụng trong nhà .
Đồ chơi sẽ phát ra tiếng “chút chít” khi thú cưng cắn vào , tạo sự vui thích cho thú cưng
Kích thước: 15x4cm

Sản phẩm được làm từ nhựa không độc hại với kiểu dáng và màu sắc tươi tắn.

', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\dochoixuonggiachocho–dochoixuongchutchit–xuongvangdai29112021053337.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (26, 2, N'Đồ Chơi Bóng Cho Chó ', 7, 1000, N'Trái', 12.0000, N'Đồ chơi bóng được làm từ chất liệu an toàn, màu sắc thu hút,
Tác dụng: Giúp thú cưng hăng say chơi với quả bóng, tạo sự vận động khỏe mạnh.
Đường kính : 4,5 cm

+ Sản phẩm có in nhiều hình, màu sắc đa dạng

', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\dochoibongchocho29112021053406.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (27, 3, N'Vòng cổ đệm cho chó', 6, 1000, N'Chiếc', 150.0000, N'Nhìn sơ qua là thấy em ấy khá sang nhờ có bộ khuyên và móc khóa inox sáng bóng kết hợp với vòng màu đa sắc. 

Vòng cổ đẹp cho chó dùng được cho chú cún bé xinh và cả mấy ông boss có ngoại hình hầm hố. Đơn giản là vì vòng được đục nhiều lỗ khuyên, dễ tăng chỉnh chiều dài cho vừa vặn với mọi cỡ cổ.

Đã vậy, nó còn có 5 size khác nhau với kích thước tăng dần giúp bạn lựa chọn được cái phù hợp nhất cho cún yêu.

Quan trọng nhất là mấy bé cún không bị trầy xước da khi đeo vòng nhờ lớp da đệm bên trong vòng cổ.

Còn ở bên ngoài của nó làm bằng chất liệu dù chống nước rất tốt. Hôm nào boss bị dầm mưa cũng không lo vòng ướt khiến anh ấy cảm thấy khó chịu.

Cơ mà nó không có dây xích, cũng không có chuông hay bảng tên đi kèm gì cả.  Bạn phải tốn thêm tiền để mua sắm mấy thứ đó.

', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\vongcodemchocho29112021053538.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (28, 3, N'Vòng cổ phản quang cho chó', 2, 1000, N'Chiếc', 160.0000, N'Vòng cổ phản quang cho chó lúc đêm tối phát ra ánh sáng nhìn khá là thích mắt.

Trên vòng có một chiếc chuông nhỏ, mỗi lần ông boss đi qua đi lại trong nhà là nghe tiếng leng keng vui tai. Nhờ tiếng chuông này mà muốn tìm thú cưng ở đâu cũng không còn khó nữa.

Nhưng mà bạn cũng cần lưu ý là chuông chó rất dễ bị rơi ra nếu như cún nhà quá hiếu động hoặc chơi đùa quá mạnh.

Bù lại một điểm cộng là bạn có thể dùng nó khá lâu, từ lúc bé cún còn nhỏ cho đến khi nó trở thành chú chó trưởng thành. Vì vòng dễ điều chỉnh độ dài đến 32 cm.

Có điều bề rộng của vòng chỉ có 1cm. Nó chỉ thích hợp đeo cho mấy giống chó có ngoại hình be bé như chó Póc, chó Chi hua hua,… Chứ bạn mà đeo cho chó becgie nhìn chả cân xứng chút nào cả.

', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\vongcophanquangchocho29112021053606.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (29, 3, N'Vòng cổ cà vạt cho chó mèo nhỏ', 3, 300, N'Chiếc', 100.0000, N'Vòng cổ hình cà vạt giúp cho ông boss nhà bạn trở nên điển trai và lịch lãm. Thêm bộ chuông bóng loáng bên trên trông anh ý cực sang chảnh và vô cùng thần thái.

Cơ mà kích thước của vòng không quá lớn nên bạn chỉ có thể dùng được cho giống chó nhỏ như poodle, Bắc Kinh hoặc chó Nhật. Nó không đeo vừa mấy anh chó sư tử hay chó bẹc ghê có kích thước quá to.

Cầm vòng cổ trên tay bạn sẽ cảm thấy rất nhẹ nhàng mà lại còn mềm mịn. Đeo vào cho ông boss rất hiếm khi bị phản kháng.

Lúc nào muốn tháo ra, bạn chỉ cần bật bộ khóa một cái là xong, không rườm rà gì cả.

Nhưng bạn cần phải nhẹ tay thôi, vì bộ khóa làm bằng nhựa dễ bị vỡ nếu chịu lực quá mạnh.

', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\vongcocavatchochomeonho29112021053633.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (30, 3, N'Combo dây dắt và vòng cổ vải dù nhiều màu', 4, 1000, N'Chiếc', 200.0000, N'Đây là chiếc vòng cổ 2 trong 1 vì nó được trang bị thêm bộ dây dắt tiện lợi để bạn dẫn thú cưng đi dạo mỗi buổi chiều.

Điểm tôi thích nhất ở em ấy chính là các họa tiết xinh xắn được in trên bề mặt vòng cổ. Nó có đủ màu, từ hồng, xanh, đỏ, cam cho đến vàng, đen, xám để bạn chọn cho chú chó đực hoặc chó cái ở nhà.

Tùy vào kích thước vòng cổ của chú khuyển là nhỏ hay lớn mà bạn có thể tùy chỉnh chiều dài tương ứng cho bộ vòng. Mua em này xài khá lâu do nó không bị chật như một số loại khác không có khóa tăng chỉnh.

Tuy nhiên, tôi cũng cảnh báo với bạn rằng chú cún nào có làn da quá nhạy cảm thì nên hạn chế dùng vòng này. Bởi vì bên trong vòng đeo không có lót lớp da mềm mại như vòng cổ đệm cho chó.

', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\combodaydatvavongcovaidunhieumau29112021053704.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (31, 3, N'Vòng đeo cổ đính chuông lục lạc', 2, 999, N'Chiếc', 90.0000, N'Nhìn nó cứ giống như cầu vồng đa sắc. Nếu mà nhẩm đếm, thì trên thân vòng có không dưới 10 màu sắc khác nhau được đan xen vô cùng tinh tế. 

Nhưng kiểu dáng của em ấy trông hơi nữ tính nên phù hợp sử dụng cho những chú chó cái hơn là chó đực.

Nó có đủ 4 size S, M, L, XL cho bạn lựa chọn theo kích cỡ cổ thú. 

Trên vòng có một chiếc lục lạc khá to phát ra tiếng kêu rất lớn mỗi khi bé cún di chuyển khắp nhà. Lúc nào không thấy bóng dáng của ẻm ở đâu nữa, bạn dễ dàng nghe theo tiếng chuông để tìm “trẻ lạc”.

Nếu mà bạn xài kỹ, thì có thể dùng vòng cổ đến vài năm là chuyện bình thường. Bởi nó làm bằng sợi polyester được đan dệt khá chắc.

Tuy nhiên, vòng dễ bám bẩn. Muốn tẩy hết vết bẩn phải mất nhiều công sức.', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\vongdeocodinhchuongluclac29112021053736.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (32, 3, N'Vòng cổ trị ve rận KILTIX cho chó ', 4, 1998, N'Chiếc', 100.0000, N'Vòng cổ KILTIX nhìn thiết kế thì không có gì đặc biệt, nếu không muốn nói là quá đơn giản. So với mấy mẫu vòng kể trên, em này không đẹp mắt cho lắm.

Nhưng mà đổi lại nó làm bằng nhựa cao su khá dẻo dai. Bạn muốn chỉnh chiều dài lớn nhỏ ra sao, kéo nhẹ cái là được.

Mẫu vòng này dùng khá ổn cho mấy bé cún từ vài ký cho đến tận 20kg nên không lo mau chật.

Đeo nó vào cổ chó nhà bé rất hợp tác, vì vòng vừa mềm, vừa mịn, không khó chịu chút nào cả.

Tuyệt vời nhất là nó có thể tiêu diệt hết lũ ve rận đang hút máu cún cưng mỗi ngày.

Nhưng giá bán của ẻm cũng khá đắt đỏ. Thậm chí là đắt nhất từ nãy đến giờ.

', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\vongcotriverankiltixchocho29112021053810.jpg')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (33, 4, N'Chuồng chó inox lắp ghép A1 ', 9, 1500, N'Chiếc', 500.0000, N'– Kích thước: dài – rộng – cao là 94cm x 64cm x 80cm.

– Phù hợp với các loại chó ta, chó phú quốc,… trọng lượng khoảng 20-30kg.

– Kiến trúc hình hộp vững chắc, tránh rung lắc, lật ngang.

– Chất liệu bền, không gỉ.

– Có tấm lót và bánh xe, thuận lợi cho việc vệ sinh và di chuyển.', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\chuongchoinoxlapghepa129112021054054.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (34, 4, N'Chuồng chó inox đôi ', 5, 300, N'Chiếc', 400.0000, N'– Chuồng có vách ngăn đôi, tránh việc chó cắn nhau.

– Chất liệu bền, chắc, đẹp, không gỉ.

– Có tấm lót ở dưới, thuận lợi cho việc cọ rửa, vệ sinh.

– Có bánh xe giúp di chuyển dễ dàng hơn.

– Có thể tháo ráp, vận chuyển dễ dàng.', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\chuongchoinoxdoi29112021054135.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (35, 4, N'Lồng chó quả dâu', 6, 998, N'Chiếc', 800.0000, N'– Làm từ vật liệu cotton, tạo cho thú cưng sự thông thoáng, thoải mái.

– Dễ dàng vệ sinh.

– Phù hợp với khí hậu nóng.', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\longchoquadau29112021054205.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (36, 4, N'Lồng chó vải hoa', 6, 3000, N'Chiếc', 800.0000, N'– Chất liệu cứng cáp và ấm áp.

– Mẫu mã đa dạng, nhiều hãng khác nhau.

– Dễ dàng dọn dẹp vệ sinh.

– Thuận lợi cho di chuyển.', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\longchovaihoa29112021054313.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (37, 4, N'Túi vận chuyển chó mèo phi hành gia nhựa', 5, 299, N'Chiếc', 899.0000, N'– Hình dạng bắt mắt, màu sắc đa dạng.

– Chất liệu bền, chắc, tránh cho thú cưng cắn xé, làm hỏng.

– Nhẹ, gọn, phù hợp với việc đi xa hay đi du lịch.', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\tuivanchuyenchomeophihanhgianhua29112021054357.png')
INSERT [dbo].[sanpham_phukien] ([idsanpham_phukien], [loaisanpham_phukien], [tensanpham_phukien], [nhacungcap], [soluong], [donvitinh], [dongia], [chitietsanpham], [huongdansudung], [hinhanh]) VALUES (38, 4, N'Giường hình gối hoặc giường nệm ', 6, 3000, N'Chiếc', 1000.0000, N'– Được thiết kế thành cái gối to hay giường nệm mini.

– Có nhiều kiểu dáng, mẫu mã đa dạng.

– Ấm áp và mềm mại.', N'(Hướng dẫn sử dụng...)', N'data\img\sanpham_phukien\giuonghinhgoihoacgiuongnem29112021054641.png')
SET IDENTITY_INSERT [dbo].[sanpham_phukien] OFF
GO
SET IDENTITY_INSERT [dbo].[chungloai] ON 

INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (1, N'Chó', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (2, N'Mèo', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (3, N'Thỏ', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (4, N'Chuột', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (5, N'Tắc kè', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (6, N'Rắn', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (7, N'Nhện', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (8, N'Sóc', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (9, N'Nhím', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (10, N'Khỉ', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (11, N'Rái cá', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (12, N'Lợn', N'')
INSERT [dbo].[chungloai] ([idchungloai], [tenchungloai], [dacdiemnhandang]) VALUES (13, N'Cá', N'')
SET IDENTITY_INSERT [dbo].[chungloai] OFF
GO
SET IDENTITY_INSERT [dbo].[thucung] ON 

INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (1, 1, N'Chó Alaska (Alaskan Malamute) ', 5, 0, N'Trắng xám', 4, 720.0000, N'Không có gì ngạc nhiên khi chó tuyết Alaska là một trong những ứng cử viên giữ vị trí quán quân trong danh sách các loại giống chó đẹp trên thế giới. Là một nhánh của giống chó sói tuyết Bắc Cực, lại trải qua quá trình lai tạo với các giống chó lớn hơn, Alaska ngày nay sở hữu vẻ ngoài cứng rắn, kiên cường và nhanh nhẹn đáng kinh ngạc. Dù diện bất cứ trang phục – phụ kiện cho chó nào thì Alaska cũng luôn nổi bật, tự tin trước mọi ánh nhìn.

', N'data\img\thucung\choalaska(alaskanmalamute)28112021054908.png', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (2, 1, N'Chó Husky (Husky Siberian) ', 8, 0, N'Đen trắng', 5, 600.0000, N'(Thông tin chi tiết...)Cũng là một dòng chó kéo xe với bộ lông dày và vẻ ngoài oai vệ nên nhiều người nhầm lẫn giữa chó Husky với Alaska. Tuy nhiên, nếu quan sát kỹ bạn sẽ nhận thấy Husky có khuôn mặt dữ tợn và bộ lông ngắn hơn nên trông chúng nhỏ hơn rất nhiều, thậm chí chỉ bằng 1/2 hoặc 1/3 Alaska. Để bộ lông của Husky luôn óng ả thì bạn nên dùng dụng cụ grooming cho chó chuyên nghiệp.

', N'data\img\thucung\chohusky(huskysiberian)28112021054314.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (3, 1, N'Chó Samoyed', 2, 1, N'Trắng', 5, 423.0000, N'Thêm một cái tên chứng tỏ sức hút của chó tuyết Siberia, đồng thời cũng là họ hàng gần của Alaska và Husky. Vẻ đẹp của Sam (tên trìu mến của Samoyed) đến từ bộ lông trắng như tuyết, thân hình cân đối và khuôn mặt hiền lành, thân thiện.', N'data\img\thucung\chosamoyed28112021054536.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (4, 1, N'Chó Pitbull (American Pit Bull Terrier) ', 7, 0, N'Nâu', 4, 535.0000, N'Chó Pitbull có nguồn gốc từ Anh, sau đó được đưa sang Mỹ và huấn luyện để trở thành chó chiến và cho đến ngày nay, chúng đã được thuần hóa để nuôi làm chó cảnh trong gia đình. Tuy nổi tiếng là hung dữ nhưng vẻ ngoài vạm vỡ, vạm vỡ của chúng được rất nhiều người yêu thích và xếp vào top những giống chó đẹp nhất.

', N'data\img\thucung\chopitbull(americanpitbullterrier)28112021054817.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (5, 1, N'Chó Corgi', 9, 0, N'Nâu xám', 2, 230.0000, N'Chó Corgi có nguồn gốc từ xứ Wales của Anh, được công nhận là giống chó chân ngắn đẹp nhất thế giới. Cặp chân ngắn, mông to và khuôn mặt ngộ nghĩnh là những điểm giúp Corgi dễ dàng "hạ gục" những người yêu chó dù giá của chúng khoảng 15 triệu đồng, chưa kể tiền mua trang phục – phụ kiện cho chó, sữa – vitamin – thuốc cho chó, …

', N'data\img\thucung\chocorgi28112021054901.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (6, 1, N'Chó Poodle', 3, 0, N'Nâu', 6, 500.0000, N'Từng được sử dụng như một giống chó săn lớn ở các vùng đầm lầy ở Châu Âu, nhưng giờ đây Poodle đã trở thành giống chó cảnh phổ biến trên thế giới. Điều khiến Poodle trở nên đáng yêu chính là bộ lông xoăn dày, tính cách vui tươi, gần gũi. Không chỉ nằm trong danh sách những giống chó đẹp nhất thế giới mà Poodle còn rất được yêu thích vì dễ nuôi, thông minh và dễ nuôi; có giá bán hợp lý từ 5 triệu trở lên.', N'data\img\thucung\chopoodle28112021054935.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (7, 1, N'Chó Phốc Sóc (Pomeranian) ', 5, 1, N'Trắng', 3, 600.0000, N'Tương tự như Poodle, Pomeranian luôn khiến chúng ta phải trầm trồ trước vẻ đẹp xinh xắn và đáng yêu của mình, đặc biệt là đối với những fan của chó poodle. Giống chó nhỏ này cũng có khả năng thích nghi tốt với môi trường sống, có thể nuôi trong các căn hộ nhỏ. Bé có thể chơi ngoan với các đồ chơi cho chó cả ngày', N'data\img\thucung\chophocsoc(pomeranian)28112021055005.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (8, 1, N'Chó American Eskimo', 3, 1, N'Trắng', 2, 1000.0000, N'Eskimo là giống chó có ngoại hình vô cùng xinh đẹp với bộ lông trắng dày phủ khắp cơ thể, khuôn mặt nhỏ nhắn và đôi mắt đen láy. Eskimo còn được thế giới biết đến là giống chó được giới quý tộc Anh nuôi phổ biến và là thú cưng của Nữ hoàng Charlotte', N'data\img\thucung\choamericaneskimo28112021055036.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (9, 1, N'Chó Akita Inu', 2, 1, N'Trắng nâu', 4, 800.0000, N'Với ngoại hình cân đối hoàn hảo, dáng vẻ uy nghiêm, lịch lãm, quý phái, Akita Inu không chỉ là “quốc khuyển” của đất nước mặt trời mọc mà còn nằm trong top những giống chó đẹp nhất thời điểm hiện tại. Đặc biệt, ở chúng còn có sự tận tâm, trung thành mà không loài chó nào có thể sánh được.



', N'data\img\thucung\choakitainu28112021055244.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (10, 2, N'Mèo Abyssinian ', 5, 1, N'Nâu đen', 2, 300.0000, N'Giống Mèo Abyssinian hay được gọi là mèo Aby vượt trội trong việc học các thủ thuật và chúng thậm chí còn giỏi hơn trong việc huấn luyện mọi người làm những gì chúng muốn.

Mèo Abyssinians có thể sống từ 15 tuổi trở lên.

Nhờ bản tính ham học hỏi, có tính xã hội cao, chúng có thể được dạy để đi bộ bằng dây xích.

Mèo Aby được lai tạo ở Mỹ lần đầu tiên vào năm 1935', N'data\img\thucung\meoabyssinian28112021055431.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (11, 2, N'Mèo Aegean', 3, 0, N'Trắng đen', 3, 500.0000, N'Mèo Aegean có một cơ thể gầy, cơ bắp được bao phủ bởi một lớp lông hai màu hoặc ba màu trắng với đen, đỏ, xanh lam hoặc kem. Một số có dấu tabby.

Mèo Aegean có đôi mắt màu xanh lục, hình quả hạnh', N'data\img\thucung\meoaegean28112021055513.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (12, 2, N'Mèo Mỹ đuôi cộc ', 4, 0, N'Trắng nâu/ Vàng đen', 3, 300.0000, N'Mèo Mỹ đuôi cộc tiếng anh American Bobtail có đuôi rất ngắn, là kết quả của một đột biến tự nhiên.

Chúng có bộ lông xù xì từ trung bình đến dài, có thể có bất kỳ màu sắc hoặc hoa văn nào.

', N'data\img\thucung\meomyduoicoc28112021055554.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (13, 2, N'Mèo Bali', 5, 0, N'Trắng', 3, 555.0000, N'Giống mèo Bali có tên tiếng anh Balinese. Mèo Bali trông giống như một con Xiêm dài và có các màu sắc tương tự như màu Xiêm: hải cẩu, sô cô la, xanh lam và hoa cà.

Mèo Bali rất năng động và có giọng hát. chúng muốn tham gia vào mọi thứ đang diễn ra trong nhà.

Giữ một con mèo Bali trong nhà để bảo vệ nó khỏi ô tô, các bệnh lây lan bởi những con mèo khác và các cuộc tấn công từ các động vật khác.

Mèo Bali là một con mèo hay nói chuyện; chúng sẽ nói chuyện với bạn nếu bạn để chúng.

', N'data\img\thucung\meobali28112021060604.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (14, 2, N'Mèo Birman', 5, 1, N'Đen trắng', 4, 700.0000, N'Giống mèo này lần đầu tiên được nhập khẩu vào Hoa Kỳ vào những năm 1960.

Mèo Birman phải có bốn bàn chân trắng, với kiểu được mô tả là “găng tay và dây buộc”.

Mèo Birman có một chiếc mũi La Mã đặc biệt.

Đây là những con mèo thông minh phát triển mạnh trong trò chơi tương tác, chẳng hạn như đồ chơi xếp hình.

Các chú mèo Birman liên tục lọt vào danh sách mười người hàng đầu ở Hoa Kỳ.', N'data\img\thucung\meobirman28112021060642.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (15, 2, N'Mèo Bombay ', 4, 0, N'đen', 2, 900.0000, N'Khi bạn nhìn vào một con mèo Bombay, bạn sẽ thấy một con mèo cơ bắp, kích thước trung bình. Nếu bạn đến đón chúng, bạn sẽ thấy rằng chúng đẹp hơn vẻ ngoài của chúng.

Để duy trì kiểu cơ thể và kết cấu bộ lông của mèo Bombay, các nhà lai tạo đôi khi có thể lai với mèo Miến Điện, một trong những giống bố mẹ của mèo Bombay. Việc lai xa Mỹ hoặc lai ngắn trong nước hiếm khi được thực hiện vì kiểu cơ thể không giống nhau.

Mèo Bombay và mèo Miến Điện khác nhau ở chỗ Bombay lớn hơn một chút và có thân dài hơn và chân dài hơn.

Mặc dù chúng đạt đến độ tuổi trưởng thành giới tính sớm, đôi khi ở 5 tháng tuổi, Mèo Bombay có thể không hoàn thành quá trình phát triển thể chất về kích thước và phát triển cơ cho đến khi chúng được gần hai tuổi.

Biệt danh của mèo Bombay là “đứa trẻ bằng da sáng chế với đôi mắt tinh anh”.

', N'data\img\thucung\meobombay28112021060723.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (16, 2, N'Mèo Anh lông ngắn ', 7, 0, N'Xám', 2, 800.0000, N'Mèo anh lông ngắn tiếng anh British Shorthair có thân hình vuông vức, chắc chắn, với bộ ngực rộng, đầy đặn, đôi chân ngắn, khỏe và chiếc đuôi ngắn, dày thuôn nhọn về đầu tròn. chúng khoác trên mình một chiếc áo khoác sang trọng, lộng lẫy khiến bạn chỉ muốn lăn lộn trong đó.

chúng có một cái đầu tròn với chiếc mũi ngắn, đôi má bầu bĩnh và đôi mắt tròn, tất cả đều kết hợp lại với nhau để tạo cho chúng một biểu cảm tươi cười.

Màu xanh lam là màu phổ biến nhất đối với mèo lông ngắn của Anh, đến nỗi “Màu xanh lam của Anh” gần như có vẻ như là giống của chính mình. Các màu sắc và hoa văn khác bao gồm trắng, đen, xanh lam, kem, các mẫu mướp khác nhau, hình đồi mồi, màu hoa và hai màu (một màu cộng với màu trắng).

Đôi mắt của chúng có thể có màu vàng đậm, đồng, xanh lam hoặc xanh lá cây, tùy thuộc vào nhiều màu lông hoặc mẫu mà chúng thích.

', N'data\img\thucung\meoanhlongngan28112021060758.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (17, 2, N'Mèo Miến Điện', 6, 0, N'Socola', 3, 900.0000, N'Tất cả mèo Miến Điện đều có nguồn gốc từ một con mèo màu sô cô la duy nhất, Wong Mau.

Mèo Miến Điện là một người thích âu yếm và thích ngồi trong lòng.

Mèo Miến Điện có giọng hát trầm khàn.

Tìm hiểu thông tin chi tiết về giống mèo này tại đây

', N'data\img\thucung\meomiendien28112021061217.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (18, 2, N'Mèo Burmilla', 9, 1, N'Trắng xám', 3, 844.0000, N'Lông của mèo Burmilla có nền bạc lấp lánh nghiêng hoặc bóng mờ với các màu đen, nâu, xanh lam, sô cô la, hoa cà, caramel, kem hoặc đỏ, hoặc hoa văn hình vỏ rùa (tortie) màu đen, nâu, xanh lam, sô cô la hoặc hoa cà.

Mèo Burmilla thường nặng khoảng 5 đến 5 kg. chúng có một cái đầu được làm tròn nhẹ ở đỉnh, thuôn lại thành một cái nêm cùn; mắt xanh lớn và đuôi dài từ trung bình đến dài. Môi, mũi và mắt của chúng trông như thể được viền bằng eyeliner đậm.

Mèo Miến Điện có thể được lai xa với Chinchilla Ba Tư hoặc Miến Điện Châu Âu.

', N'data\img\thucung\meoburmilla28112021060909.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (19, 2, N'Mèo Chartreux', 6, 1, N'Xám đen', 2, 1230.0000, N'Mèo Chartreux rất phù hợp với bất kỳ ngôi nhà nào có những người sẽ yêu quý và chải lông hàng tuần cho bộ lông tuyệt đẹp của chú. Giữ nó trong nhà để bảo vệ nó khỏi ô tô, các bệnh lây lan bởi những con mèo khác và các cuộc tấn công từ các động vật khác', N'data\img\thucung\meochartreux28112021060950.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (20, 3, N'Thỏ Mỹ (American) ', 6, 1, N'Trắng', 2, 666.0000, N'Thỏ là một trong những loài làm thú cưng dễ thương
– Cân nặng: 4 – 5,4 kg

– Ngoại hình: thân hình nửa vòm, với đôi tai hẹp thuôn và chiều dài cân đối. Bộ lông mượt mà, mềm mại và có lông màu trắng hoặc màu xanh xám. Giống thỏ kiểng này có mắt màu đỏ

– Tính cách: Với tính cách điềm đạm và ngọt ngào, giống thỏ quý hiếm là sự lựa chọn tuyệt vời cho những ai mới lần đầu nuôi thỏ. Tuy nhiên, bạn không nên để trẻ nhỏ chăm sóc thỏ cảnh American Rabbit vì chúng nhút nhát và có thể cắn nếu không được đối xử nhẹ nhàng.

– Cách chăm sóc: Việc chải lông cho giống thỏ trắng kiểng rất dễ dàng, tuy nhiên không nên tắm cho thỏ vì chúng dễ bị căng thẳng. Với những con thỏ tự chăm sóc bản thân giỏi, bạn không cần quá quan tâm đến việc vệ cho chúng. Thỏ có rụng lông, và khi chúng thay lông, bạn sẽ phải chải lông thêm cho chúng.

Giống thỏ Mỹ có thể sinh sản sớm nhất là 4 tháng tuổi, nhưng 6 tháng tuổi tapilu là độ tuổi tốt nhất để sinh sản.

Mặc dù đây là một giống thỏ cảnh rất khỏe mạnh, chúng có thể dễ mắc bệnh xù lông, u ở tử cung, bệnh nghẹt mũi, myxomytosis, calicivirus và răng mọc quá mức.

– Tuổi thọ: 8 – 12 năm. Với việc chải chuốt đúng cách và chế độ ăn uống lành mạnh, thỏ Mỹ có thể sống tới 12 năm.

', N'data\img\thucung\thomy(american)28112021061354.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (21, 3, N'Thỏ cảnh Blanc de Hotot', 8, 1, N'Trắng', 3, 200.0000, N'– Cân nặng: 3,6 – 4,9 kg

– Ngoại hình: Nếu bạn là người thích make up thì đừng nên bỏ qua em thỏ kiểng Blanc de Hotot này nhé; vì em ấy có ‘eyeliner’ ở quanh đôi mắt màu nâu cực kỳ độc đáo. Nó có một cái đuôi nhỏ và đôi tai có kích thước trung bình dựng đứng. Bộ lông ngắn và bóng mượt và lông bảo vệ cực dài.

– Tính cách: Với cơ thể màu trắng, giống thỏ cảnh lớn từ Pháp này là một người bạn đồng hành tuyệt vời với trẻ em và người lớn Chúng ngọt ngào và năng động, ngoan ngoãn và thân thiện, nếu hòa nhập với môi trường, chúng có thể trở thành người bạn tốt nhất của chú chó hay mèo nhà bạn.

– Cách chăm sóc: Loài thỏ kiểng này hoạt động tốt với nhiều bài tập thể dục ngoài trời. Việc chải chuốt được giữ ở mức tối thiểu 1-2 lần một tuần trong mùa rụng lông và hai tuần một lần khi chúng không rụng lông. Các hoạt động này sẽ giúp bạn và bé thỏ cảnh thêm gắn kết.

Mặc dù không dễ mắc bất kỳ bệnh di truyền nào, nhưng bạn hãy để ý những chiếc răng mọc quá mức của chúng. Điều này có thể được ngăn ngừa bằng cách cho ăn một chế độ ăn uống tốt. Chúng cũng có thể bị ve tai.

Như thường lệ, hãy giữ thỏ cưng của bạn tránh xa những con chó hung hãn hoặc những con vật lớn tapilu có thể làm nó bị thương, đặc biệt là khi ở ngoài trời.

– Thỏ kiểng sống được bao lâu: 7 – 10 năm', N'data\img\thucung\thocanhblancdehotot28112021061431.png', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (22, 3, N'Thỏ Minilop (mini lop)', 4, 0, N'Xám trắng', 4, 700.0000, N'Mặc dù có xuất xứ từ Đức nhưng thỏ Mini Lop lại phổ biến trên toàn thế giới. Và chúng là một trong những loại thỏ kiểng được ưa chuộng ở Việt Nam.

– Cân nặng: 2 – 2,7kg

– Ngoại hình: thỏ minilop có thân hình nhỏ gọn, cơ bắp săn chắc và đầy đặn, cổ ngắn đầu rộng với đôi tai dài, dày. Bộ lông có độ dài vừa phải và có hoa văn đặc hoặc đứt quãng với nhiều màu sắc khác nhau.

– Tính cách: Rất thích được ôm ấp và tương tác với con người, bao gồm cả việc được cưng nựng và cưng chiều. Cực kỳ ngọt ngào và dễ tính và dễ dàng huấn luyện, thỏ Minilop là vật nuôi lý tưởng cho trẻ em.

Chúng rất hòa đồng với những con thỏ và động vật khác, nhưng chúng thích những đứa trẻ điềm tĩnh hơn. Giống thỏ này cần được kích thích trí tuệ, vì vậy hãy nhớ đặt nhiều đồ chơi trong lồng của chúng.

– Cách chăm sóc: đây là loài thỏ cảnh dễ nuôi, chúng khỏe mạnh và ít lo ngại về sức khỏe. Hãy cho phép thỏ cảnh cưng của bạn tận hưởng không gian ngoài trời, nhưng cũng nên để chúng ở trong nhà, nhất là vào những tháng nắng nóng.

Loài thỏ kiểng Mini Lop có nhiều khả năng nhai các đồ vật ngẫu nhiên hơn các giống khác. Với tai có kích thước trung bình cụp xuống dưới, thỏ kiểng tai cụp này có thể dễ bị nhiễm trùng tai hoặc ve tai.

– Tuổi thọ: 5-10 năm

', N'data\img\thucung\thominilop(minilop)28112021061502.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (23, 3, N'Thỏ cảnh Rex', 7, 0, N'Nâu đen', 3, 900.0000, N'– Cân nặng: 3,4 – 4,7 kg

– Ngoại hình: Đây là một giống thỏ có thân hình cân đối với chiều dài cơ thể trung bình với đầu rộng, với đôi tai dựng đứng có chiều dài và độ dày vừa phải. Thỏ kiểng Rex có đôi chân ngắn và thẳng.

Bộ lông ngắn gần 1,27cm, dày và mềm, trông giống như nhung. Thỏ Rex nuôi làm thỏ cảnh trong nhà có nhiều màu sắc như chinchilla, thầu dầu, đen, trắng, opal, hải cẩu, hổ phách và California. Màu lông cũng có thể bị trộn lẫn với các màu lông khác.

– Tính cách: Giống thỏ thông minh và vui tươi này có nguồn gốc từ Pháp. Chúng thích nhảy tự do bên ngoài lồng và thích tương tác với chủ nuôi.

– Cách chăm sóc: Đây là một giống thỏ khỏe mạnh và không có vấn đề gì về sức khỏe. Tuy nhiên, giống như tất cả các con thỏ khác, thỏ kiểng Rex dễ bị tình trạng răng mọc quá mức, đầy hơi và mắc búi lông tapilu.

– Tuổi thọ: 5 -6 năm', N'data\img\thucung\thocanhrex28112021061543.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (24, 3, N'Thỏ kiểng Mini Rex', 6, 1, N'Xám ', 3, 300.0000, N'– Cân nặng: 1,6 – 2kg

– Ngoại hình: Tai dài, dựng đứng và cổ ngắn. Loài thỏ cảnh này thường có lưng tròn với vai phát triển tốt. Bộ lông ngắn, mịn, cực kỳ rậm rạp và có thể có nhiều màu sắc như sable, Himalayan, lilac, lynx, blue, castor, ba màu và hoa văn.

– Tính cách: Chúng rất thân thiện và thường rất điềm tĩnh với trẻ nhỏ, nhưng có thể vặn vẹo nếu bị giữ quá chặt.

– Cách chăm sóc: Loại thỏ cảnh từ Pháp này phù hợp cho những người mới nuôi thỏ lần đầu. Chúng cần ít chải chuốt hơn hầu hết các giống thỏ do bộ lông ngắn của chúng. Thỏ Mini Rex có thể bị đau chân do không có lông ở chân. Chúng cũng có râu xoăn cần được cắt tỉa thường xuyên.

– Tuổi thọ: 5-7 năm', N'data\img\thucung\thokiengminirex28112021061616.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (25, 3, N'Thỏ cảnh Mini Satin', 8, 0, N'Vàng trắng', 2, 213.0000, N'– Cân nặng: 1,3 – 2kg

– Ngoại hình : Bộ lông sáng bóng đặc biệt với nhiều kiểu và màu sắc. Cơ thể ngắn, đầy đặn với đầu tròn.

– Tính cách: Lanh lợi, bình tĩnh và nhẹ nhàng nhưng có thể lảng tránh những người không quen biết. Thỏ Mini Satins thường điềm tĩnh và thân thiện. Tuy nhiên, đôi khi chúng có thể trở nên thất thường.

– Cách chăm sóc: Giống thỏ cảnh satin Không cần nhiều không gian như hầu hết các giống thỏ khác, chúng lý tưởng cho các căn hộ hoặc nhà nhỏ. Chúng cũng không năng động như nhiều giống khác. Do bản tính lanh lợi, chúng không phải là vật nuôi tapilu lý tưởng cho trẻ em.

Về sức khỏe: Không có vấn đề sức khỏe nào được biết ngoài những lo ngại về sức khỏe chung của thỏ.

– Tuổi thọ: 5 – 8 năm', N'data\img\thucung\thocanhminisatin28112021061653.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (26, 3, N'Thỏ Lion head ', 5, 1, N'Xám đen', 3, 600.0000, N'– Cân nặng: 1 – 1,5kg

– Ngoại hình: Giống thỏ cảnh này có bộ lông dài ở cả cổ và lưng. Chúng có kích thước nhỏ đến trung bình, và trông có vẻ cơ bắp. Thỏ kiểng Lionhead có bờm dài khoảng 5cm, một số con thỏ có thể mang một bờm đơn hoặc đôi.

– Tính cách: Năng nổ, thân thiện với mọi người, tình cảm và thích chơi. Chúng thích được bế lên ôm ấp và vuốt ve nhẹ nhàng.

– Cách chăm sóc: Loài thỏ này cần chải chuốt và chăm sóc lông nhiều hơn các giống khác vì lông có thể dễ bị nhão hoặc rối. Lionhead cần được vận động nhiều. Loài thỏ này thường mắc các bệnh như bệnh xuất huyết do vi rút (VHD) và bệnh myxomatosis.

– Tuổi thọ: 7-10 năm', N'data\img\thucung\tholionhead28112021061727.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (27, 3, N'Thỏ Hà Lan (Holland lop) ', 6, 1, N'Nâu', 3, 400.0000, N'– Cân nặng: 0,9 – 1,8kg

– Ngoại hình: Có nguồn gốc từ Hà Lan, Holland Lop là một giống thỏ nhỏ gọn. Với một cái đầu rộng và cơ thể chắc nịch, nó có một chùm lông ở phía sau đầu. Cơ thể phải được cân đối tốt từ đầu này đến đầu kia. Thân hình vạm vỡ với bờ vai rộng. Đôi tai lớn, mềm mại với bộ lông dài vừa phải. Đầu lớn với mõm ngắn và rộng.

– Tính cách: Thỏ kiểng Hà Lan rất năng nổ, năng động và thân thiện nhưng sẽ chống lại (vặn vẹo cả người) việc bị bắt giữ. Holland Lops thỏ Hà Lan rất dễ bị kích động bởi bản chất, vì vậy chúng rất vui vẻ khi chơi đùa nhưng cũng có thể hơi khó khăn khi bắt chúng ra vào lồng

– Cách chăm sóc: Rụng nhiều trong những tháng mùa hè, vì vậy bạn cần chải lông chò chúng nhiều hơn trong thời gian đó. Nên cho ra ngoài đi lang thang khá thường xuyên và tập các bài thể dục ngoài trời tự do. Thỏ Hà Lan là một giống thỏ khỏe mạnh.

– Tuổi thọ: 7 – 14 năm', N'data\img\thucung\thohalan(hollandlop)28112021061759.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (28, 3, N'Thỏ Hà Lan (Dutch)', 8, 0, N'Trắng tai đen', 3, 399.0000, N'– Cân nặng: 1,8 – 2,5kg

– Ngoại hình: Phát triển ở Anh, thỏ Hà Lan có thân hình tròn trịa, nhỏ với đầu tròn. Tai ngắn và rộng, chân trước ngắn hơn chân sau và có bộ lông ngắn và bóng. Giống thỏ kiểng này có màu tối và trắng rất đặc biệt. Chúng có tai và phần dưới sẫm màu, vai, bụng, chân trước màu trắng – thêm vào đó là một chùm lông trắng phía trước mặt.

– Tính cách: Bình tĩnh và nhẹ nhàng nhưng sẽ dễ chán nản nếu bị giam cầm quá lâu. Rất hòa đồng. Chúng là một giống thỏ kiểng điềm tĩnh và dễ tính, phù hợp với trẻ em. Chúng có thể chịu đựng được sự hỗn loạn khi thường xuyên được tapilu cưng nựng.

– Cách chăm sóc: Thỏ Hàn Lan (Dutch) rụng nhiều vào những tháng mùa hè và cần được chải lông hàng ngày. Tuy nhiên, chúng rất dễ chải chuốt. Ngoài ra, chúng cần được phải vận động và chạy thường xuyên.

– Tuổi thọ: 5 – 8 năm', N'data\img\thucung\thohalan(dutch)28112021061831.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (29, 3, N'Thỏ Ba Lan (Polish) ', 5, 0, N'Đen', 2, 893.0000, N'– Cân nặng: 1,1 – 1,5kg

– Ngoại hình: Lông ngắn, mềm, có sáu màu đặc biệt: lông đen, xanh lam, sô cô la, hoa văn đứt đoạn, lông trắng mắt màu hồng ngọc, lông trắng mắt xanh, .

– Tính cách: Âu yếm, điềm tĩnh và thân thiện, tình cảm và tiền có xu hướng đặc biệt thoải mái.

– Cách chăm sóc: Giống thỏ Ba Lan lùn này nên nuôi ở trong nhà. Vì kích thước nhỏ nên chúng cần ít không gian. Chúng có xu hướng ít hoạt động hơn các giống khác, có nghĩa là chúng lý tưởng cho những ai muốn có một con thỏ nhưng không có không gian rộng rãi.

Kích thước nhỏ của giống thỏ kiểng Ba Lan khiến chúng dễ bị rơi, vì vậy hãy thận trọng.

– Tuổi thọ: 5 – 6 năm', N'data\img\thucung\thobalan(polish)28112021061909.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (30, 3, N'Thỏ Hymalaya ', 6, 0, N'Trắng mũi đen', 4, 1000.0000, N'– Cân nặng: 1,1 – 2,3kg

– Ngoại hình: Bộ lông ngắn, màu trắng, lông có những mảng sẫm màu trên bàn chân, đuôi, tai và một vết hình trứng trên mũi.

– Tính cách: Nhờ bản tính rất kiên nhẫn và bình tĩnh, loài thỏ cảnh này ngay lập tức trở thành vật nuôi phổ biến, nhất là cho trẻ em.

– Cách chăm sóc: Ngoài việc rất nhạy cảm với lạnh khi còn là thỏ sơ sinh, thỏ Hymalayan rất dễ chăm sóc.

– Tuổi thọ: 5 – 8 năm', N'data\img\thucung\thohymalaya28112021061949.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (31, 4, N'Chuột Hamster', 8, 1, N'Nâu loang/ Trắng đen', 3, 424.0000, N'Chuột Hamster Bear hay Chuột Gấu là một cái tên nổi tiếng trong thế giới Chuột Hamster đa dạng. Có vẻ ngoài mập mạp đáng yêu cùng những hành động ngộ nghĩnh. Những chú Hamster Bear sẽ là người bạn nhỏ tuyệt vời trong nhà.

', N'data\img\thucung\chuothamster28112021062200.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (32, 5, N'Carpet Chameleon', 3, 1, N'Xanh vằn đen', 3, 500.0000, N'Carpet Chameleon là một loài tắc kè có kích thước nhỏ tầm khoảng 25 – 30cm rất thích hợp để nuôi làm cảnh. Chúng được tìm thấy ở vùng Madagascar, màu sắc của chúng thường là màu xanh lá cây, màu vàng và một chú màu xanh lam quanh mắt và bàn chân.

Tuổi thọ của loài tắc kè này khá ngắn chúng chỉ sống được từ 2 – 3 năm, nhiệt độ môi trường nuôi khoảng 23 – 25 độ C và độ ẩm 65%.

Carpet Chameleon là một loài tắc kè có kích thước nhỏ tầm khoảng 25 – 30cm rất thích hợp để nuôi làm cảnh. Chúng được tìm thấy ở vùng Madagascar, màu sắc của chúng thường là màu xanh lá cây, màu vàng và một chú màu xanh lam quanh mắt và bàn chân.

Tuổi thọ của loài tắc kè này khá ngắn chúng chỉ sống được từ 2 – 3 năm, nhiệt độ môi trường nuôi khoảng 23 – 25 độ C và độ ẩm 65%.

', N'data\img\thucung\carpetchameleon28112021062307.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (33, 5, N'Fischer’s Chameleon', 6, 0, N'Xanh loang nâu', 5, 300.0000, N'Fischer’s Chameleon là một loài tắc kè hoa khá độc đáo chúng được bán nhiều ở các cửa hàng thú cưng và bò sát cảnh. Không giống với loài tắc kè hoa Jackson chúng có 2 cái sừng thay vì 3 cái sừng. Loài tắc kè hoa Fischer’s Chameleon có kích thước khoảng 38 – 40cm ở tuổi trưởng thành.

Tuổi thọ của chúng là 3 năm, nhiệt độ môi trường nuôi là 23 – 25 độ C, độ ẩm 75 – 85%.', N'data\img\thucung\fischer’schameleon28112021062336.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (34, 5, N'Flapneck Chameleon', 5, 1, N'Xanh đốm đen', 1, 299.0000, N'Flapneck Chameleon bắt nguồn từ miền nam và trung Phi loài tắc kè này còn được gọi tên là Flapneck tắc kè hoa, loài tắc kè này có màu xanh lá cây, màu nâu nhạt và một dải màu vàng chạy theo khắp cơ thể.

', N'data\img\thucung\flapneckchameleon28112021062406.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (35, 5, N'Jackson’s Chameleon ', 5, 0, N'Xanh lam', 3, 900.0000, N'Trong tự nhiên thì tắc kè hoa Jackson’s Chameleon được tìm thấy nhiều ở Đông Phi, chúng là một loài tắc kè cảnh được nhiều người ưu chuộng ở Việt Nam. Kích thước của chúng có thể dài tới 34cm và tuổi thọ lên tới 8 năm, nhiệt độ sống ưu thích ở mức 23 – 26 độ C, độ ẩm 65%. Tắc kè Jackson’s Chameleon khi bình thường chúng có thể thay đổi nhiều màu sắc khác nhau từ xanh lá cây nhạt, xanh đậm. Khi chúng trở lên hung giữ chúng có thể thay đổi sang các màu sẫm hơn như đen, xanh dương.

Nếu như bạn đang muốn nuôi tắc kè hoa thì Jackson’s Chameleon là một loài động vật tuyệt vời.

', N'data\img\thucung\jackson’schameleon28112021062440.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (36, 5, N'Meller’s Chameleon', 6, 0, N'Xanh vàng đốm đen', 3, 424.0000, N'Meller’s Chameleon là một loài tắc kè hoa lớn chúng có thể đạt tới kích thước 60cm. Tuổi thọ của loài tắc kè này lên tới 12 năm, nhiệt độ môi trường sống 26 độ C và độ ẩm ở mức 70%. Tắc kè Meller’s Chameleon khá dữ tợn nếu như bạn là người mới học nuôi loài tắc kè hoa thì không nên lựa chọn nuôi loài này vội vì đòi hỏi kinh nghiệm nuôi tắc kè khá lâu mới nên chơi dòng này.

', N'data\img\thucung\meller’schameleon28112021062513.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (37, 6, N'Rắn sữa Honduras (Honduran Milk Snake)  ', 6, 0, N'đỏ vằn vàng đen', 3, 1000.0000, N'Loài rắn này được phát hiện chủ yếu tại Honduras và Nicaragua (Nam Mỹ). Thuộc họ Lampropeltis. Tuy có màu sắc rất sặc sỡ, song nọc độc của loài rắn sữa này thực sự vô hại. Các nhà nghiên cứu bò sát tin rằng, đây là một ví dụ điển hình của hiện tượng Batesian Mimicry – khi loại rắn vô hại này bắt chước hình dạng của một loài rắn độc để tự bảo vệ mình.

Ở nước ta, rắn sữa Honduras là một trong những loài rắn cảnh được rất nhiều người yêu thích, tuy nhiên, giá của nó không hề rẻ, khoảng 4 – 6 triệu đồng/con.

', N'data\img\thucung\ransuahonduras(honduranmilksnake)28112021062637.jpg', 0)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (38, 6, N'Rắn ngũ sắc (The Iridescent Shieldtail)  ', 6, 1, N'Ngũ sắc', 3, 1200.0000, N'Không có gì bàn cãi, rắn ngũ sắc là một loài rắn đẹp nhất trên thế giới. Loài rắn này được các nhà khoa học phát hiện lần đầu tiên sinh sống tại Wayanad, miền Nam Ấn Độ vào năm 1943, tuy nhiên, những thông tin về loài rắn này không nhiều và trên thực tế chúng hiếm khi xuất hiện trong tự nhiên', N'data\img\thucung\ranngusac(theiridescentshieldtail)28112021062803.png', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (39, 6, N'Rắn bạch tạng Texas (Leucistic Texas Rat Snake)  ', 4, 1, N'Trắng bạch', 1, 944.0000, N'Loài rắn này được phát hiện tại các bang Texas, Arizona và Louisiana của Mỹ. Chúng có tên là “rắn bạch tạng”. Đơn giản vì màu trắng thuần khiết trên cơ thể chúng chứ không phải chúng bị bạch tạng. Loài rắn này không có nọc độc, thức ăn của chúng là chuột và các loài động vật gặm nhấm nhỏ khác.', N'data\img\thucung\ranbachtangtexas(leucistictexasratsnake)28112021062835.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (40, 7, N'Nhện nhà', 5, 0, N'Đen nâu', 3, 100.0000, N'Hình dáng:

Nhện nhà đực kích thước khoảng 4 mm, trong khi nhện cái có chiều dài từ 5 đến 8 mm
Một mắt thấu kính, tổng cộng có 8 mắt
Có màu nâu hoặc màu xám, với các đường phân đoạn đậm nằm dọc theo cơ thể nhện nhà.
Được chia thành hai phần gồm bụng và ngực trước. Giống như bọ ve, bọ cạp chúng không có cánh.
Tập tính thói quen:

Nhện nhà thường xâm nhập vào nhà thông qua các kẻ hở tren tường
Chúng thích sống ở những khu vực tối tăm hoặc bị mốc và những khu vực lộn xộn, ít khi được sử dụng.
Có thể là những khe hở dưới của, vết nứt trong nhà hoặc chạy vào nhà khi chúng ta mở cửa.
', N'data\img\thucung\nhennha28112021062957.jpg', 1)
INSERT [dbo].[thucung] ([idthucung], [chungloai], [tenthucung], [nhacungcap], [gioitinh], [mausac], [thangtuoi], [dongia], [thongtinchitiet], [hinhanh], [trangthai]) VALUES (41, 7, N'Nhện sói', 7, 0, N'Trắng', 3, 200.0000, N'Hình dáng:

Nhện sói cái trưởng thành dài khoảng 8mm, con đực khoảng 6mm
Màu sắc của chúng đa phần có màu nâu đến xám
Tập tính:

Nhện sói thích trống sống trong hang cạn, có lối vào mở, trong rong rêu hoặc chất thối rữa
Chúng có thói quen tìm kiếm thức ăn vào ban đêm và lẩn trốn vào ban ngày
Vòng đời:

Nhện sói mẹ mang các túi trứng quanh mình dính với cơ quan nhả tơ dưới bụng
Nhện con leo lên lưng mẹ để sống trong vài tuần đầu tiên sau khi nở
', N'data\img\thucung\nhensoi28112021063034.jpg', 1)
SET IDENTITY_INSERT [dbo].[thucung] OFF
GO
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (1, 7, 30, 1500.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (1, 9, 30, 570.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (2, 7, 10, 500.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (4, 35, 1, 800.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (5, 10, 20, 600.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (5, 35, 1, 800.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (6, 9, 10, 190.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (7, 1, 15, 750.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (8, 5, 12, 480.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (8, 15, 11, 825.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (9, 13, 20, 500.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (9, 37, 1, 899.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (10, 14, 11, 550.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (11, 7, 11, 550.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (11, 12, 11, 660.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (12, 12, 10, 600.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (12, 32, 1, 100.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (14, 15, 11, 825.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (14, 31, 1, 90.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (15, 20, 3, 198.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (15, 32, 1, 100.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (17, 7, 10, 500.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (18, 15, 30, 2250.0000)
INSERT [dbo].[hoadonchitiet_sanpham_phukien] ([idhoadon], [idsanpham_phukien], [soluong], [dongia]) VALUES (19, 11, 20, 600.0000)
GO
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (1, 6, 500.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (1, 7, 600.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (3, 28, 399.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (6, 36, 424.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (7, 20, 666.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (8, 18, 844.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (9, 12, 300.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (10, 33, 300.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (12, 9, 800.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (13, 11, 500.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (13, 19, 1230.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (15, 21, 200.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (16, 30, 250.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (17, 16, 800.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (18, 14, 700.0000)
INSERT [dbo].[hoadonchitiet_thucung] ([idhoadon], [idthucung], [dongia]) VALUES (19, 37, 1000.0000)
GO