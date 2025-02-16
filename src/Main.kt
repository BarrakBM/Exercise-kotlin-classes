// Task 1
class Book constructor(
    var title: String,
    var author: String,
    var yearPublished: Int,
    var genre: String){
//    var title: String =""
//    var author: String = ""
//    var yearPublished: Int = 0
    fun getBookInfo(){
        println("$title by $author ($yearPublished) genre: $genre" )
    }

}

fun main() {
    // Task 1
    val book1 = Book("Atomic habits", "James Clear", 2018, "self help book")
    book1.getBookInfo()


}