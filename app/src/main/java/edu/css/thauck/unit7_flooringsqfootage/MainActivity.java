package edu.css.thauck.unit7_flooringsqfootage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextWidth;
    EditText editTextLength;
    TextView tvDescription;

    private static final String FOOTAGE_KEY = "FOOTAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWidth = (EditText) findViewById(R.id.editTextWidth);
        editTextLength = (EditText) findViewById(R.id.editTextLength);
        tvDescription = (TextView) findViewById(R.id.textViewDescription);
    }

    public void onClickResult(View view) {
        // calculate footage
        Double length = Double.parseDouble(editTextLength.getText().toString());
        Double width = Double.parseDouble(editTextWidth.getText().toString());
        Double result = width * length;

        // call the result activity using an intent
        Intent secActIntent = new Intent(this, ResultActivity.class);
        secActIntent.putExtra(FOOTAGE_KEY, result);
        startActivity(secActIntent);
    }
}
