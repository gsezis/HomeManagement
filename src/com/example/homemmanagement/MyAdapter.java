package com.example.homemmanagement;


import java.util.List;
import com.example.homemmanagement.R;
import com.example.homemmanagement.beanItem;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class MyAdapter extends ArrayAdapter<beanItem> {
 
    Context context;
 
    public MyAdapter(Context context, int resourceId,
            List<beanItem> items) {
        	super(context, resourceId, items);
        this.context = context;
    }

    private class ViewHolder {
        ImageView imageView; 
        ImageView imageView2;
        TextView txtTitle;
       
 
    }
     
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
       beanItem rowItem = getItem(position);
         
        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.menudata, null);
            holder = new ViewHolder();
            
            holder.imageView = (ImageView) convertView.findViewById(R.id.icon);
            holder.txtTitle = (TextView) convertView.findViewById(R.id.title);
            holder.imageView2 = (ImageView) convertView.findViewById(R.id.icon2);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();
                 
       
        holder.txtTitle.setText(rowItem.getTitle());
        holder.imageView.setImageResource(rowItem.getImageId());
        holder.imageView2.setImageResource(rowItem.getImageforward());
         
        return convertView;
    }
}