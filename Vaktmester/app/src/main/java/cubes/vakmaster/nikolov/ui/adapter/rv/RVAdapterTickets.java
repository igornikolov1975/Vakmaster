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

public class RVAdapterTickets extends RecyclerView.Adapter<RVAdapterTickets.TicketHolder> {

        private ArrayList<Ticket> list;
        private OnRVClickListener listener;


    public RVAdapterTickets(ArrayList<Ticket> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public TicketHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_ticket,parent,false);

        return new TicketHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull TicketHolder holder, int position) {

        Ticket ticket = list.get(position);

        holder.txtTitle.setText("#"+ticket.id+" - "+ticket.title);
        holder.txtPriority.setText(ticket.priority);
        holder.txtStatus.setText(ticket.status);
        holder.txtStartDate.setText(ticket.startDate);
        holder.txtEndDate.setText(ticket.endDate);

    }
    @Override
    public int getItemCount() {

        return list.size();

    }
    public void setListener(OnRVClickListener listener) {
        this.listener = listener;
    }
    public OnRVClickListener getListener() {
        return listener;
    }


    public class TicketHolder extends RecyclerView.ViewHolder {

        public TextView txtTitle, txtStartDate, txtEndDate, txtStatus, txtPriority;

        public TicketHolder(@NonNull View itemView) {
            super(itemView);

            txtStartDate = itemView.findViewById(R.id.textViewStartDate);
            txtTitle = itemView.findViewById(R.id.textViewTitle);
            txtEndDate = itemView.findViewById(R.id.textViewEndDate);
            txtStatus = itemView.findViewById(R.id.textViewStatus);
            txtPriority = itemView.findViewById(R.id.textViewPriority);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener!=null){
                        listener.onClick(list.get(getAdapterPosition()));
                    }
                }
            });

        }

    }
    public interface OnRVClickListener{
        public void onClick(Ticket ticket);
    }
}
