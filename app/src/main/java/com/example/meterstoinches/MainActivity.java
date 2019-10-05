package com.example.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TODO Deklarasi layout yang telah dibuat berdasarkan ID
    private EditText editText;
    private Button button;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO inisialisasi variable dan menghubungkan kepada layout yang telah dibuat
        editText = (EditText) findViewById(R.id.editText);
        resultTextView = (TextView) findViewById(R.id.resultid);
        button = (Button) findViewById(R.id.button);

        //TODO SetOnClick
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO menaruuh logic untuk mengubah inputan menjadi inchi
                double multipler = 39.37;
                double result = 0.0;

                double meterValue = Double.parseDouble(editText.getText().toString());
                result = meterValue*multipler;

                resultTextView.setText(Double.toString(result));

            }
        });


    }
}
