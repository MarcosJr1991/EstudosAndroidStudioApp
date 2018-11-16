package marcosjr.com.circleseekbar;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.akaita.android.circularseekbar.CircularSeekBar;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircularSeekBar seekBar = (CircularSeekBar)findViewById(R.id.seekbar);
        seekBar.setProgressTextFormat(new DecimalFormat("###,###,##0.00"));
        seekBar.setRingColor(Color.GREEN);

        seekBar.setOnCenterClickedListener(new CircularSeekBar.OnCenterClickedListener() {
            @Override
            public void onCenterClicked(CircularSeekBar seekBar, float progress) {
                Snackbar.make(seekBar," Reset ",Snackbar.LENGTH_SHORT)
                        .show();
                seekBar.setProgress(0);
            }
        });

        seekBar.setOnCircularSeekBarChangeListener(new CircularSeekBar.OnCircularSeekBarChangeListener() {
            @Override
            public void onProgressChanged(CircularSeekBar seekBar, float progress, boolean fromUser) {
                if (progress <33)
                    seekBar.setRingColor(Color.GREEN);
                else if (progress <66)
                    seekBar.setRingColor(Color.RED);
                else
                    seekBar.setRingColor(Color.BLUE);
            }

            @Override
            public void onStartTrackingTouch(CircularSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(CircularSeekBar seekBar) {

            }
        });

    }
}
