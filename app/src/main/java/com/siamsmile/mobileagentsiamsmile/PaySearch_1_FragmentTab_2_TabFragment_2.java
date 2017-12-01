package com.siamsmile.mobileagentsiamsmile;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.Adapter_PaySearch_1_FragmentTab_2_Tab_2;
import Adapter.Adapter_PaySearch_1_FregmentTab_2_Spinner;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class PaySearch_1_FragmentTab_2_TabFragment_2 extends Fragment  {


    View rootView;



    public PaySearch_1_FragmentTab_2_TabFragment_2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.paysearch_1_fragmenttab_2_tabfragment_2, container, false );

        ListView lvDatalist = (ListView)rootView.findViewById(R.id.expandableListView);

        //=====================================  set list =================================
        String[][] dataProspect = new String[][]{
                {String.valueOf(R.drawable.c1),"7410852963\n","502-Silver","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","12/12/2018\n","เริ่มคุ้มครอง : 12/12/2017\nความคุ้มครอง : XXXXX\nบริษัทผู้รับประกัน : YYYYY\n .... ","100,000","Aug-17\n","New App"},
                {String.valueOf(R.drawable.c3),"1230456789\n","502-Silver","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","12/12/2018\n","เริ่มคุ้มครอง : 12/12/2017\nความคุ้มครอง : XXXXX\nบริษัทผู้รับประกัน : YYYYY\n .... ","100,000","Aug-17\n","New App"},
                {String.valueOf(R.drawable.l1),"0147025896\n","502-Silver","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","12/12/2018\n","เริ่มคุ้มครอง : 12/12/2017\nความคุ้มครอง : XXXXX\nบริษัทผู้รับประกัน : YYYYY\n .... ","100,000","Aug-17\n","New App"},
                {String.valueOf(R.drawable.l2),"1234569878\n","502-Silver","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","12/12/2018\n","เริ่มคุ้มครอง : 12/12/2017\nความคุ้มครอง : XXXXX\nบริษัทผู้รับประกัน : YYYYY\n .... ","100,000","Aug-17\n","New App"},
                {String.valueOf(R.drawable.l3),"4562111114\n","502-Silver","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","12/12/2018\n","เริ่มคุ้มครอง : 12/12/2017\nความคุ้มครอง : XXXXX\nบริษัทผู้รับประกัน : YYYYY\n .... ","100,000","Aug-17\n","New App"},
                {String.valueOf(R.drawable.l3),"1010101011\n","502-Silver","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","12/12/2018\n","เริ่มคุ้มครอง : 12/12/2017\nความคุ้มครอง : XXXXX\nบริษัทผู้รับประกัน : YYYYY\n .... ","100,000","Aug-17\n","New App"},
                {String.valueOf(R.drawable.l2),"7878787586\n","502-Silver","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","12/12/2018\n","เริ่มคุ้มครอง : 12/12/2017\nความคุ้มครอง : XXXXX\nบริษัทผู้รับประกัน : YYYYY\n .... ","100,000","Aug-17\n","New App"},
                {String.valueOf(R.drawable.l2),"9998898980\n","502-Silver","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","12/12/2018\n","เริ่มคุ้มครอง : 12/12/2017\nความคุ้มครอง : XXXXX\nบริษัทผู้รับประกัน : YYYYY\n .... ","100,000","Aug-17\n","New App"},
                {String.valueOf(R.drawable.c3),"1452369870\n","502-Silver","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","12/12/2018\n","เริ่มคุ้มครอง : 12/12/2017\nความคุ้มครอง : XXXXX\nบริษัทผู้รับประกัน : YYYYY\n .... ","100,000","Aug-17\n","New App"},
                {String.valueOf(R.drawable.l1),"0123654789\n","502-Silver","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","12/12/2018\n","เริ่มคุ้มครอง : 12/12/2017\nความคุ้มครอง : XXXXX\nบริษัทผู้รับประกัน : YYYYY\n .... ","100,000","Aug-17\n","New App"}};

        ArrayList<Integer> imageId = new ArrayList<>();
        ArrayList<String> AppId = new ArrayList<>();
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<String> data1 = new ArrayList<>();
        ArrayList<String> data2 = new ArrayList<>();
        ArrayList<String> data3 = new ArrayList<>();
        ArrayList<String> data4 = new ArrayList<>();
        ArrayList<String> data5 = new ArrayList<>();
        ArrayList<String> data6 = new ArrayList<>();
        ArrayList<String> data7 = new ArrayList<>();


        for(int i = 0;i<10;i++) {
            int image1 = Integer.parseInt( dataProspect[i][0] );
            imageId.add( image1 );
            AppId.add( dataProspect[i][1] );
            Name.add( dataProspect[i][2] );
            data1.add( dataProspect[i][3] );
            data2.add( dataProspect[i][4] );
            data3.add( dataProspect[i][5] );
            data4.add( dataProspect[i][6] );
            data5.add( dataProspect[i][7] );
            data6.add(dataProspect[i][8]);
            data7.add( dataProspect[i][9] );

        }


        Adapter_PaySearch_1_FragmentTab_2_Tab_2 adapter = new Adapter_PaySearch_1_FragmentTab_2_Tab_2(getActivity(),
                imageId, AppId,Name,data1,data2,data3,data4,data5,data6,data7);
        lvDatalist.setAdapter(adapter);


        lvDatalist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Toast.makeText(getActivity(),"Your Position:"+arg2,Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = (Button)view.findViewById( R.id.bt_searchandfilter );
//        button.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getActivity(),PaySearch_1_FragmentTab_2_TabFragment_2_PopUp.class));
//            }
//        } );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(getActivity());

                dialog.requestWindowFeature( Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.paysearch_1_fragmenttab_2_tabfragment_2_popup);
                dialog.setCancelable(true);

                final ArrayList<String> list_01=new ArrayList<String>();
                list_01.add(" -เลือกกลุ่มผลิตภัณฑ์- ");
                for (int i=0;i<=10;i++){
                    list_01.add("ผลิตภัณฑ์ที่ "+i);
                }

                final ArrayList<String> list_02=new ArrayList<String>();
                list_02.add(" -เลือกแผนประกัน- ");
                for (int i=0;i<=10;i++){
                    list_02.add("แผนที่ "+i);
                }

                final ArrayList<String> list_03=new ArrayList<String>();
                list_03.add(" -เลือกรอบในการคิดเกรด- ");
                list_03.add("Aug - 17");
                list_03.add("Nov - 17");

                final ArrayList<String> list_04=new ArrayList<String>();
                list_04.add(" -เลือกสถานะ- ");
                list_04.add("New App");
                list_04.add("ยกเลิก");



                Button button1 = (Button)dialog.findViewById(R.id.bt_clickpage_2);
                Button button2 = (Button)dialog.findViewById(R.id.bt_clickpage_1);

                Spinner s = (Spinner) dialog.findViewById(R.id.Spinner_List_01);
                Adapter_PaySearch_1_FregmentTab_2_Spinner spiner = new  Adapter_PaySearch_1_FregmentTab_2_Spinner(getActivity(),list_01);
                s.setAdapter(spiner);

                Spinner s2 = (Spinner) dialog.findViewById(R.id.Spinner_List_02);
                Adapter_PaySearch_1_FregmentTab_2_Spinner spiner2 = new  Adapter_PaySearch_1_FregmentTab_2_Spinner(getActivity(),list_02);
                s2.setAdapter(spiner2);

                Spinner s3 = (Spinner) dialog.findViewById(R.id.Spinner_List_03);
                Adapter_PaySearch_1_FregmentTab_2_Spinner spiner3 = new  Adapter_PaySearch_1_FregmentTab_2_Spinner(getActivity(),list_03);
                s3.setAdapter(spiner3);

                Spinner s4 = (Spinner) dialog.findViewById(R.id.Spinner_List_04);
                Adapter_PaySearch_1_FregmentTab_2_Spinner spiner4 = new  Adapter_PaySearch_1_FregmentTab_2_Spinner(getActivity(),list_04);
                s4.setAdapter(spiner4);



                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getActivity(),"Click Cancel",Toast.LENGTH_SHORT).show();
                            dialog.cancel();

                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(),"Click Cancel",Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });

                dialog.show();

            }
        } );












    }



}


























