package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.siamsmile.mobileagentsiamsmile.R;

import java.util.ArrayList;

/**
 * Created by aligndev on 27-Nov-17.
 */

public class Adapter_PaymentCustomer_FregmentTab_1_Spinner extends BaseAdapter {


    private Context mContext;
    private ArrayList<String> mData;
    private LayoutInflater mInflater;


    public Adapter_PaymentCustomer_FregmentTab_1_Spinner(Context context, ArrayList<String> data) {
        mInflater = LayoutInflater.from(context);
        mContext = context;
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.activity_spinner_text_model, parent, false);
            holder.name = (TextView) convertView.findViewById( R.id.tv_addresslist);
            //  holder.logo = (ImageView) convertView.findViewById(R.id.imv_icon_product);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

//        int imgResourceId;
//        switch (position) {
//            case 0:
//                imgResourceId = R.drawable.claim_home;
//                break;
//            case 1:
//                imgResourceId = R.drawable.claim_health;
//                break;
//            case 2:
//                imgResourceId = R.drawable.claim_accident;
//                break;
//            case 3:
//                imgResourceId = R.drawable.claim_car;
//                break;
//            default:
//                imgResourceId = R.drawable.claim_health3;
//                break;
//        }

        holder.name.setText(mData.get(position));
        // holder.logo.setImageResource(imgResourceId);

        convertView.setTag(holder);

        return convertView;
    }

    public class ViewHolder {
        TextView name;
        // ImageView logo;
    }










}


