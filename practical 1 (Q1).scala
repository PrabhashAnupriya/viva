object DiskArea {
  def main(args: Array[String]): Unit = {
    val radius = 5
    val area = math.Pi * math.pow(radius, 2)
    println(s"The area of a disk with radius $radius is $area")
  }
}
