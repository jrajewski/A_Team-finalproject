package net.sf.freecol.common.io.sza;

import java.util.*;

/** Mock for { @link ImageAnimationEvent } */
@Generated(value = "org.junit-tools-1.0.5")
public class ImageAnimationEventMock implements ImageAnimationEvent {

	private Image getImageResult = null;
	private int getDurationInMsResult = 0;

	public static ImageAnimationEventMock create() {
		return new ImageAnimationEventMock();
	}

	public void setGetImageResult(Image getImageResult) {
		this.getImageResult = getImageResult;
	}

	@Override
	public Image getImage() {
		return getImageResult;
	}

	public void setGetDurationInMsResult(int getDurationInMsResult) {
		this.getDurationInMsResult = getDurationInMsResult;
	}

	@Override
	public int getDurationInMs() {
		return getDurationInMsResult;
	}
}