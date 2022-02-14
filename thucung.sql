use master
go
if db_id('test') is not null
drop database test
go
create database test
go
use test
go

----------------------------------------------------------------
create table thanhpho
(
	idthanhpho int identity,
	tenthanhpho nvarchar(50) not null,

	primary key (idthanhpho)
)
go
create table huyen
(
	idhuyen int identity,
	idthanhpho int,
	tenhuyen nvarchar(50) not null,

	primary key (idhuyen,idthanhpho),
	foreign key (idthanhpho) references thanhpho (idthanhpho)
)
go
create table xa_phuong
(
	idxa_phuong int identity,
	idhuyen int,
	idthanhpho int,
	tenxa_phuong nvarchar(50) not null,

	primary key (idxa_phuong,idhuyen,idthanhpho),
	foreign key (idhuyen, idthanhpho) references huyen (idhuyen,idthanhpho)
)
go
----------------------------------------------------------------

create table nhanvien
(
	idnhanvien int identity,
	tennhanvien nvarchar(50) not null,
	ngaysinh datetime not null,
	gioitinh bit not null,
	diachi nvarchar(255) not null,
	sodienthoai varchar(15) not null,
	email varchar(255) not null,
	hinhanh varchar(7500),

	primary key (idnhanvien)
)
go

create table taikhoan
(
	taikhoan varchar(30),
	matkhau varchar(60) not null,
	nhanvien int unique,
	vaitro bit not null,
	trangthai bit not null,

	primary key (taikhoan),
	foreign key (nhanvien) references nhanvien (idnhanvien)
)
go

create table khachhang
(
	idkhachhang int identity,
	tenkhachhang nvarchar(50) not null,
	gioitinh bit not null,
	diachi nvarchar(255) not null,
	sodienthoai varchar(15) not null,
	email varchar(100),

	primary key (idkhachhang)
)
go

create table magiamgia
(
	idmagiamgia int identity,
	magiamgia varchar(15) not null,
	giatri int not null,
	soluong int not null,
	ngaybatdau datetime not null,
	ngayketthuc datetime not null,

	primary key (idmagiamgia)
)
go

create table nhacungcap
(
	idnhacungcap int identity,
	tennhacungcap nvarchar(50) not null,
	ngayhoptac datetime not null,
	diachi nvarchar(255) not null,
	sodienthoai varchar(15) not null,
	trangthai bit not null,

	primary key (idnhacungcap)
)
go

create table loaisanpham_phukien
(
	idloaisanpham_phukien int identity,
	tenloaisanpham_phukien nvarchar(50),

	primary key (idloaisanpham_phukien)
)
go

create table sanpham_phukien
(
	idsanpham_phukien int identity,
	loaisanpham_phukien int not null,
	tensanpham_phukien nvarchar(200) not null,
	nhacungcap int not null,
	soluong int not null,
	donvitinh nvarchar(50) not null,
	dongia money not null,
	chitietsanpham nvarchar(4000),
	huongdansudung nvarchar(4000),
	hinhanh varchar(7500),

	primary key (idsanpham_phukien),
	foreign key (loaisanpham_phukien) references loaisanpham_phukien (idloaisanpham_phukien),
	foreign key (nhacungcap) references nhacungcap (idnhacungcap)
)
go

create table hoadon
(
	idhoadon int identity,
	khachhang int not null,
	nhanvien int,
	magiamgia int,
	ngayxuathoadon datetime not null,

	primary key (idhoadon),
	foreign key (khachhang) references khachhang (idkhachhang) on delete cascade,
	foreign key (nhanvien) references nhanvien (idnhanvien),
	foreign key (magiamgia) references magiamgia (idmagiamgia)
)
go

create table chungloai
(
	idchungloai int identity,
	tenchungloai nvarchar(50) not null,
	dacdiemnhandang nvarchar(4000),

	primary key (idchungloai)
)
go

create table thucung
(
	idthucung int identity,
	chungloai int not null,
	tenthucung nvarchar(50) not null,
	nhacungcap int not null,
	gioitinh bit not null,
	mausac nvarchar(50) not null,
	thangtuoi int not null,
	dongia money not null,
	thongtinchitiet nvarchar(4000),
	hinhanh varchar(7500),
	trangthai bit not null,

	primary key (idthucung),
	foreign key (chungloai) references chungloai (idchungloai),
	foreign key (nhacungcap) references nhacungcap (idnhacungcap)
)
go

