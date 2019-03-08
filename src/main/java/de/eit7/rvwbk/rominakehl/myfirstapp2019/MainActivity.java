package de.eit7.rvwbk.rominakehl.myfirstapp2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

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

        final int guess = generateRand();

        this.gameHint = (TextView) findViewById(R.id.txtHintGame);
        this.gameResult = (TextView) findViewById(R.id.txtResult);
        this.numberInput = (EditText) findViewById(R.id.txtNumberInput);
        this.btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.valueOf(numberInput.getText().toString());
                if (number > 20 || number < 1)
                {
                    gameResult.setText(R.string.resultOutOfRange);
                }
                else if (number == guess)
                {
                    gameResult.setText(R.string.resultCorrect);
                }
                else if (number > guess)
                {
                    gameResult.setText(R.string.resultHigh);
                }
                else
                {
                    gameResult.setText(R.string.resultLow);
                }

            }
        });


    }

    private int generateRand()
    {
        Random guess = new Random();
        int number = guess.nextInt(19)+1;
        return number;
    }
}
