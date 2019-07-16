package sg.edu.rp.c346.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Colour> contactList;


    public CustomAdapter(Context context, int resource, ArrayList<Colour> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater =(LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);

        ImageView ivColour = rowView.findViewById(R.id.imageColour);

        Colour currentItem = contactList.get(position);

        if(currentItem.getColour() == "Blue"){
            ivColour.setImageResource(R.drawable.blue_box);
        }
        else if(currentItem.getColour() == "Orange"){
            ivColour.setImageResource(R.drawable.orange_box);
        }
        else{
            ivColour.setImageResource(R.drawable.brown_box);
        }

        return rowView;
    }

}