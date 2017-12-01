package Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.siamsmile.mobileagentsiamsmile.R;

/**
 * Created by aligndev on 24-Oct-17.
 */

public class Adapter_ListData extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;


    public Adapter_ListData(Activity context,
                             String[] web) {
        super( context, R.layout.activity_listdata_model, web );
        this.context = context;
        this.web = web;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.activity_listdata_model, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.textView44);
        txtTitle.setText(web[position]);

        return rowView;
    }



}
