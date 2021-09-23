/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungnd62.observer;

/**
 *
 * @author Admin
 */
public interface SubjectItf {
    //Định nghĩa sự phụ thuộc một nhiều giữa các đối tượng sao cho khi một đối tượng thay đổi trạng thái thì tất cả các đối tượng phụ thuộc nó cũng thay đổi theo
    public void attach(ObserverItf observer);
    public void detach(ObserverItf observer);
    public void notifyAllObserver();
}
