package code.anint.edu.com.intentedu;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class otherActivityEdureka extends AppCompatActivity {

// Component
    //1 it runs on a diffrent address space - process..

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_edureka);

        Toast.makeText(this, "Landed In Other REMOTE COMPONENT... *&%$#@! Activity *&%$#@!", Toast.LENGTH_SHORT).show();


        String outPut = null;

        TextView textView = ( TextView )findViewById(R.id.textView);

        // Streaming path

        Uri uri = getIntent().getData();  // we are trying to retrive the tag: mystreamer:
                                          //  <data android:scheme="mystreamer"/>

//        Uri uriAction = Uri.parse(getIntent().getAction());
//        Uri uriCat    = Uri.parse(getIntent().getCategories());
//


        // extras..

        Bundle extras = getIntent().getExtras(); // Lets get the data( String ) - streamer - codec

        outPut = uri.toString();

        if( extras != null ){
            outPut = outPut + "From " + extras.getString("FROM");

        }
        // While compiling I cant talk Since it consumes complete CPU

        textView.setText("Landed In Other REMOTE COMPONENT \n This can be a Streamer or Network call manager \n " +
                ".. -----*&%$#@! Activity *&%$#@--------!\n"+outPut.toString());
        textView.setTextColor(Color.RED);
        textView.setTextSize(23);


        // PHASE II if its called via startActivityForeResult

        //        Intent intent = new Intent();
        //        intent.putExtra("DONE","Done playing the song "+uri);

        //        setResult(201,intent);

//      Phase II ends here

        //        Intent intent = new Intent();
        //        Bundle bundle = new Bundle();
        //        bundle.putString("MESSAGE","Received this data from Remote Component");
        //       intent.putExtras(bundle);
        //        setResult(222,intent);

    }
}
