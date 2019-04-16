package cubes.vakmaster.nikolov.ui.activity.building;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.activity.tickets.TicketsActivity;

public class BuildingDetailActivity extends Activity {

    private ImageView imageViewBack, imageViewMapa, imageView, imageViewArrow,
            imageViewTickets, imageViewSuppler, imageViewDocuments;

    private TextView textViewTitle, textViewMapa, textViewTasks,
            textViewName, textViewAdress,textViewDescription,
            textViewPerson, textViewNumber, textViewTickets,
            textViewSuppler, textViewDocuments, textViewContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buildings);

        initConponent();
        addListener();

    }
    private void addListener() {
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildingDetailActivity.this,BuildingListActivity.class));
                finish();
            }
        });
        imageViewMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BuildingMapActivity.class);
                startActivity(intent);

            }
        });
        imageViewTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildingDetailActivity.this,TicketsActivity.class));
                finish();
            }
        });
    }
    private void initConponent() {
        imageViewBack = findViewById(R.id.imageViewBack);
        imageViewMapa = findViewById(R.id.imageViewMapa);
        imageView = findViewById(R.id.imageView);
        imageViewArrow = findViewById(R.id.imageViewArrow);
        imageViewTickets = findViewById(R.id.imageViewTickets);
        imageViewSuppler = findViewById(R.id.imageViewSuppler);
        imageViewDocuments = findViewById(R.id.imageViewDocuments);
        textViewContact = findViewById(R.id.textViewContact);
        textViewTitle = findViewById(R.id.textViewTitle);
        textViewMapa = findViewById(R.id.textViewMap);
        textViewTasks = findViewById(R.id.textViewTasks);
        textViewName = findViewById(R.id.textViewName);
        textViewAdress = findViewById(R.id.textViewAdress);
        textViewDescription = findViewById(R.id.textViewDescription);
        textViewPerson = findViewById(R.id.textViewPerson);
        textViewNumber = findViewById(R.id.textViewNumber);
        textViewTickets = findViewById(R.id.textViewTickets);
        textViewSuppler = findViewById(R.id.textViewSuppler);
        textViewDocuments = findViewById(R.id.textViewDocuments);






    }
}
