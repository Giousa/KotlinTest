package com.giousa.kotlintest.java

import com.giousa.kotlintest.ct.User

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/7
 * Time:下午11:47
 */

object HelloKotlin {

    @JvmStatic fun main(args: Array<String>) {
        val user = User(1, "giousa")
        val user2 = User(2, null)
        println(user)
        println(user2)
    }
}
