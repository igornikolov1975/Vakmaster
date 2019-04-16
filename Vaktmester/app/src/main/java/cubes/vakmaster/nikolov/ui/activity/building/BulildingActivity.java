package cubes.vakmaster.nikolov.ui.activity.building;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.activity.main.MainActivity;

public class BulildingActivity extends Activity {

    private ImageView imageViewBack, imageViewSearch;
    private EditText editTextSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_buildings);

        initConponent();
        addListener();

    }
    private void addListener() {
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BulildingActivity.this,MainActivity.class));
                finish();
            }
        });
        imageViewSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextSearch.getText().length()==0) {

                    startActivity(new Intent(BulildingActivity.this,BuildingDetailActivity.class));

                    Toast.makeText(getApplicationContext(),"Unesite objekat koji zelite da pronadjete",Toast.LENGTH_SHORT).show();

                }
                else {

                }
            }
        });

    }
    private void initConponent() {

        imageViewBack = findViewById(R.id.imageViewBack);
        imageViewSearch = findViewById(R.id.imageViewSearch);
        editTextSearch = findViewById(R.id.editTextSearch);

    }
}
