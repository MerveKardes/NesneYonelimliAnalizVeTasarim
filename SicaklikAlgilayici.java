/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutmasistemiuygulamasi;
import java.util.Random;

public class SicaklikAlgilayici {
    
    private int sicaklik;
    
   
    public int SicaklikOku()
    {
        Random r=new Random();
        sicaklik=r.nextInt(40);
        return sicaklik;
    }
    
    
}
