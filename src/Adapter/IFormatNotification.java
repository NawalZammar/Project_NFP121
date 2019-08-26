/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Models.Notification;;

/**
 *
 * @author USER
 */
public interface IFormatNotification {

    public void displayText(Notification not);

    public void displayXml(Notification not);

    public void displayJson(Notification not);
}
