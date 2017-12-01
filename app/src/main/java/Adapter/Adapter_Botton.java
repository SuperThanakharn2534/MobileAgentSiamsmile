package Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.siamsmile.mobileagentsiamsmile.R;

import MGR.Activity_Bottom_MGR;

/**
 * Created by aligndev on 19-Oct-17.
 */

public class Adapter_Botton extends BaseAdapter {


    // MessageBox
   // NotificationBadge mBadge;
    //private  Integer  count2 = 4;

    Activity_Bottom_MGR  mgr = new Activity_Bottom_MGR();
    private Context mContext;
    private Activity mActivity;


    public Adapter_Botton(Context context ,Activity activity) {
        mContext = context;
        mActivity = activity;
        // mCount = context2;
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

        TextView txtTitle = (TextView)grid.findViewById(R.id.textView_Menu);
        txtTitle.setText( mgr.MenuText()[position]);


        // MessageBox  ข้อความแจ้งแตือน
       // mBadge = (NotificationBadge)grid.findViewById(R.id.badge2);
       //mBadge.setNumber(count2);



        return grid;

    }
}
