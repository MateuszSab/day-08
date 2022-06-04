List(2, 4, 6, 8, 10).filter(_ < 3)

val f: (String, Int) => String = { (s, n) => s"$s + $n" }
List(1, 2, 3).foldLeft(z = "")(f).drop(2)


List(1, 2, 3).foldLeft("")((s, n) => s"$s + $n").drop(2)


List(1, 2, 3, 4).reduce((a, b) => a % b)