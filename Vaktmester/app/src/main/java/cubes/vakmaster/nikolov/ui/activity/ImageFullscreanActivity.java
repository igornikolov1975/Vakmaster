package cubes.vakmaster.nikolov.ui.activity;

import android.app.Activity;
import android.os.Bundle;

import com.jsibbold.zoomage.ZoomageView;
import com.squareup.picasso.Picasso;

import cubes.vakmaster.nikolov.R;

public class ImageFullscreanActivity extends Activity {

    private ZoomageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_fullscrean);

        imageView = findViewById(R.id.imageView);

        String url = getIntent().getStringExtra("image");

        Picasso.get().load(url).into(imageView);
    }
}
