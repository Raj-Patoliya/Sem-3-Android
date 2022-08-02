import java.util.Scanner;
fun main() {  
    println("Enter First Number : ")  
    var input: Int =Integer.valueOf(readLine())  
    println("Enter Second Number : ")  
    var input2: Int =Integer.valueOf(readLine())  

     if(input2 > input)
    {    
        println("$input2 is Greatest and $input is smallest");
    }
    else
    {
        println("$input is Greatest and $input2 is smallest")
    }
}  
