package cubes.vakmaster.nikolov.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cubes.vakmaster.nikolov.R;

public class HomepageActivity extends AppCompatActivity {

    private ImageView imageViewMenu,imageViewBuildings,imageViewTimeshoot,imageViewTickets,imageViewChat;
    private TextView textViewMessage1,textViewMessage2,textViewMessage3,textViewMessage4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        initConponent();
        addListener();

    }
    private void addListener() {
        imageViewMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
        imageViewBuildings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomepageActivity.this,SearchActivity.class));
                finish();

            }
        });
    }
    private void initConponent() {
        imageViewMenu = findViewById(R.id.imageViewMenu);
        imageViewBuildings = findViewById(R.id.imageViewBuildings);
        imageViewTimeshoot = findViewById(R.id.imageViewTimesheet);
        imageViewTickets = findViewById(R.id.imageViewTickets);
        imageViewChat = findViewById(R.id.imageViewChat);
        textViewMessage1 = findViewById(R.id.textViewMessage1);
        textViewMessage2 = findViewById(R.id.textViewMessage2);
        textViewMessage3 = findViewById(R.id.textViewMessage3);
        textViewMessage4 = findViewById(R.id.textViewMessage4);

    }
}
