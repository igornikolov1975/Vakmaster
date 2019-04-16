package cubes.vakmaster.nikolov.ui.activity.tickets;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.activity.building.BuildingDetailActivity;
import cubes.vakmaster.nikolov.ui.activity.building.BuildingListActivity;
import cubes.vakmaster.nikolov.ui.activity.main.MainActivity;
import cubes.vakmaster.nikolov.ui.adapter.rv.RVAdapterFilter;
import cubes.vakmaster.nikolov.ui.adapter.rv.RVAdapterTickets;
import cubes.vakmaster.nikolov.ui.model.Ticket;

public class TicketsActivity extends AppCompatActivity {

    private RecyclerView recyclerView, recyclerViewFilter;
    private RVAdapterTickets adapterTickets;
    private ImageView imageViewBack;
    private RVAdapterFilter adapterFilter;
    private FloatingActionButton fabAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);

        initConponent();

        adapterTickets.setListener(new RVAdapterTickets.OnRVClickListener() {
            @Override
            public void onClick(Ticket ticket) {

            }
        });
        adapterFilter.setListener(new RVAdapterFilter.OnRVClickListener() {
            @Override
            public void onClick(String listFilter) {

            }
        });
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TicketsActivity.this,MainActivity.class));
                finish();
            }
        });
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TicketsActivity.this,FilterActivity.class));
                finish();
            }
        });

    }
    private void initConponent() {

        imageViewBack = findViewById(R.id.imageViewBack);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerViewFilter = findViewById(R.id.recyclerViewFilter);
        fabAdd = findViewById(R.id.fabAdd);


        ArrayList<Ticket> list = new ArrayList<>();
        list.add(new Ticket());
        list.add(new Ticket());
        list.add(new Ticket());
        list.add(new Ticket());

        ArrayList<String> listFilter = new ArrayList<>();
        listFilter.add("Status");
        listFilter.add("Priority");
        listFilter.add("Category");

        adapterTickets = new RVAdapterTickets(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapterTickets);


        adapterFilter = new RVAdapterFilter(listFilter);
        recyclerViewFilter.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerViewFilter.setAdapter(adapterFilter);

    }
}
