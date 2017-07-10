package org.troncontroller.controller;

import org.tron.contract.IModel;
import org.tron.contract.IView;

public class Controller {

	private final IView  view;
    private final IModel model;

    public Controller(final IView view, final IModel model) {
        this.view = view;
        this.model = model;
    }

    public void run() {
        this.view.displayMessage(this.model.getHelloWorld());
    }
}
