package com.example.ngaji.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ngaji.R;

public class CostumListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] judulList;
    private final Integer[] gambarHamzah;

    public CostumListAdapter(Activity context, String[] judulList, Integer[] gambarHamzah) {
        super(context, R.layout.row_item, judulList);
        this.context = context;
        this.judulList = judulList;
        this.gambarHamzah = gambarHamzah;
    }
    public View getView(int position, View view, ViewGroup viewGroup){
        LayoutInflater infalter = context.getLayoutInflater();
        View rowView = infalter.inflate(R.layout.row_item, null, true);

        TextView txtList = rowView.findViewById(R.id.txt_list);
        ImageView imageList = rowView.findViewById(R.id.image_list);

        txtList.setText(judulList[position]);
        imageList.setImageResource(gambarHamzah[position]);

        return rowView;
    }

}
