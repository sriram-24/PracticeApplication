package calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.practiceapplication.R


class CalculatorActivity : AppCompatActivity() {

    lateinit var resultView : TextView;
    lateinit var buttonOne : Button;
    lateinit var buttonTwo : Button;
    lateinit var buttonThree : Button;


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        resultView = findViewById(R.id.textViewCalculationResult)
        buttonOne = findViewById(R.id.buttonOne)
        buttonOne = findViewById(R.id.buttonOne)


        var calculator :Calculator = Calculator();

        buttonOne.setOnClickListener{
            calculator.setOne()
            resultView.text = calculator.getReult()
        }


    }
}