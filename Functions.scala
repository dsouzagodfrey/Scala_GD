def AddNumbers(number1:Int, number2:Int): Int = {
  return number1 + number2
}
AddNumbers(3,2)
def greetname(name:String): String={
  return s"Hello $name"
}
greetname("World")
def isPrime(numbercheck:Int):Boolean={
  for (n <- Range(2,numbercheck)){
    if(numbercheck % 2 == 0){
      return false
    }
  }
  return true
}

println(isPrime(3))
println(isPrime(4))

val numbers = List(1,2,3,4,5,6)

def numcheck(nums:List[Int]):List[Int]={
  return numbers
}
println(numcheck(numbers))
