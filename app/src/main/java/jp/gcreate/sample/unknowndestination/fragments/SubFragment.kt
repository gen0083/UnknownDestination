package jp.gcreate.sample.unknowndestination.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import jp.gcreate.sample.unknowndestination.R
import kotlinx.android.synthetic.main.fragment_sub.*

class SubFragment : Fragment() {
    
    private val args: SubFragmentArgs by navArgs()
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        Log.d("test", "sub fragment create")
        return inflater.inflate(R.layout.fragment_sub, container, false)
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("test", "sub fragment onViewCreated")
        text_view.text = "sub: ${args.myArg}"
    }
}
