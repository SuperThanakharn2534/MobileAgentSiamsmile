package Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.nex3z.notificationbadge.NotificationBadge;
import com.siamsmile.mobileagentsiamsmile.R;

import MGR.Activity_Payment_MGR;

/**
 * Created by aligndev on 24-Oct-17.
 */

public class Adapter_Payment extends BaseAdapter {


    // MessageBox
    NotificationBadge mBadge;
    private  Integer  count2 = 1;

    Activity_Payment_MGR mgr = new Activity_Payment_MGR();
    private Context mContext;
    private Activity mActivity;

    public Adapter_Payment(Context context ,Activity activity) {
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
        grid=inflater.inflate( R.layout.activity_bottom_model, parent, false);
        // }else{
        //   grid = (View)view;
        // }

        ImageView imageView = (ImageView)grid.findViewById(R.id.imageView_BOTTOM_Model);
        imageView.setImageResource(mgr.MenuImg()[position]);

        //TextView txtTitle = (TextView)grid.findViewById(R.id.textView_Menu);
        //txtTitle.setText( mgr.MenuText()[position]);

        // MessageBox
//        mBadge = (NotificationBadge)grid.findViewById(R.id.badge2);
//        mBadge.setNumber(count2);
        //mBadge.setNumber(mgr.MenuCount() [position]);


        return grid;
    }
}
