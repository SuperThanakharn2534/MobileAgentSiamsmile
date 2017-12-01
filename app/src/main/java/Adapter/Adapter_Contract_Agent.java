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

public class Adapter_Contract_Agent extends BaseAdapter {

    ArrayList<Integer> imageId = new ArrayList<>();
    ArrayList<String> Agent_Id = new ArrayList<>();
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<String> Area = new ArrayList<>();
    ArrayList<Integer> imageId2 = new ArrayList<>();
    Context mContext;

    public Adapter_Contract_Agent(Context context, ArrayList<Integer> imageId, ArrayList<String> agent_Id, ArrayList<String> Agent_Id,
                                  ArrayList<String> Name, ArrayList<String> Area, ArrayList<Integer> imageId2) {
        this.mContext= context;
        this.imageId = imageId;
        this.Agent_Id = Agent_Id;
        this.Name = Name;
        this.Area = Area;
        this.imageId2 = imageId2;

    }

    @Override
    public int getCount() {
        return Agent_Id.size();
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
            view = mInflater.inflate(R.layout.contractuse_agent_model, parent, false);


        ImageView imageView = (ImageView)view.findViewById(R.id.imv_00);
        imageView.setBackgroundResource(imageId.get(position));

        TextView txt_appid = (TextView)view.findViewById(R.id.Text_01);
        txt_appid.setText(Agent_Id.get(position));

        TextView txt_Name = (TextView)view.findViewById(R.id.Text_02);
        txt_Name.setText(Name.get(position));

        TextView txt_type = (TextView)view.findViewById(R.id.Text_03);
        txt_type.setText(Area.get(position));

        ImageView imageView2 = (ImageView)view.findViewById(R.id.imv_02);
        imageView2.setBackgroundResource(imageId2.get(position));

        return view;

    }







}
