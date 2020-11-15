package jesustepec.com.userlist

import java.util.*

class User(
    val name: String,
    val mail: String,
    val status: UserStatus
) {

    companion object {
        fun getUsers(): ArrayList<User> {
            val usersList = ArrayList<User>()
            usersList.add(User("Tanisha Hickman", "user1@mail.com", UserStatus.ACTIVE))
            usersList.add(User("Ella Jarvis", "user2@mail.com", UserStatus.INACTIVE))
            usersList.add(User("Maggie Ortega", "user3@mail.com", UserStatus.ACTIVE))
            usersList.add(User("Jay Lara", "user4@mail.com", UserStatus.REMOVED))
            usersList.add(User("Joanna Cortez", "user5@mail.com", UserStatus.REMOVED))
            usersList.add(User("Martha Acosta", "user6@mail.com", UserStatus.PENDING))

            return usersList
        }
    }
}