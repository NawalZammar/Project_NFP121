/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Models.Notification;
/**
 *
 * @author USER
 */
public interface INotification {
    
    public void display(String format, Notification not);
}
