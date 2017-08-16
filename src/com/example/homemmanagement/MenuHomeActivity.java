package com.example.homemmanagement;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;


import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toolbar;

import com.example.homemmanagement.R;
import com.example.homemmanagement.beanItem;
import com.example.homemmanagement.MyAdapter;

public class MenuHomeActivity extends Activity implements
        OnItemClickListener {
 
    public static final String[] titles = new String[] { "Wohnzimmer","Schlafzimmer", "Kinderzimmer", "Flur", "Küche", "Bad","WC"
             };
 
     public static final Integer[] images = { R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher,  R.drawable.ic_launcher, 
    	 R.drawable.ic_launcher , R.drawable.ic_launcher, R.drawable.ic_launcher
         };
     public static final Integer [] imagesFoward ={R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher,  R.drawable.ic_launcher, 
    	 R.drawable.ic_launcher , R.drawable.ic_launcher, R.drawable.ic_launcher
    	 };
 
    ListView listView;
    List<beanItem> rowItems;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_home);
         
        rowItems = new ArrayList<beanItem>();
        for (int i = 0; i < titles.length; i++) {
        	beanItem item = new beanItem(images[i], titles[i], imagesFoward[i]);
            rowItems.add(item);
        }
 
        listView = (ListView) findViewById(R.id.list);
        MyAdapter adapter = new  MyAdapter(this,
                R.layout.menudata, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setActionBar(myToolbar);
        myToolbar.setTitleTextColor(Color.WHITE);
     
    }
        
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_bad_menu, menu);
        return true;
    }
     
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
            long id) {
    	switch( position )
        {
        	case 0:  Intent newActivity = new Intent("com.example.homemmanagement.bad.Bad");     
          				startActivity(newActivity);
                    	break;
          	case 1:  Intent newActivity1 = new Intent("com.example.homemmanagement.wc.Wc");     
                   		startActivity(newActivity1);
                   		break;
        	case 2:  Intent newActivity2 = new Intent("com.example.homemmanagement.bad.Bad");     
                   		startActivity(newActivity2);
                   		break;
         	case 3:  Intent newActivity3 = new Intent("com.example.homemmanagement.bad.Bad");     
         				startActivity(newActivity3);
                    	break;
            case 4:  Intent newActivity4 = new Intent("com.example.homemmanagement.wc.Wc");     
                   		startActivity(newActivity4);
                   		break;
        	case 5:  Intent newActivity5 = new Intent("com.example.homemmanagement.bad.Bad");     
        				startActivity(newActivity5);
        				break;
        	case 6: Intent newActivity6 = new Intent("com.example.homemmanagement.bad.Bad");     
           				startActivity(newActivity6);
           				break;
        }
    }
}
    	   
        
                
                         	
                              
                
    

