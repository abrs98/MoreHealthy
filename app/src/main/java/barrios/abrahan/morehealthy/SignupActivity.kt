package barrios.abrahan.morehealthy

import android.content.ContentValues
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import barrios.abrahan.morehealthy.databinding.ActivityLoginBinding
import barrios.abrahan.morehealthy.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignupBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signupOneFragment = SignupOneFragment()
        val signupTwoFragment = SignupTwoFragment()
        val signupThreeFragment = SignupThreeFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,signupOneFragment)
            commit()
        }

        binding.signupBtn.setOnClickListener{
            if (getSupportFragmentManager().findFragmentById() != null)
        }
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            reload();
        }
    }

    private fun reload() {
        finish();
        startActivity(getIntent());
    }

    private fun signupFirebase(usuario: String, contrasena:String) {
        auth.createUserWithEmailAndPassword(usuario, contrasena)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser
                    //updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                    //updateUI(null)
                }
            }
    }


}