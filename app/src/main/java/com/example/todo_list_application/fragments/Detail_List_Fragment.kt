package com.example.todo_list_application.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todo_list_application.R
import com.example.todo_list_application.databinding.FragmentDetailListBinding


/**
 * A simple [Fragment] subclass.
 * Use the [Detail_List_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Detail_List_Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private val binding: FragmentDetailListBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail__list_, container, false)
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment Detail_List_Fragment.
//         */
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            Detail_List_Fragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
    }
