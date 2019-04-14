package bjpkten.slidepagerlayoutdemo.customerview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import bjpkten.slidepagerlayoutdemo.R;

public class AddedFragment extends Fragment {

    private static int nameId;
    private TextView name;
    private String nameString;

    public AddedFragment() {
        // Required empty public constructor
    }


    @SuppressLint("ValidFragment")
    public AddedFragment(String nameString){
        this();
        this.nameString = nameString;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_added, container, false);
        name = (TextView) inflate.findViewById(R.id.textView);
        name.setText(nameString + " " + (nameId ++));

        return inflate;
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
    }


}
