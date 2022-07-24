package com.example.progressbar1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  int CurrentProgress=0;
    private ProgressBar progressBar;
    Button startProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.progressbar);
        startProgress=findViewById(R.id.progress_bar);

        startProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               CurrentProgress=CurrentProgress+10;
               progressBar.setProgress(CurrentProgress);
               progressBar.setMax(100);
                Toast.makeText(getApplicationContext(), "Progress Started", Toast.LENGTH_SHORT).show();

            }
        });
    }
}