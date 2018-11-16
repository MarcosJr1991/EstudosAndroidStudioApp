package marcosjr.com.tablayoutfragments;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import marcosjr.com.tablayoutfragments.Adapter.ViewPagerAdapter;
import marcosjr.com.tablayoutfragments.Fragments.FragmentList;
import marcosjr.com.tablayoutfragments.Fragments.FragmentList2;
import marcosjr.com.tablayoutfragments.Fragments.FragmentList3;
import marcosjr.com.tablayoutfragments.Fragments.FragmentList4;
import marcosjr.com.tablayoutfragments.Fragments.FragmentList5;
import marcosjr.com.tablayoutfragments.Fragments.FragmentList6;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout)findViewById(R.id.appbarid);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Adicionando Fragmentos
        adapter.AddFragment(new FragmentList(),"Lista");
        adapter.AddFragment(new FragmentList2(),"Lista 2 ");
        adapter.AddFragment(new FragmentList3(),"Lista 3 ");
        adapter.AddFragment(new FragmentList4(),"Lista 4 ");
        adapter.AddFragment(new FragmentList5(),"Lista 5 ");
        adapter.AddFragment(new FragmentList6(),"Lista 6 ");

        //adapter setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        

    }
}
