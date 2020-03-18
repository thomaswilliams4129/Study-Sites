package edu.floridapoly.studysites;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends BaseAdapter {

    Context context;
    private final String [] locations;
    private  final String [] types;

    public ListAdapter(Context context, String [] locations, String [] types) {
        this.context = context;
        this.locations = locations;
        this.types = types;
    }

    @Override
    public int getCount() {
        return locations.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            viewHolder.location = (TextView) convertView.findViewById(R.id.location);
            viewHolder.type = (TextView) convertView.findViewById(R.id.type);

            result = convertView;

            convertView.setTag(viewHolder);
        } else {

            viewHolder = (ViewHolder) convertView.getTag();

            result=convertView;
        }

        viewHolder.location.setText(locations[position]);
        viewHolder.type.setText(types[position]);

        return convertView;
    }


    private static class ViewHolder {

        TextView location;
        TextView type;

    }


}
