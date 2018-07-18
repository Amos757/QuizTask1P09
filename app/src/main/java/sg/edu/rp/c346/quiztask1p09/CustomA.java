package sg.edu.rp.c346.quiztask1p09;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomA extends ArrayAdapter {


    Context parent_context;
    int layout_id;
    ArrayList<formula> FormulaList;

    public CustomA(@NonNull Context context, int resource, @NonNull ArrayList<formula> objects) {
        super(context , resource , objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.FormulaList = objects;
    }

    public View getView(int position, @Nullable View convertView , @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Prepare into each listview item and customising it
        View rowView = inflater.inflate(layout_id , parent, false);

        TextView Area = rowView.findViewById(R.id.areaOR);
        TextView Steps = rowView.findViewById(R.id.steps);
        TextView Type = rowView.findViewById(R.id.type);


        //Get the arraylist number
        formula currentItem = FormulaList.get(position);

        Area.setText(currentItem.getAreaOr());
        Steps.setText(currentItem.getSteps());
        Type.setText(currentItem.getType());



        return rowView;


    }
}


