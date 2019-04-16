package cubes.vakmaster.nikolov.ui.adapter.rv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.model.Ticket;

public class RVAdapterFilter extends RecyclerView.Adapter<RVAdapterFilter.FilterHolder> {

    private ArrayList<String> listFilter;
    private OnRVClickListener listener;


    public RVAdapterFilter(ArrayList<String > listFilter) {
        this.listFilter = listFilter;
    }

    @NonNull
    @Override
    public FilterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item,parent,false);

        return new FilterHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull FilterHolder holder, int position) {

        String filter = listFilter.get(position);

        holder.textView.setText(filter);

    }
    @Override
    public int getItemCount() {

        return listFilter.size();

    }
    public void setListener(OnRVClickListener listener) {
        this.listener = listener;
    }
    public OnRVClickListener getListener() {
        return listener;
    }


    public class FilterHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public FilterHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener!=null){
                        listener.onClick(listFilter.get(getAdapterPosition()));
                    }
                }
            });

        }

    }
    public interface OnRVClickListener{
        public void onClick(String filter);
    }
}

