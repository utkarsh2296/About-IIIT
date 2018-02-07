package MC.assignments;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class choose extends AppCompatActivity implements View.OnClickListener {

    Button about_institute;
    Button programs;
    Button admission;
    Button contact;
    String lang;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        lang=getIntent().getExtras().getString("lang");
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
        setTitle(R.string.label_1);
        setContentView(R.layout.activity_choose);
        about_institute=findViewById(R.id.option1);
        programs=findViewById(R.id.option2);
        admission=findViewById(R.id.option3);
        contact=findViewById(R.id.option4);

        about_institute.setOnClickListener(this);
        programs.setOnClickListener(this);
        admission.setOnClickListener(this);
        contact.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.option1:
                Intent i=new Intent(this,about_iiitd.class);
                i.putExtra("lang",lang);
                startActivity(i);
                break;
            case R.id.option2:
                Intent i2=new Intent(this,programs_iiitd.class);
                i2.putExtra("lang",lang);
                startActivity(i2);
                break;
            case R.id.option3:
                Intent i3=new Intent(this,getinUG.class);
                i3.putExtra("lang",lang);
                startActivity(i3);
                break;
            case R.id.option4:
                Intent i4=new Intent(this,contact.class);
                i4.putExtra("lang",lang);
                startActivity(i4);
                break;
        }

    }
}
