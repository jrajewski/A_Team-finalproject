package net.sf.freecol.client.gui.panel;

import java.util.*;

/** Mock for { @link DropTarget } */
@Generated(value = "org.junit-tools-1.0.5")
public class DropTargetMock implements DropTarget {

	private boolean acceptsResult = false;
	private boolean acceptsResult_1 = false;
	private Component addResult = null;
	private int suggestedResult = 0;

	public static DropTargetMock create() {
		return new DropTargetMock();
	}

	public void setAcceptsResult(boolean acceptsResult) {
		this.acceptsResult = acceptsResult;
	}

	@Override
	public boolean accepts(Unit unit) {
		return acceptsResult;
	}

	public void setAcceptsResult_1(boolean acceptsResult_1) {
		this.acceptsResult_1 = acceptsResult_1;
	}

	@Override
	public boolean accepts(Goods goods) {
		return acceptsResult_1;
	}

	public void setAddResult(Component addResult) {
		this.addResult = addResult;
	}

	@Override
	public Component add(Component comp, boolean editState) {
		return addResult;
	}

	public void setSuggestedResult(int suggestedResult) {
		this.suggestedResult = suggestedResult;
	}

	@Override
	public int suggested(GoodsType goodsType) {
		return suggestedResult;
	}
}