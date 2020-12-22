//for loops
//iterate through a list
//println("Hello")

for (item <- List(10,20)){
  println(item)
}

//iterate through an Array
for (item <- Array.range(100,120)){
  println(item)
}

//iterate through a Set
for (item <- Set(10,20, 30, 40 ,50)){
  println(item)
}

//iterate through an Array
for (item <- Array.range(1, 10)){
  if(item %2 == 0){
    println(s"$item is even")
  }else{
    println(s"$item is odd")
  }
}

val names = List("John", "Sandeep", "Kunj", "Dhivya", "Mehmet", "Chuks")
for( name <- names){
  if(name.startsWith("C")){
    println(name)
  }
}
