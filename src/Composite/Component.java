/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import javafx.beans.Observable;
import Models.Notification;

/**
 *
 * @author USER
 */
public interface Component {
    abstract void sendMessage(Notification not);
}
