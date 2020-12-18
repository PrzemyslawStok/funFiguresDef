fun main(){
    rectangle(10,7)
    println()
    println()
    rectangle(5,5)
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
    for (i in 1..a) {
        print("*")
    }
}

fun triangle(a: Int){

}
