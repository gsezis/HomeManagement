package com.example.homemmanagement.wohnzimmer.adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.homemmanagement.R;

import com.example.homemmanagement.wohnzimmer.model.WohnzimmerProductList;

public class WohnzimmerAdapter extends ArrayAdapter<WohnzimmerProductList>{

	public WohnzimmerAdapter(Context context, int layout,List<WohnzimmerProductList> objects) {
		super(context, layout,  objects);
		this.context= context;
	}

	private Context context;
	
	
	private class ViewHolder {
       
        TextView txtid;
        TextView txttitel;
        TextView txtauthor;
 
    }
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		ViewHolder holder = null;
		WohnzimmerProductList rowItem = getItem(position);
         
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.records_bad, parent, false);
            holder = new ViewHolder();
         
                 
            convertView.setTag(holder);
            
        } else
            holder = (ViewHolder) convertView.getTag();
                 
       
        holder.txtid.setText(rowItem.getId());
        holder.txttitel.setText(rowItem.getTitel());
        holder.txtauthor.setText(rowItem.getAuthor());
        
         
        return convertView;
	}

}
