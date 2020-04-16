/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaucamly_59131356_baitap1;

import java.util.ArrayList;

/**
 *
 * @author Cam Ly
 */
public class LopHoc 
{
    GiaoVien giaoVienCN;
    ArrayList<CaNhan> dsHS;
    ArrayList<CaNhan> dsGVGD;
    
    IQLDS qldsGVGD;
    IQLDS qldsHS;
  
    
    public  LopHoc()
    {
        dsGVGD = new ArrayList<>();
        dsHS = new ArrayList<>();
        qldsHS = new QLDS(dsHS);
        qldsGVGD = new QLDS(dsGVGD);
    }

    public void setGiaoVienCN(GiaoVien giaoVienCN) {
        this.giaoVienCN = giaoVienCN;
    }
    
    
    
    
    public void themGVGD (GiaoVien gv)
    {
        qldsGVGD.them(gv);
    }
    
    public void themHocSinh (HocSinh hs)
    {
        qldsHS.them(hs);
    }
    
    public void inDSHS()
    {
        qldsHS.inDS();
    }
    public void inDSGVGD()
    {
        qldsGVGD.inDS();
    }
}
    
   
