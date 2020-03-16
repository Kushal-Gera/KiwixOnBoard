package kushal.application.kiwixonboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_frag2.view.*

/**
 * A simple [Fragment] subclass.
 */
class Frag2 : Fragment() {

    lateinit var vieww: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vieww = inflater.inflate(R.layout.fragment_frag2, container, false)

        vieww.frame.animate().translationYBy(-40f).alpha(1f).duration = 1600

        return vieww
    }

}
