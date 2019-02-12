package advanced.interoperability

data class Book @JvmOverloads constructor(val title: String,
                                          val author: String = "Unknown",
                                          @JvmField val pages: Int? = null,
                                          var signed: Boolean = false) {
    companion object {
        @JvmField
        val SOME_CONSTANT = "XYZ"
    }
}
