package com.example.go.androidpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView t1;
 private Button goback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = (TextView) findViewById(R.id.t1);
        goback = (Button) findViewById(R.id.goback);

        Bundle extras = getIntent().getExtras();

        if (extras != null){

            String myString = extras.getString("I am the new actitivty");
            t1.setText(myString);
        }

  goback.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {


          Intent returnintent = getIntent();
          returnintent.putExtra("returnData", "DATA HAS BEEN PASSED BITCH!!!");

          setResult(RESULT_OK, returnintent);
            finish();



      }
  });

    }
}
