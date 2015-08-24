package cd.synapsehub.smartgeotools.MaterialDesign.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by user on 8/11/15.
 */
public class FragmentGeoMap extends Fragment {



    public FragmentGeoMap(){
        //Empty constructor
    }

    public static FragmentGeoMap newInstance(String param1, String param2){
        FragmentGeoMap fragmentGeoMap=new FragmentGeoMap();
        Bundle args=new Bundle();
        //put any extra arguments that you may want to supply to this fragment
        fragmentGeoMap.setArguments(args);
        return fragmentGeoMap;
    }



}
