package mr_auspicious.shivam_kr_shiv.com.fragments1;

     import android.support.v7.app.AppCompatActivity;
     import android.os.Bundle;
     import android.util.Log;
     import android.view.LayoutInflater;
     import android.view.View;
     import android.widget.Button;
     import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    TextView textView;
    Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);




        button.setOnClickListener(new View.OnClickListener() { //handling the click event
            @Override
            public void onClick(View v) {

                    String value = SimpleAddition.edt.getText().toString().trim(); //getting the editext value from fragment...
                   textView.setText(value); //Setting the textview to the value entered by the user .


            }
        });


    }



}
