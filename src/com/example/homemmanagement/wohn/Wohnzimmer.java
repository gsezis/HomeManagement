package com.example.homemmanagement.wohn;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;


import com.example.homemmanagement.R;

public class Wohnzimmer extends Activity  {
	ImageView mImageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.records_wohnzimmer);
		
	Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setActionBar(myToolbar);
        myToolbar.setTitleTextColor(Color.WHITE);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setDisplayShowHomeEnabled(true);
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            	Intent intent_home = new Intent("com.example.homemmanagement.MenuHomeActivity");
				startActivity(intent_home);
            }
        });
        
        mImageView = (ImageView)findViewById(R.id.ImageButton01);
        mImageView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
					
				Toast.makeText(Wohnzimmer.this,"Tbd", Toast.LENGTH_LONG).show();
				
			}
		});
              
	}
	

	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	    	getMenuInflater().inflate(R.menu.main_bad_menu, menu);
	    	
	    	return super.onCreateOptionsMenu(menu);
	    }
	    @Override
	 public boolean onOptionsItemSelected(MenuItem item) {
	    	// TODO Auto-generated method stub
	    	return super.onOptionsItemSelected(item);
	    }
	
	
	
	}
		