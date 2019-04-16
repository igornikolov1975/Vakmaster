package cubes.vakmaster.nikolov.ui.activity.tickets;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.adapter.expandable.FilterELVAdapter;

public class FilterActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private ImageView imageViewBack;
    private TextView textViewTitle;
    private FloatingActionButton fabCancel,fabOk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_filters);

        initConponent();
        addListener();
    }

    private void addListener() {
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FilterActivity.this,TicketsActivity.class));
                finish();
            }
        });
        fabOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        fabCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initConponent() {

        expandableListView = findViewById(R.id.expandableListView);
        imageViewBack = findViewById(R.id.imageViewBack);
        textViewTitle = findViewById(R.id.textViewTitle);
        fabCancel = findViewById(R.id.floatingButtonCansel);
        fabOk = findViewById(R.id.floatingButtonOk);

        expandableListView.setAdapter(new FilterELVAdapter());

    }
}
