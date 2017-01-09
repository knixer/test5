package com.example.christopherono.adaptermednote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ChristopherOno on 2016-11-17.
 */

public class NoteAdapter extends ArrayAdapter<Note> {

    public static class ViewHolder{
        TextView title;
        TextView note;
        ImageView noteIcon;
    }
        //lär dig
    public NoteAdapter(Context context, ArrayList<Note> notes){
        super(context, 0, notes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Note note = getItem(position);

        ViewHolder viewHolder;
        if(convertView == null){

            viewHolder = new ViewHolder();
            //lär dig, det är denna som gör att de tre ihopslagna raderna nedanör funkar som det ska.
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_row, parent, false);

            viewHolder.title = (TextView) convertView.findViewById(R.id.listItemNoteTitle);
            viewHolder.note = (TextView) convertView.findViewById(R.id.listItemNoteBody);
            viewHolder.noteIcon = (ImageView) convertView.findViewById(R.id.listItemNoteImg);

            //use set tag to remember  our viewholder which is holding our references to our widgets
            convertView.setTag(viewHolder);
        }else{
            viewHolder =  (ViewHolder) convertView.getTag();
        }



        viewHolder.title.setText(note.getTitle());
        viewHolder.note.setText(note.getMEssage());
        viewHolder.noteIcon.setImageResource(note.getAssociatedDrawable());

        return convertView;
    }
}
