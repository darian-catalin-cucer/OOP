package cucerdariancatalin.oop.test

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailNuclearActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME         = "extra_name"
        const val EXTRA_DETAIL       = "extra_detail"
        const val EXTRA_COUNTRY      = "extra_country"
        const val EXTRA_CONSTRUCTION = "extra_construction"
        const val EXTRA_DECOMMISSION = "extra_decommission"
        const val EXTRA_CAPACITY     = "extra_capacity"
        const val EXTRA_UNIT         = "extra_unit"
        const val EXTRA_IMAGE        = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_nuclear)

        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        val tvDetailReceived:       TextView  = findViewById(R.id.tv_detail_received)
        val tvCountryReceived:      TextView  = findViewById(R.id.tv_country_received)
        val tvConstructionReceived: TextView  = findViewById(R.id.tv_construction_received)
        val tvDecommissionReceived: TextView  = findViewById(R.id.tv_decommission_received)
        val tvCapacityReceived:     TextView  = findViewById(R.id.tv_capacity_received)
        val tvUnitReceived:         TextView  = findViewById(R.id.tv_unit_received)
        val imgDetailReceived:      ImageView = findViewById(R.id.img_item_photo)

        val name         = intent.getStringExtra(EXTRA_NAME)
        val detail       = intent.getStringExtra(EXTRA_DETAIL)
        val country      = intent.getStringExtra(EXTRA_COUNTRY)
        val construction = intent.getStringExtra(EXTRA_CONSTRUCTION)
        val decommission = intent.getStringExtra(EXTRA_DECOMMISSION)
        val capacity     = intent.getStringExtra(EXTRA_CAPACITY)
        val unit         = intent.getStringExtra(EXTRA_UNIT)
        val image        = intent.getIntExtra(EXTRA_IMAGE, 0)

        tvDetailReceived.text       = detail
        tvCountryReceived.text      = country
        tvConstructionReceived.text = construction
        tvDecommissionReceived.text = decommission
        tvCapacityReceived.text     = capacity
        tvUnitReceived.text         = unit
        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(imgDetailReceived)

        actionBar.title = name
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}