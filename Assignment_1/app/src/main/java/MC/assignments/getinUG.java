package MC.assignments;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class getinUG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        setTitle(R.string.label_4);
        setContentView(R.layout.activity_getin_ug);
    }
}
