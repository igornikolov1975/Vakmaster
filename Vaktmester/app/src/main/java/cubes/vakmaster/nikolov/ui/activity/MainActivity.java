package cubes.vakmaster.nikolov.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import cubes.vakmaster.nikolov.R;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewMenu,imageViewBuildings,imageViewTimeshoot,imageViewTickets,imageViewChat;
    private TextView textViewMessage1,textViewMessage2;

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

                PopupMenu popup = new PopupMenu(MainActivity.this, imageViewMenu);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MainActivity.this,"You clicked :"+item.getTitle(),Toast.LENGTH_SHORT).show();

                        return true;
                    }
                });
                popup.show();
            }
        });
        imageViewBuildings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BuildingListActivity.class));
                finish();

            }
        });
        imageViewTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TicketFiltersActivity.class));
                finish();


            }
        });
        imageViewTimeshoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imageViewChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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


    }
}
