package advanced.interoperability

data class Book(val title: String,
                val author: String = "Unknown",
                val pages: Int? = null,
                var signed: Boolean = false)
