package cardoza.mcm.edu.ph.localetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spin;
    String language;
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin = findViewById(R.id.langspin);
        tv = findViewById(R.id.welcometxt);
        btn = findViewById(R.id.button);

        spin.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        language = spin.getSelectedItem().toString();
                        languageSelect(language);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
        btn.setOnClickListener(
                new View.OnClickListener() { //para mag autotype sya type lang ug new View.OnClickListener. pag naay suggestion just press enter or click
                    @Override
                    public void onClick(View v) {
                        Intent i  = new Intent(MainActivity.this, Main2Activity.class);

                        i.putExtra("LANGUAGE",language);
                        startActivity(i);

                    }//closure sa onclick listener. Please ignore
                }
        );
    }
    public void languageSelect(String language){
        if(language.equals("English")){
            tv.setText("Hello User!");
        }
        else if(language.equals("Filipino")){
            tv.setText("Kumusta Manggagamit!");
        }
        else{
            tv.setText("Hello mga yawa!");
        }
    }
}
