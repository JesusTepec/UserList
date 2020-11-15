package jesustepec.com.userlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpList()
    }

    private fun setUpList() {
        val adapter = UsersAdapter(User.getUsers())
        usersList.adapter = adapter
        usersList.layoutManager = LinearLayoutManager(this)
    }


}
