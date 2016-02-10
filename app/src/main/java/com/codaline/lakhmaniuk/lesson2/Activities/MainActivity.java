package com.codaline.lakhmaniuk.lesson2.Activities;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.codaline.lakhmaniuk.lesson2.R;


public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    String strName;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);

        editText = (EditText) findViewById(R.id.editText);
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // сохраняем текст, введенный до нажатия Enter в переменную
                    strName = editText.getText().toString();
                    count = strName.length();
                    if (count != 0) {
                        textView.setText(count +" chars");
                    }

                    return true;
                }
                return false;
            }

        });

    }

  }
