object Q2 extends App {

  def patternMatching(x:Int):String = x match {
    case y if y<=0 => "Negative/Zero";
    case y if y%2==0 => "Even";
    case _ => "Odd";
  }

  println("Input an integer: ");
  val input = scala.io.StdIn.readInt();
  println(patternMatching(input));

}
