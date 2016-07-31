package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by danle on 7/25/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, int resource) {
        super(context, resource);


    }

    private int mColorResourceId;


    public WordAdapter(Context context, int resource, int colorResourceId) {
        super(context, resource);

        mColorResourceId = colorResourceId;
    }

    public WordAdapter(NumbersActivity context, int resource, ArrayList<Word> words) {
        super(context, resource, words);
    }

    public WordAdapter(ColorsActivity colorsActivity, int list_item, ArrayList<Word> words) {
        super(colorsActivity, list_item, words);
    }

    public WordAdapter(FamilyMembersActivity familyActivity, int list_item, ArrayList<Word> words) {
        super(familyActivity, list_item, words);
    }

    public WordAdapter(PhrasesActivity phrasesActivity, int list_item, ArrayList<Word> words) {
        super(phrasesActivity, list_item, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceId());
        }
        else{
            iconView.setVisibility(View.GONE);

        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
//Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
//Set the background color of the text container View
        textContainer.setBackgroundColor(color);










        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
