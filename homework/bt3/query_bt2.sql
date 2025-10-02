select r.MaRap, r.TenRap, count(g.MaGhe) as SoGhe, cr.TenCumRap
from Rap r 
join CumRap cr on r.MaCumRap = cr.MaCumRap
join Ghe g on r.MaRap = g.MaRap
where cr.TenCumRap like "Mega GS"
group by r.MaRap, r.TenRap, cr.TenCumRap;

select g.MaGhe, g.TenGhe, r.TenRap, g.STT, lg.TenLoaiGhe, g.KichHoat
from Ghe g
join Rap r on g.MaRap = r.MaRap
join LoaiGhe lg on g.MaLoaiGhe = lg.MaLoaiGhe
where lg.TenLoaiGhe like "Thuong";

select p.TenPhim, r.TenRap, c.NgayGioChieu, c.GiaVe, c.ThoiLuong
from Chieu c
join Rap r on c.MaRap = r.MaRap
join Phim p on c.MaPhim = p.MaPhim
where c.NgayGioChieu = "2019-01-01 14:00:00";

select nd.TaiKhoan, nd.Email, nd.SoDT
from NguoiDung nd
join LoaiNguoiDung lnd on nd.MaLoaiNguoiDung = lnd.MaLoaiNguoiDung
where lnd.TenLoaiNguoiDung = "Nhom 1";

select p.TenPhim, r.TenRap, c.NgayGioChieu, c.GiaVe, c.ThoiLuong
from Chieu c
join Phim p on c.MaPhim = p.MaPhim
join Rap r on c.MaRap = r.MaRap
where p.TenPhim like "%Ted%";



