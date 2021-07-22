fun main() {
    print(isBeautifulString("bbbaacdafe"))
}

fun isBeautifulString(inputString: String): Boolean {
    var elementList=inputString.toSet()
    var iterateList=mutableListOf<Int>()
    for(item in elementList){var count=0
        for(item1 in inputString)
            if(item==item1)
                count++
        iterateList.add(count)}
    for(i in 0 until elementList.size)
        if(elementList.elementAt(i)=='a')
            continue
        else if(((elementList.elementAt(i).toInt())-1).toChar() !in elementList)
            return false
        else if(iterateList.elementAt(elementList.indexOf(((elementList.elementAt(i).toInt())-1).toChar()))<iterateList.elementAt(i))
            return false
        else
            continue

    return true


}
