package test;

import java.util.ArrayList;
import java.util.List;

public class MakeArraylist {
    private static MakeArraylist makeArraylist;

    private MakeArraylist(){}
    

    public static MakeArraylist getMakeArraylist()
    {
        return makeArraylist;
    }

    public void getArrayList(){
        List<String> list= new ArrayList<>();
    }
}
