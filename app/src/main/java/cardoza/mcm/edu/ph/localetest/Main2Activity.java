package cardoza.mcm.edu.ph.localetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;
import android.widget.Spinner;

import android.os.Bundle;



public class Main2Activity extends AppCompatActivity {
    Spinner spin;
    String language;
    TextView tv,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.welcometxt);
        tv2 = findViewById(R.id.dodot);
        Intent i = getIntent();
        language = i.getStringExtra("LANGUAGE");
        languageSelect(language);

    }
    public void languageSelect(String language){

        if(language.equals("English")){
            tv.setText("Hello User!");
            tv2.setText("What do you want to do?");
        }
        else if(language.equals("Filipino")){
            tv.setText("Kumusta Manggagamit!");
            tv.setText("Ano ang gusto mong gawin?");
        }
        else{
            tv.setText("Hello mga yawa!");
            tv2.setText("Sumbagay nalang ta part, Saman?");
        }
    }
}
