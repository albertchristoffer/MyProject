package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutPage extends AppCompatActivity {

    private Button button;
    private TextView wikipedia;
    private TextView unsplash;
    private TextView copyright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_page);

        button = findViewById(R.id.back_button);
        wikipedia = findViewById(R.id.wikipedia);
        unsplash = findViewById(R.id.unsplash);
        copyright = findViewById(R.id.copyright);

        wikipedia.setMovementMethod(LinkMovementMethod.getInstance());
        unsplash.setMovementMethod(LinkMovementMethod.getInstance());
        copyright.setMovementMethod(LinkMovementMethod.getInstance());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}