package com.siamsmile.mobileagentsiamsmile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.Adapter_PaySearch_1_FragmentTab_1;

/**
 * Created by aligndev on 02-Nov-17.
 */


public  class PaySearch_1_FragmentTab_1 extends Fragment  {

    View rootView;


    public PaySearch_1_FragmentTab_1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.paysearch_1_fragmenttab_1, container, false);

     ListView Datalist = (ListView)rootView.findViewById(R.id.expandableListView);

        //=====================================  set list =================================
        String[][] dataProspect = new String[][]{
                {String.valueOf(R.drawable.c1),"7410852963\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","12/04/2018\n","100,000 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.c3),"9638527410\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","02/02/2018\n","200,000 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.l1),"7894563215 \n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","30/10/2018\n","300,000 บาท",String.valueOf(R.drawable.off)},
                {String.valueOf(R.drawable.l2),"8753265411\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","16/06/2018\n","400,000 บาท",String.valueOf(R.drawable.off)},
                {String.valueOf(R.drawable.l3),"0123456789\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","19/02/2018\n","500,00 บาท",String.valueOf(R.drawable.pos)},
                {String.valueOf(R.drawable.l3),"9512368740 \n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","20/12/2018\n","600,000 บาท",String.valueOf(R.drawable.pos)},
                {String.valueOf(R.drawable.l2),"0123457896\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","31/01/2018\n","700,000 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.l2),"9852367410\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","13/08/2018\n","800,000 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.c3),"3214569870\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","18/09/2018\n","900,000 บาท",String.valueOf(R.drawable.off)},
                {String.valueOf(R.drawable.l1),"3697412580\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","25/05/2018\n","1,000,000 บาท",String.valueOf(R.drawable.pos)}};

        ArrayList<Integer> imageId = new ArrayList<>();
        ArrayList<String> AppId = new ArrayList<>();
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<String> Name2 = new ArrayList<>();
        ArrayList<String> type = new ArrayList<>();
        ArrayList<String> Detail = new ArrayList<>();
        ArrayList<String> amount = new ArrayList<>();
        ArrayList<Integer> imageId2 = new ArrayList<>();




        for(int i = 0;i<10;i++){
            int image1 = Integer.parseInt(dataProspect[i][0]);
            imageId.add(image1);
            AppId.add(dataProspect[i][1]);
            Name.add(dataProspect[i][2]);
            Name2.add(dataProspect[i][3]);
            type.add(dataProspect[i][4]);
            Detail.add(dataProspect[i][5]);
            amount.add(dataProspect[i][6]);
            int image2 = Integer.parseInt(dataProspect[i][7]);
            imageId2.add(image2);

        }

        Adapter_PaySearch_1_FragmentTab_1 adapter = new Adapter_PaySearch_1_FragmentTab_1(getActivity(),
                imageId, AppId,Name,Name2,type,Detail,amount,imageId2);
        Datalist.setAdapter(adapter);


        Datalist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Toast.makeText(getActivity(),"Your Position:"+arg2,Toast.LENGTH_SHORT).show();
            }
        });




        return rootView;

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        Button button = (Button)view.findViewById( R.id.bt_payment );
//        button.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getActivity(),PaySearch_1_FragmentTab_2.class));
//            }
//        } );
    }
//    private View init(final View inflate) {
//
//        Button b = (Button) inflate.findViewById(R.id.bt_payment);
//        b.setOnClickListener(this);
//        expandableListView = (ExpandableListView) inflate.findViewById( R.id.expandableListView );
//        expandableListDetail = Activity_Page_PaySearch_2_FragmentTab_1_ExpandableListDataPump.getData();
//        expandableListTitle = new ArrayList<String>( expandableListDetail.keySet() );
//        expandableListAdapter = new Activity_Page_PaySearch_2_FragmentTab_1_CustomerExpandableListAdapter( getActivity(), expandableListTitle, expandableListDetail );
//        expandableListView.setAdapter( expandableListAdapter );
//
//
//        expandableListView.setOnGroupExpandListener( new ExpandableListView.OnGroupExpandListener() {
//
//            @Override
//            public void onGroupExpand(int groupPosition) {
//                Toast.makeText( getActivity(),
//                        expandableListTitle.get( groupPosition ) + " List Expanded.",
//                        Toast.LENGTH_SHORT ).show();
//            }
//        } );
//
//        expandableListView.setOnGroupCollapseListener( new ExpandableListView.OnGroupCollapseListener() {
//
//            @Override
//            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText( getActivity(),
//                        expandableListTitle.get( groupPosition ) + " List Collapsed.",
//                        Toast.LENGTH_SHORT ).show();
//
//            }
//        } );
//
//        expandableListView.setOnChildClickListener( new ExpandableListView.OnChildClickListener() {
//            @Override
//            public boolean onChildClick(ExpandableListView parent, View v,
//                                        int groupPosition, int childPosition, long id) {
//                Toast.makeText(
//                        getActivity(),
//                        expandableListTitle.get(groupPosition)
//                                + " -> "
//                                + expandableListDetail.get(
//                                expandableListTitle.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT
//                ).show();
//
//
//                int itemPosition = groupPosition;
//                // int itemPosition_childPosition     = childPosition;
//                return false;
//            }
//        } );
//
//        return inflate;
//    }




//    @Override
//    public void onClick(View view) {
//        startActivity(new Intent(getActivity(),PaySearch_2_FragmentTab_2.class));
//    }
}


























