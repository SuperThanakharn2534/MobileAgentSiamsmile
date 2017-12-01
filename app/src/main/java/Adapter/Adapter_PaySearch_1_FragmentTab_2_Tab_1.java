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

public class Adapter_PaySearch_1_FragmentTab_2_Tab_1 extends BaseAdapter {

    ArrayList<Integer> imageId = new ArrayList<>();
    ArrayList<String> AppId = new ArrayList<>();
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<String> count1 = new ArrayList<>();
    ArrayList<String> count2 = new ArrayList<>();
    ArrayList<String> count3 = new ArrayList<>();
    ArrayList<String> count4 = new ArrayList<>();
    ArrayList<String> count5 = new ArrayList<>();
    Context mContext;


    //ArrayList<String> DCR = new ArrayList<>();
   // ArrayList<String> statusAler = new ArrayList<>();


    public Adapter_PaySearch_1_FragmentTab_2_Tab_1(Context context, ArrayList<Integer> imageId,ArrayList<String> AppId,
                                                   ArrayList<String> Name,ArrayList<String> count1,ArrayList<String> count2
            ,ArrayList<String> count3,ArrayList<String> count4,ArrayList<String> count5 ) {
        this.mContext= context;
        this.imageId = imageId;
        this.AppId = AppId;
        this.Name = Name;
        this.count1 = count1;
        this.count2 = count2;
        this.count3 = count3;
        this.count4 = count4;
        this.count5 = count5;

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
            view = mInflater.inflate(R.layout.paysearch_1_fragmenttab_2_tab_1_model, parent, false);


        ImageView imageView = (ImageView)view.findViewById(R.id.imv_00);
        imageView.setBackgroundResource(imageId.get(position));

        TextView txt_appid = (TextView)view.findViewById(R.id.text_01);
        txt_appid.setText(AppId.get(position));

        TextView txt_Name = (TextView)view.findViewById(R.id.text_02);
        txt_Name.setText(Name.get(position));

        TextView txt_count1 = (TextView)view.findViewById(R.id.text_03);
        txt_count1.setText(count1.get(position));

        TextView txt_count2 = (TextView)view.findViewById(R.id.text_04);
        txt_count2.setText(count2.get(position));

        TextView txt_count3 = (TextView)view.findViewById(R.id.text_05);
        txt_count3.setText(count3.get(position));

        TextView txt_count4 = (TextView)view.findViewById(R.id.text_06);
        txt_count4.setText(count4.get(position));

        TextView txt_count5 = (TextView)view.findViewById(R.id.text_07);
        txt_count5.setText(count5.get(position));





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
