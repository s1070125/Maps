package com.example.androidmapsv2;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 Uri uri = Uri.parse("http://www.evenementenmail.nl/maps.html");
		 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		 startActivity(intent);

	}
	

}
