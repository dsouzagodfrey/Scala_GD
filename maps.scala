val mymap = Map(("a", 1), ("b", 2), ("c", 100), ("d", 200))
mymap("a")
mymap("D")
mymap get "d"
mymap get "D"
val mymutemap = collection.mutable.Map(("x", 1), ("y", 2))
mymutemap += ("Key1" -> 123)
mymutemap.keys
mymutemap.values