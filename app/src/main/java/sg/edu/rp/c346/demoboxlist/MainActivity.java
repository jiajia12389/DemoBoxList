package sg.edu.rp.c346.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColour;
    ArrayList<Colour> alColour;
    CustomAdapter caColour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColour = findViewById(R.id.lvColour);
        alColour = new ArrayList<>();
        Colour c1 = new Colour("Blue");
        Colour c2 = new Colour("Orange");
        Colour c3 = new Colour("Brown");
        alColour.add(c1);
        alColour.add(c2);
        alColour.add(c3);

        caColour = new CustomAdapter(this, R.layout.row,alColour);
        lvColour.setAdapter(caColour);
    }
}
