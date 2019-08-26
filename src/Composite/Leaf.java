/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.Observable;
import java.util.Observer;
import javafx.beans.InvalidationListener;
import Models.Notification;

/**
 *
 * @author USER
 */
public class Leaf extends Observable implements Component {
    
    @Override
    public void sendMessage(Notification not) {

        //set change
        setChanged();
        //notify observers for change
        notifyObservers(not);

    }
}
