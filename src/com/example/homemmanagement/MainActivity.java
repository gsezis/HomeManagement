package com.example.homemmanagement;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity  {
	
	private static EditText mEditText;
	private static EditText pEditText;
	private static Button lbutton;
	private static int counter =3;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registrationUser();
    }
    
    public void registrationUser()
    {
    	mEditText= (EditText)findViewById(R.id.Login_email);
    	pEditText= (EditText)findViewById(R.id.editText2);
    	lbutton = (Button) findViewById(R.id.button1);
     	lbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
						
				if(mEditText.getText().toString().equals("abc")
					&& pEditText.getText().toString().equals("pass")){
				
					Toast.makeText(MainActivity.this, "Email and Password was correct",Toast.LENGTH_SHORT).show();
				
					Intent intent_home = new Intent("com.example.homemmanagement.MenuHomeActivity");
					startActivity(intent_home);
				}
				
				if(! mEditText.getText().toString().equals("abc") | (!pEditText.getText().toString().equals("pass"))) {
					counter --;
					
					if(counter==0)
					{
						lbutton.setEnabled(false);
					Toast.makeText(MainActivity.this, "You entered the entries incorrectly three times",Toast.LENGTH_LONG).show();	
											
					}
								
				}
					
				
				}
									
			
		});
    	 	
    
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//    	getMenuInflater().inflate(R.menu.main_bad_menu, menu);
//    	
//    	return super.onCreateOptionsMenu(menu);
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//    	// TODO Auto-generated method stub
//    	return super.onOptionsItemSelected(item);
//    }
}
