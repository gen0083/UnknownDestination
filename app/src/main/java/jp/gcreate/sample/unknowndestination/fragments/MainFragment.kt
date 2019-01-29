package jp.gcreate.sample.unknowndestination.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import jp.gcreate.sample.unknowndestination.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_1.setOnClickListener {
            Log.d("test", "onClick button 1: before navigate")
            findNavController().navigate(
                MainFragmentDirections.actionMainFragmentToSubFragment("button1"))
            Log.d("test", "onClick button 1: after navigate")
        }
        button_2.setOnClickListener {
            Log.d("test", "onClick button 2: before navigate")
            findNavController().navigate(
                MainFragmentDirections.actionMainFragmentToSubFragment("button2"))
            Log.d("test", "onClick button 2: after navigate")
        }
    }
}
