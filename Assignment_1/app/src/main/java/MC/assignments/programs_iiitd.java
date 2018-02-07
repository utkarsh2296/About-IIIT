package MC.assignments;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.Locale;

public class programs_iiitd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs_iiitd);
        String lang=getIntent().getExtras().getString("lang");
        if(lang.equals("eng"))
        {
            Resources res=getResources();
            Configuration config;
            config = new Configuration(res.getConfiguration());
            config.locale = Locale.ENGLISH;
            res.updateConfiguration(config,res.getDisplayMetrics());
        }
        else if(lang.equals("hindi")){
            Resources res=getResources();
            Configuration config;
            config = new Configuration(res.getConfiguration());
            config.locale = new Locale("hi");
            res.updateConfiguration(config,res.getDisplayMetrics());
        }
        setTitle(R.string.label_3);
        setContentView(R.layout.activity_programs_iiitd);
    }
}
