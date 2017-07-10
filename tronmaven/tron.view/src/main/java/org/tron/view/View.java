package org.tron.view;

import org.tron.contract.IView;

public class View implements IView{

	public void displayMessage(final String message) {
        System.out.println(message);
    }
}
