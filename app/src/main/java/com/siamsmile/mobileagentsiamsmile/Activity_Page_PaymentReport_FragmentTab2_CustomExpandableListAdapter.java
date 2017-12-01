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

public class Activity_Page_PaymentReport_FragmentTab2_CustomExpandableListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> appid2;
    private List<String> Name2;
    private List<String> Product2;
   // private List<String> expandableListTitle;
    private HashMap<String, List<String>> expandableListDetail;

    public Activity_Page_PaymentReport_FragmentTab2_CustomExpandableListAdapter(Context context,List<String> appid2,List<String> Name2,List<String> Product2, //List<String> expandableListTitle,
                                                                                HashMap<String, List<String>> expandableListDetail) {
        this.context = context;
        this.appid2 = appid2;
        this.Name2 = Name2;
        this.Product2 =Product2;
       // this.expandableListTitle = expandableListTitle;
        this.expandableListDetail = expandableListDetail;
    }

    @Override
    public Object getChild(int listPosition, int expandedListPosition) {
        return this.expandableListDetail.get( this.appid2.get( listPosition ) )
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
            convertView = layoutInflater.inflate( R.layout.activity_page_paymentreport_fragmenttab2_tab_list_item, null );
        }
        TextView expandedListTextView = (TextView) convertView
                .findViewById( R.id.expandedListItem );
        expandedListTextView.setText( expandedListText );
        return convertView;
    }

    @Override
    public int getChildrenCount(int listPosition) {
        return this.expandableListDetail.get( this.appid2.get( listPosition ) )
                .size();
    }

    @Override
    public Object getGroup(int listPosition) {
        return this.appid2.get( listPosition );
    }

    @Override
    public int getGroupCount() {
        return this.appid2.size();
    }

    @Override
    public long getGroupId(int listPosition) {
        return listPosition;
    }

    @Override
    public View getGroupView(final int listPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
       // String listTitle = (String) getGroup( listPosition );
        String  Appid =(String)getGroup( listPosition );
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.
                    getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            convertView = layoutInflater.inflate( R.layout.activity_page_paymentreport_fragmenttab2_tab_list_group, null );
        }
        TextView listtext_Product = (TextView) convertView
                .findViewById( R.id.data_product );

        TextView listTitleTextView = (TextView) convertView
                .findViewById( R.id.List_Name );

        TextView  St_Appid =(TextView) convertView
                .findViewById( R.id.Appid);

        St_Appid.setTypeface( null,Typeface.BOLD );
        St_Appid.setText( Appid );

        //ใช้เพื่อให้ตัวอักษรเป็นตัวบาง
        //listTitleTextView.setTypeface( null, Typeface.BOLD );
        listTitleTextView.setText( Name2.get(listPosition) );
        listtext_Product.setText( Product2.get(listPosition) );

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
                context.startActivity(new Intent( context,Activity_Page_AgentLogin.class ));
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