/* Online Kotlin Compiler */
fun main() {
    print("\n\tEnter The Number : ")
    var size:Int = Integer.valueOf(readLine())
    print("\n\tTable of "+size)
    print("\n\t0 1 ")
    var t1:Int = 0
    var t2:Int = 1
    var temp:Int = t1 + t2
    for(x in 1..size)
    {
        print(" "+temp+" ")
        t1  =t2
        t2 = temp
        temp = t1+t2
    }
}
