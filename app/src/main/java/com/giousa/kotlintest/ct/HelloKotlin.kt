package com.giousa.kotlintest.ct

/**
 *
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/7
 * Time:下午11:51
 *
 */

fun main(args: Array<String>){
    val user = User(1, "giousa")
    val user2 = User(2, null)
    println(user)
    println(user2)
    HelloKotlin::class.constructors.map { user }
}

class HelloKotlin{
    fun hello(){

    }
}
