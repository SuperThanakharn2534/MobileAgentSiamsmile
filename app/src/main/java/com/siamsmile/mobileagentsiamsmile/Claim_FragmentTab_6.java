package com.siamsmile.mobileagentsiamsmile;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Adapter.Adapter_ClaimTypeMenu_6_FragmentTab_1;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Claim_FragmentTab_6 extends android.support.v4.app.Fragment {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    List<String> expire_date;
    List<String> Product;
    List<String> Name;
    List<String> appid;
    HashMap<String, List<String>> expandableListDetail;
    View rootView;

    public Claim_FragmentTab_6() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.claim_fragmenttab_6, container, false );
        ListView Datalist = (ListView)rootView.findViewById(R.id.expandableListView);


        //=====================================  set list =================================
        String[][] dataProspect = new String[][]{
                {String.valueOf(R.drawable.c1),"7410852963\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","567/123\n","New App\n","500 บาท","500 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.c3),"9638527410\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","567/123\n","New App\n","500 บาท","420 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.l1),"7894563215 \n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","567/123\n","New App\n","500 บาท","950 บาท",String.valueOf(R.drawable.off)},
                {String.valueOf(R.drawable.l2),"8753265411\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","567/123\n","New App\n","500 บาท","850 บาท",String.valueOf(R.drawable.off)},
                {String.valueOf(R.drawable.l3),"0123456789\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","567/123\n","New App\n","500 บาท","600 บาท",String.valueOf(R.drawable.pos)},
                {String.valueOf(R.drawable.l3),"9512368740 \n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","567/123\n","New App\n","500 บาท","500 บาท",String.valueOf(R.drawable.pos)},
                {String.valueOf(R.drawable.l2),"0123457896\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","567/123\n","New App\n","500 บาท","450 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.l2),"9852367410\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","567/123\n","New App\n","500 บาท","250 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.c3),"3214569870\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","567/123\n","New App\n","500 บาท","300 บาท",String.valueOf(R.drawable.off)},
                {String.valueOf(R.drawable.l1),"3697412580\n","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","502-Silver","567/123\n","New App\n","500 บาท","590 บาท",String.valueOf(R.drawable.pos)}};

        ArrayList<Integer> imageId = new ArrayList<>();
        ArrayList<String> AppId = new ArrayList<>();
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<String> Name2 = new ArrayList<>();
        ArrayList<String> type = new ArrayList<>();
        ArrayList<String> Detail = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();
        ArrayList<String> amount = new ArrayList<>();
        ArrayList<String> Sum = new ArrayList<>();
        ArrayList<Integer> imageId2 = new ArrayList<>();




        for(int i = 0;i<10;i++){
            int image1 = Integer.parseInt(dataProspect[i][0]);
            imageId.add(image1);
            AppId.add(dataProspect[i][1]);
            Name.add(dataProspect[i][2]);
            Name2.add(dataProspect[i][3]);
            type.add(dataProspect[i][4]);
            Detail.add(dataProspect[i][5]);
            status.add(dataProspect[i][6]);
            amount.add(dataProspect[i][7]);
            Sum.add(dataProspect[i][8]);
            int image2 = Integer.parseInt(dataProspect[i][9]);
            imageId2.add(image2);

        }

        Adapter_ClaimTypeMenu_6_FragmentTab_1 adapter = new Adapter_ClaimTypeMenu_6_FragmentTab_1(getActivity(),
                imageId, AppId,Name,Name2,type,Detail,status,amount,Sum,imageId2);
        Datalist.setAdapter(adapter);


        Datalist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // Toast.makeText(getActivity(),"Your Position:"+arg2,Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), Claim_FragmentTab_1_Detail.class));
            }
        });


        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );

        Button button = (Button) view.findViewById( R.id.bt_searchandfilter );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(getActivity(),Claim_Fragment_1_Detail_PopUp.class));
                // Toast.makeText(getActivity(),"Your Position:"+view,Toast.LENGTH_SHORT).show();

                final Dialog dialog = new Dialog( getActivity() );
                dialog.requestWindowFeature( Window.FEATURE_NO_TITLE );
                // dialog.setContentView(R.layout.activity_page_paymentreport_fragmenttab_1_popup);fragmenttab_1_popup.xml
                dialog.setContentView( R.layout.claim_fragmenttab_6_detail_popup );
                dialog.setCancelable( true );

                final List<String> list_01 = new ArrayList<String>();
                list_01.add( "เลือกประกัน" );
                for (int i = 0; i <= 10; i++) {
                    list_01.add( "ประกันที่ " + i );
                }


                Button button1 = (Button) dialog.findViewById( R.id.bt_clickpage_2 );
                Button button2 = (Button) dialog.findViewById( R.id.bt_clickpage_1 );

                Spinner s = (Spinner) dialog.findViewById( R.id.Spinner_List_01 );
                ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                        getActivity(), R.layout.activity_spinner_text_model, list_01 );
                spinnerArrayAdapter.setDropDownViewResource( R.layout.activity_spinner_text_model );
                s.setAdapter( spinnerArrayAdapter );


                button1.setOnClickListener( new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText( getActivity(), "Click Cancel", Toast.LENGTH_SHORT ).show();
                        dialog.cancel();
                    }
                } );

                button2.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText( getActivity(), "Click Cancel", Toast.LENGTH_SHORT ).show();
                        dialog.cancel();
                    }
                } );

                dialog.show();

            }
        } );


    }
















}







