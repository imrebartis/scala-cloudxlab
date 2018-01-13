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