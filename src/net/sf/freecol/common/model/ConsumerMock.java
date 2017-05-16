package net.sf.freecol.common.model;

import java.util.List;
import java.util.Set;

import javax.annotation.Generated;

/** Mock for { @link Consumer } */
@Generated(value = "org.junit-tools-1.0.5")
public class ConsumerMock implements Consumer {

	private List<AbstractGoods> getConsumedGoodsResult = null;
	private int getPriorityResult = 0;
	private boolean hasAbilityResult = false;
	private Set<Modifier> getModifiersResult = null;

	public static ConsumerMock create() {
		return new ConsumerMock();
	}

	public void setGetConsumedGoodsResult(List<AbstractGoods> getConsumedGoodsResult) {
		this.getConsumedGoodsResult = getConsumedGoodsResult;
	}

	@Override
	public List<AbstractGoods> getConsumedGoods() {
		return getConsumedGoodsResult;
	}

	public void setGetPriorityResult(int getPriorityResult) {
		this.getPriorityResult = getPriorityResult;
	}

	@Override
	public int getPriority() {
		return getPriorityResult;
	}

	public void setHasAbilityResult(boolean hasAbilityResult) {
		this.hasAbilityResult = hasAbilityResult;
	}

	@Override
	public boolean hasAbility(String id) {
		return hasAbilityResult;
	}

	public void setGetModifiersResult(Set<Modifier> getModifiersResult) {
		this.getModifiersResult = getModifiersResult;
	}

	@Override
	public Set<Modifier> getModifiers(String id) {
		return getModifiersResult;
	}
}