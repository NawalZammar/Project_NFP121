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
public class TextNotification implements IFormatNotification {
  
    @Override
    public void displayText(Notification not) {

        String st = "Description = " + not.Description + " " + ",Value = " + not.value + " " + ",Type = " + not.Type;
        System.out.println(st);
    }

    @Override
    public void displayXml(Notification not) {

    }

    @Override
    public void displayJson(Notification not) {

    }
}
