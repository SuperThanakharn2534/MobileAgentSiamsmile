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

public class Adapter_ClaimTypeMenu_6_FragmentTab_1 extends BaseAdapter {

    ArrayList<Integer> imageId = new ArrayList<>();
    ArrayList<String> AppId = new ArrayList<>();
    ArrayList<Integer> imageId2 = new ArrayList<>();
    ArrayList<String> type = new ArrayList<>();
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<String> Name2 = new ArrayList<>();
    ArrayList<String> Detail  = new ArrayList<>();
    ArrayList<String> status = new ArrayList<>();
    ArrayList<String> amount = new ArrayList<>();
    ArrayList<String> Sum = new ArrayList<>();


    //ArrayList<String> Address = new ArrayList<>();
    //ArrayList<String> DCR = new ArrayList<>();
   // ArrayList<String> statusAler = new ArrayList<>();
    Context mContext;

    public Adapter_ClaimTypeMenu_6_FragmentTab_1(Context context, ArrayList<Integer> imageId, ArrayList<String> AppId,
                                                 ArrayList<String> Name, ArrayList<String> Name2, ArrayList<String> type
            , ArrayList<String> Detail, ArrayList<String> status, ArrayList<String> amount, ArrayList<String> Sum, ArrayList<Integer> imageId2) {
        this.mContext= context;
        this.imageId = imageId;
        this.AppId = AppId;
        this.imageId2 = imageId2;
        this.type = type;
        this.Name = Name;
        this.Name2 = Name2;
        this.Detail = Detail;
        this.status = status;
        this.amount = amount;
        this.Sum = Sum;

        //this.Address = Address;
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
            view = mInflater.inflate(R.layout.claimtypemenu_1_fragmenttab_model, parent, false);


        ImageView imageView = (ImageView)view.findViewById(R.id.imv_000);
        imageView.setBackgroundResource(imageId.get(position));

        TextView txt_appid = (TextView)view.findViewById(R.id.text_01);
        txt_appid.setText(AppId.get(position));

        ImageView imageView2 = (ImageView)view.findViewById(R.id.imv_030);
        imageView2.setBackgroundResource(imageId2.get(position));

        TextView txt_Name = (TextView)view.findViewById(R.id.text_02);
        txt_Name.setText(Name.get(position));

        TextView txt_Name2 = (TextView)view.findViewById(R.id.text_03);
        txt_Name2.setText(Name2.get(position));

        TextView txt_type = (TextView)view.findViewById(R.id.text_04);
        txt_type.setText(type.get(position));

        TextView txt_Detail = (TextView)view.findViewById(R.id.text_05);
        txt_Detail.setText(Detail.get(position));

        TextView txt_status = (TextView)view.findViewById(R.id.text_06);
        txt_status.setText(status.get(position));

        TextView txt_amount = (TextView)view.findViewById(R.id.text_07);
        txt_amount.setText(amount.get(position));

        TextView txt_Sum = (TextView)view.findViewById(R.id.text_08);
        txt_Sum.setText(Sum.get(position));



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
