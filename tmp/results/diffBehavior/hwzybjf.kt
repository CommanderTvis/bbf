// Different behavior happens on:JVM , JS 

fun test(i: Int): String {
    when (0) {
        (return " test1") -> {
println("WHEN (return  test1)");
0
}
        return "returnOK" -> {
println("WHEN return returnOK");
1
}
    }
    i
}

fun box(): String = "42"