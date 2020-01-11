package com.strategickaos.secondarydisplaytest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.Display;

public class  MainActivity extends AppCompatActivity{
	public DisplayManager displayManager = null;
	public Display[] presentationDisplays = null;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		displayManager =  (DisplayManager)getSystemService(Context.DISPLAY_SERVICE);
		if (displayManager!= null){
			presentationDisplays = displayManager.getDisplays(DisplayManager.DISPLAY_CATEGORY_PRESENTATION);
			if (presentationDisplays.length > 0){
				SecondaryDisplay secondaryDisplay = new SecondaryDisplay(MainActivity.this, presentationDisplays[0]);
				secondaryDisplay.show();
			}
		}
	}
}