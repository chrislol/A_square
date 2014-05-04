package com.example.gpa_calculator;

import com.example.asquare.R;





import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;


public class advice2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gpa_advice2);
		
		//Exit
		Button buttonGPAadvice2_1 = (Button)findViewById(R.id.buttonGPAadvice2_1);
		
		//this text view will show the advised TGA
		final TextView textViewGPAadvice2_3 = (TextView)findViewById(R.id.textViewGPAadvice2_3);
		
	

		//Exit
		buttonGPAadvice2_1.setOnClickListener(new Button.OnClickListener(){ 
			

			@Override
			public void onClick(View v) {
        
				//Exit advice function, back to GPA main << cannot achieve now
			
				finish();
	
			
			}
		});

		
		//ref: http://stackoverflow.com/questions/2300169/how-to-change-text-in-android-textview
		//this text view will show the advised TGA
		final Runnable mUpdateUITimerTask = new Runnable() {
		    public void run() {
		        // do whatever you want to change here, like:
		    	
				Bundle params = getIntent().getExtras();	   	
				int year = params.getInt ("year");
				int sem = params.getInt ("sem");
		    	double targetTGA = params.getDouble ("targetTGA");
		
		    	//Content to change
		    	textViewGPAadvice2_3.setText(MainActivity.student1.adviceMinGradePoint(year-1, sem-1, targetTGA));
		    }
		};
		
		final Handler mHandler = new Handler();
		
		// run the mUpdateUITimerTask's run() method in 10 seconds from now
		mHandler.postDelayed(mUpdateUITimerTask, 10);
		

	
	}
	
	 Button buttonGPAadvice2_1; 
	 TextView textViewGPAadvice2_3;
}
	