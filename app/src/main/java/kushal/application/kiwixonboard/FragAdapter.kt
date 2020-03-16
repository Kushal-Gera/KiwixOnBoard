package kushal.application.kiwixonboard

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragAdapter(fm: FragmentManager, behavior: Int) : FragmentPagerAdapter(fm, behavior) {
    override fun getItem(position: Int): Fragment {

        when (position) {
            0 -> return Frag1()
            1 -> return Frag2()
            else -> return Frag3()
        }

    }

    override fun getCount(): Int = 3
}