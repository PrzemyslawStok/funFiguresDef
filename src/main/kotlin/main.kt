fun main(){
    /*rectangle(10,7)
    println()
    println()
    rectangle(5,5)
    println()*/

    //triangle(10,5)

    for(i in 1..5)
        triangle(5+i)
}

fun rectangle(rows: Int,columns: Int){

    for(j in 1..rows) {

        for (i in 1..columns) {
            print("*")
        }

        println()
    }
}

fun triangle(a: Int, h: Int){
    val myStep = 2

    for(j in 1..a) {
        for (i in 1..a-j) {
            print("*")
        }

        println()
    }

    /*println("*****************") //a gwiazdek
    println("****************")  //a-1 gwiazdek
    println("***************")
    println("**************")
    println("*************")
    println("************")*/

}

fun triangle(a: Int){
    for(j in a-1 downTo 1) {

        for(k in j+a downTo 0)
            print(" ")

        for (i in 1..a-j) {
            print("*")
        }

        for (i in 1..a-j) {
            print("*")
        }

        println()
    }
}