create table hoadonchitiet_thucung
(
	idhoadon int not null,
	idthucung int unique,
	dongia money not null,

	primary key (idhoadon, idthucung),
	foreign key (idhoadon) references hoadon (idhoadon) on delete cascade,
	foreign key (idthucung) references thucung (idthucung),
)
go

create table hoadonchitiet_sanpham_phukien
(
	idhoadon int not null,
	idsanpham_phukien int,
	soluong int not null,
	dongia money not null,

	primary key (idhoadon, idsanpham_phukien),
	foreign key (idhoadon) references hoadon (idhoadon) on delete cascade,
	foreign key (idsanpham_phukien) references sanpham_phukien (idsanpham_phukien)
)
go
----------------------------------------------------------------
--insert into thanhpho values
--(N'Hà Nội'),
--(N'Đà Nẵng'),
--(N'Thanh Hóa'),
--(N'Nghệ An'),
--(N'Hồ Chí Minh')
--go

--insert into huyen values
--(1,N'Mê Linh'),
--(1,N'Sóc Sơn'),
--(1,N'Ba Đình'),
--(1,N'Cầu Giấy'),
--(1,N'Đống Đa'),
--(1,N'Hà Đông'),
--(1,N'Bắc Từ Niêm'),
--(1,N'Nam Từ Niêm'),
--(1,N'Hoàn Kiếm'),
--(1,N'Long Biên'),
--(2,N'Hải Châu'),
--(2,N'Cẩm Lệ'),
--(2,N'Thanh Khê'),
--(2,N'Liên Chiểu'),
--(2,N'Sơn Trà'),
--(2,N'Hoàng Sa'),
--(2,N'Hòa Vang')
--go

--insert into xa_phuong values
--(1,1,N'Quang Minh'),
--(1,1,N'Chi Đông'),
--(1,1,N'Đại Thịnh'),
--(1,1,N'Thanh Lâm'),
--(1,1,N'Tự Lập'),
--(1,1,N'Tiền Phong'),
--(1,1,N'Thạch Đà'),
--(1,1,N'Kim Hoa'),
--(1,1,N'Liên Mạc'),
--(2,1,N'Thanh Xuân'),
--(2,1,N'Minh Phú'),
--(2,1,N'Quang Tiến'),
--(2,1,N'Phú Minh'),
--(2,1,N'Phù Lỗ'),
--(2,1,N'Nam Sơn'),
--(2,1,N'Hồng Kỳ'),
--(2,1,N'Tân Hưng')
--go
----------------------------------------------------------------
--insert into nhanvien values
----0: nam, 1: nu
--(N'Girlkun','2002-05-07',0,N'Quang Minh - Mê Linh - Hà Nội','0974264451','75wouldbeperfect@gmail.com',''),
--(N'Phan Thanh Hải','2002-09-29',0,N'Phú Cường - Sóc Sơn - Hà Nội','0987654321','haiptph17054@fpt.edu.vn',''),
--(N'Nhân Viên Ảo',GETDATE(),1,N'Hư Vô','0123123123','nva@ao.ao','')
--go

--insert into taikhoan values
--('admin','$2a$07$7oBYvKdPfCpoW7bDiKaF7.hmo9y0zxjKuCjrpJ4BEzHNxH1f8Et.C',null,0,1) --0: admin, 1: nhanvien; 1: activity, 0: banned
--('gk','$2a$07$7oBYvKdPfCpoW7bDiKaF7.hmo9y0zxjKuCjrpJ4BEzHNxH1f8Et.C',1,1,0),
--('pth','123',2,1,0),
--('nva','123',3,1,0)
--go

--insert into chungloai values
--(N'Chó',N''),
--(N'Mèo',N''),
--(N'Thỏ',N''),
--(N'Chuột',N''),
--(N'Tắc kè',N''),
--(N'Rắn',N''),
--(N'Nhện',N''),
--(N'Sóc',N''),
--(N'Nhím',N''),
--(N'Khỉ',N''),
--(N'Rái cá',N''),
--(N'Lợn',N''),
--(N'Cá',N'')
--go

