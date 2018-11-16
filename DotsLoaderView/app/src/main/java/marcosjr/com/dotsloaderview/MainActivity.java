package marcosjr.com.dotsloaderview;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import steelkiwi.com.library.DotsLoaderView;

public class MainActivity extends AppCompatActivity {

    DotsLoaderView dotsLoaderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dotsLoaderView = (DotsLoaderView)findViewById(R.id.dotsLoader);

        downloadMjr ();

    }

    private void downloadMjr() {
        AsyncTask<String,String,String> mjrAsync = new AsyncTask<String, String, String>() {

            @Override
            protected void onPreExecute() {
                dotsLoaderView.show();
            }

            @Override
            protected String doInBackground(String... strings) {

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "done";
            }

            @Override
            protected void onPostExecute(String s) {
                if (s.equals("done"))
                    dotsLoaderView.hide();
            }
        };
        mjrAsync.execute();
    }
}
