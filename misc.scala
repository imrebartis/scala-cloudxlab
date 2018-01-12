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


