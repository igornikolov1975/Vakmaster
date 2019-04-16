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

import cubes.vakmaster.nikolov.R;

public class EditTaskAdapter extends ArrayAdapter<String> {

    private ArrayList<String> list;

    public EditTaskAdapter(Context context) {
        super(context, R.layout.spinner_list_edit_task);

        list = new ArrayList<>();
        list.add("Low");
        list.add("Normal");
        list.add("Urgent");
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View row = inflater.inflate(R.layout.spinner_list_edit_task,parent,false);

        TextView textView = row.findViewById(R.id.textView);
        textView.setText(list.get(position));

        ImageView imageView = row.findViewById(R.id.imageView);
        imageView.setVisibility(View.INVISIBLE);

        return row;

    }

    @Override
    public View getDropDownView(int position,View convertView,ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View row = inflater.inflate(R.layout.spinner_list_edit_task,parent,false);

        TextView textView = row.findViewById(R.id.textView);
        textView.setText(list.get(position));

        ImageView imageView = row.findViewById(R.id.imageView);

        imageView.setImageResource(R.drawable.arrow);

        return row;

    }
}

