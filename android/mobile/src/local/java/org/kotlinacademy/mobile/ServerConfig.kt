package org.kotlinacademy.mobile

import org.kotlinacademy.respositories.BaseURL
import kotlinx.coroutines.experimental.android.UI as AndroidUI

fun setUpServer() {
    BaseURL = "http://10.0.2.2:8080/"
}
