object WholesaleCost {
  def main(args: Array[String]): Unit = {
    val coverPrice = 24.95
    val discount = 0.40
    val discountedPrice = coverPrice * (1 - discount)
    val numberOfCopies = 60

    // Total cost for the books
    val totalBookCost = discountedPrice * numberOfCopies

    // Shipping cost calculation
    val shippingCostFirst50 = 3.00
    val shippingCostAdditional = 0.75
    val additionalCopies = numberOfCopies - 50
    val totalShippingCost = if (additionalCopies > 0) {
      shippingCostFirst50 + additionalCopies * shippingCostAdditional
    } else {
      shippingCostFirst50
    }

    // Total wholesale cost
    val totalWholesaleCost = totalBookCost + totalShippingCost

    println(s"The total wholesale cost for $numberOfCopies copies is Rs. $totalWholesaleCost")
  }
}
