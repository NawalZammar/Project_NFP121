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
public class XmlNotification implements IFormatNotification {
  
    @Override
    public void displayText(Notification not) {
    }

    @Override
    public void displayXml(Notification not) {
        String str = "<Notification>"
                + "<Description>" + not.Description + "</Description>"
                + "<Value>" + not.value + "</Value>"
                + "<Type>" + not.Type + "</Type>"
                + "</Notification>";

        System.out.println(str);
    }

    @Override
    public void displayJson(Notification not) {
    }

}
