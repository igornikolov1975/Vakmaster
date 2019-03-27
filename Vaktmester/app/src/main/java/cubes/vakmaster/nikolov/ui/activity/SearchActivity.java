package cubes.vakmaster.nikolov.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import cubes.vakmaster.nikolov.R;

public class SearchActivity extends Activity {

    private ImageView imageViewBack, imageViewSearch;
    private EditText editTextSearch;
    private ListView listView;

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
                startActivity(new Intent(SearchActivity.this,HomepageActivity.class));
                finish();

            }
        });
        imageViewSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextSearch.getText().length()==0) {

                    startActivity(new Intent(SearchActivity.this,SinglBuildingActivity.class));

                    Toast.makeText(getApplicationContext(),"Unesite pojam za koji zelite da pretrazite vesti",Toast.LENGTH_SHORT).show();


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
        listView = findViewById(R.id.listView);
    }
}
