package org.tron.model;

import org.tron.contract.IModel;

public class Model implements IModel{
	public String getHelloWorld() {
        return DAOHelloWorld.getInstance().getHelloWorldMessage();
    }
	
}
