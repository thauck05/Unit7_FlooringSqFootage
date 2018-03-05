package edu.css.thauck.unit7_flooringsqfootage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvDescription;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvDescription = (TextView) findViewById(R.id.textViewDescription);

        Bundle extras = getIntent().getExtras();
        result = extras.getDouble("FOOTAGE_KEY");
        tvDescription.setText("" + result + " square feet");
    }
}
