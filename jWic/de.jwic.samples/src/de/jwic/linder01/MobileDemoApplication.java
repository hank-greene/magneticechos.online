package de.jwic.linder01;

import java.util.ArrayList;
import java.util.List;

import de.jwic.base.Application;
import de.jwic.base.Control;
import de.jwic.base.IControlContainer;
import de.jwic.linder01.demos.EchoWindow;
import de.jwic.linder01.demos.InputDemo;
import de.jwic.linder01.demos.SelectMenuDemo06;

/**
 * Created by boogie on 10/27/14.
 */
public class MobileDemoApplication extends Application {

	@Override
	public Control createRootControl(IControlContainer container) {
		
		final List<MobileDemoModule> mobileDemoModules = new ArrayList<MobileDemoModule>();

		mobileDemoModules.add(new EchoWindow());
		mobileDemoModules.add(new SelectMenuDemo06());
		mobileDemoModules.add(new InputDemo());
		
		return new MobileDemoPage(container, "demoPage", mobileDemoModules);
	}
}
