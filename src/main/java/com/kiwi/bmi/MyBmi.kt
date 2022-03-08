package com.kiwi.bmi

fun main(){
//    println("Hello world!")
    val p = Person()
    p.hello()
    //variable var可以多次改變 val只能定義初值，不可修改
    var age = 18
    println(age)
    age = 21
    println(age)

    val weight: Float= 74.5f //冒號＋變數型態為期望能為ＸＸ型態
    val height = 1.61f //不打f其資料型態為double
    val bmi = weight/(height*height)
    println(bmi)

    //var name = ""此時name身上為空字串，也可以var name = null
    var name: String?= null //若初值為空，則必須定義其資料型態，否則後面變數使用會錯亂
    name = "Hank"
    println(name)

}