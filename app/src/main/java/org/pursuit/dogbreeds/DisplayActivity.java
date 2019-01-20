package org.pursuit.dogbreeds;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DisplayActivity extends AppCompatActivity {
    private TextView breedTextView;
    private ImageView breedImageView;

    //TODO create activity_display.xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        //TODO recieve intent and get url string breed name
        //TODO set breed name into textview
        breedTextView = findViewById(R.id.selected_breed_textview);
        beedImageView = findViewById(R.id.random_dog_imageview);
        // TODO use picasso to load image url into imageview
    }
}
