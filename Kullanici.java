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
public class Kullanici implements Observer{
     private Observable observable;

 
     @Override
    public void notify(String message) {
        System.out.println(message);
    }

    public void removeObserver(){
        observable.removeObserver(this);
    }
    
}
