package net.sf.freecol.common.model;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Generated;

/** Mock for { @link Location } */
@Generated(value = "org.junit-tools-1.0.5")
public class LocationMock implements Location {

	private String getIdResult = "";
	private Tile getTileResult = null;
	private StringTemplate getLocationLabelResult = "";
	private StringTemplate getLocationLabelForResult = "";
	private boolean addResult = false;
	private boolean removeResult = false;
	private boolean containsResult = false;
	private boolean canAddResult = false;
	private int getUnitCountResult = 0;
	private List<Unit> getUnitListResult = null;
	private Iterator<Unit> getUnitIteratorResult = null;
	private GoodsContainer getGoodsContainerResult = null;
	private Settlement getSettlementResult = null;
	private Colony getColonyResult = null;
	private IndianSettlement getIndianSettlementResult = null;
	private Location upResult = null;
	private int getRankResult = 0;
	private String toShortStringResult = "";
	private Location upLocResult = null;
	private int getRankResult_1 = 0;

	public static LocationMock create() {
		return new LocationMock();
	}

	public void setGetIdResult(String getIdResult) {
		this.getIdResult = getIdResult;
	}

	@Override
	public String getId() {
		return getIdResult;
	}

	public void setGetTileResult(Tile getTileResult) {
		this.getTileResult = getTileResult;
	}

	@Override
	public Tile getTile() {
		return getTileResult;
	}

	public void setGetLocationLabelResult(StringTemplate getLocationLabelResult) {
		this.getLocationLabelResult = getLocationLabelResult;
	}

	@Override
	public StringTemplate getLocationLabel() {
		return getLocationLabelResult;
	}

	public void setGetLocationLabelForResult(StringTemplate getLocationLabelForResult) {
		this.getLocationLabelForResult = getLocationLabelForResult;
	}

	@Override
	public StringTemplate getLocationLabelFor(Player player) {
		return getLocationLabelForResult;
	}

	public void setAddResult(boolean addResult) {
		this.addResult = addResult;
	}

	@Override
	public boolean add(Locatable locatable) {
		return addResult;
	}

	public void setRemoveResult(boolean removeResult) {
		this.removeResult = removeResult;
	}

	@Override
	public boolean remove(Locatable locatable) {
		return removeResult;
	}

	public void setContainsResult(boolean containsResult) {
		this.containsResult = containsResult;
	}

	@Override
	public boolean contains(Locatable locatable) {
		return containsResult;
	}

	public void setCanAddResult(boolean canAddResult) {
		this.canAddResult = canAddResult;
	}

	@Override
	public boolean canAdd(Locatable locatable) {
		return canAddResult;
	}

	public void setGetUnitCountResult(int getUnitCountResult) {
		this.getUnitCountResult = getUnitCountResult;
	}

	@Override
	public int getUnitCount() {
		return getUnitCountResult;
	}

	public void setGetUnitListResult(List<Unit> getUnitListResult) {
		this.getUnitListResult = getUnitListResult;
	}

	@Override
	public List<Unit> getUnitList() {
		return getUnitListResult;
	}

	public void setGetUnitIteratorResult(Iterator<Unit> getUnitIteratorResult) {
		this.getUnitIteratorResult = getUnitIteratorResult;
	}

	@Override
	public Iterator<Unit> getUnitIterator() {
		return getUnitIteratorResult;
	}

	public void setGetGoodsContainerResult(GoodsContainer getGoodsContainerResult) {
		this.getGoodsContainerResult = getGoodsContainerResult;
	}

	@Override
	public GoodsContainer getGoodsContainer() {
		return getGoodsContainerResult;
	}

	public void setGetSettlementResult(Settlement getSettlementResult) {
		this.getSettlementResult = getSettlementResult;
	}

	@Override
	public Settlement getSettlement() {
		return getSettlementResult;
	}

	public void setGetColonyResult(Colony getColonyResult) {
		this.getColonyResult = getColonyResult;
	}

	@Override
	public Colony getColony() {
		return getColonyResult;
	}

	public void setGetIndianSettlementResult(IndianSettlement getIndianSettlementResult) {
		this.getIndianSettlementResult = getIndianSettlementResult;
	}

	@Override
	public IndianSettlement getIndianSettlement() {
		return getIndianSettlementResult;
	}

	public void setUpResult(Location upResult) {
		this.upResult = upResult;
	}

	@Override
	public Location up() {
		return upResult;
	}

	public void setGetRankResult(int getRankResult) {
		this.getRankResult = getRankResult;
	}

	public void setToShortStringResult(String toShortStringResult) {
		this.toShortStringResult = toShortStringResult;
	}

	@Override
	public String toShortString() {
		return toShortStringResult;
	}

	public void setUpLocResult(Location upLocResult) {
		this.upLocResult = upLocResult;
	}

	@Override
	public Location upLoc(Location loc) {
		return upLocResult;
	}

	public void setGetRankResult_1(int getRankResult_1) {
		this.getRankResult_1 = getRankResult_1;
	}

	@Override
	public int getRank(Location loc) {
		return getRankResult_1;
	}
}