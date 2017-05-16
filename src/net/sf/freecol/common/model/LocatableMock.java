package net.sf.freecol.common.model;

import javax.annotation.Generated;

/** Mock for { @link Locatable } */
@Generated(value = "org.junit-tools-1.0.5")
public class LocatableMock implements Locatable {

	private Location getLocationResult = null;
	private boolean setLocationResult = false;
	private boolean isInEuropeResult = false;
	private Tile getTileResult = null;
	private int getSpaceTakenResult = 0;

	public static LocatableMock create() {
		return new LocatableMock();
	}

	public void setGetLocationResult(Location getLocationResult) {
		this.getLocationResult = getLocationResult;
	}

	@Override
	public Location getLocation() {
		return getLocationResult;
	}

	public void setSetLocationResult(boolean setLocationResult) {
		this.setLocationResult = setLocationResult;
	}

	@Override
	public boolean setLocation(Location newLocation) {
		return setLocationResult;
	}

	public void setIsInEuropeResult(boolean isInEuropeResult) {
		this.isInEuropeResult = isInEuropeResult;
	}

	@Override
	public boolean isInEurope() {
		return isInEuropeResult;
	}

	public void setGetTileResult(Tile getTileResult) {
		this.getTileResult = getTileResult;
	}

	@Override
	public Tile getTile() {
		return getTileResult;
	}

	public void setGetSpaceTakenResult(int getSpaceTakenResult) {
		this.getSpaceTakenResult = getSpaceTakenResult;
	}

	@Override
	public int getSpaceTaken() {
		return getSpaceTakenResult;
	}
}