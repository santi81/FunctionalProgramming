

object nqueens {
  def queens(n : Int): Set[List[Int]] = {
    def placeQueens(k: Int): Set[List[Int]] =
      if (k == 0) Set(List())
      else
        for {
          queens <- placeQueens(k - 1)
          col <- 0 until n
          if isSafe(col,queens)
        } yield col :: queens
    placeQueens(n)
  }

  def isSafe(col: Int,queens: List[Int]): Boolean = {
    val row = queens.length
    val queensWithRows = (row - 1 to 0 by -1) zip queens

    val result = queensWithRows forall {
      case(r,c) => col != c && math.abs(col - c) != row - r
    }
    result
  }
  def show(queens : List[Int]) = {

    val lines =
    for ( col <- queens.reverse)
      yield Vector.fill(queens.length)("* ").updated(col,"X ").mkString
    lines mkString "\n"
  }
  (queens(8) take 3 map show) mkString "\n\n"
}

