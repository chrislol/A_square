package com.example.gpa_calculator;


import com.example.asquare.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class GPAMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gpa_main);
		
		ButtonGPAmain1 = (Button)findViewById(R.id.ButtonGPAmain1);
		ButtonGPAmain2 = (Button)findViewById(R.id.ButtonGPAmain2);
		ButtonGPAmain3 = (Button)findViewById(R.id.ButtonGPAmain3);
		
		
		ButtonGPAmain1.setOnClickListener(new View.OnClickListener() {

	            @Override
	            public void onClick(View view) {
	            	
	                //count = listView.getAdapter().getCount();
	            	Intent intent = new Intent();
	            	intent.setClass(GPAMainActivity.this, print_course_record.class);
	                startActivity(intent);
	                


	            }
	            
	     
	            
	        });
		
		ButtonGPAmain2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            	
                //count = listView.getAdapter().getCount();
            	Intent intent = new Intent();
            	intent.setClass(GPAMainActivity.this, advice1.class);
                startActivity(intent);
                


            }
            
     
            
        });
		
		ButtonGPAmain3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            	
                //count = listView.getAdapter().getCount();
            	Intent intent = new Intent();
            	intent.setClass(GPAMainActivity.this, add_course_record.class);
                startActivity(intent);
                


            }
            
     
            
        });
	}
	
	

	Button ButtonGPAmain1;
	Button ButtonGPAmain2;
	Button ButtonGPAmain3;
}