fun main() {
    print("\n\tEnter The value of A : ")
    var a:Int = Integer.valueOf(readLine())
    print("\n\tEnter The value of B : ")
    var b:Int = Integer.valueOf(readLine())
    print("\n\t Before Swap..")
    print("\n\t A : "+a)
    print("\n\t B : "+b)    
    a = a + b
    b = a - b
    a = a - b
    print("\n\t After Swap..")
    print("\n\t A : "+a)
    print("\n\t B : "+b)
}
