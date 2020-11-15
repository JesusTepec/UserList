package jesustepec.com.userlist

import java.util.*

class User(
    val name: String,
    val mail: String,
    val created_at: Date,
    val status: UserStatus
) {

    companion object {
        fun getUsers(): ArrayList<User> {
            val usersList = ArrayList<User>()
            usersList.add(User("Jesus", "user1@mail.com", Date(), UserStatus.ACTIVE))
            usersList.add(User("Jesus Antonio Tepec", "user1@mail.com", Date(), UserStatus.INACTIVE))

            return usersList
        }
    }
}