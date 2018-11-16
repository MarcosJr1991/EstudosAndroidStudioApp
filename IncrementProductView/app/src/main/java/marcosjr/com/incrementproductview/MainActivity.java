package marcosjr.com.incrementproductview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.steelkiwi.library.IncrementProductView;
import com.steelkiwi.library.listener.OnStateListener;

public class MainActivity extends AppCompatActivity {

    TextView amount;
    IncrementProductView productView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = (TextView) findViewById(R.id.amount);
        productView = (IncrementProductView) findViewById(R.id.productView);

        productView.setOnStateListener(new OnStateListener() {
            @Override
            public void onCountChange(int count) {
                amount.setText("$"+count*45);
            }

            @Override
            public void onConfirm(int count) {
                                                    //você quer comprar       produtos ?
                Toast.makeText(getBaseContext()," You want to buy "+count+" products ? ",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onClose() {

            }
        });

    }
}
