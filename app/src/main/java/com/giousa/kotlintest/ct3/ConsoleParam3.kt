package com.giousa.kotlintest.ct3

/**
 *
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/8
 * Time:上午12:54
 *
 * map:类似foreach 的方法
 * flatMap:返回一个可迭代的返回值
 */

fun main(vararg args: String){
    args.flatMap {

        it.split("_")

    }.map {

//        print("$it ")
        println("$it ${it.length}")
    }
}