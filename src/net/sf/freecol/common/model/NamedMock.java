package net.sf.freecol.common.model;

import javax.annotation.Generated;

/** Mock for { @link Named } */
@Generated(value = "org.junit-tools-1.0.5")
public class NamedMock implements Named {

	private String getNameKeyResult = "";

	public static NamedMock create() {
		return new NamedMock();
	}

	public void setGetNameKeyResult(String getNameKeyResult) {
		this.getNameKeyResult = getNameKeyResult;
	}

	@Override
	public String getNameKey() {
		return getNameKeyResult;
	}
}