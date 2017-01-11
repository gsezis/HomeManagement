package com.example.homemmanagement.bad;

import com.example.homemmanagement.R;
import com.example.homemmanagement.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Bad extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bad);
	}
	
	@Override
	public boolean onCreateOptionsMenu (Menu menu)
	{
		MenuInflater mInf = getMenuInflater();
		mInf.inflate(R.menu.menu, menu);
		
		return super.onCreateOptionsMenu(menu);
		
	}
	public boolean onCreateOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId()) {
		case R.id.menu_item:
			Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
			
			break;

		default:
			break;
		}
		return super.onContextItemSelected(item);
		
	}
	
}
