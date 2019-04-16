package cubes.vakmaster.nikolov.ui.activity.building;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.activity.main.MainActivity;
import cubes.vakmaster.nikolov.ui.adapter.BuildingsListAdapter;
import cubes.vakmaster.nikolov.ui.model.BuildingItem;
import cubes.vakmaster.nikolov.ui.data.DataConteiner;

public class BuildingListActivity extends Activity {

    private TextView textViewTitle, textViewTasks, textViewDescription;
    private ImageView imageView, imageViewBack;
    private ListView listView;
    BuildingsListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_buildings);


        initBuildingList();
        initConponent();

    }
    private void initConponent() {
        textViewDescription = findViewById(R.id.textViewDescription);
        textViewTasks = findViewById(R.id.textViewTasks);
        textViewTitle = findViewById(R.id.textViewTitle);
        imageView = findViewById(R.id.imageView);
        listView = findViewById(R.id.listView);
        imageViewBack = findViewById(R.id.imageViewBack);

        adapter = new BuildingsListAdapter(DataConteiner.buildingList,getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Intent intent = new Intent(getApplicationContext(),BuildingDetailActivity.class);
               startActivity(intent);

            }
        });
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildingListActivity.this,MainActivity.class));
                finish();

            }
        });
    }
    private void initBuildingList(){

        DataConteiner.buildingList = new ArrayList<>();

        BuildingItem item1 = new BuildingItem();

        item1.title = "Stepa Stepanovic";
        item1.description = "Vase Smajevica 9";


        DataConteiner.buildingList.add(item1);

        BuildingItem item2 = new BuildingItem();

        item2.title = "Bora Stankovic";
        item2.description = "Lole Ribara 14";

        DataConteiner.buildingList.add(item2);

        BuildingItem item3 = new BuildingItem();
        item3.title = "Vila Nikolina";
        item3.description = "Lole Ribara 14";

        DataConteiner.buildingList.add(item3);

        BuildingItem item4 = new BuildingItem();
        item4.title = "Vila Aleksandra";
        item4.description = "Lole Ribara 14";

        DataConteiner.buildingList.add(item4);

        BuildingItem item5 = new BuildingItem();
        item5.title = "Vila Liki";
        item5.description = "Lole Ribara 14";

        DataConteiner.buildingList.add(item5);

        BuildingItem item6 = new BuildingItem();
        item6.title = "Vila Mica";
        item6.description = "Lole Ribara 14";

        DataConteiner.buildingList.add(item6);


    }
}
