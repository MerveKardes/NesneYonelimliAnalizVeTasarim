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
public class SogutucuKapatma implements IIslem{
   
     private final IEyleyici eyleyici;
     
     SogutucuKapatma(IEyleyici eyleyici){
        
         this.eyleyici=eyleyici;
     }
     
     public void islemYap(){
         
         eyleyici.SogutucuKapat();
     }
}
