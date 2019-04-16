package cubes.vakmaster.nikolov.ui.activity.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.data.DataConteiner;
import cubes.vakmaster.nikolov.ui.data.SharedPrefs;
import cubes.vakmaster.nikolov.ui.model.SettingsItem;

public class LoadingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        loadSettingsData();

        if (SharedPrefs.isFirstTime(getApplicationContext())){
            startActivity(new Intent(LoadingActivity.this,ChoseLanguageActivity.class));
            finish();

        }
        else {
            startActivity(new Intent(LoadingActivity.this,LoginActivity.class));
            finish();
        }

    }

    private void loadSettingsData() {

        DataConteiner.categoryList = new ArrayList<>();

        DataConteiner.categoryList.add(new SettingsItem("Category 1",false));
        DataConteiner.categoryList.add(new SettingsItem("Category 2",false));
        DataConteiner.categoryList.add(new SettingsItem("Category 3",false));


        DataConteiner.priorityList = new ArrayList<>();

        DataConteiner.priorityList.add(new SettingsItem("Low",false));
        DataConteiner.priorityList.add(new SettingsItem("Normal",false));
        DataConteiner.priorityList.add(new SettingsItem("Urgent",false));


        DataConteiner.statusList = new ArrayList<>();

        DataConteiner.statusList.add(new SettingsItem("New",false));
        DataConteiner.statusList.add(new SettingsItem("Approved",false));
        DataConteiner.statusList.add(new SettingsItem("in Progres",false));
        DataConteiner.statusList.add(new SettingsItem("Resolved",false));
        DataConteiner.statusList.add(new SettingsItem("Closed",false));
        DataConteiner.statusList.add(new SettingsItem("Feedback",false));

    }

}
