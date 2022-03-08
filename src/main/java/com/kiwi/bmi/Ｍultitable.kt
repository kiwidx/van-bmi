package com.kiwi.bmi

fun main(){
    for(i in 1..9){
        for(j in 1..9){
            print("${if (i*j < 10) " " else ""}${i*j}\t") //if..else也能當表達式
        }
        println()
    }
//    for(x in 1..9){
//        for(y in 1..9){
//            var multi = x * y
//            println(multi)
//        }
//        println()
//    }
}
class Ｍultitable {
}