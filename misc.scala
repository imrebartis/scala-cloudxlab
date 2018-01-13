def simpleInterest(principal: Int, rate: Double, duration: Int): Double = {
    if (principal < 0) {
        println("Wrong principal");
        return 0;
    }
    var interest = principal * rate * duration / 100;

    return interest;
    }

    for (x <- a) {
      println(x)
      }

    while(x > 0) {
      println(x);
      x = x -1
      }


      // HELLO WORLD

      object HelloWorld {
      def main(args: Array[String]) {
      println("Hello world!")
        }
      }

      // CLASSES

      class Person(val fname: String, val lname: String, val anage: Int) {
          val firstname: String = fname;
          val lastname:  String = lname;
          val age = anage;
          def getFullName():String = {
              return firstname + " " + lastname;
          }
      }

      val obj = new Person("Kili", "Pertti", 42)

      obj.firstname // => String = Kili
      obj.age // => Int = 42
      obj.getFullName // => String = Kili Pertti

      // singleton class:
      object Hello {
          def message(): String = {
              return "Hello!!!";
          }
      }

       Hello.message // => String = Hello!!!

// FUNCTIONS
def add(x: Int, y: Int) : Int = {
    return x + y
}

def add(x: Int, y: Int) : Int = {
     x + y // 'return' keyword is optional
}

def add(x: Int, y: Int) = x + y // curly braces optional on single line blocks

// ARRAYS
var languages = Array("Ruby", "SQL", "Python")
// => Array[String] = Array(Ruby, SQL, Python)

languages(0)
// => String = Ruby

languages(1) = "C++"
languages
// Array[String] = Array(Ruby, C++, Python)

for (x <- languages) {
      println(x)
      } 
// Ruby
// C++
// Python

//LISTS
//List in Scala represents a linked list having 
//elements such that each element has a value and pointer to the next element.

var number_list = List(1,2,3)
// => List[Int] = List(1, 2, 3)

number_list :+ 4
/ => List[Int] = List(1, 2, 3, 4)

number_list(1) = 7 // lists are immutable
// => <console>:13: error: value update is not a member of List[Int]
//      number_list(1) = 7

//SETS
// A set in Scala is a bag of data with no duplicates.
// Also, the ordering is not guaranteed in sets.

var set = Set(76, 5, 9, 1, 2)
// => scala.collection.immutable.Set[Int] = Set(5, 1, 9, 2, 76)

set = set + 20
// => scala.collection.immutable.Set[Int] = Set(5, 20, 1, 9, 2, 76)

set(5)
// => Boolean = true (since 5 is in the set)

// TUPLES
// tuples can hold elements of different data types

var t = (14, 45.69, "Australia")

// specifying there'll be 3 elements in the tuple
var t = Tuple3(14, 45.69, "Australia")

// => t: (Int, Double, String) = (14,45.69,Australia)

t._3
// => String = Australia

var (my_int, my_double, my_string) = t

// => my_int: Int = 14
// my_double: Double = 45.69
// my_string: String = Australia

// tuples are immutable:
 t._1 = 18
 // => <console>:12: error: reassignment to val
//      t._1 = 18
//           ^

// MAPS
// collection of key/value pairs
// by default immutable
// but maps can be mutable, too, with
// import scala.collection.mutable.Map

var colors = Map("red" -> "#FF0000", "yellow" -> "#FF000")
// => colors: scala.collection.immutable.Map[String,String] = Map(red -> #FF0000, yellow -> #FF000)

colors("yellow")
// => res18: String = #FF000

colors += "green" -> "#008000"
colors
// => res20: scala.collection.immutable.Map[String,String] = Map(red -> #FF0000, yellow -> #FF000, green -> #008000)

colors -= "red"
colors
// => res22: scala.collection.immutable.Map[String,String] = Map(yellow -> #FF000, green -> #008000)

for ((key, value) <- colors) {
    printf("key: %s, value: %s\n", key, value)
}
// key: yellow, value: #FF000
// key: green, value: #008000