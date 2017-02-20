package recursivity

import scala.annotation.tailrec

object CountChange {

  def countChange(money: Int, coins: List[Int], first: Int = 0): Int = {
    
    if (money == 0 && first != 0)
      1
    else if (money > 0 && !coins.isEmpty)
      countChange(money - coins.head, coins, 1) + countChange(money, coins.tail, 1)
    else
      0
  }

}