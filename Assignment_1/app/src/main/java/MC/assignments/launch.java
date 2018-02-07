package MC.assignments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class launch extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        Handler handler = new Handler();

                handler.postDelayed(new Runnable() {
                    public void run()
                    {
                        Intent i=new Intent(launch.this,choose_lang.class);
                        startActivity(i);
                        finish();
                    }
                }, 2000);
            }
    }
