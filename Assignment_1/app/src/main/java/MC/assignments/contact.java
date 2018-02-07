package MC.assignments;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Locale;

public class contact extends AppCompatActivity {

    LinearLayout mail;
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
        setTitle(R.string.label_5);
        setContentView(R.layout.activity_contact);
        mail=findViewById(R.id.sendmail);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gm = new Intent(Intent.ACTION_SENDTO);
                gm.setData(Uri.parse("mailto:")); // only email apps should handle this
                gm.putExtra(Intent.EXTRA_EMAIL, new String[] { " btech-admissions@iiitd.ac.in" });
                if (gm.resolveActivity(getPackageManager()) != null) {
                    startActivity(gm);
                }
            }
        });
    }
}
