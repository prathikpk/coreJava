package com.Aurionpro.Test;

import com.Aurionpro.model.Advertisement;
import com.Aurionpro.model.IDisplayable;
import com.Aurionpro.model.Monitor;
import com.Aurionpro.model.Projector;
import com.Aurionpro.model.Television;

public class AdvertisementTest {

	public static void main(String[] args) {
		Advertisement ad = new Advertisement();

		IDisplayable m = new Monitor();
		ad.setDisp(m);
		ad.showDisplay();

		IDisplayable p = new Projector();
		ad.setDisp(p);
		ad.showDisplay();

		IDisplayable tv = new Television();
		ad.setDisp(tv);
		ad.showDisplay();
	}

}
