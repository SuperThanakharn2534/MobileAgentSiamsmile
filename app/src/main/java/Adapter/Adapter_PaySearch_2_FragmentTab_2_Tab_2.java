package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.siamsmile.mobileagentsiamsmile.R;

import java.util.ArrayList;

/**
 * Created by aligndev on 07-Nov-17.
 */

public class Adapter_PaySearch_2_FragmentTab_2_Tab_2 extends BaseAdapter {

    ArrayList<Integer> imageId = new ArrayList<>();
    ArrayList<String> AppId = new ArrayList<>();
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<String> Name2 = new ArrayList<>();
    ArrayList<String> type = new ArrayList<>();
    ArrayList<String> detail = new ArrayList<>();
    ArrayList<String> date = new ArrayList<>();
    ArrayList<String> contact = new ArrayList<>();
    ArrayList<String> price = new ArrayList<>();
    ArrayList<String> invoice = new ArrayList<>();
    Context mContext;

    public Adapter_PaySearch_2_FragmentTab_2_Tab_2(Context context, ArrayList<Integer> imageId,ArrayList<String> AppId,
                                                   ArrayList<String> Name,ArrayList<String> Name2,ArrayList<String> type
            ,ArrayList<String> detail,ArrayList<String> date,ArrayList<String> contact,ArrayList<String> price,ArrayList<String> invoice) {
        this.mContext= context;
        this.imageId = imageId;
        this.AppId = AppId;
        this.Name = Name;
        this.Name2 = Name2;
        this.type = type;
        this.detail = detail;
        this.date = date;
        this.contact = contact;
        this.price = price;
        this.invoice = invoice;
        //this.DCR = DCR;
        //this.statusAler = statusAler;
    }




    @Override
    public int getCount() {
        return AppId.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater =
                (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = mInflater.inflate(R.layout.paysearch_2_fragmenttab_2_tab_1_model, parent, false);


        ImageView imageView = (ImageView)view.findViewById(R.id.imv_00);
        imageView.setBackgroundResource(imageId.get(position));

        TextView txt_appid = (TextView)view.findViewById(R.id.text_01);
        txt_appid.setText(AppId.get(position));

        TextView txt_Name = (TextView)view.findViewById(R.id.text_02);
        txt_Name.setText(Name.get(position));

        TextView txt_Name2 = (TextView)view.findViewById(R.id.text_03);
        txt_Name2.setText(Name2.get(position));

        TextView txt_type = (TextView)view.findViewById(R.id.text_04);
        txt_type.setText(type.get(position));

        TextView txt_detail = (TextView)view.findViewById(R.id.text_05);
        txt_detail.setText(detail.get(position));

        TextView txt_date = (TextView)view.findViewById(R.id.text_06);
        txt_date.setText(date.get(position));

        TextView txt_contact = (TextView)view.findViewById(R.id.text_07);
        txt_contact.setText(contact.get(position));

        TextView txt_price = (TextView)view.findViewById(R.id.text_08);
        txt_price.setText(price.get(position));

        TextView txt_invoice = (TextView)view.findViewById(R.id.text_09);
        txt_invoice.setText(invoice.get(position));


//        TextView tx_dcr = (TextView)view.findViewById(R.id.tv_dcr);
//        tx_dcr.setText(DCR.get(position));
//        Switch sw_aler = (Switch)view.findViewById(R.id.sw_aler);

//        if(statusAler.get(position).equals("true")){
//            sw_aler.setChecked(true);
//        }else{
//            sw_aler.setChecked(false);
//        }

        return view;

    }







}
