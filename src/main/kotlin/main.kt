fun main(){
    /*rectangle(10,7)
    println()
    println()
    rectangle(5,5)
    println()*/

    triangle(10,5)
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

}
