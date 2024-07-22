object StringFilterer extends App {

def main(list: List[String]): List[String] = {
    list.filter(_.length >= 5)  // Filter out strings with length <= 5
  }

  val originalList = List("Hello", "world4", "is", "a", "large", "place")
  val filteredList = main(originalList)

  println(s"Original List: $originalList")
  println(s"Filtered List (length > 5): $filteredList")
}

