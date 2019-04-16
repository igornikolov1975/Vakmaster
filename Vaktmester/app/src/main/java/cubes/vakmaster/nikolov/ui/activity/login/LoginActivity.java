package cubes.vakmaster.nikolov.ui.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.adapter.IntroPageAdapter;

public class LoginActivity extends AppCompatActivity {
    
    private ViewPager viewPager;
    private ImageView imageViewOval1, imageViewOval2,imageViewOval3;
    private Button buttonLogin;
    private EditText editTextUsername, editTextPassword;

    private final String USERNAME = "1", PASSWORD = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        initConponent();
        addListener();
    }

    private void addListener() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameET = editTextUsername.getText().toString();
                String passwordET = editTextPassword.getText().toString();

                if (usernameET.equalsIgnoreCase(USERNAME) && passwordET.equalsIgnoreCase(PASSWORD)){
                    Intent startIntent = new Intent(getApplicationContext(),ForgotPasswordActivity.class);
                    startActivity(startIntent);
                    finish();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Uneli ste pogresne parametre",Toast.LENGTH_SHORT).show();
                }

//                startActivity(new Intent(LoginActivity.this,ForgotPasswordActivity.class));
//                finish();
            }
        });
    }

    private void initConponent() {

        editTextPassword = findViewById(R.id.editTextPassword);
        editTextUsername = findViewById(R.id.editTextUsername);

        buttonLogin = findViewById(R.id.buttonLogin);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new IntroPageAdapter(getSupportFragmentManager()));

        imageViewOval1 = findViewById(R.id.imageViewOval1);
        imageViewOval2 = findViewById(R.id.imageViewOval2);
        imageViewOval3 = findViewById(R.id.imageViewOval3);

        imageViewOval1.setImageResource(R.drawable.oval1_full);
        imageViewOval2.setImageResource(R.drawable.oval2);
        imageViewOval3.setImageResource(R.drawable.oval2);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }
            @Override
            public void onPageSelected(int i) {

                if(i == 0){
                    imageViewOval1.setImageResource(R.drawable.oval1_full);
                    imageViewOval2.setImageResource(R.drawable.oval2);
                    imageViewOval3.setImageResource(R.drawable.oval2);
                }
                else if (i ==1){
                    imageViewOval1.setImageResource(R.drawable.oval2);
                    imageViewOval2.setImageResource(R.drawable.oval1_full);
                    imageViewOval3.setImageResource(R.drawable.oval2);
                }
                else {
                    imageViewOval1.setImageResource(R.drawable.oval2);
                    imageViewOval2.setImageResource(R.drawable.oval2);
                    imageViewOval3.setImageResource(R.drawable.oval1_full);
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }
}
