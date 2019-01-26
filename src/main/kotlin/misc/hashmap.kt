package misc

fun main() {

    /*
        final Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("5", "five");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    */

    // TODO prepsat do kotlinu a pouzit "Destructuring Declarations"
    val map = mapOf(
            "1" to "one",
            "2" to "two",
            "5" to "five")
    for ((key, value) in map)
        println("$key:$value")

}