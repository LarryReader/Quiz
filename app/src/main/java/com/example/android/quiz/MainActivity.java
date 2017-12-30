package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

//Declare and collect answers in public vars
    String electionYear;
    boolean taxCutForRich;
    boolean taxCutForCorps;
    String trumpHonestYes;
    boolean trumpHonestNo;
    String countryInterfered;
    boolean democratsEnthused;
    boolean womenVoters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveAnswer(View view){
    //Set the public var for each question id

        switch (view.getId()) {
            case R.id.edit_text_election_year:
                EditText editTextElectionYear = findViewById(R.id.edit_text_election_year);
                electionYear = editTextElectionYear.getText().toString();
            case R.id.check_box_rich:
                //boolean checked = ((RadioButton) view).isChecked();
                //if (checked)
                    // Tax cuts for rich
                //    break;
                if (((RadioButton) view).isChecked())
                    // Tax cuts for rich
                    break;

                //
            case R.id.check_box_corporations:
                //




        }






    }

    public void reset(View view){}
}

