package com.siamsmile.mobileagentsiamsmile;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by aligndev on 30-Oct-17.
 */

public class Group {

    public String string;
    public final List<String> children = new ArrayList<String>();

    public Group(String string) {
        this.string = string;
    }


}
