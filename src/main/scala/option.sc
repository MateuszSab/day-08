Option(4)
Option(null)
Option(4).getOrElse()

def example(hello: String) = {
  println(s"hello $hello")
}

example("world")

def alwaysJacek = "Jacek"

example(alwaysJacek)

def alwaysDamian = {
  "Damian"
}
example(alwaysDamian)

example({
  "Damian"
})


def excercise1(x: Option[Int]) = {
  println(x.getOrElse("nie ma wartosci"))
}

excercise1(Option(3))


Option.unless(false)("hello")
Option.when(true)("hello")


List(List(1, 2), List())

def brrr(n: Int) = {
  val x = (List()).toString() * n
  List(x)
}

brrr(5)


def trrr(n: Int) = {
  (0 until  n).map(x => List("mrr")).toList
}
trrr(3)

def srrr(n: Int) = {
  List.fill(n)(List(""))
}

List(1) == 1 :: Nil
1 :: 2 :: 3 :: Nil

class liczba
