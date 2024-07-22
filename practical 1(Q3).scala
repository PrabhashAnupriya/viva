object TemperatureConverter {
  def main(args: Array[String]): Unit = {
    val celsius = 35
    val fahrenheit = celsius * 1.8 + 32
    println(s"The temperature $celsius°C is equal to $fahrenheit°F")
  }
}
