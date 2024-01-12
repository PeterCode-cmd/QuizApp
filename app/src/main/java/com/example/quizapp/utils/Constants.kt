package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants
{
    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answers"

    fun getQuestions(): MutableList<Question>
    {
        val questions = mutableListOf<Question>()

        val quest1 = Question(
            1, "What country does this flag belong?",
            R.drawable.czechy, "Poland",
            "Finland",
            "Turkey",
            "Czech Republic",
            4
        )
        questions.add(quest1)

        val quest2 = Question(
            2, "What country does this flag belong?",
            R.drawable.rosja, "Ukraine",
            "France",
            "Russia",
            "Sweden",
            3
        )
        questions.add(quest2)

        val quest3 = Question(
            3, "What country does this flag belong?",
            R.drawable.francja, "Greece",
            "France",
            "Spain",
            "Ukraine",
            2
        )
        questions.add(quest3)

        val quest4 = Question(
            4, "What country does this flag belong?",
            R.drawable.ukraina, "Ukraine",
            "Poland",
            "Turkey",
            "Russia",
            1
        )
        questions.add(quest4)

        val quest5 = Question(
            5, "What country does this flag belong?",
            R.drawable.polska, "Russia",
            "Sweden",
            "Poland",
            "Czech Republic",
            3
        )
        questions.add(quest5)

        val quest6 = Question(
            6, "What country does this flag belong?",
            R.drawable.grecja, "Turkey",
            "Spain",
            "Finland",
            "Greece",
            4
        )
        questions.add(quest6)

        val quest7 = Question(
            7, "What country does this flag belong?",
            R.drawable.hiszpaina, "Spain",
            "Ukraine",
            "Sweden",
            "France",
            1
        )
        questions.add(quest7)

        val quest8 = Question(
            8, "What country does this flag belong?",
            R.drawable.turcja, "Poland",
            "Turkey",
            "Czech Republic",
            "Finland",
            2
        )
        questions.add(quest8)

        val quest9 = Question(
            9, "What country does this flag belong?",
            R.drawable.szwecja, "Sweden",
            "Poland",
            "Ukraine",
            "Russia",
            1
        )
        questions.add(quest9)

        val quest10 = Question(
            10, "What country does this flag belong?",
            R.drawable.finlandia, "Russia",
            "Greece",
            "Finland",
            "Czech Republic",
            3
        )
        questions.add(quest10)
        return questions
    }
}