package com.example.user.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends BaseAdapter {

    ArrayList<Music> list;
    Context context;
    int resource;

    public MusicAdapter(ArrayList<Music> list, Context context, int resource) {
        this.list = list;
        this.context = context;
        this.resource = resource;
    }

    public int getCount() {
        return list.size();
    }

    public Object getItem(int i) {
        return list.get(i);
    }

    public long getItemId(int i) {
        return i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if ( view == null ) {
            LayoutInflater intflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = intflater.inflate(resource, viewGroup, false);
        }

        TextView nickname = (TextView) view.findViewById(R.id.free_nickname);
        TextView title = (TextView) view.findViewById(R.id.free_title);
        TextView date = (TextView) view.findViewById(R.id.free_date);

        nickname.setText(list.get(i).getNickname());
        date.setText(list.get(i).getDate());
        title.setText(list.get(i).getTitle());

        return view;
    }
}
