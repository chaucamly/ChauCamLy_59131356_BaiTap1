/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaucamly_59131356_baitap1;

/**
 *
 * @author Cam Ly
 */
public class GiaoVien extends CaNhan
{
    String monDay;
    String toBoMon;
    public GiaoVien(String monDay, String toBoMon,  String hoTen, int Tuoi, String diaChi, String sdt)
    {
        super(hoTen, Tuoi, diaChi,sdt);
        this.monDay=monDay;
        this.toBoMon=toBoMon;
    }
    
    public String getmonDay()
    {
        return monDay;
    }
      public void setmonDay(String monDay)
    {
        this.monDay=monDay;
    }
    public String gettoBoMon()
    {
        return toBoMon;
    }
     public void settoBoMon(String toBoMon)
    {
        this.toBoMon=toBoMon;
    }

    @Override
    public String HienThiTT() {
        return "Giáo viên: Họ Tên: " + hoTen+ ", "
                + "Tuổi: " + Tuoi + ", "
                + "Địa Chỉ: " + diaChi + ", "
                + "Số điện thoại: " + sdt + ", "
                + "Môn dạy : " + monDay + ", "
                + "Tổ bộ môn: " + toBoMon;
                   
    }

   
}
