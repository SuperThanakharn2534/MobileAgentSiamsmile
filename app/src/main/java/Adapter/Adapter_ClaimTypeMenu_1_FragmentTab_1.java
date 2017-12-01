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

public class Adapter_ClaimTypeMenu_1_FragmentTab_1 extends BaseAdapter {

    ArrayList<Integer> imageId = new ArrayList<>();
    ArrayList<String> AppId = new ArrayList<>();
    ArrayList<Integer> imageId2 = new ArrayList<>();
    ArrayList<String> data1 = new ArrayList<>();
    ArrayList<String> data2 = new ArrayList<>();
    ArrayList<String> data3  = new ArrayList<>();
    ArrayList<String> data4 = new ArrayList<>();
    ArrayList<String> data5 = new ArrayList<>();
    ArrayList<String> data6 = new ArrayList<>();
    ArrayList<String> data7 = new ArrayList<>();
    ArrayList<String> data8 = new ArrayList<>();




    //ArrayList<String> Address = new ArrayList<>();
    //ArrayList<String> DCR = new ArrayList<>();
   // ArrayList<String> statusAler = new ArrayList<>();
    Context mContext;

    public Adapter_ClaimTypeMenu_1_FragmentTab_1(Context context, ArrayList<Integer> imageId, ArrayList<String> AppId,
             ArrayList<String> data1, ArrayList<String> data2, ArrayList<String> data3, ArrayList<String> data4
            ,ArrayList<String> data5, ArrayList<String> data6, ArrayList<String> data7, ArrayList<String> data8
            , ArrayList<Integer> imageId2) {
        this.mContext= context;
        this.imageId = imageId;
        this.AppId = AppId;
        this.imageId2 = imageId2;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.data7 = data7;
        this.data8 = data8;


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

        ImageView imageView2 = (ImageView)view.findViewById(R.id.imv_030);
        imageView2.setBackgroundResource(imageId2.get(position));

        TextView txt_appid = (TextView)view.findViewById(R.id.text_01);
        txt_appid.setText(AppId.get(position));

        TextView txt_data1 = (TextView)view.findViewById(R.id.text_02);
        txt_data1.setText(data1.get(position));

        TextView txt_data2 = (TextView)view.findViewById(R.id.text_03);
        txt_data2.setText(data2.get(position));

        TextView txt_data3 = (TextView)view.findViewById(R.id.text_04);
        txt_data3.setText(data3.get(position));

        TextView txt_data4 = (TextView)view.findViewById(R.id.text_05);
        txt_data4.setText(data4.get(position));

        TextView txt_data5 = (TextView)view.findViewById(R.id.text_06);
        txt_data5.setText(data5.get(position));

        TextView txt_data6 = (TextView)view.findViewById(R.id.text_07);
        txt_data6.setText(data6.get(position));

        TextView txt_data7 = (TextView)view.findViewById(R.id.text_08);
        txt_data7.setText(data7.get(position));

        TextView txt_data8 = (TextView)view.findViewById(R.id.text_09);
        txt_data8.setText(data8.get(position));






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
