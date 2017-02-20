package recursivity

import scala.annotation.tailrec

object Parenthesis {

  def balance(chars: List[Char], acc: Int = 0): Boolean =
    if (acc < 0 || chars.isEmpty && acc > 0)
      false
    else if (chars.isEmpty && acc == 0)
      true
    else if (chars.head == '(')
      balance(chars.tail, acc + 1)
    else if (chars.head == ')')
      balance(chars.tail, acc - 1)
    else
      balance(chars.tail, acc)
}