package ucm.sistemaemprego;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Vagas extends AppCompatActivity {

    Button b1;
    EditText ed1;

    TextView tx1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vagas);

        b1 = (Button) findViewById(R.id.button);
        ed1 = (EditText) findViewById(R.id.editText);

        tx1 = (TextView) findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE);


    }
}



