package mastermex.xemud.in.th.drumember.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mastermex.xemud.in.th.drumember.R;

/**
 * Created by Notebook039 on 31/1/2561.
 */

public class MainFragment extends Fragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R. layout.fragment_main, container,false);
        return view;
    }

}
