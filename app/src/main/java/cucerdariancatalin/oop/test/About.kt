package cucerdariancatalin.oop.test

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionBar = supportActionBar
        actionBar!!.title = "About"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tvEmail:         TextView = findViewById(R.id.tv_url_email)
        val btnLinkedIn:     Button   = findViewById(R.id.btn_url_linkedin)
        val btnGitHub:       Button   = findViewById(R.id.btn_url_github)
        val tvStackOverflow: TextView = findViewById(R.id.tv_url_stackoverflow)

        tvEmail.setOnClickListener(this)
        btnLinkedIn.setOnClickListener(this)
        btnGitHub.setOnClickListener(this)
        tvStackOverflow.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_url_email -> {
                val link = "mailto:cucerdariancatalin@gmail.com"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }

            R.id.btn_url_linkedin -> {
                val link = "https://www.linkedin.com/in/cucerdariancatalin"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }

            R.id.btn_url_github -> {
                val link = "https://github.com/cucerdariancatalin"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }

        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
