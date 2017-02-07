package com.giousa.kotlintest.ct3;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/8
 * Time:上午12:55
 */

public class ConsoleParamJava {

    public static void main(String[] args) {
        for (String arg: args){
            String[] splits = arg.split("_");

            for (String split:splits) {
                System.out.print(split);
                System.out.print(" ");
            }

        }
    }
}
