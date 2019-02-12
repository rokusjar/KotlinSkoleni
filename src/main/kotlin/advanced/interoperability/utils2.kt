@file:JvmName("BookUtils")
@file:JvmMultifileClass
package advanced.interoperability

fun Book.printAuthorAndTitle() = println("${this.title}, ${this.author}")
