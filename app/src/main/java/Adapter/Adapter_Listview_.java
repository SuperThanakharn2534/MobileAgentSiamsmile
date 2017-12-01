package Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.siamsmile.mobileagentsiamsmile.R;

/**
 * Created by aligndev on 17-Oct-17.
 */


public class Adapter_Listview_ extends ArrayAdapter<String> {



    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    private final Integer[] imageId2;
    public Adapter_Listview_(Activity context,
                             String[] web, Integer[] imageId, Integer[] imageId2) {
        super(context, R.layout.activity_listview_model, web );
        this.context = context;
        this.web = web;
        this.imageId = imageId;
        this.imageId2 = imageId2;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.activity_listview_model, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.textView1);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
        txtTitle.setText(web[position]);

        ImageView imageView2 = (ImageView) rowView.findViewById(R.id.imageView7);
        txtTitle.setText(web[position]);

        imageView.setImageResource(imageId[position]);
        imageView2.setImageResource(imageId2[position]);
        return rowView;
    }
}
