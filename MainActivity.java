package com.example.first_class;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends Activity {

    Button button;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            Intent my=new Intent(getBaseContext(),Main2Activity.class);
            startActivity(my);
            }
        });

    }

}