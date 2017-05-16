package net.sf.freecol.common.model;

import javax.annotation.Generated;

/** Mock for { @link TransactionListener } */
@Generated(value = "org.junit-tools-1.0.5")
public class TransactionListenerMock implements TransactionListener {

	public static TransactionListenerMock create() {
		return new TransactionListenerMock();
	}

	@Override
	public void logPurchase(GoodsType goodsType, int amount, int price) {
		// nothing
	}

	@Override
	public void logSale(GoodsType goodsType, int amount, int price, int tax) {
		// nothing
	}
}