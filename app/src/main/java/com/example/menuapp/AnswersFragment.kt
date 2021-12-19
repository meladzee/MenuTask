package com.example.menuapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class AnswersFragment: Fragment(R.layout.answers_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.nameAns).text = AnswersFragmentArgs.fromBundle(requireArguments()).argName.toString()
        view.findViewById<TextView>(R.id.lastNameAns).text = AnswersFragmentArgs.fromBundle(requireArguments()).argLastName.toString()
        view.findViewById<TextView>(R.id.emailAns).text = AnswersFragmentArgs.fromBundle(requireArguments()).argEmail.toString()
    }
}