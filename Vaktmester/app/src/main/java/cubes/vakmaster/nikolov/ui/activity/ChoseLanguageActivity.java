package cubes.vakmaster.nikolov.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.adapter.LanguageAdapter;
import cubes.vakmaster.nikolov.ui.data.SharedPrefs;

public class ChoseLanguageActivity extends Activity {

    private Button buttonConfirm;
    private Spinner spinnerLanguage;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_language);

        initConponent();
        addListener();

    }
    private void addListener() {
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChoseLanguageActivity.this,LoginActivity.class));
                finish();

                SharedPrefs.setFirstTime(getApplicationContext());
            }
        });
    }

    private void initConponent() {
        buttonConfirm = findViewById(R.id.buttonConfirm);
        spinnerLanguage = findViewById(R.id.spinnerLanguage);

        spinnerLanguage.setAdapter(new LanguageAdapter(getApplicationContext()));

        
    }
}
