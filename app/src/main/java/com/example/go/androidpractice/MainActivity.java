package com.example.go.androidpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//  Spanable String
        TextView HTML = (TextView) findViewById(R.id.HTML);
        String text = HTML.getText().toString();

        String goToSettings = getString(R.string.THING);
        int start = text.indexOf(goToSettings);
        int end = start + goToSettings.length();

        SpannableString spannableString = new SpannableString(text);

        spannableString.setSpan(new GoToSettingsSpan(), start, end, 0);

        HTML.setText(spannableString);

        HTML.setMovementMethod(new LinkMovementMethod());



    }




// Click on TextView
    private class GoToSettingsSpan extends ClickableSpan {
        @Override
        public void onClick(View view) {


            Toast.makeText(getApplicationContext(),"Mining Sentences! 文マイニング！", Toast.LENGTH_LONG).show();
        }
    }




}



