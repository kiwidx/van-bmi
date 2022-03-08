import com.kiwi.bmi.Student

class GraduatedStudent(name: String,chinese: Int,english: Int)
        : Student(name,chinese,english){        //三種建構子
            constructor(name: String): this(name,0,0)
            constructor():this("",0,0)
}

fun main(){
    var jenny = GraduatedStudent("Jenny",70,90)
    jenny.print()
}