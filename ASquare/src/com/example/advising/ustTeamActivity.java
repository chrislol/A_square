package com.example.advising;

import com.example.asquare.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ustTeamActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
			    String phoneNum="23586696";

			    Intent i=new Intent(Intent.ACTION_DIAL,Uri.parse(phoneNum));
			    startActivity(i);
			  }
		});
	
	}
	
	private Button button1;
	
}
