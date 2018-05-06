package com.example.android.timisoaratourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/* Provides the appropriate  Fragment for a view pager.
 *  CategoryAdapter is a FragmentPagerAdapter that can provide the layout for
 * each list item based on a data source which is a list of Word objects.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /* Create a new CategoryAdapter object.
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     * across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    // Return the Fragment that should be displayed for the given page number.
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ParkFragment();
        } else if (position == 1){
            return new RestaurantFragment();
        } else if (position == 2) {
            return new MuseumFragment();
        } else if (position == 3){
            return new IndoorPlaygroundFragment();
        } else return new KidsSportFragment();
    }

    //Return the total number of pages.
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_parks);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurant);
        } else if (position == 2) {
            return mContext.getString(R.string.category_museum);
        } else if (position == 3) {
            return mContext.getString(R.string.category_indoorplay);
        } else {
            return mContext.getString(R.string.category_kidssport);
        }
    }
}

