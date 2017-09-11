package com.example.homemmanagement;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

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
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setActionBar(myToolbar);
        myToolbar.setTitleTextColor(Color.WHITE);
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
					Toast.makeText(MainActivity.this, "Email or password wasn´t correct",Toast.LENGTH_LONG).show();
					
					if(counter==0)
					{
						lbutton.setEnabled(false);
					Toast.makeText(MainActivity.this, "You entered the entries incorrectly three times",Toast.LENGTH_LONG).show();	
					}
								
				}
						
				}						
		});
    	 	
        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.login_menu, menu);
    	
    	return super.onCreateOptionsMenu(menu);
    }
   @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    
	   switch(item.getItemId()) {
	    case R.id.action_AboutUs:
	    	Toast.makeText(MainActivity.this, "About Us",Toast.LENGTH_LONG).show();	
//	        Intent intent = new Intent(this, ActivityForItemOne.class);
//	        this.startActivity(intent);
	        break;
	    case R.id.action_Settings:
	    	Toast.makeText(MainActivity.this, "Settings",Toast.LENGTH_LONG).show();	
	        break;
	    case R.id.action_LogIn:
	    		
	        break;
	        
	    default:
	        return super.onOptionsItemSelected(item);
	    }

	    return true;
	}
}
