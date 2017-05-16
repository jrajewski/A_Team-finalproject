package net.sf.freecol.common.model;

import javax.annotation.Generated;

/** Mock for { @link Ownable } */
@Generated(value = "org.junit-tools-1.0.5")
public class OwnableMock implements Ownable {

	private Player getOwnerResult = null;

	public static OwnableMock create() {
		return new OwnableMock();
	}

	public void setGetOwnerResult(Player getOwnerResult) {
		this.getOwnerResult = getOwnerResult;
	}

	@Override
	public Player getOwner() {
		return getOwnerResult;
	}

	@Override
	public void setOwner(Player p) {
		// nothing
	}
}