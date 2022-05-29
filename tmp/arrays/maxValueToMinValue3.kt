// KJS_WITH_FULL_RUNTIME
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


const val MaxUI = UInt.MAX_VALUE
const val MinUI = UInt.MIN_VALUE
const val MaxUL = ULong.MAX_VALUE
const val MinUL = ULong.MIN_VALUE

fun box(): String {
    val list1 = ArrayList<UInt>()
    for (i in MaxUI..MinUI) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<UInt>()) {
        return "Wrong elements for MaxUI..MinUI: $list1"
    }

    val list2 = ArrayList<ULong>()
    for (i in MaxUL..MinUL) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<ULong>()) {
        return "Wrong elements for MaxUL..MinUL: $list2"
    }

    return "OK"
}
