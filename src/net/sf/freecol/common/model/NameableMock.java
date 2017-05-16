package net.sf.freecol.common.model;

import javax.annotation.Generated;

/** Mock for { @link Nameable } */
@Generated(value = "org.junit-tools-1.0.5")
public class NameableMock implements Nameable {

	private String getNameResult = "";

	public static NameableMock create() {
		return new NameableMock();
	}

	public void setGetNameResult(String getNameResult) {
		this.getNameResult = getNameResult;
	}

	@Override
	public String getName() {
		return getNameResult;
	}

	@Override
	public void setName(String newName) {
		// nothing
	}
}