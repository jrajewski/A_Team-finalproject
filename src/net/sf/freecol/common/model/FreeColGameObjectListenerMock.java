package net.sf.freecol.common.model;

import javax.annotation.Generated;

/** Mock for { @link FreeColGameObjectListener } */
@Generated(value = "org.junit-tools-1.0.5")
public class FreeColGameObjectListenerMock implements FreeColGameObjectListener {

	public static FreeColGameObjectListenerMock create() {
		return new FreeColGameObjectListenerMock();
	}

	@Override
	public void setFreeColGameObject(String id, FreeColGameObject fcgo) {
		// nothing
	}

	@Override
	public void removeFreeColGameObject(String id) {
		// nothing
	}

	@Override
	public void ownerChanged(FreeColGameObject source, Player oldOwner, Player newOwner) {
		// nothing
	}
}