package advanced.interoperability.lambda

fun foo(text: String, operation: (String) -> String) = operation(text)
