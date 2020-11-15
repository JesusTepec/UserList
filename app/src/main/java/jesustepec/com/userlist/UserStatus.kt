package jesustepec.com.userlist

import android.graphics.Color

enum class UserStatus(val code: Int, val text: String, val color: Int) {

    ACTIVE(1, "Active", Color.parseColor("#1AAD5C")),
    PENDING(2, "Pending", Color.parseColor("#E0C955")),
    INACTIVE(3, "Inactive", Color.parseColor("#767B7E")),
    REMOVED(4, "Removed", Color.parseColor("#E41C1B"));

}