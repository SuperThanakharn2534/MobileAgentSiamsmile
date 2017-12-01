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
 * Created by aligndev on 22-Oct-17.
 */

public class Adapter_PaySearch_2_Fragment_3 extends BaseAdapter {

//    // MessageBox
//    NotificationBadge mBadge;
//    private  Integer  count2 = 1;
//
//    Activity_ContracUse_MGR mgr = new Activity_ContracUse_MGR();
//    private Context mContext;
//    private Activity mActivity;
//
//    public Adapter_PaySearch_2_Fragment_3(Context context , Activity activity) {
//        mContext = context;
//        mActivity = activity;
//
//    }
//
//
//
//    @Override
//    public int getCount() {
//        return mgr.MenuImg().length;
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return mgr.MenuImg()[i];
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return  i;
//    }
//
//    @Override
//    public View getView(int position, View view, ViewGroup parent) {
//        View grid;
//
//        // if(view==null){
//        grid = new View(mContext);
//        LayoutInflater inflater = mActivity.getLayoutInflater();
//        grid=inflater.inflate( R.layout.activity_listimage_contrac_model, parent, false);
//        // }else{
//        //   grid = (View)view;
//        // }
//
//        ImageView imageView = (ImageView)grid.findViewById(R.id.imageView_Contrac_Model);
//        imageView.setImageResource(mgr.MenuImg()[position]);
//
//        TextView txtTitle = (TextView)grid.findViewById(R.id.textView_Contrac);
//        txtTitle.setText( mgr.MenuText()[position]);
//
//        // MessageBox
////        mBadge = (NotificationBadge)grid.findViewById(R.id.badge2);
////        mBadge.setNumber(count2);
//        //mBadge.setNumber(mgr.MenuCount() [position]);
//
//
//        return grid;
//
//    }
//}

    ArrayList<Integer> imageId = new ArrayList<>();
    ArrayList<String> Header = new ArrayList<>();

    Context mContext;

    public Adapter_PaySearch_2_Fragment_3(Context context, ArrayList<Integer> imageId, ArrayList<String> Header) {
        this.mContext= context;
        this.imageId = imageId;
        this.Header = Header;
    }
    @Override
    public int getCount() {
        return imageId.size();
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
            view = mInflater.inflate(R.layout.paysearch_2_fragmenttab_3_model, parent, false);


        ImageView imageView = (ImageView)view.findViewById(R.id.img_paysearch_3_Model);
        imageView.setBackgroundResource(imageId.get(position));

        TextView txt_header = (TextView)view.findViewById(R.id.txt_paysearch_3_modell);
        txt_header.setText(Header.get(position));


        return view;

    }


}