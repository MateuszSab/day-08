class Liczba(val x: Int) {
  def followedBy(that: Liczba) = {
    s"${this.x},${that.x}"
  }

  def ::(that: Liczba) = {
    s"${this.x},${that.x}"
  }
}

object Liczba {
  def apply(x: Int): Liczba = new Liczba(x)
}


Liczba(1) followedBy Liczba(2)
Liczba(1) :: Liczba(2)
// wynik 1,2

// wynik 2,1