package cubes.vakmaster.nikolov.ui.adapter.expandable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.activity.tickets.FilterActivity;
import cubes.vakmaster.nikolov.ui.data.DataConteiner;

public class FilterELVAdapter extends BaseExpandableListAdapter {

    @Override
    public int getGroupCount() {
        return 3;
    }

    @Override
    public int getChildrenCount(int groupPosition) {

        if (groupPosition == 0){
            return DataConteiner.statusList.size();
        }
        else if (groupPosition == 1){
            return DataConteiner.priorityList.size();
        }
        else if (groupPosition == 2){
            return DataConteiner.categoryList.size();
        }
        return 0;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        View row = convertView;
        ELHolderClass holder;

        if (row == null){
            row = LayoutInflater.from(parent.getContext()).inflate(R.layout.expandable_lv_item_group_title,parent,false);

            holder = new ELHolderClass();
            holder.textView = row.findViewById(R.id.textViewTitle);
            row.setTag(holder);
        }
        else {
            holder = (ELHolderClass) row.getTag();
        }
        if (groupPosition == 0){
            holder.textView.setText(R.string.title_status);
        }
        else if (groupPosition == 1){
            holder.textView.setText(R.string.title_priority);
        }
        else {
            holder.textView.setText(R.string.title_category);
        }
        return row;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View row = convertView;
        ELHolderClass holder;

        if (row == null){
            row = LayoutInflater.from(parent.getContext()).inflate(R.layout.expandable_lv_item_check_box,parent,false);

            holder = new ELHolderClass();
            holder.checkBox = row.findViewById(R.id.checkBox);
            row.setTag(holder);

        }
        else {
            holder = (ELHolderClass) row.getTag();
        }
        if (groupPosition == 0){
            holder.checkBox.setText(DataConteiner.statusList.get(childPosition).title);
        }
        else if (groupPosition == 1){
            holder.checkBox.setText(DataConteiner.priorityList.get(childPosition).title);
        }
        else {
            holder.checkBox.setText(DataConteiner.categoryList.get(childPosition).title);
        }

        return row;
    }


    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {

        return false;
    }

    public class ELHolderClass{
        public TextView textView;
        public CheckBox checkBox;

    }

}
