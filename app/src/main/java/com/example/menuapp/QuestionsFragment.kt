package com.example.menuapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class QuestionsFragment: Fragment(R.layout.questions_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val submitBtn = view.findViewById<Button>(R.id.submitBTN)
        val name = view.findViewById<EditText>(R.id.nameET)
        val lastName = view.findViewById<EditText>(R.id.lastNameET)
        val email = view.findViewById<EditText>(R.id.emailET)

        val navController = Navigation.findNavController(view)

        submitBtn.setOnClickListener{
            val nameTxt = name.text.toString()
            val lastNameTxt = lastName.text.toString()
            val emailTxt = email.text.toString()

            if (nameTxt.isEmpty() || lastNameTxt.isEmpty() || emailTxt.isEmpty())
                return@setOnClickListener

            val action = QuestionsFragmentDirections.actionQuestionsFragmentToAnswersFragment(nameTxt, lastNameTxt, emailTxt)
            navController.navigate(action)
        }

    }
}