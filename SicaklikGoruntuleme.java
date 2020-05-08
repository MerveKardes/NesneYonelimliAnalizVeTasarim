/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutmasistemiuygulamasi;

/**
 *
 * @author MERVE KARDES
 */
public class SicaklikGoruntuleme implements IIslem {
    
    private final IEkran ekran;
    private final SicaklikAlgilayici sicaklikAlgilayici;
   
    
    public SicaklikGoruntuleme()
    {
     ekran=new Ekran();
     sicaklikAlgilayici=new SicaklikAlgilayici();
        
    }

    public void islemYap(){
        ekran.mesajGoruntule("Ortam Sıcaklığı:"+" "+sicaklikAlgilayici.SicaklikOku()+" "+"derecedir.");
    }
            
    
}
