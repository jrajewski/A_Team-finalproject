package net.sf.freecol.common;

import javax.annotation.Generated;

/** Mock for { @link ObjectWithId } */
@Generated(value = "org.junit-tools-1.0.5")
public class ObjectWithIdMock implements ObjectWithId {

	private String getIdResult = "";

	public static ObjectWithIdMock create() {
		return new ObjectWithIdMock();
	}

	public void setGetIdResult(String getIdResult) {
		this.getIdResult = getIdResult;
	}

	@Override
	public String getId() {
		return getIdResult;
	}
}