--insert into nhacungcap values
--(N'Cung giống chó',GETDATE(),N'Vô Định','0128378247',1),  --0: Ngừng hợp tác, 1: đang hợp tác
--(N'Cung giống mèo',GETDATE(),N'Vô Định','0283787427',1),
--(N'Cung giống thỏ',GETDATE(),N'Vô Định','0128498294',1),
--(N'Ảo Thế Đấy',GETDATE(),N'Vô Định','0234723844',1),
--(N'Nhưng cũng hay',GETDATE(),N'Vô Định','0586458986',0),
--(N'Hay Điểm nào',GETDATE(),N'Vô Định','0345895555',1),
--(N'Haizz',GETDATE(),N'Vô Định','0834594355',0),
--(N'Cung không bán',GETDATE(),N'Vô Định','0345892341',1),
--(N'Bán không mua',GETDATE(),N'Vô Định','0348534545',0),
--(N'Mua đòi trả',GETDATE(),N'Vô Định','0345347857',1)
--go

--insert into khachhang values
--(N'Trương Ngọc Bảo',0,N'Phú Cường - Sóc Sơn - Hà Nội','0999999999',''),
--(N'Khách Hàng Ảo',0,N'Vô Định','0888888888',''),
--(N'Khách Hàng Ảo Vãi',0,N'Vô Định','0777777777','')
--go

--insert into loaisanpham_phukien values
--(N'Đồ ăn'),
--(N'Đồ chơi'),
--(N'Dây cổ'),
--(N'Chuồng')
--go

--insert into sanpham_phukien values
--(1,N'Cám lợn',3,231,N'Túi',342,'','',''),
--(1,N'Hạt ngũ cốc',2,231,N'Kg',432,'','',''),
--(1,N'Thức ăn mèo whiskas',4,123,N'Túi',534,'','',''),
--(1,N'Cơm',2,32,N'Bát',345,'','',''),
--(2,N'Đồ chơi 1',3,231,N'Chiếc',543,'','',''),
--(2,N'Đồ chơi 2',4,231,N'Chiếc',756,'','',''),
--(2,N'Đồ chơi 3',1,231,N'Chiếc',987,'','','')
--go

--insert into magiamgia values
--('HSU42',10,4,'2020-01-01','2022-01-01'),
--('JFSD4',35,7,'2020-01-01','2022-01-01'),
--('523FH',45,3,'2020-01-01','2021-01-01'),
--('AS34G',55,7,'2020-01-01','2021-01-01'),
--('OSFS8',20,9,'2020-01-01','2021-01-01'),
--('AS34G',55,0,'2020-01-01','2021-01-01'),
--('OSFS8',20,0,'2020-01-01','2021-01-01'),
--('AS34G',55,0,'2020-01-01','2021-01-01'),
--('OSFS8',20,0,'2020-01-01','2021-01-01'),
--('GIRLKUN',95,2,'2020-01-01','2022-01-01')
--go

--insert into hoadon values
--(1,1,null,GETDATE()),
--(2,2,1,GETDATE()),
--(3,1,4,GETDATE()),
--(1,1,null,GETDATE()),
--(3,3,1,GETDATE()),
--(2,2,null,GETDATE()),
--(2,1,1,GETDATE()),
--(2,1,1,GETDATE())
--go

--insert into thucung values
--(1,N'Ngao Tây',1,0,N'Đen',1,853,'','',1),
--(3,N'Thú cưng 2',2,1,N'Đen',1,345,'','',1),
--(2,N'Thú cưng 3',3,0,N'Đen',3,532,'','',1),
--(5,N'Thú cưng 4',3,0,N'Đen',1,867,'','',1),
--(2,N'Thú cưng 5',1,1,N'Đen',4,123,'','',1),
--(5,N'Thú cưng 6',2,0,N'Đen',3,334,'','',1),
--(3,N'Thú cưng 7',1,0,N'Đen',2,12,'','',1),
--(7,N'Thú cưng 8',3,1,N'Đen',1,123,'','',1),
--(2,N'Thú cưng 9',2,0,N'Đen',5,534,'','',1),
--(1,N'Thú cưng 10',1,1,N'Đen',1,754,'','',1),
--(1,N'Thú cưng 11',3,0,N'Đen',1,865,'','',1)
--go

--insert into hoadonchitiet_thucung values
--(1,1,321),
--(2,3,456),
--(4,4,345),
--(5,5,234),
--(2,6,654),
--(3,7,876),
--(5,8,234)
--go

