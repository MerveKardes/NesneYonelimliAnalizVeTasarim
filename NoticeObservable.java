/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutmasistemiuygulamasi;

import java.util.ArrayList;
import java.util.List;

public class NoticeObservable implements Observable{
    private List<Observer> observerList = new ArrayList<>();
    
    private String message = "Bildirim... !";

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer); // Kullanıcıları duyuruya eklemek için.
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer); // Kullanıcıları duyurudan silmek için.
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.notify(message); // Duyuruya kayıtlı kullanıcılara mesaj göndermek için.
        }
    }
    
}
