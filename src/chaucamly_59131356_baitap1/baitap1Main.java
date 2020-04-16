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
public class baitap1Main 
{
    public static void main(String[] arg)
    {
        LopHoc lh = new LopHoc();
        lh.setGiaoVienCN(new GiaoVien("Hoa", "LyHoa", "Nguyen Van A", 30, "PY", "0978727659"));
        
        lh.themGVGD(new GiaoVien("The Duc", "The Chat", "Ngyen Thi B", 28, "NT", "0986543205"));
        lh.themGVGD(new GiaoVien("Lich Su", "Su Dia", "Nguyen Thi C", 38, "TH", "0765349740"));
        lh.themGVGD(new GiaoVien("Toan", "Toan", "Nguyen Van D", 32, "PY", "0376598797"));
        lh.themGVGD(new GiaoVien("Anh", "Ngoai Ngu", "Ngyen Thi E", 30, "HN", "0375863976"));
        
      
        lh.themHocSinh(new HocSinh("1", "hat", "Tran Thi Anh", 12, "PY", "0954378476"));
        lh.themHocSinh(new HocSinh("2", "mua", "Do Thuy Quynh", 11, "PY", "0764397644"));
        lh.themHocSinh(new HocSinh("1", "hat", "Nguyen Thi Nga", 9, "PY", "0986512234"));
        lh.themHocSinh(new HocSinh("2", "mua", "Nguyen Thanh Thao", 11, "PY", "0763528233"));
        lh.themHocSinh(new HocSinh("1", "hat", "Tran Bich Hop", 10, "PY", "0973526327"));
        
        
        

        System.out.println("Danh sách học sinh:");
        lh.inDSHS();
        
        System.out.println("Danh sách giáo viên giảng  dạy:");
        lh.inDSGVGD();
    } 
        
        

}