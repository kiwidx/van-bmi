package com.kiwi.bmi

open class Student constructor(  //主要建構子 因為Student 內部宣告都是不可被繼承，所以用open宣告可以被別人繼承
    var name: String,
    var chinese: Int,
    var english: Int){
//    var name: String? = null 若有在開頭宣告建構子，其參數則可不用再次宣告
//    var chinese: Int = 0
//    var english: Int = 0

    fun print(){
        println("$name\t$chinese\t$english\t${average()}")
    }
    fun average(): Int = (chinese+english)/2      //回傳平均值

    fun max(a: Int,b: Int) = if(a > b) a else b
    // a method named 'highest' can return one 'highest' score of all courses
    fun highest() = if(chinese > english) chinese else english
    // a method named 'grading' can return one char for the score
    fun grading(): Char{
        var grade=when(average()/10){
            in 10..9 ->'A'
            8 -> 'B'
            7 -> 'C'
            6 -> 'D'
            else -> 'F'
        }
        return grade
    }
}


fun main(){
    var jack= Student("Jack", 79,85)  //若為jack= Student()則有送一個空的建構子
//    jack.name = "Jack"
//    jack.chinese = 79
//    jack.english = 85
//    println("${jack.name}\t${jack.chinese}\t${jack.english}")
    jack.print()


}