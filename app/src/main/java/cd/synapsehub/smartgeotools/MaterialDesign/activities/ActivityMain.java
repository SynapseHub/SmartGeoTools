package cd.synapsehub.smartgeotools.MaterialDesign.activities;


import android.app.job.JobScheduler;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import cd.synapsehub.smartgeotools.MaterialDesign.fragments.FragmentDrawer;
import cd.synapsehub.smartgeotools.MaterialDesign.fragments.FragmentGeoMap;
import cd.synapsehub.smartgeotools.MaterialDesign.fragments.FragmentPoi;
import cd.synapsehub.smartgeotools.MaterialDesign.fragments.FragmentSearch;
import cd.synapsehub.smartgeotools.R;
import it.neokree.materialtabs.MaterialTab;
import it.neokree.materialtabs.MaterialTabHost;
import it.neokree.materialtabs.MaterialTabListener;

/**
 * Created by user on 8/11/15.
 */
public class ActivityMain extends AppCompatActivity implements MaterialTabListener, View.OnClickListener{


    //Here i will declare some int variable corresponding for differents tab
    public static final int TAB_SEARCH_RESULTS=0;
    public static final int TAB_MAP=1;
    public static final int TAB_POI=2;
    public static final int TAB_COUNT = 4;


    //Run the JobSchedulerService every 2 minutes
    private JobScheduler mJobScheduler;
    private Toolbar myToolbar;
    //Layout including Toolbar and the tabs
    private ViewGroup mContainerToolbar;
    private MaterialTabHost mTabhost;
    private ViewPager mPager;
    private ViewPagerAdapter mAdapter;
    private FloatingActionButton mFAB;
    private FloatingActionMenu mFABMenu;
    private FragmentDrawer mDrawerFragment;


    @Override
    public void onTabSelected(MaterialTab materialTab) {

    }

    @Override
    public void onTabReselected(MaterialTab materialTab) {

    }

    @Override
    public void onTabUnselected(MaterialTab materialTab) {

    }

    @Override
    public void onClick(View view) {

    }

    private  class ViewPagerAdapter extends FragmentStatePagerAdapter{

        int icons[]={

        };

        FragmentManager fragmentManager;

        public ViewPagerAdapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
            fragmentManager = fm;
        }

        public Fragment getItem(int num) {
            Fragment fragment = null;
//            L.m("getItem called for " + num);
            switch (num) {
                case TAB_SEARCH_RESULTS:
                    fragment = FragmentSearch.newInstance("", "");
                    break;
                case TAB_MAP:
                    fragment = FragmentGeoMap.newInstance("", "");
                    break;
                case TAB_POI:
                    fragment = FragmentPoi.newInstance("", "");
                    break;
            }
            return fragment;

        }

        @Override
        public int getCount() {
            return TAB_COUNT;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return  getResources().getStringArray(R.array.tabs)[position];
        }

        private Drawable getIcon(int position) {
            return getResources().getDrawable(icons[position]);
        }

    }







}
