object Q1 extends App {
  def interest(deposit: Double):Double= {

    if (deposit <= 20000){
      return deposit*0.02;
    }
    else if (deposit <= 200000) {
      return deposit*0.04;
    }
    else if (deposit <= 2000000) {
      return deposit * 0.035;
    }
    else {
      return deposit * 0.065;
    }

  }
  println(interest(10000));
  println(interest(20000));
  println(interest(40000));
  println(interest(100000));
  println(interest(300000));
  println(interest(3000000));
}
