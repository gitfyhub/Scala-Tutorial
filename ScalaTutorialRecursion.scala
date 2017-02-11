import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial
{
	def main(args: Array[String])
    {
        def factorial(num : BigInt) : BigInt =
        {
            if (num <= 1)
                1
            else
                num * factorial(num - 1)
        }

        println("Factorial of 4 = " + factorial(4))

        // 1st : num = 4 * factorial(3) = 4 * 6 = 24
        // 2nd : num = 3 * factorial(2) = 3 * 2 = 6
        // 3rd : num = 2 * factorial(1) = 2 * 1 = 2

	}
}