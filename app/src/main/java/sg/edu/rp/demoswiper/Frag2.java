package sg.edu.rp.demoswiper;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {


    TextView tvSecond;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_2, container, false);

        View view = inflater.inflate(R.layout.fragment_2, container, false);

        tvSecond = (TextView) view.findViewById(R.id.tvSecond);

        return view;
    }

}
