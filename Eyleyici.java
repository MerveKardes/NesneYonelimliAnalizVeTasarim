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
public class Eyleyici implements IEyleyici{
    
    @Override
    public void SogutucuAc()
    {
        System.out.println("Soğutucu açıldı");
    }
    
    @Override
    public void SogutucuKapat()
    {
        System.out.println("Soğutucu kapatıldı");
    }  
}


