package com.kiwi.bmi

import java.lang.Exception
import kotlin.random.Random

fun main(){
    /*老師寫的猜１到１００
    var min = 1
    var max = 100
    val secret: Int = Random.nextInt(100)+1
    println(secret)
    var num = 0
    while(num != secret){
        println("Please enter a number between " + min + " and " + max)
        num = readLine()!!.toInt()
        if(num > secret){
            max = num
        }else if(num < secret){
            min =num
        }else if(num == secret){
            println("You got it!")
        }
    }*/
/*
    var min = 1
    var max = 100
    val secret: Int = Random.nextInt(100)+1
    println(secret)
    var num = 0
    while(num != secret){
        println("Please enter a number between " + min + " and " + max)
        readLine()?.let {
            num = it.toInt()  //使用let讓num去讀取可能有空值的輸入
            if(num > secret){
                max = num
            }else if(num < secret){
                min =num
            }else{
                println("You got it!")
            }
        }

    }
 */
    var min = 1     //設定猜數字範圍在１至１００之間
    var max = 100
    var times = 0   //計算猜的次數
    var num = 0
    var secret: Int = Random.nextInt(100)+1
    println("終極密碼(最多猜6次)： ")
    while(num != secret){
        println("Please enter a number between " + min + " and " + max)
        times++
        println("第 " + times + " 次輸入：")
        num = readLine()!!.toInt()
        if(num > max || num < min){     //輸入num超出目前猜數字的範圍
            println("input error")
        }else{      //正常輸入
            if(num > secret){
                max = num
            }else if(num < secret){
                min =num
            }else if(num == secret){
                println("You got it!")
            }
            if(num != secret && times >= 6){
                println("You have failed!!")
                println("正解: " + secret)
                break
            }
        }
    }
}