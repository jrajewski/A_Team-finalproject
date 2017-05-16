package net.sf.freecol.common.model.pathfinding;

import javax.annotation.Generated;

import net.sf.freecol.common.model.PathNode;
import net.sf.freecol.common.model.Unit;

/** Mock for { @link GoalDecider } */
@Generated(value = "org.junit-tools-1.0.5")
public class GoalDeciderMock implements GoalDecider {

	private PathNode getGoalResult = null;
	private boolean hasSubGoalsResult = false;
	private boolean checkResult = false;

	public static GoalDeciderMock create() {
		return new GoalDeciderMock();
	}

	public void setGetGoalResult(PathNode getGoalResult) {
		this.getGoalResult = getGoalResult;
	}

	@Override
	public PathNode getGoal() {
		return getGoalResult;
	}

	public void setHasSubGoalsResult(boolean hasSubGoalsResult) {
		this.hasSubGoalsResult = hasSubGoalsResult;
	}

	@Override
	public boolean hasSubGoals() {
		return hasSubGoalsResult;
	}

	public void setCheckResult(boolean checkResult) {
		this.checkResult = checkResult;
	}

	@Override
	public boolean check(Unit u, PathNode pathNode) {
		return checkResult;
	}
}