package net.sf.freecol.common.model.pathfinding;

import java.util.*;

/** Mock for { @link CostDecider } */
@Generated(value = "org.junit-tools-1.0.5")
public class CostDeciderMock implements CostDecider {

	private int getCostResult = 0;
	private int getMovesLeftResult = 0;
	private int getNewTurnsResult = 0;

	public static CostDeciderMock create() {
		return new CostDeciderMock();
	}

	public void setGetCostResult(int getCostResult) {
		this.getCostResult = getCostResult;
	}

	@Override
	public int getCost(Unit unit, Location oldLocation, Location newLocation, int movesLeftBefore) {
		return getCostResult;
	}

	public void setGetMovesLeftResult(int getMovesLeftResult) {
		this.getMovesLeftResult = getMovesLeftResult;
	}

	@Override
	public int getMovesLeft() {
		return getMovesLeftResult;
	}

	public void setGetNewTurnsResult(int getNewTurnsResult) {
		this.getNewTurnsResult = getNewTurnsResult;
	}

	@Override
	public int getNewTurns() {
		return getNewTurnsResult;
	}
}