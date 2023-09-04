package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityLoginBinding
import com.example.quizapp.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    private var count =0
    private var score =0
    private lateinit var list:ArrayList<QuestionModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList<QuestionModel>()
        list.add(QuestionModel("Who is Vandan ?","Dev","Ops","designer","All","All"))
        list.add(QuestionModel("Who is Vivek ?","Ops","Dev","All","designer","designer"))
        list.add(QuestionModel("Who is Vandan ?","Dev","Ops","designer","All","All"))
        list.add(QuestionModel("Who is Vivek ?","Ops","Dev","All","designer","designer"))
        list.add(QuestionModel("Who is Vandan ?","Dev","Ops","designer","All","All"))
        list.add(QuestionModel("Who is Vivek ?","Ops","Dev","All","designer","designer"))
        binding.question.text = list[0].question
        binding.option1.text = list[0].option1
        binding.option2.text = list[0].option2
        binding.option3.text = list[0].option3
        binding.option4.text = list[0].option4

        binding.option1.setOnClickListener{
            nextData(binding.option1.text.toString())
        }
        binding.option2.setOnClickListener{
            nextData(binding.option2.text.toString())
        }
        binding.option3.setOnClickListener{
            nextData(binding.option3.text.toString())
        }
        binding.option4.setOnClickListener{
            nextData(binding.option4.text.toString())
        }










    }

    private fun nextData(i:String) {
        if(count<list.size){
            if(list[count].answer == i){
                score++
            }
        }
        count++;
        if(count>=list.size){
            Toast.makeText(this@QuizActivity,"Questions ended and your score is $score",Toast.LENGTH_LONG).show()
        }
        else{
        binding.question.text = list[count].question
        binding.option1.text = list[count].option1
        binding.option2.text = list[count].option2
        binding.option3.text = list[count].option3
        binding.option4.text = list[count].option4
        }
    }
}