package misc

import java.util.*

fun main() {

    val list = Arrays.asList("word", "home", "one")
    val filterList = ArrayList<String>()
    for (item in list) {
        if (item == null) continue
        if (item.length % 2 == 0)
            filterList.add(item)
    }
    println(filterList)

    // TODO kod je napsan v java stylem - ukol je upravit/zjednodusit kod pouzitim kotlin funkci
    // tips: filter, filterNotNull, listOf

}