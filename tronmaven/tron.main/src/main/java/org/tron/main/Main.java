package org.tron.main;

import org.troncontroller.controller.Controller;
import org.tron.model.Model;
import org.tron.view.View;;

public abstract class Main {

	public static void main(final String[] args) {
        new Controller(new View(), new Model()).run();
    }
}