--insert into hoadonchitiet_sanpham_phukien values
--(1,7,4,231),
--(2,7,4,231),
--(3,7,4,231),
--(4,7,4,231),
--(5,7,4,231),
--(6,7,4,231),
--(7,7,4,231),
--(1,6,4,231),
--(1,4,4,231),
--(1,3,4,231)
--go

------------------------------------------------------

if object_id('timnhanvien') is not null
drop proc timnhanvien
go
create proc timnhanvien (@ten nvarchar(50))
as begin
	select * from nhanvien where tennhanvien like N'%'+@ten+'%'
end
go

if object_id('timkhachhang') is not null
drop proc timkhachhang
go
create proc timkhachhang (@ten nvarchar(50))
as begin
	select * from khachhang where tenkhachhang like N'%'+@ten+'%'
end
go

if object_id('timthucung') is not null
drop proc timthucung
go
create proc timthucung (@ten nvarchar(50))
as begin
	select * from thucung where tenthucung like N'%'+@ten+'%' and trangthai = 1
end
go

if object_id('timthucungkhoanggia') is not null
drop proc timthucungkhoanggia
go
create proc timthucungkhoanggia (@tu money, @den money)
as begin
	select * from thucung where trangthai = 1 and dongia between @tu and @den
end
go

if object_id('timsanpham_phukien') is not null
drop proc timsanpham_phukien
go
create proc timsanpham_phukien (@ten nvarchar(50))
as begin
	select * from sanpham_phukien where tensanpham_phukien like N'%'+@ten+'%' and soluong > 0
end
go

if object_id('timsanpham_phukienkhoanggia') is not null
drop proc timsanpham_phukienkhoanggia
go
create proc timsanpham_phukienkhoanggia (@tu money, @den money)
as begin
	select * from sanpham_phukien where soluong > 0 and dongia between @tu and @den
end
go

if object_id('timhoadontheongay') is not null
drop proc timhoadontheongay
go
create proc timhoadontheongay (@tu datetime, @den datetime)
as begin
	select * from hoadon where ngayxuathoadon between @tu and @den
end
go

if object_id('timmagiamgiaconhan') is not null
drop proc timmagiamgiaconhan
go
create proc timmagiamgiaconhan (@han datetime)
as begin
	select * from magiamgia where ngayketthuc > @han and soluong > 0
end
go

if object_id('xoamagiamgiahong') is not null
drop proc xoamagiamgiahong
go
create proc xoamagiamgiahong
as begin
	delete magiamgia where soluong = 0 and ngayketthuc < GETDATE()
end
go

if object_id('trusanpham_phukien') is not null
drop proc trusanpham_phukien
go
create proc trusanpham_phukien (@idsanpham_phukien int, @soluong int)
as begin
	declare @soluongconlai int
	set @soluongconlai = (select soluong from sanpham_phukien where idsanpham_phukien = @idsanpham_phukien) - @soluong

	update sanpham_phukien
	set soluong = @soluongconlai
	where idsanpham_phukien = @idsanpham_phukien
end
go

if object_id('laykhachhangthanthiet') is not null
drop proc laykhachhangthanthiet
go
create proc laykhachhangthanthiet
as begin
	select * from khachhang where idkhachhang in
	(select khachhang from hoadon group by khachhang having count(khachhang) >= 3)
end
go

if object_id('laykhachhangbinhthuong') is not null
drop proc laykhachhangbinhthuong
go
create proc laykhachhangbinhthuong
as begin
	select * from khachhang where idkhachhang in
	(select khachhang from hoadon group by khachhang having count(khachhang) < 3)
end
go

if object_id('trumagiamgia') is not null
drop proc trumagiamgia
go
create proc trumagiamgia (@idmagiamgia int)
as begin
	declare @soluong int
	set @soluong = (select soluong from magiamgia where idmagiamgia = @idmagiamgia)
	update magiamgia set soluong = (@soluong -1) where idmagiamgia = @idmagiamgia
end
go





select * from nhanvien

go
select * from sanpham_phukien
select * from hoadonchitiet_sanpham_phukien

---------------------------------------
select * from hoadon where nhanvien = 1

select * 
from hoadonchitiet_thucung
where idhoadon in (select idhoadon from hoadon where nhanvien = 1)


