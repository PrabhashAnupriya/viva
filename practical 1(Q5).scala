object RunningTime {
  def main(args: Array[String]): Unit = {
    val easyPace = 8 // minutes per km
    val tempoPace = 7 // minutes per km

    val easyPaceDistance1 = 2 // km
    val tempoPaceDistance = 3 // km
    val easyPaceDistance2 = 2 // km

    // Calculate the time for each segment
    val timeEasyPace1 = easyPace * easyPaceDistance1
    val timeTempoPace = tempoPace * tempoPaceDistance
    val timeEasyPace2 = easyPace * easyPaceDistance2

    // Calculate the total time
    val totalTime = timeEasyPace1 + timeTempoPace + timeEasyPace2

    println(s"The total running time is $totalTime minutes")
  }
}
