package cucerdariancatalin.oop.test

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListNuclearAdapter(private val listNuclear: ArrayList<Nuclear>) : RecyclerView.Adapter<ListNuclearAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Nuclear)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName:   TextView  = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView  = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_nuclear, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val nuclear = listNuclear[position]

        Glide.with(holder.itemView.context)
            .load(nuclear.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text   = nuclear.name
        holder.tvDetail.text = nuclear.detail

        holder.itemView.setOnClickListener {
            // onItemClickCallback.onItemClicked(listNuclear[holder.adapterPosition])

            val intent = Intent(holder.itemView.context, DetailNuclearActivity::class.java).apply {
                putExtra(DetailNuclearActivity.EXTRA_NAME,         nuclear.name)
                putExtra(DetailNuclearActivity.EXTRA_DETAIL,       nuclear.detail)
                putExtra(DetailNuclearActivity.EXTRA_IMAGE,        nuclear.photo)
                putExtra(DetailNuclearActivity.EXTRA_COUNTRY,      nuclear.country)
                putExtra(DetailNuclearActivity.EXTRA_CONSTRUCTION, nuclear.construction)
                putExtra(DetailNuclearActivity.EXTRA_DECOMMISSION, nuclear.decommission)
                putExtra(DetailNuclearActivity.EXTRA_CAPACITY,     nuclear.capacity)
                putExtra(DetailNuclearActivity.EXTRA_UNIT,         nuclear.unit)
            }
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listNuclear.size
    }
}