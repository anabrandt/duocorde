package com.duocorde.app.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.duocorde.app.R
import com.duocorde.app.adapter.WordAdapter
import kotlinx.android.synthetic.main.activity_listening_exercise.*

class ListeningExerciseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listening_exercise)

        answerOptionsRecyclerView.adapter = WordAdapter() // Configura o adapter para respostas
    }
}
