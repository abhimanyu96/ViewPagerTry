package com.example.viewpagertry;

import com.example.fragments.Fragment1;
import com.example.fragments.Fragment2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter{

	public FragmentAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Fragment getItem(int pos) {
		// TODO Auto-generated method stub
		switch (pos) {
		case 0:
			return new Fragment1();
		case 1:
			return new Fragment2();
		}
		return null;
	}
	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		switch (position) {
		case 0:
			return "1";
		case 1:
			return "2";

		}
		return super.getPageTitle(position);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}

}
