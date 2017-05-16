package net.sf.freecol.common.model.mission;

import javax.annotation.Generated;

import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.Unit;

/** Mock for { @link Mission } */
@Generated(value = "org.junit-tools-1.0.5")
public class MissionMock implements Mission {

	private MissionState doMissionResult = null;
	private boolean isValidResult = false;
	private Unit getUnitResult = null;

	public static MissionMock create() {
		return new MissionMock();
	}

	public void setDoMissionResult(MissionState doMissionResult) {
		this.doMissionResult = doMissionResult;
	}

	@Override
	public MissionState doMission() {
		return doMissionResult;
	}

	public void setIsValidResult(boolean isValidResult) {
		this.isValidResult = isValidResult;
	}

	@Override
	public boolean isValid() {
		return isValidResult;
	}

	public void setGetUnitResult(Unit getUnitResult) {
		this.getUnitResult = getUnitResult;
	}

	@Override
	public Unit getUnit() {
		return getUnitResult;
	}

	@Override
	public void toXML(FreeColXMLWriter xw) throws QXMLStreamException;

	{
		// nothing
	}
}