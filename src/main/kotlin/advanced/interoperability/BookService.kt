package advanced.interoperability

object BookService {

    @JvmStatic
    fun sign(book: Book) {
        book.signed = true
    }
}
