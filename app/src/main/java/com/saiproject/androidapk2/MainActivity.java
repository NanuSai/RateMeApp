package com.saiproject.androidapk2;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private RatingBar ratingBar;        //The rating bar
    private TextView txtrating;         //The final rating 1 - 5
    private Button btnSubmit;           //Button to submit the rating




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                                                              //Actual texts

         TextView txtemj1 = findViewById(R.id.txtemj1);        //Emj1
         TextView txtemj2 = findViewById(R.id.txtemj2);         //Emj2
         TextView txtemj3 = findViewById(R.id.txtemj3);         //Emj3


         txtemj1.setText(new String(Character.toChars(0X1F60A)));
         txtemj2.setText(new String(Character.toChars(0X1F605)));
         txtemj3.setText(new String(Character.toChars(0X1F609)));


         addListenerOnRatingBar();             //Rating bar changes as per mouse hover
         addListeneronButton();                 //New Text created of the rating you selected

    }




    public void addListenerOnRatingBar(){

        ratingBar = findViewById(R.id.ratingBar);
        btnSubmit = findViewById(R.id.btnSubmit);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                txtrating.setText(String.valueOf(ratingBar.getRating()));

            }
        });

    }



    public  void addListeneronButton(){

        ratingBar = findViewById(R.id.ratingBar);
        txtrating = findViewById(R.id.txtRating);

        //If clicked display the current value

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, String.valueOf(ratingBar.getRating()),Toast.LENGTH_SHORT).show();

            }
        });
    }


}
