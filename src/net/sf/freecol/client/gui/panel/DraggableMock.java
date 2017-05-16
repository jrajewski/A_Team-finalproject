package net.sf.freecol.client.gui.panel;

import javax.annotation.Generated;

/** Mock for { @link Draggable } */
@Generated(value = "org.junit-tools-1.0.5")
public class DraggableMock implements Draggable {

	private boolean isOnCarrierResult = false;

	public static DraggableMock create() {
		return new DraggableMock();
	}

	public void setIsOnCarrierResult(boolean isOnCarrierResult) {
		this.isOnCarrierResult = isOnCarrierResult;
	}

	@Override
	public boolean isOnCarrier() {
		return isOnCarrierResult;
	}
}