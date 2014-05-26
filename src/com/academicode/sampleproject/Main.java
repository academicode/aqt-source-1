package com.academicode.sampleproject;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * This Activity is the only Activity of the application.  We use it to demonstrate
 * how to *programatically* go full screen. 
 * 
 * You can simply do this using themes, as well!
 * 
 * The XML file associated with this Activity is "layout\main.xml".
 * 
 * @author Marc J. McDougall
 */
public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// Mandatory parent method call.
		super.onCreate(savedInstanceState);
		
		// We want to remove the TitleBar.
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		// We also want to remove the ActionBar by going completely full screen!
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		// Then, we set the content view to the appropriate XML file. 
		setContentView(R.layout.main);
	}
}
