package net.sf.freecol.common.model;

import javax.annotation.Generated;

/** Mock for { @link TradeLocation } */
@Generated(value = "org.junit-tools-1.0.5")
public class TradeLocationMock implements TradeLocation {

	private int getGoodsCountResult = 0;
	private int getExportAmountResult = 0;
	private int getImportAmountResult = 0;

	public static TradeLocationMock create() {
		return new TradeLocationMock();
	}

	public void setGetGoodsCountResult(int getGoodsCountResult) {
		this.getGoodsCountResult = getGoodsCountResult;
	}

	@Override
	public int getGoodsCount(GoodsType goodsType) {
		return getGoodsCountResult;
	}

	public void setGetExportAmountResult(int getExportAmountResult) {
		this.getExportAmountResult = getExportAmountResult;
	}

	@Override
	public int getExportAmount(GoodsType goodsType, int turns) {
		return getExportAmountResult;
	}

	public void setGetImportAmountResult(int getImportAmountResult) {
		this.getImportAmountResult = getImportAmountResult;
	}

	@Override
	public int getImportAmount(GoodsType goodsType, int turns) {
		return getImportAmountResult;
	}
}