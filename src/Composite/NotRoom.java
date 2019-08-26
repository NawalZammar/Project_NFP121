/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import javafx.beans.InvalidationListener;
import Composite.Component;
import Models.Notification;
/**
 *
 * @author USER
 */
public class NotRoom extends Observable implements Component {
    
    private List<Component> subordinates = new ArrayList<Component>();

    @Override
    public void sendMessage(Notification not) {
        for (Component component : subordinates) {
            component.sendMessage(not);
        }

    }

    public void add(Component component) {
        subordinates.add(component);
    }

    public void remove(Component component) {
        subordinates.remove(component);
    }

    public Component getChild(int index) {
        return subordinates.get(index);
    }

}
