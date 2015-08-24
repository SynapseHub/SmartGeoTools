package cd.synapsehub.smartgeotools.MaterialDesign.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by user on 8/11/15.
 */
public class FragmentPoi extends Fragment {





    public FragmentPoi(){
        //Empty constructor
    }

    public static FragmentPoi newInstance(String param1, String param2){
        FragmentPoi fragmentPoi=new FragmentPoi();
        Bundle args=new Bundle();
        //put any extra arguments that you may want to supply to this fragment
        fragmentPoi.setArguments(args);
        return fragmentPoi;
    }



}
