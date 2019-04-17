package com.projekat.pma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.projekat.pma.model.News;

import java.util.List;

public class NewsListAdapter extends ArrayAdapter<News> {

    private Context mContext;
    private int mResource;
    public NewsListAdapter(Context context, int resource, List<News> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        String title = getItem(position).getTitle();
        String text  = getItem(position).getText();

        News news = new News(title,text);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);

        TextView tvTitle = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvText = (TextView) convertView.findViewById(R.id.textView2);

        tvTitle.setText(title);
        tvText.setText(text);

        return convertView;

    }
}
