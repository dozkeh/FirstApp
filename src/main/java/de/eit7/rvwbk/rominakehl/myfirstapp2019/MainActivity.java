package de.eit7.rvwbk.rominakehl.myfirstapp2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TextViews
    private TextView gameHint = null;
    private TextView gameResult = null;

    //EditTexts
    private EditText numberInput = null;

    //Buttons
    private Button btnSubmit = null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.gameHint = (TextView) findViewById(R.id.txtHintGame);
        this.gameResult = (TextView) findViewById(R.id.txtResult);
        this.numberInput = (EditText) findViewById(R.id.txtNumberInput);
        this.btnSubmit = (Button) findViewById(R.id.btnSubmit);





    }
}
