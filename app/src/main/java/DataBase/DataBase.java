package DataBase;

        import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aligndev on 12-Oct-17.
 */

public class DataBase extends SQLiteOpenHelper {

        private static final String DB_NAME = "SiamSmile";
        private static final String  COL_USERNAME = "UserName";
        private static final String  COL_PASSWORD = "PassWord";
        private static final String TABLE_USER_Name = "user";
        private static final int DB_VERSION = 3;
        public static final String TABLE_USER = "CREATE TABLE  User "
                + "(RowId INTEGER PRIMARY KEY  AUTOINCREMENT  ,"
                + COL_USERNAME + "TEXT,"
                + COL_PASSWORD + "TEXT);";
       // drop table sql query
        private String DROP_USER_TABLE = "DROP TABLE IF EXISTS " + TABLE_USER_Name;

        public DataBase(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(TABLE_USER);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            //Drop User Table if exist
            db.execSQL(DROP_USER_TABLE);
            // Create tables again
            onCreate(db);
        }
}
