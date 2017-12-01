package Biz;

/**
 * Created by aligndev on 16-Oct-17.
 */

public class User  {

    //   private String examID;
    private String RowId;
    private String UserName;
    private String Password;

    public String getRowID() {
        return RowId;
    }
    public String getUserName() {
        return UserName;
    }
    public String getPassword() {
        return Password;
    }


    public void setRowID(String rowID) {
        this.RowId = rowID;
    }
    public void setUserName(String userName) {
        this.UserName = userName;
    }
    public void setPassword(String password) {
        this.Password = password;
    }





}
