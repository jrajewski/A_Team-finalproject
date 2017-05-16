package net.sf.freecol.common.model;

import javax.annotation.Generated;

/** Mock for { @link Movable } */
@Generated(value = "org.junit-tools-1.0.5")
public class MovableMock implements Movable {

	private int getMovesLeftResult = 0;
	private int getInitialMovesLeftResult = 0;

	public static MovableMock create() {
		return new MovableMock();
	}

	public void setGetMovesLeftResult(int getMovesLeftResult) {
		this.getMovesLeftResult = getMovesLeftResult;
	}

	@Override
	public int getMovesLeft() {
		return getMovesLeftResult;
	}

	public void setGetInitialMovesLeftResult(int getInitialMovesLeftResult) {
		this.getInitialMovesLeftResult = getInitialMovesLeftResult;
	}

	@Override
	public int getInitialMovesLeft() {
		return getInitialMovesLeftResult;
	}
}