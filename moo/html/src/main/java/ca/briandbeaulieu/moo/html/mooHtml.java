package ca.briandbeaulieu.moo.html;

import ca.briandbeaulieu.moo.core.moo;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class mooHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new moo();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
