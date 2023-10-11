package kz.just_code.guessnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kz.just_code.guessnumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val correctNumber = (0..10).random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener {
            val userGuess = binding.inputView.text.toString().toIntOrNull()
            if (userGuess != null) {
                if (userGuess == correctNumber) {
                    binding.mainText.text = "Поздравляю вы угадали число"
                } else {
                    binding.mainText.text = "Попробуйте еще раз!"
                }

            } else {
                binding.mainText.text = "Введенные данные неправильные"
            }
        }
    }

}