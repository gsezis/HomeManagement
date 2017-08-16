package com.example.homemmanagement.bad;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.homemmanagement.R;

public class Bad extends Activity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.records_bad);
		
	Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setActionBar(myToolbar);
        myToolbar.setTitleTextColor(Color.WHITE);
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
		
	