select sum(dongia)
from hoadonchitiet_thucung
where idhoadon in (select idhoadon from hoadon where nhanvien = 1)
---------------------------------------
select *
from hoadonchitiet_sanpham_phukien
where idhoadon in (select idhoadon from hoadon where nhanvien = 1)


select sum(dongia * soluong)
from hoadonchitiet_sanpham_phukien
where idhoadon in (select idhoadon from hoadon where nhanvien = 1)
go
-------------------------------------------------------

select count(*) from hoadon where nhanvien = 1 and month(ngayxuathoadon) = 11



------------------------------------------------

if object_id('tongtienhoadon') is not null
drop proc tongtienhoadon
go
create proc tongtienhoadon (@idhoadon int)
as begin
	declare @tongtienthucung money
	declare @tongtiensanpham_phukien money

	set @tongtienthucung = (select sum(dongia) from hoadonchitiet_thucung where idhoadon = @idhoadon)
	set @tongtiensanpham_phukien = (select sum(dongia) from hoadonchitiet_sanpham_phukien where idhoadon = @idhoadon)

	select @idhoadon as 'idhoadon', @tongtienthucung as 'tongtienthucung', @tongtiensanpham_phukien as 'tongtiensanpham_phukien'
end
go

if object_id('timhdtheonv') is not null
drop proc timhdtheonv
go
create proc timhdtheonv (@nv nvarchar(50))
as begin
	select * from hoadon where nhanvien in (select idnhanvien from nhanvien where tennhanvien like N'%'+@nv+'%')
end
go


if object_id('timhdtheokh') is not null
drop proc timhdtheokh
go
create proc timhdtheokh (@kh nvarchar(50))
as begin
	select * from hoadon where khachhang in (select idkhachhang from khachhang where tenkhachhang like N'%'+@kh+'%')
end
go

if object_id('top10hd') is not null
drop proc top10hd
go
create proc top10hd
as begin
	declare @tablethucung table (hoadon int, dongia money)
	declare @tablesanpham_phukien table (hoadon int, dongia money)
	declare @tablehoadon table (hoadon int, dongia money)


	insert @tablethucung select hoadon.idhoadon, sum(hoadonchitiet_thucung.dongia)
						 from hoadon inner join hoadonchitiet_thucung on hoadon.idhoadon = hoadonchitiet_thucung.idhoadon
						 group by hoadon.idhoadon
	insert @tablesanpham_phukien select hoadon.idhoadon, sum(hoadonchitiet_sanpham_phukien.dongia)
								 from hoadon inner join hoadonchitiet_sanpham_phukien on hoadon.idhoadon = hoadonchitiet_sanpham_phukien.idhoadon
								 group by hoadon.idhoadon
	insert @tablehoadon select tc.hoadon, tc.dongia+sp_pk.dongia
						from @tablethucung as tc inner join @tablesanpham_phukien as sp_pk on tc.hoadon = sp_pk.hoadon
	insert @tablehoadon select * from @tablethucung where hoadon not in (select hoadon from @tablesanpham_phukien)
	insert @tablehoadon select * from @tablesanpham_phukien where hoadon not in (select hoadon from @tablethucung)
	select top 10 * from @tablehoadon order by dongia desc
end
go

if object_id('hdthanghientai') is not null
drop proc hdthanghientai
go
create proc hdthanghientai
as begin
	select * from hoadon where month(ngayxuathoadon) = month(getdate())
end
go

if object_id('hoadonadmin') is not null
drop proc hoadonadmin
go
create proc hoadonadmin
as begin 
	select * from hoadon where nhanvien is null
end
go

if object_id ('top3nv') is not null
drop proc top3nv
go
create proc top3nv
as begin
	declare @tongtienthucung money
	declare @tongtiensanpham_phukien money

	set @tongtienthucung = (select sum(dongia) from hoadonchitiet_thucung where idhoadon = 1)
	set @tongtiensanpham_phukien = (select sum(dongia) from hoadonchitiet_sanpham_phukien where idhoadon = 1)

	select 1, @tongtienthucung as 'tttc', @tongtiensanpham_phukien as 'ttsp_pk'
end
---------------------------------
if object_id('sodonhangtrongthang') is not null
drop proc sodonhangtrongthang
go
create proc sodonhangtrongthang (@thang int, @nam int)
as begin
	select count(*) from hoadon where month(ngayxuathoadon) = @thang and year(ngayxuathoadon) = @nam
