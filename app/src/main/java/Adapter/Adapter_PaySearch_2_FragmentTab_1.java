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

public class Adapter_PaySearch_2_FragmentTab_1 extends BaseAdapter {

    ArrayList<Integer> imageId = new ArrayList<>();
    ArrayList<String> AppId = new ArrayList<>();
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<String> Name2 = new ArrayList<>();
    ArrayList<String> type = new ArrayList<>();
    ArrayList<String> detail = new ArrayList<>();
    ArrayList<String> status = new ArrayList<>();
    ArrayList<String> price = new ArrayList<>();
    Context mContext;

    public Adapter_PaySearch_2_FragmentTab_1(Context context, ArrayList<Integer> imageId, ArrayList<String> AppId,
                                             ArrayList<String> Name,ArrayList<String> Name2,ArrayList<String> type,ArrayList<String> detail,ArrayList<String> status
            ,ArrayList<String> price) {
        this.mContext= context;
        this.imageId = imageId;
        this.AppId = AppId;
        this.Name = Name;
        this.Name2 = Name2;
        this.type = type;
        this.detail = detail;
        this.status = status;
        this.price = price;

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
            view = mInflater.inflate(R.layout.paysearch_2_fragmenttab_model, parent, false);


        ImageView imageView = (ImageView)view.findViewById(R.id.imv_00);
        imageView.setBackgroundResource(imageId.get(position));

        TextView txt_appid = (TextView)view.findViewById(R.id.Text_01);
        txt_appid.setText(AppId.get(position));

        TextView txt_Name = (TextView)view.findViewById(R.id.Text_02);
        txt_Name.setText(Name.get(position));

        TextView txt_Name2 = (TextView)view.findViewById(R.id.Text_03);
        txt_Name2.setText(Name2.get(position));


        TextView txt_status = (TextView)view.findViewById(R.id.Text_06);
        txt_status.setText(status.get(position));

        TextView txt_price = (TextView)view.findViewById(R.id.Text_07);
        txt_price.setText(price.get(position));

//        TextView tx_address = (TextView)view.findViewById(R.id.tv_address);
//        tx_address.setText(Address.get(position));
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
