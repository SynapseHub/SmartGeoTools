package cd.synapsehub.smartgeotools.MaterialDesign.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by user on 8/11/15.
 */
public class FragmentSearch extends Fragment {



    public FragmentSearch(){
        //Empty constructor
    }

    public static FragmentSearch newInstance(String param1, String param2){
        FragmentSearch fragmentSearch=new FragmentSearch();
        Bundle args=new Bundle();
        //put any extra arguments that you may want to supply to this fragment
        fragmentSearch.setArguments(args);
        return fragmentSearch;
    }


}
