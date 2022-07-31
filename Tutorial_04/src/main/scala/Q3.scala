object Q3 extends App {

  def toUpper(x:String):String = {
    return x.toUpperCase();
  }

  def toLower(x: String):String = {
    return x.toLowerCase();
  }

  def formatNames(name:String, func:(String)=>String):String = {
    return func(name);
  }

  println(formatNames("Benny",toUpper));
  println(formatNames("Ni",toUpper)+formatNames("roshan",toLower));
  println(formatNames("Saman",toLower));
  println(formatNames("K",toUpper)+formatNames("umar",toLower)+formatNames("A",toUpper));

}
