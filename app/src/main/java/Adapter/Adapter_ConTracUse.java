package Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nex3z.notificationbadge.NotificationBadge;
import com.siamsmile.mobileagentsiamsmile.R;

import MGR.Activity_ContracUse_MGR;

/**
 * Created by aligndev on 22-Oct-17.
 */

public class Adapter_ConTracUse extends BaseAdapter {

    // MessageBox
    NotificationBadge mBadge;
    private  Integer  count2 = 1;

    Activity_ContracUse_MGR mgr = new Activity_ContracUse_MGR();
    private Context mContext;
    private Activity mActivity;

    public Adapter_ConTracUse(Context context ,Activity activity) {
        mContext = context;
        mActivity = activity;

    }



    @Override
    public int getCount() {
        return mgr.MenuImg().length;
    }

    @Override
    public Object getItem(int i) {
        return mgr.MenuImg()[i];
    }

    @Override
    public long getItemId(int i) {
        return  i;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View grid;

        // if(view==null){
        grid = new View(mContext);
        LayoutInflater inflater = mActivity.getLayoutInflater();
        grid=inflater.inflate( R.layout.activity_listimage_contrac_model, parent, false);
        // }else{
        //   grid = (View)view;
        // }

        ImageView imageView = (ImageView)grid.findViewById(R.id.imageView_Contrac_Model);
        imageView.setImageResource(mgr.MenuImg()[position]);

        TextView txtTitle = (TextView)grid.findViewById(R.id.textView_Contrac);
        txtTitle.setText( mgr.MenuText()[position]);

        // MessageBox
//        mBadge = (NotificationBadge)grid.findViewById(R.id.badge2);
//        mBadge.setNumber(count2);
        //mBadge.setNumber(mgr.MenuCount() [position]);


        return grid;

    }
}
