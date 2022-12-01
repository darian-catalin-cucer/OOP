package cucerdariancatalin.oop.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvNuclears: RecyclerView
    private var list: ArrayList<Nuclear> = arrayListOf()
    private var title: String = "Nuclear Power Plant"

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvNuclears = findViewById(R.id.rv_nuclears)
        rvNuclears.setHasFixedSize(true)

        list.addAll(NuclearsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvNuclears.layoutManager = LinearLayoutManager(this)
        val listNuclearAdapter = ListNuclearAdapter(list)
        rvNuclears.adapter = listNuclearAdapter

        listNuclearAdapter.setOnItemClickCallback(object : ListNuclearAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Nuclear) {
                showSelectedNuclear(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvNuclears.layoutManager = GridLayoutManager(this, 2)
        val gridNuclearAdapter = GridNuclearAdapter(list)
        rvNuclears.adapter = gridNuclearAdapter

        gridNuclearAdapter.setOnItemClickCallback(object : GridNuclearAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Nuclear) {
                showSelectedNuclear(data)
            }
        })
    }

    private fun showRecyclerCardView() {
        rvNuclears.layoutManager = LinearLayoutManager(this)
        val cardViewNuclearAdapter = CardViewNuclearAdapter(list)
        rvNuclears.adapter = cardViewNuclearAdapter
    }

    private fun showSelectedNuclear(nuclear: Nuclear) {
        Toast.makeText(this, nuclear.name, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.list_mode -> {
                title = "Nuclear Power Plant"
                showRecyclerList()
            }

            R.id.grid_mode -> {
                title = "Nuclear Power Plant (Picture)"
                showRecyclerGrid()
            }

            R.id.cardview_mode -> {
                title = "Nuclear Power Plant (Detail)"
                showRecyclerCardView()
            }

            R.id.about -> {
                val aboutIntent = Intent(this@MainActivity, About::class.java)
                startActivity(aboutIntent)
            }
        }
        setActionBarTitle(title)
    }
}