package bez.dev.logutils

import android.util.Log

object KL {

    private const val TAG = "AWESOME_APP"

    fun d(message: String) {
        Log.d(TAG, message)
    }

    fun e(message: String) {
        Log.e(TAG, message)
    }

    fun i(message: String) {
        Log.i(TAG, message)
    }

    fun v(message: String) {
        Log.v(TAG, message)
    }

    fun w(message: String) {
        Log.w(TAG, message)
    }

}
