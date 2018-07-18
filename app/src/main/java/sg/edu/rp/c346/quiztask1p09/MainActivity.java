package sg.edu.rp.c346.quiztask1p09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView Lvformula;
    ArrayList<formula> alformula;
    CustomA caformula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lvformula = findViewById(R.id.PersonList);

        alformula = new ArrayList<>();
        formula no1 = new formula("Area of rectangle","Length x Length" , "Formula type is Area");
        formula no2 = new formula("Area of triangle" , "(Length of base x Length)/2" , "Formula type is Area");
        formula no3 = new formula("Area of cube","Length x Length x Length" , "Formula type is Volume");



        alformula.add(no1);
        alformula.add(no2);
        alformula.add(no3);



        caformula = new CustomA(this, R.layout.formula, alformula);
        Lvformula.setAdapter(caformula);


    }
}
