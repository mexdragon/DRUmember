package mastermex.xemud.in.th.drumember;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mastermex.xemud.in.th.drumember.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
//            Add Fragment to Activity
    getSupportFragmentManager()
            .beginTransaction()
            .add(R.id.contentMainFragment, new MainFragment())
            .commit();
        }



    }
}
