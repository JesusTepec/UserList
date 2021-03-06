package jesustepec.com.userlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class UsersAdapter(private val usersList: ArrayList<User>) :
    RecyclerView.Adapter<UsersAdapter.UserViewHolder>() {

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName: TextView = itemView.findViewById(R.id.txtName)
        val txtMail: TextView = itemView.findViewById(R.id.txtMail)
        val txtStatus: TextView = itemView.findViewById(R.id.txtStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val item = usersList[position]
        holder.txtName.text = item.name
        holder.txtMail.text = item.mail
        holder.txtStatus.text = item.status.text
        holder.txtStatus.setBackgroundColor(item.status.color)
    }

    override fun getItemCount(): Int {
        return usersList.size
    }

    fun formatDate(date: Date): String {
        val format = SimpleDateFormat("dd/MM/yyy", Locale.getDefault())
        return format.format(date)
    }


}