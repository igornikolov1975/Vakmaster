package cubes.vakmaster.nikolov.ui.adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import cubes.vakmaster.nikolov.R;


public class LanguageAdapter extends ArrayAdapter<String> {

    private ArrayList<String> list;

    public LanguageAdapter(Context context) {
        super(context,R.layout.spinner_list_item);

        list = new ArrayList<>();
        list.add("English");
        list.add("Norvegian");

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View row = inflater.inflate(R.layout.spinner_list_item,parent,false);

        TextView textView = row.findViewById(R.id.textView);
        textView.setText(list.get(position));

        ImageView imageView = row.findViewById(R.id.imageView);
        imageView.setVisibility(View.INVISIBLE);

        return row;

    }

    @Override
    public View getDropDownView(int position,View convertView,ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View row = inflater.inflate(R.layout.spinner_list_item,parent,false);

        TextView textView = row.findViewById(R.id.textView);
        textView.setText(list.get(position));

        ImageView imageView = row.findViewById(R.id.imageView);

        if (position == 0){
            imageView.setImageResource(R.drawable.flag_nation_kingdom);

        }
       else if (position == 1){
            imageView.setImageResource(R.drawable.flaf_norway);

        }

        return row;

    }
}
