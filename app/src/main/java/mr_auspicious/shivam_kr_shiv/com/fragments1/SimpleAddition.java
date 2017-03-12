package mr_auspicious.shivam_kr_shiv.com.fragments1;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class SimpleAddition extends Fragment{

    View rootView;
    public static EditText edt; //global variable

    public SimpleAddition() { // constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_simple_addition, container, false); //inflating the fragment layout...
        init();
        return rootView;
    }

    protected void init(){
        edt = (EditText) rootView.findViewById(R.id.et);
    }

}