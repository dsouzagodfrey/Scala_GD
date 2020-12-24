def checkEven(number1: Int): Boolean={
    return number1%2 == 0
}
println(checkEven(2))
println(checkEven(3))

//Function definition in a single line
def checkEven2(number1: Int)= number1%2 == 0
println(checkEven2(2))
println(checkEven2(3))

def checkEvensInList(Numbers: List[Int]): Boolean = {
  for (n <- Numbers){
    if (n % 2 == 0){
      return true
    }
  }
  return false
}
println (checkEvensInList(List(1,3,5)))
println (checkEvensInList(List(1,3,5,7,8,9)))
