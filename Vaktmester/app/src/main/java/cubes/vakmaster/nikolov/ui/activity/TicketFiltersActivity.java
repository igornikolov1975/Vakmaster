package cubes.vakmaster.nikolov.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cubes.vakmaster.nikolov.R;

public class TicketFiltersActivity extends Activity {

    private ImageView imageViewBack, imageViewBuildings, imageViewPhone, imageViewClose,
    imageViewArrow1,imageViewArrow2,imageViewArrow3,imageViewArrow4;

    private TextView textViewName, textViewPerson, textViewFilters, textViewJunitors,
    textViewStatus, textViewPriority, textViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_filters);

        initConponent();
        addListener();
    }

    private void addListener() {
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TicketFiltersActivity.this,MainActivity.class));
                finish();

            }
        });
        imageViewPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imageViewArrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imageViewArrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imageViewArrow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imageViewArrow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void initConponent() {

        imageViewBack = findViewById(R.id.imageViewBack);
        imageViewBuildings = findViewById(R.id.imageViewBuildings);
        imageViewPhone = findViewById(R.id.imageViewPhone);
        imageViewClose = findViewById(R.id.imageViewClose);
        imageViewArrow1 = findViewById(R.id.imageViewArrow1);
        imageViewArrow2 = findViewById(R.id.imageViewArrow2);
        imageViewArrow3 = findViewById(R.id.imageViewArrow3);
        imageViewArrow4 = findViewById(R.id.imageViewArrow4);
        textViewName = findViewById(R.id.textViewName);
        textViewPerson = findViewById(R.id.textViewPerson);
        textViewFilters = findViewById(R.id.textViewFilters);
        textViewJunitors = findViewById(R.id.textViewJunitors);
        textViewStatus = findViewById(R.id.textViewStatus);
        textViewPriority = findViewById(R.id.textViewPriority);
        textViewCategory = findViewById(R.id.textViewCategory);
    }
}
