package android.viratara.com.ticktick

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spalsh_activity)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
        }, 3000)

    }
}
