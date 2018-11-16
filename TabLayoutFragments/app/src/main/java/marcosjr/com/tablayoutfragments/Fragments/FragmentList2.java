package marcosjr.com.tablayoutfragments.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import marcosjr.com.tablayoutfragments.R;

public class FragmentList2 extends Fragment {

    View view;


    public FragmentList2() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.list2_fragment,container,false);

        return view;
    }
}
