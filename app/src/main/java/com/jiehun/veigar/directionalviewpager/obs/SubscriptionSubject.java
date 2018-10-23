package com.jiehun.veigar.directionalviewpager.obs;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: houwj
 * @date: 2018/10/17
 */

public class SubscriptionSubject implements Subject{
    private List<Observer> list = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer : list){
            observer.update(message);
        }
    }
}
