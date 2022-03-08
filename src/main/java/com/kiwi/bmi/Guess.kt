package com.kiwi.bmi

import kotlin.random.Random

fun main(){
    val secret: Int = Random.nextInt(10)+1
    println(secret)
    while (true){
        println("Please enter a number(1-10):")
        val s = readLine()
        val number = s!!.toInt()  //雙!!為了讓可能有null的變數可以執行1
        if(number > secret){
            println("Smaller")
        }else if (number < secret){
            println("Bigger")
        }else{
            println("You got it!")
            break;
        }
    }

}
class Guess {
}