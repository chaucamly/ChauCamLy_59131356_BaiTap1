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
public class QLDS implements IQLDS
{
     ArrayList<CaNhan> dsCaNhan;  
     
    public QLDS (ArrayList<CaNhan> dsCaNhan) 
   {
        this.dsCaNhan = dsCaNhan;
   }

    @Override
    public int them(CaNhan p) {
        dsCaNhan.add(p);
        return 1;
    }

     
     @Override
    public int xoa(String ten) 
    {
      for(int i=0;i<dsCaNhan.size(); i++) {
          if (dsCaNhan.get(i).gethoTen() == ten) {
              dsCaNhan.remove(i);
              return 1;
          }
      }
      
      return 0;
    }

    @Override
    public void inDS() 
    { 
        for(int i=0;i<dsCaNhan.size(); i++)
        {
            System.out.println("CaNhan" + (i+1)+ " : "+ dsCaNhan.get(i).HienThiTT());
        }
      
  }
}
