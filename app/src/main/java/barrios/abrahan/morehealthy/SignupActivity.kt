package barrios.abrahan.morehealthy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import barrios.abrahan.morehealthy.R

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        var signup_btn = findViewById<Button>(R.id.signin_btn)

        signup_btn.setOnClickListener {
            setContentView(R.layout.activity_signup2)
        }
    }
}