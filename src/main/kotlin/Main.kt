fun main(args: Array<String>) {

   /* i)Create a string variable access the third character  then loop through it and print it in a vertical order.
   ii)get the length of the string
    iii) use an inbuilt function to the created string "its possible"
     2 Create a string  that cannot be changed.
     3 Write a function that takes in a parameter, if seven it prints out neutral if not prints base otherwise acidic.
      4 Create a function that takes in an array and find the largest number.
       5 Create a function that prints this in grammatical order  var names= array of("anita"b," adalab", "hopperlab", "rwanda", "kenya", "tanzania"
        6 create a class called Human with the properties name gender color height and weight.
        i) create two functions one called rest and the other one identity. function rest prints out "sleep eight hours and   am female and my name is Phelisia."*/
    //create a data class called book with properties author title pages published year create one object

    var text = "i love candy"
    println(text[2])
    for (x in text){
        println(x)
    }
    println(text.length)
    val sentence = "Amazon forest is in Brazil"


    chemicals()
    numbers()
    names()
}
fun chemicals(){
    var pigments = 7

    if (pigments.equals (7)) {

        println("neutral")
    }
        else {
            println("acidic")
        }


}
fun numbers(){
    var numbers = arrayOf(34,56,98,780,450,432)
    println(numbers.max())

}

fun names(){
    var names = arrayOf("anita b"," adaLab", "hopperLab", "rwanda", "kenya", "tanzania")
    names.sort()
    println(names.sortedArray().contentToString())
}

class Human( var name:String, var gender:String, var color:String, var height:Int,var weight:Int){
    fun rest(){
        println("sleep")
    }
}

