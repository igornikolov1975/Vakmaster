package cubes.vakmaster.nikolov.ui.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.activity.main.MainActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    private Button buttonConfirm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_passvord);
        
        initConponent();
        addListener();
    }

    private void addListener() {
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPasswordActivity.this,MainActivity.class));
                finish();
            }
        });

    }

    private void initConponent() {
        buttonConfirm = findViewById(R.id.buttonConfirm);


    }
}
