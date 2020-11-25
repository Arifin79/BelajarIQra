package com.example.ngaji.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ngaji.R;

public class CostumListAdapterTata extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] judulList;
    private final String[] detailList;
    private final Integer[] gambarList;

    public CostumListAdapterTata(Activity context, String[] judulList, String[] detailList, Integer[] gambarList) {
        super(context, R.layout.tata_item,judulList);
        this.context = context;
        this.judulList = judulList;
        this.detailList = detailList;
        this.gambarList = gambarList;
    }

    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater infalter = context.getLayoutInflater();
        View rowView = infalter.inflate(R.layout.tata_item, null, true);

        TextView txtList = rowView.findViewById(R.id.tv_item_name);
        TextView dtlList = rowView.findViewById(R.id.tv_item_detail);
        ImageView imageList = rowView.findViewById(R.id.image_list);

        txtList.setText(judulList[position]);
        dtlList.setText(detailList[position]);
        imageList.setImageResource(gambarList[position]);

        return rowView;
    }
}