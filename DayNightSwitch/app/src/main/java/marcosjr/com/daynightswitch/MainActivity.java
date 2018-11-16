package marcosjr.com.daynightswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchListener;

public class MainActivity extends AppCompatActivity {

    DayNightSwitch dayNightSwitch;
    View background_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dayNightSwitch = (DayNightSwitch)findViewById(R.id.dayNight);
        background_view = findViewById(R.id.background_view);

        dayNightSwitch.setDuration(450);
        dayNightSwitch.setListener(new DayNightSwitchListener() {
            @Override
            public void onSwitch(boolean isNight) {
                if (isNight)
                {
                    Toast.makeText(MainActivity.this,"Night mode selected",Toast.LENGTH_SHORT).show();
                    background_view.setAlpha(1f);
                }
                else
                {

                    Toast.makeText(MainActivity.this,"Day mode selected",Toast.LENGTH_SHORT).show();
                    background_view.setAlpha(0f);
                }
            }
        });
    }
}