end
go

if object_id('tkdtbhadminttn') is not null   --Thống kê doanh thu bán hàng admin theo tháng năm
drop proc tkdtbhadminttn
go
create proc tkdtbhadminttn (@thang int, @nam int)
as begin
	declare @soluongdon int
	declare @tienthucung money
	declare @tiensanpham_phukien money

	set @soluongdon = (select count(*) from hoadon 
					   where nhanvien is null and month(ngayxuathoadon) = @thang and year(ngayxuathoadon) = @nam)

	set @tienthucung = (
					   select sum(dongia)
					   from hoadonchitiet_thucung
					   where idhoadon in (select idhoadon from hoadon 
					   where nhanvien is null and month(ngayxuathoadon) = @thang and year(ngayxuathoadon) = @nam)
					   )
	set @tiensanpham_phukien = (
								select sum(dongia)
								from hoadonchitiet_sanpham_phukien
								where idhoadon in (select idhoadon from hoadon 
								where nhanvien is null and month(ngayxuathoadon) = @thang and year(ngayxuathoadon) = @nam)
							   )
	select 0 as 'NV', @thang as 'thang', @nam as 'nam',
	@soluongdon as 'soluongdonban', @tienthucung as 'tienthucung', @tiensanpham_phukien as 'tiensanpham_phukien'
end
go


if object_id('tkdtbhnvttn') is not null   --Thống kê doanh thu bán hàng nhân viên theo tháng năm
drop proc tkdtbhnvttn
go
create proc tkdtbhnvttn (@nhanvien int, @thang int, @nam int)
as begin
	declare @soluongdon int
	declare @tienthucung money
	declare @tiensanpham_phukien money

	set @soluongdon = (select count(*) from hoadon 
					   where nhanvien = @nhanvien and month(ngayxuathoadon) = @thang and year(ngayxuathoadon) = @nam)

	set @tienthucung = (
					   select sum(dongia)
					   from hoadonchitiet_thucung
					   where idhoadon in (select idhoadon from hoadon 
					   where nhanvien = @nhanvien and month(ngayxuathoadon) = @thang and year(ngayxuathoadon) = @nam)
					   )
	set @tiensanpham_phukien = (
								select sum(dongia)
								from hoadonchitiet_sanpham_phukien
								where idhoadon in (select idhoadon from hoadon 
								where nhanvien = @nhanvien and month(ngayxuathoadon) = @thang and year(ngayxuathoadon) = @nam)
							   )
	select @nhanvien as 'NV', @thang as 'thang', @nam as 'nam',
	@soluongdon as 'soluongdonban', @tienthucung as 'tienthucung', @tiensanpham_phukien as 'tiensanpham_phukien'
end
go
--------------

if object_id('tkbh12ttn') is not null   --Thống kê bán hàng 12 tháng trong năm
drop proc tkbh12ttn
go
create proc tkbh12ttn (@nhanvien int)
as begin
	declare @table table (nhanvien int, thang int, nam int, soluongdon int, tongtien money)
	declare @thang int
	set @thang = 1
	declare @nam int
	set @nam = year(getdate())
	
	while @thang <= 12
	begin
		insert @table execute tkdtbhnvttn @nhanvien, @thang, @nam
		set @thang = @thang + 1
	end
	select * from @table
end
go
----------------------------------------------------------------
if object_id('top5sanphamtrongthang') is not null
drop proc top5sanphamtrongthang
go
create proc top5sanphamtrongthang (@thang int, @nam int)
as begin
	select top 5 idsanpham_phukien, sum(soluong) as 'soluong' from hoadonchitiet_sanpham_phukien 
	where idhoadon in (select idhoadon from hoadon where month(ngayxuathoadon) = @thang and year(ngayxuathoadon) = @nam)
	group by idsanpham_phukien
	order by soluong desc
end
go

if object_id('soluongsanphambantrongthang') is not null
drop proc soluongsanphambantrongthang
go
create proc soluongsanphambantrongthang (@thang int, @nam int)
as begin
	select sum(soluong) from hoadonchitiet_sanpham_phukien 
	where idhoadon in (select idhoadon from hoadon where month(ngayxuathoadon) = @thang and year(ngayxuathoadon) = @nam)
end