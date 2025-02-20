package com.example.tabs

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabs.R

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        val cityName = context.resources.getStringArray(R.array.cities)[position]
        return PlaceholderFragment.newInstance(cityName)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getStringArray(R.array.cities)[position]
    }

    override fun getCount(): Int {
        return context.resources.getStringArray(R.array.cities).size
    }
}
