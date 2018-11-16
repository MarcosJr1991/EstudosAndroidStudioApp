package marcosjr.com.searchdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import ir.mirrajabi.searchdialog.SimpleSearchDialogCompat;
import ir.mirrajabi.searchdialog.core.BaseSearchDialogCompat;
import ir.mirrajabi.searchdialog.core.SearchResultListener;
import ir.mirrajabi.searchdialog.core.Searchable;
import marcosjr.com.searchdialog.Model.SearchModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSearch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //basta ligar para o diálogo de pesquisa
                new SimpleSearchDialogCompat(MainActivity.this, "Search...", "What are you looking for...?",
                        null, initData(), new SearchResultListener<Searchable>() {
                    @Override
                    public void onSelected(BaseSearchDialogCompat baseSearchDialogCompat, Searchable searchable, int i) {
                        Toast.makeText(MainActivity.this," " +searchable.getTitle(),Toast.LENGTH_SHORT).show();
                        baseSearchDialogCompat.dismiss();
                    }
                }).show();
            }
        });
    }

    private ArrayList<SearchModel> initData() {
        ArrayList<SearchModel> items = new ArrayList<>();
        items.add(new SearchModel("Captain America"));
        items.add(new SearchModel("Batman"));
        items.add(new SearchModel("Iron man"));
        items.add(new SearchModel("Superman"));
        items.add(new SearchModel("Hulk"));
        items.add(new SearchModel("Wonder woman"));

        return items;
    }
}
