package jesustepec.com.userlist

import android.graphics.Color

enum class UserStatus(val code: Int, val text: String, val color: Int) {

    ACTIVE(1, "Active", Color.BLUE),
    PENDING(2, "Pending", Color.GREEN),
    INACTIVE(3, "Inactive", Color.GRAY),
    REMOVED(4, "Removed", Color.RED);

}