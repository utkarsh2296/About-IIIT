package MC.assignments;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class choose_lang extends AppCompatActivity implements View.OnClickListener {
    Button to_eng;
    Button to_hindi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        to_eng=findViewById(R.id.english);
        to_hindi=findViewById(R.id.hindi);

        to_eng.setOnClickListener(this);
        to_hindi.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.english)
        {
            Resources res=getResources();
            Configuration config;
            config = new Configuration(res.getConfiguration());
            config.locale =Locale.ENGLISH;
            res.updateConfiguration(config,res.getDisplayMetrics());
            Intent i= new Intent(this,choose.class);
            i.putExtra("lang","eng");
            startActivity(i);

        }
        if(view.getId()==R.id.hindi)
        {
            Resources res=getResources();
            Configuration config;
            config = new Configuration(res.getConfiguration());
            config.locale = new Locale("hi");
            res.updateConfiguration(config,res.getDisplayMetrics());
            Intent i= new Intent(this,choose.class);
            i.putExtra("lang","hindi");
            startActivity(i);
        }


    }
}
