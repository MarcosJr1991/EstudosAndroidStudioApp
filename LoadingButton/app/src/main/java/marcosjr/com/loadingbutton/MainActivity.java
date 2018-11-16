package marcosjr.com.loadingbutton;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;

public class MainActivity extends AppCompatActivity {

    CircularProgressButton circularProgressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circularProgressButton = (CircularProgressButton)findViewById(R.id.btnDownload);
        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //nova classe asynctask para exemplo de carregamento
                AsyncTask<String,String,String> mjrDownload = new AsyncTask<String, String, String>() {
                    @Override
                    protected String doInBackground(String... voids) {
                        //no método doinBackground (), vai demorar 3 seg
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return "done";
                    }

                    @Override
                    protected void onPostExecute(String s) {
                        //depois de 3 segundos vamos mostrar o botão de animação
                        if (s.equals("done"))
                        {
                            Toast.makeText(MainActivity.this,"Download done",Toast.LENGTH_SHORT).show();
                            circularProgressButton.doneLoadingAnimation(Color.parseColor("#e65100"), BitmapFactory.decodeResource(getResources(),R.drawable.ic_done_white_48dp));
                        }
                    }
                };

                //chamar animação de início e tarefa assíncrona
                circularProgressButton.startAnimation();
                mjrDownload.execute();

            }
        });
    }
}
