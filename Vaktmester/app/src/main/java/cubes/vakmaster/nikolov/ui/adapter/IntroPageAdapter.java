package cubes.vakmaster.nikolov.ui.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cubes.vakmaster.nikolov.R;
import cubes.vakmaster.nikolov.ui.fragment.IntroFragment;

public class IntroPageAdapter extends FragmentPagerAdapter {


    public IntroPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
           IntroFragment fragment1 = new IntroFragment();

           fragment1.titleString = "Welcome to";
           fragment1.descriptionString = "";
           fragment1.imageResurce = R.drawable.vaktmester;

           return fragment1;
        }
        else if(position == 1){
            IntroFragment fragment2 = new IntroFragment();

            fragment2.titleString = "Title one";
            fragment2.descriptionString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
            fragment2.imageResurce = R.drawable.title_one ;

            return fragment2;
        }
        else {
            IntroFragment fragment3 = new IntroFragment();
            fragment3.titleString = "Title two";
            fragment3.descriptionString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
            fragment3.imageResurce = R.drawable.title_two ;

            return fragment3;
        }
    }
    @Override
    public int getCount() {
        return 3;
    }

}