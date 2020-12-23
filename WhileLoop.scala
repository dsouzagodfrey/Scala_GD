import util.control.Breaks._
//class simple_calss(){
//  def simple_function(): Unit = {
    var v = 0
    while (v < 10){
      println(s"current value is $v ")
      v +=1
    }

    var y=0
    while (y<10){
      println(s"y is currently $y")
      y += 1
      if (y==3) break
    }
//  }
//}
