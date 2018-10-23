package com.jiehun.veigar.directionalviewpager.obs;

/**
 * @description:
 * @author: houwj
 * @date: 2018/10/17
 */

public interface Subject {
    void attach(Observer observer);//增加订阅者
    void detach(Observer observer);//删除订阅者
    void notify(String message);//更新消息
}
