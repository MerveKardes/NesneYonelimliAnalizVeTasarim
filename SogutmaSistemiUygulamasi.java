
package sogutmasistemiuygulamasi;


import java.util.Scanner;

import java.sql.SQLException;



public class SogutmaSistemiUygulamasi {


    public static void main(String[] args) throws SQLException  {
            

VeritabaniBilgiSistemi veritabani=VeritabaniBilgiSistemi.getInstance();

    
        System.out.println("Lütfen kullanıcı adınızı girin");
        Scanner input=new Scanner(System.in);
        String kullanici=input.nextLine();
        System.out.println("Lütfen şifrenizi girin");
        Scanner girdi=new Scanner(System.in);
        String sifre=girdi.nextLine();
        
        
     
        if(veritabani.girisYap(kullanici,sifre)==true)
        {
             SogutmaCihazi s1=new SogutmaCihazi();
             s1.basla();
        }

    }
  }    

