object FibonacciSequence {

  // Recursive function to calculate the nth Fibonacci number
  def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  // Helper function to print Fibonacci numbers recursively
  def printFibonacciHelper(current: Int, n: Int): Unit = {
    if (current < n) {
      print(s"${fibonacci(current)} ")
      printFibonacciHelper(current + 1, n)
    } else {
      println() // Newline for better output format
    }
  }

  // Function to print the first n Fibonacci numbers using the helper
  def printFibonacci(n: Int): Unit = {
    printFibonacciHelper(0, n)
  }

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine("Enter the number of Fibonacci numbers to print: ").toInt
    println(s"The first $n Fibonacci numbers are:")
    printFibonacci(n)
  }
}
