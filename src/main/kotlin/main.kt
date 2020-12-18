fun main(){
    rectangle(5,10)
    println()
    println()
    rectangle(2,1)
}

fun rectangle(rows: Int,columns: Int){
    for(i in 1..columns){
        print("*")
    }
}
