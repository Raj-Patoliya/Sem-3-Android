fun main() {
    print("\n\tEnter The Number : ")
    var size:Int = Integer.valueOf(readLine())
    print("\n\tTable of "+size)
    
    for(x in 1..10)
    {
        println( " "+size +" * "+x+" = "+(x*size))
    }
}
