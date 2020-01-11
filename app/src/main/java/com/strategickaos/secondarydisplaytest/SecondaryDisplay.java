package com.strategickaos.secondarydisplaytest;


import android.app.Presentation;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;

public class SecondaryDisplay extends Presentation
{

	public SecondaryDisplay(Context outerContext, Display display) {
		super(outerContext, display);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondary_display);
	}
}