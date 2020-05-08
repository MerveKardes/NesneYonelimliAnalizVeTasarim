/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutmasistemiuygulamasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


public class VeritabaniBilgiSistemi {
    
    private static VeritabaniBilgiSistemi instance=null;
    
   private VeritabaniBilgiSistemi(){}
   
   public static VeritabaniBilgiSistemi getInstance(){
		if(instance==null){
                    instance=new VeritabaniBilgiSistemi();
		}
		return instance;
		
	}
    
      public Connection baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SogutmaSistemi",
                    "postgres", "mervekardes");
            if (conn != null)
                System.out.println("Veritabanına bağlanıyor...");
            else
                System.out.println("Bağlantı girişimi başarısız!");
        } catch (SQLException e) {
        }
        return conn;
    }
      
      public boolean girisYap(String kullanici_adi,String sifre) throws SQLException
    {
       Connection conn = baglan();
        String sql="SELECT * FROM \"public\".\"Kullanici\" WHERE \"kullaniciAdi\" = '" + kullanici_adi + "'and sifre = '" + sifre + "'";
        if(conn != null)
        {
            try
            {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                conn.close();
                if(rs.next())
                {
                      System.out.println("Kullanıcı bilgileri doğrulandı.");
                    return true;
                }
                else
                {
                    System.out.println("Hatalı giriş! Kullanıcı adı veya şifre yanlış.");
                    return false;
                }
            } catch(SQLException e)
            {
            }
        }
        else
            return false;
        return false;
    }
}
    
   

