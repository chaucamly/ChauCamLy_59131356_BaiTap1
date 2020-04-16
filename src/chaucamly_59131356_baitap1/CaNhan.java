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
public abstract class CaNhan 
{
    String hoTen;
    int Tuoi;
    String diaChi;
    String sdt;
    
    public CaNhan(String hoTen, int Tuoi, String diaChi, String sdt)
    {
        this.hoTen=hoTen;
        this.Tuoi=Tuoi;
        this.diaChi=diaChi;
        this.sdt=sdt;
    }
    
    
    public String gethoTen()
    {
        return hoTen;
    }
    public void sethoTen(String hoTen)
    {
        this.hoTen=hoTen;
    }
    public int getTuoi()
    {
        return Tuoi;
    }
    public int setTuoi()
    {
        return Tuoi;
    }
    public String getdiaChi()
    {
        return diaChi;
    }
    public void setdiaChi(String diaChi)
    {
        this.diaChi=diaChi;
    }
    public String sdt()
    {
        return sdt;
    }
    public void setsdt(String sdt)
    {
        this.sdt=sdt;
    }
      
    
    public abstract String HienThiTT();
}



