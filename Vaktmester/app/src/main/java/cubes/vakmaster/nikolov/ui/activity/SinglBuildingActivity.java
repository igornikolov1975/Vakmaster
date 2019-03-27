package cubes.vakmaster.nikolov.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cubes.vakmaster.nikolov.R;

public class SinglBuildingActivity extends Activity {

    private ImageView imageViewBack, imageViewMapa, imageView, imageViewArrow,
            imageViewContact, imageViewTickets, imageViewSuppler, imageViewDocuments;

    private TextView textViewTitle, textViewMapa, textViewTasks,
            textViewName, textViewAdress,textViewDescription,
            textViewPerson, textViewNumber, textViewTickets,
            textViewSuppler, textViewDocuments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singl_buildings);

        initConponent();
        addListener();


    }

    private void addListener() {
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SinglBuildingActivity.this,SearchActivity.class));
                finish();

            }
        });
    }

    private void initConponent() {
        imageViewBack = findViewById(R.id.imageViewBack);
        imageViewMapa = findViewById(R.id.imageViewMapa);
        imageView = findViewById(R.id.imageView);
        imageViewArrow = findViewById(R.id.imageViewArrow);
        imageViewContact = findViewById(R.id.imageViewContact);
        imageViewTickets = findViewById(R.id.imageViewTickets);
        imageViewSuppler = findViewById(R.id.imageViewSuppler);
        imageViewDocuments = findViewById(R.id.imageViewDocuments);
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
