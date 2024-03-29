/***************************************************************
 * file: SplashController.java
 * author: Omar Rodriguez
 * class: CS 245 - Programming Graphical User Interfaces
 *
 * assignment: Swing Project v1.0
 * date last modified: 10/11/2016
 *
 * purpose: This is the controller that controls the communication
 * between the splash screen model and view
 *
 ****************************************************************/
package co.edu.escuelaing.hangman.controller;

import co.edu.escuelaing.hangman.GUI;
import co.edu.escuelaing.hangman.model.SplashModel;
import co.edu.escuelaing.hangman.view.SplashPanel;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashController {
    private SplashPanel panel;
    private SplashModel model;
    private MainFrameController rootController;

    public SplashController(SplashPanel panel, SplashModel model, MainFrameController rootController) {
        this.panel = (SplashPanel) panel;
        this.model = (SplashModel) model;
        this.rootController = rootController;
        setup();
    }

    //method: setup
    //purpose: set contents of model to be reflected in the view, as well as
    // set a timeout for the splash screen to automatically switch to the
    // next screen.
    private void setup() {
        panel.setTitle(model.getSplashTitle());
        panel.setTeam(model.getTeamName());
        panel.setBackgroundColor(model.getBackgroundColor());

        panel.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent event) {
                Timer timer = new Timer(model.getSplashTime(), new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        rootController.changeVisibleCard(GUI.FUNCTION_KEY);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {
            }

            @Override
            public void ancestorMoved(AncestorEvent event) {
            }

        });
    }

    //method: getPanel
    //purpose: return the panel associated with this screen (splashPanel)
    @Autowired
    public SplashPanel getPanel() {
        return panel;
    }
}
