object SphereVolume {
  def main(args: Array[String]): Unit = {
    val radius = 5
    val volume = (4.0 / 3.0) * math.Pi * math.pow(radius, 3)
    println(s"The volume of a sphere with radius $radius is $volume")
  }
}
