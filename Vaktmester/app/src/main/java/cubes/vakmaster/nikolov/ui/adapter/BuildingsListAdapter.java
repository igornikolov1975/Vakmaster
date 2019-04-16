package cubes.vakmaster.nikolov.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.model.BuildingItem;

public class BuildingsListAdapter extends BaseAdapter {

    private ArrayList<BuildingItem> list;
    private Context context;

    public BuildingsListAdapter(ArrayList<BuildingItem> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        HolderClass holder;

        if (row == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            row = inflater.inflate(R.layout.list_view_item_building,parent,false);

            holder = new HolderClass();

            holder.imageView = row.findViewById(R.id.imageView);
            holder.txtDesc = row.findViewById(R.id.textViewDescription);
            holder.txtTasks = row.findViewById(R.id.textViewTasks);
            holder.txtTitle = row.findViewById(R.id.textViewTitle);

            row.setTag(holder);

        }
        else {
            holder = (HolderClass) row.getTag();
        }

        holder.txtTitle.setText(list.get(position).title);
        holder.txtTasks.setText(list.get(position).tasks);
        holder.txtDesc.setText(list.get(position).description);

        AlphaAnimation animation = new AlphaAnimation(0,1);
        animation.setDuration(2000);

        row.startAnimation(animation);

        if (list.get(position).description.length()>120){
            holder.txtDesc.setText(list.get(position).description.substring(0,120)+"...");
        }
        else {
            holder.txtDesc.setText(list.get(position).description);
        }

        Picasso.get().load(list.get(position).image).into(holder.imageView);
        return row;
    }


    public void setBuildingList(ArrayList<BuildingItem> buildingList) {
        this.list = buildingList;
        notifyDataSetChanged();
    }

    private class HolderClass {
        public ImageView imageView;
        public TextView txtTitle, txtDesc, txtTasks;
    }
}

