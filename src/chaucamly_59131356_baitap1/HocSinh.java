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
public class HocSinh extends CaNhan
{
    String lop;
    String nangkhieu;
    public HocSinh(String lop, String nangkhieu, String hoTen, int Tuoi, String diaChi, String sdt)
    {
        super(hoTen, Tuoi, diaChi,sdt);
        this.lop=lop;
        this.nangkhieu=nangkhieu;
    }

    public String getlop()
    {
        return lop;
    }
    public void setlop(String lop)
    {
        this.lop=lop;
    }
    public String getnangkhieu()
    {
        return nangkhieu;
    }
    public void setnangkhieu(String nangkhieu)
    {
        this.nangkhieu=nangkhieu;
    }

    @Override
    public  String HienThiTT()
    {
        return "Học sinh: Họ Tên: " + hoTen+ ", "
                + "Tuổi: " + Tuoi + ", "
                + "Địa Chỉ: " + diaChi + ", "
                + "Số điện thoại: " + sdt + ", "
                + "Lớp : " + lop + ", "
                + "Năng khiếu: " + nangkhieu;
    }
 
 }
