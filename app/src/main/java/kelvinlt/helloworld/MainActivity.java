package kelvinlt.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;

    boolean opcion=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.et1);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView.setText("Hello World!");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("flx","S'ha fet un clic");
                textView.setText("Hola "+ editText.getText());
            }
        });

        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                return false;
            }
        });
    }
    @Override protected void onStart(){
        super.onStart();
        Log.d("flx","onStart()");
    }
    @Override protected void onResume(){
        super.onResume();
        Log.d("flx","onResume()");
    }
    @Override protected void onPause(){
        super.onPause();
        Log.d("flx","onPause()");
    }
    @Override protected void onStop(){
        super.onStop();
        Log.d("flx","onStop()");
    }
    @Override protected void onDestroy(){
        super.onDestroy();
        Log.d("flx","onDestroy()");
    }
}
