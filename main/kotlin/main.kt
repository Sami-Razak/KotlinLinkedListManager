fun main() {

    val fruits = LinkedList<String>()
    fruits.addFirst("Birne")
    fruits.addFirst("Apfel")
    println(fruits.toString()) // [Apfel, Birne]

    fruits.addLast("Erdbeere")
    println(fruits.toString()) // [Apfel, Birne, Erdbeere]

    fruits.addSorted("Banane")
    println(fruits.toString()) // [Apfel, Banane, Birne, Erdbeere]

    fruits.addSorted("Blaubeere")
    println(fruits.toString()) // [Apfel, Banane, Birne, Blaubeere, Erdbeere]

    val newList = LinkedList<String>()
    newList.addLast("Wassermelone")
    newList.addLast("Mango")
    fruits.appendList(newList)
    println(fruits.toString()) // [Apfel, Banane, Birne, Blaubeere, Erdbeere, Wassermelone, Mango]

    // fruits.forEach { element ->
    //  println(element)

    val found = fruits.firstWhere { element ->
        element.startsWith("B")
    }
    println(found) // Banane

    val found2 = fruits.firstWhere { element ->
        element.contains("beere")
    }
    println(found2) // Blaubeere

    val found3 = fruits.firstWhere { element ->
        element.length > 10
    }
    println(found3) // Wassermelone

val ll : LinkedList<Int> = LinkedList()
    ll.addLast(3)
    ll.addLast(8)
    ll.addLast(15)

    val ll2 : LinkedList<Int> = LinkedList()
    ll2.addLast(3)
    ll2.addLast(8)
    ll2.addLast(14)

 println(ll)
    println(ll2)


}
