package cd.synapsehub.smartgeotools.MaterialDesign.fragments;

import android.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import cd.synapsehub.smartgeotools.MaterialDesign.adapters.AdapterDrawer;

/**
 * Created by user on 8/11/15.
 */
public class FragmentDrawer extends Fragment{


    public static final String KEY_USER_DRAWER="user_drawer";
    private RecyclerView mRecyclerDrawer;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private AdapterDrawer mAdapter;
    private boolean mUserLearnedDrawer;
    private boolean mFromSavedInstanceState;
    private View mContainer;
    private boolean mDrawerOpened=false;

    public FragmentDrawer(){
        //Empty constructor required
    }




}
