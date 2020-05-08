/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutmasistemiuygulamasi;
import java.util.Scanner;



    public class SogutmaCihazi {
  
    private final  IEkran ekran;
    private final  SicaklikGoruntuleme sgoruntule;
    private final  Eyleyici eyleyici;
    
    

	private static final int SICAKLIK_GORUNTULE = 1;
	private static final int SOGUTUCU_AC= 2;
	private static final int SOGUTUCU_KAPAT = 3;
        private static final int CIKIS = 4;

        
        	public SogutmaCihazi() 
	{	
		ekran=new Ekran();
                sgoruntule=new SicaklikGoruntuleme();        
                eyleyici=new Eyleyici();
        }

  

   public void basla() {
	ekran.mesajGoruntule("Lütfen seçmek istedidiğiniz işlemi seçiniz");
        int secim;
        do{
            secim=anaMenuyuGoster();
			switch (secim) {
				case SICAKLIK_GORUNTULE:
                                    sgoruntule.islemYap();
					break;
				case SOGUTUCU_AC:
                                    IIslem SogutucuAcma=new SogutucuAcma(eyleyici);
                                       SogutucuAcma.islemYap();
					break;
				case SOGUTUCU_KAPAT:
                                    IIslem SogutucuKapatma=new SogutucuKapatma(eyleyici);
                                     SogutucuKapatma.islemYap();				
					break;
				case CIKIS:
					ekran.mesajGoruntule("Çıkılıyor");
					break;
				default:
					ekran.mesajGoruntule("1-4 arasında bir sayı girmelisiniz");
			}
        }while(secim!=4);
    }
    
 
    private int anaMenuyuGoster()
	{
           
		ekran.mesajGoruntule("******************************************");
		ekran.mesajGoruntule("Ana Menu");
		ekran.mesajGoruntule("1-Sıcaklık Görüntüle");
		ekran.mesajGoruntule("2-Soğutucuyu Aç");
		ekran.mesajGoruntule("3-Soğutucuyu Kapat");
		ekran.mesajGoruntule("4-Cikis");
		ekran.mesajGoruntule("Seciminiz:");
		ekran.mesajGoruntule("******************************************");

                 Scanner girdi = new Scanner(System.in);
                 int sonuc = girdi.nextInt(); 
                 return sonuc;
	}
}
