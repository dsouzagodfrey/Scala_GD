def addListNumbers(numbers: List[Int]): Int = {
  var totals = 0
  for(n <- numbers){
    if (n == 7) {
      totals += (n + n)
    }
    else
    {
      totals += n
    }
  }
  return totals
}

println (addListNumbers(List(1,2,3,2,7)))
