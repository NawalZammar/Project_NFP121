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
public class JsonNotification implements IFormatNotification  {
  
    
    @Override
    public void displayText(Notification not) {

    }

    @Override
    public void displayXml(Notification not) {

    }

    @Override
    public void displayJson(Notification not) {
        String str = "{'Description':" + not.Description
                + "'Value':" + not.value
                + "'Type':" + not.Type + "}";
        System.out.println(str);
    }
}
