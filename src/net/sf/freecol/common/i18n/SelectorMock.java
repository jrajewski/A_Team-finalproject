package net.sf.freecol.common.i18n;

import javax.annotation.Generated;

/** Mock for { @link Selector } */
@Generated(value = "org.junit-tools-1.0.5")
public class SelectorMock implements Selector {

	private String getKeyResult = "";

	public static SelectorMock create() {
		return new SelectorMock();
	}

	public void setGetKeyResult(String getKeyResult) {
		this.getKeyResult = getKeyResult;
	}

	@Override
	public String getKey(String selector, String template) {
		return getKeyResult;
	}
}