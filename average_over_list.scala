
def average(numbers: List[Double]): Option[Double] =
  if numbers.isEmpty then None
  else Some(numbers.sum / numbers.length)
@main
def run(): Unit =
// Example Usage:
    val nums = List(10.0, 20.0, 30.0, 40.0)
    val result = average(nums)
    result match
    case Some(avg) => println(s"The average is $avg")
    case None => println("Error, list is empty.")
