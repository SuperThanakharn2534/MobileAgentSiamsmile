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

import Adapter.Adapter_PaySearch_1_FregmentTab_2_Spinner;
import Adapter.Adapter_PaySearch_2_FragmentTab_2_Tab_3;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class PaySearch_2_FragmentTab_2_TabFragment_5 extends Fragment  {

    View rootView;



    public PaySearch_2_FragmentTab_2_TabFragment_5() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.paysearch_2_fragmenttab_2_tabfragment_5, container, false );

        ListView lvDatalist = (ListView)rootView.findViewById(R.id.expandableListView);

        //=====================================  set list =================================
        String[][] dataProspect = new String[][]{
                {String.valueOf(R.drawable.c1),"7410852963\n","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","Silver 602-01\n","3333/999","12/10/2018","cash","500 บาท\n","1230123456987"},
                {String.valueOf(R.drawable.c3),"1230456789\n","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","Silver 602-01\n","3333/999","12/10/2018","cash","500 บาท\n","1230123456987"},
                {String.valueOf(R.drawable.l1),"0147025896\n","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","Silver 602-01\n","3333/999","12/10/2018","cash","500 บาท\n","1230123456987"},
                {String.valueOf(R.drawable.l2),"1234569878\n","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","Silver 602-01\n","3333/999","12/10/2018","cash","500 บาท\n","1230123456987"},
                {String.valueOf(R.drawable.l3),"4562111114\n","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","Silver 602-01\n","3333/999","12/10/2018","cash","500 บาท\n","1230123456987"},
                {String.valueOf(R.drawable.l3),"1010101011\n","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","Silver 602-01\n","3333/999","12/10/2018","cash","500 บาท\n","1230123456987"},
                {String.valueOf(R.drawable.l2),"7878787586\n","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","Silver 602-01\n","3333/999","12/10/2018","cash","500 บาท\n","1230123456987"},
                {String.valueOf(R.drawable.l2),"9998898980\n","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","Silver 602-01\n","3333/999","12/10/2018","cash","500 บาท\n","1230123456987"},
                {String.valueOf(R.drawable.c3),"1452369870\n","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","Silver 602-01\n","3333/999","12/10/2018","cash","500 บาท\n","1230123456987"},
                {String.valueOf(R.drawable.l1),"0123654789\n","นาย สมรัก  คำสร้อย \n","นางนาดี พอดี","Silver 602-01\n","3333/999","12/10/2018","cash","500 บาท\n","1230123456987"}};

        ArrayList<Integer> imageId = new ArrayList<>();
        ArrayList<String> AppId = new ArrayList<>();
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<String> Name2 = new ArrayList<>();
        ArrayList<String> type = new ArrayList<>();
        ArrayList<String> detail = new ArrayList<>();
        ArrayList<String> date = new ArrayList<>();
        ArrayList<String> contact = new ArrayList<>();
        ArrayList<String> price = new ArrayList<>();
        ArrayList<String> invoice = new ArrayList<>();


        for(int i = 0;i<10;i++) {
            int image1 = Integer.parseInt( dataProspect[i][0] );
            imageId.add( image1 );
            AppId.add( dataProspect[i][1] );
            Name.add( dataProspect[i][2] );
            Name2.add( dataProspect[i][3] );
            type.add( dataProspect[i][4] );
            detail.add( dataProspect[i][5] );
            date.add( dataProspect[i][6] );
            contact.add( dataProspect[i][7] );
            price.add( dataProspect[i][8] );
            invoice.add( dataProspect[i][9] );




        }


        Adapter_PaySearch_2_FragmentTab_2_Tab_3 adapter = new Adapter_PaySearch_2_FragmentTab_2_Tab_3(getActivity(),
                imageId, AppId,Name,Name2,type,detail,date,contact,price,invoice);
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
//                startActivity(new Intent(getActivity(),PaySearch_2_FragmentTab_2_TabFragment_4_PopUp.class));
//            }
//        } );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(getActivity());

                dialog.requestWindowFeature( Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.paysearch_2_fragmenttab_2_tabfragment_5_popup);
                dialog.setCancelable(true);


                final ArrayList<String> list_01=new ArrayList<String>();
                list_01.add(" -เลือกประเภทลูกค้า- ");
                list_01.add("ลูกค้าตนเอง");
                list_01.add("ลูกค้าสาขา");
                list_01.add("ลูกค้าทีม");




                Button button1 = (Button)dialog.findViewById(R.id.bt_clickpage_2);
                Button button2 = (Button)dialog.findViewById(R.id.bt_clickpage_1);

                Spinner s = (Spinner) dialog.findViewById(R.id.Spinner_List_01);
                Adapter_PaySearch_1_FregmentTab_2_Spinner spiner = new  Adapter_PaySearch_1_FregmentTab_2_Spinner(getActivity(),list_01);
                s.setAdapter(spiner);

                //Function Click Button
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


























