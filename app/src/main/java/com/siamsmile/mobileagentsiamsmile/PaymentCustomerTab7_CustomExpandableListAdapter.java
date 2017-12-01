package com.siamsmile.mobileagentsiamsmile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 30-Oct-17.
 */

public class PaymentCustomerTab7_CustomExpandableListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> appid;
    private List<String> Name;
    private List<String> Product;
    private List<String> expire_date;
    //private List<String> expandableListTitle;
    private HashMap<String, List<String>> expandableListDetail;

    public PaymentCustomerTab7_CustomExpandableListAdapter(Context context, List<String> appid, List<String> Name , List<String> Product,List<String> expire_date,
                                                           HashMap<String, List<String>> expandableListDetail) {
        this.context = context;
        this.appid = appid;
        this.Name = Name;
        this.Product = Product;
        this.expire_date = expire_date;
        //this.expandableListTitle = expandableListTitle;
        this.expandableListDetail = expandableListDetail;
    }

    @Override
    public Object getChild(int listPosition, int expandedListPosition) {
        return this.expandableListDetail.get( this.appid.get( listPosition ) )
                .get( expandedListPosition );
    }

    @Override
    public long getChildId(int listPosition, int expandedListPosition) {
        return expandedListPosition;
    }

    @Override
    public View getChildView(int listPosition, final int expandedListPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        final String expandedListText = (String) getChild( listPosition, expandedListPosition );
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            convertView = layoutInflater.inflate( R.layout.paymentcustomer7_tab_list_item, null );
        }
        TextView expandedListTextView = (TextView) convertView
                .findViewById( R.id.expandedListItem );
        expandedListTextView.setText( expandedListText );
        return convertView;
    }

    @Override
    public int getChildrenCount(int listPosition) {
        return this.expandableListDetail.get( this.appid.get( listPosition ) )
                .size();
    }

    @Override
    public Object getGroup(int listPosition) {
        return this.appid.get( listPosition );
    }

    @Override
    public int getGroupCount() {
        return this.appid.size();
    }

    @Override
    public long getGroupId(int listPosition) {
        return listPosition;
    }

    @Override
    public View getGroupView(final int listPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        //String listTitle = (String) getGroup( listPosition );
        String  Appid =(String)getGroup( listPosition );

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.
                    getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            convertView = layoutInflater.inflate( R.layout.paymentcustomer7_tab_list_group, null );
        }

        //code set Text Data
        TextView  t_Appid =(TextView) convertView
                .findViewById( R.id.text_01);

        TextView t_Name = (TextView) convertView
                .findViewById( R.id.text_02 );

        TextView t_Product = (TextView) convertView
                .findViewById( R.id.text_03 );

        TextView t_Date =(TextView) convertView
                .findViewById( R.id.text_04 );

        t_Appid.setTypeface( null, Typeface.BOLD );
        t_Appid.setText( Appid );

        //ใช้เพื่อให้ตัวอักษรเป็นตัวบาง
        //listTitleTextView.setTypeface( null, Typeface.BOLD );
        //listTitleTextView.setText( Name.get(listPosition) );
        t_Name.setText( Name.get(listPosition) );
        t_Product.setText( Product.get(listPosition) );
        t_Date.setText( expire_date.get(listPosition) );



        //  set click Header and function image Up and Down
        //ImageView imvIcon = (ImageView)convertView.findViewById(R.id.imv_product);
        LinearLayout layoutMain = (LinearLayout)convertView.findViewById(R.id.layout_main);
        ImageView imvNavigate = (ImageView) convertView.findViewById(R.id.img_upanddown);


        //================================== Set Layout Click then show Detail ===============//
        layoutMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context,"Position IS:"+listPosition, Toast.LENGTH_SHORT).show();
                //  startActivity(new Intent(getBaseContext(), Activity_Page_AgentLogin.class));
                context.startActivity(new Intent( context,FragmentTab_1_Page_Detail.class ));
            }
        });

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int listPosition, int expandedListPosition) {
        return true;
    }

}