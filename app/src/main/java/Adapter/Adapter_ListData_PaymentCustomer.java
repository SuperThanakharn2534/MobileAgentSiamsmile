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
 * Created by aligndev on 25-Oct-17.
 */

public class Adapter_ListData_PaymentCustomer extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;
    private final String[] imageId;
    private final Integer[] imageId2;

    public Adapter_ListData_PaymentCustomer(Activity Context ,String[] web ,String[] imageId, Integer[] imageId2) {
            super( Context, R.layout.activity_listpaymentcustomer_model, web);
        this.context = Context;
                this.web = web;
        this.imageId = imageId;
        this.imageId2 = imageId2;
        }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.activity_listpaymentcustomer_model, null, true);
        TextView txtTitle1 = (TextView) rowView.findViewById(R.id.txt_01);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.txt_02);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imv_00);
        txtTitle1.setText(web[position]);
        txtTitle2.setText(imageId[position]);
        imageView.setImageResource(imageId2[position]);
        return rowView;
    }





}
