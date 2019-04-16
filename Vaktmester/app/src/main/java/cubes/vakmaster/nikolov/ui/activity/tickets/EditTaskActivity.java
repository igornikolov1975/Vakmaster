package cubes.vakmaster.nikolov.ui.activity.tickets;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Spinner;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.adapter.EditTaskAdapter;


public class EditTaskActivity extends Activity {

    private FloatingActionButton floatingActionButtonCancel,floatingActionButtonSave;
    private Spinner spinnerBoretslang,spinnerBuildingName,spinnerPriority,
            spinnerCategory,spinnerStatus;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_edit);
        
        initConponent();
        addListener();
        
    }

    private void addListener() {
        floatingActionButtonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        floatingActionButtonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initConponent() {
        floatingActionButtonCancel = findViewById(R.id.floatingButtonCansel);
        floatingActionButtonSave = findViewById(R.id.floatingButtonSave);
        spinnerBuildingName = findViewById(R.id.spinnerBuildingName);
        spinnerPriority = findViewById(R.id.spinnerPriority);
        spinnerCategory = findViewById(R.id.spinnerCategory);
        spinnerBoretslang = findViewById(R.id.spinnerBoretslang);
        spinnerStatus = findViewById(R.id.spinnerStatus);

        spinnerPriority.setAdapter(new EditTaskAdapter(getApplicationContext()));
        spinnerCategory.setAdapter(new EditTaskAdapter(getApplicationContext()));
        spinnerStatus.setAdapter(new EditTaskAdapter(getApplicationContext()));
        spinnerBuildingName.setAdapter(new EditTaskAdapter(getApplicationContext()));
        spinnerBoretslang.setAdapter(new EditTaskAdapter(getApplicationContext()));


    }
}
