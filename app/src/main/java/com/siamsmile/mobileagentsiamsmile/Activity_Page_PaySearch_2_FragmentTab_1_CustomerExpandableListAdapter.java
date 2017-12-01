package com.siamsmile.mobileagentsiamsmile;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Activity_Page_PaySearch_2_FragmentTab_1_CustomerExpandableListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> appid;
    private List<String> Name;
    private List<String> data1;
    private List<String> data2;
    //private List<String> expandableListTitle;
    private HashMap<String, List<String>> expandableListDetail;

    public Activity_Page_PaySearch_2_FragmentTab_1_CustomerExpandableListAdapter(Context context,List<String> appid, List<String> Name,List<String> data1,List<String> data2,
                                                                                         HashMap<String, List<String>> expandableListDetail) {
        this.context = context;
        this.appid = appid;
        //this.expandableListTitle = expandableListTitle;
        this.Name = Name;
        this.data1 =data1;
        this.data2 =data2;
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
            convertView = layoutInflater.inflate( R.layout.paysearch_2_tab1_list_item, null );
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
        final String  Appid =(String)getGroup( listPosition );
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.
                    getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            convertView = layoutInflater.inflate( R.layout.paysearch_2_tab1_list_group, null );
        }



        //code set Text Data
        TextView listtext_Text4 = (TextView) convertView
                .findViewById( R.id.Text_04 );

        TextView listtext_Text3 = (TextView) convertView
                .findViewById( R.id.Text_03 );

        TextView listTitleTextView = (TextView) convertView
                .findViewById( R.id.Text_02 );

        TextView  St_Appid =(TextView) convertView
                .findViewById( R.id.Text_01);

        St_Appid.setTypeface( null,Typeface.BOLD );
        St_Appid.setText( Appid);

        //ใช้เพื่อให้ตัวอักษรเป็นตัวบาง
        //listTitleTextView.setTypeface( null, Typeface.BOLD );
        listTitleTextView.setText( Name.get(listPosition) );
        listtext_Text3.setText( data1.get(listPosition) );
        listtext_Text4.setText( data2.get( listPosition ) );

        //  set click Header and function image Up and Down
        //ImageView imvIcon = (ImageView)convertView.findViewById(R.id.imv_product);
        LinearLayout layoutMain = (LinearLayout)convertView.findViewById(R.id.layout_main);
        ImageView imvNavigate = (ImageView) convertView.findViewById(R.id.img_upanddown);


        //================================== Set Layout Click then show Detail ===============//
//        layoutMain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(context,"Position IS:"+listPosition, Toast.LENGTH_SHORT).show();
//                //  startActivity(new Intent(getBaseContext(), Activity_Page_AgentLogin.class));
//                //context.startActivity(new Intent( context,Activity_Page_AgentLogin.class ));
//            }
//        });

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



























