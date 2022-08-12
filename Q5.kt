fun main() {
    println("Enter First Number : ")  
    var a =readLine()  
    if (a >= 'A'&& a<= 'Z')
    {
        println("input character is in Uper case")
    }
    else if(a >= 'a'&& a<= 'z')
    {
        println("input character is in Lower case")
    }
    else
    {
        println("Input is not an alphabet")
        
    }
}
