package Biz;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

import DataBase.DataBase;

/**
 * Created by aligndev on 16-Oct-17.
 */

public class UserMGR {

    private  String Username;
    private  String Password;
    public  SQLiteDatabase database;


    public boolean InsertData(User user,Context context) {


        DataBase database = new DataBase(context);
        Boolean aBoolean = true;
        SQLiteDatabase db = database.getWritableDatabase();
        ContentValues Val = new ContentValues();
//         user.setUserName("THANAKHARN");
//         user.setPassword("1234567890");

        Val.put("UserLName",user.getUserName());
        Val.put("Password",user.getPassword());


        long rows ;
        Log.i("long","InsertLong");
        rows  = db.insert("User", null, Val);
        if (rows == -1 ){
            aBoolean = false;
        }
        return  aBoolean;
    }

    public ArrayList<User> SelectData(String s, String toString, Context context) {
        ArrayList<User> UsersList = new ArrayList<User>();
        User oUsers ;
        // Database
        DataBase database = new DataBase(context);

        String selectQuery = "SELECT  * FROM  User  where  LOWER(UserName) = LOWER('"+Username+"') and Password = '"+Password+"'";

        Log.i("Log",selectQuery);
        SQLiteDatabase db  = database.getReadableDatabase();
        Cursor cursor      = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                oUsers = new User();
                oUsers.setRowID(cursor.getString(cursor.getColumnIndexOrThrow("RowId")));
                oUsers.setUserName(cursor.getString(cursor.getColumnIndexOrThrow("UserName")));
                oUsers.setPassword(cursor.getString(cursor.getColumnIndexOrThrow("Password")));
                UsersList.add(oUsers);

                // get the data into array, or class variable
            } while (cursor.moveToNext());
        }
        cursor.close();
        return UsersList;
    }

    public boolean UpdateData(User user,Context context) {

        DataBase database = new DataBase(context);
        Boolean aBoolean = true;
        SQLiteDatabase db = database.getWritableDatabase();
        ContentValues Val = new ContentValues();

        //Val.put("RowId",users.getRowID());
        //Val.put("UserId",users.getUserID());
        Val.put("UserName",user.getUserName());
        Val.put("Password",user.getPassword());


        int rows ;
        Log.i("long","InsertLong");
        rows  = db.update("User",Val,null,null);
        if (rows == -1 ){
            aBoolean = false;
        }

        return  aBoolean;
    }

    public boolean DeleteData(User user,Context context) {

        DataBase database = new DataBase(context);
        Boolean aBoolean = true;
        SQLiteDatabase db = database.getWritableDatabase();
        ContentValues Val = new ContentValues();

        //Val.put("RowId",users.getRowID());
        //Val.put("UserId",users.getUserID());
        Val.put("UserName",user.getUserName());
        Val.put("Password",user.getPassword());



        int rows ;
        Log.i("long","DeleteLong");
        rows  = db.delete("User",user.getRowID(),null);
        if (rows == -1 ){
            aBoolean = false;
        }

        return  aBoolean;
    }



}
