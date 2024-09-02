 class LinkedList<T : Comparable<T>> {

     data class Node<T>(val data: T, var next: Node<T>?)

     private var first: Node<T>? = null
     private var size: Int = 0

     fun isEmpty(): Boolean = size == 0

     fun addFirst(data: T) {
         val newNode = Node(data, first)
         first = newNode
         size++
     }

     fun clear() {
         first = null
         size = 0
     }

     fun size(): Int = size

     override fun toString(): String {
         if (isEmpty()) {
             return "[]"
         }
         var current = first
         val stringBuilder = StringBuilder("[")
         while (current != null) {
             stringBuilder.append(current.data)
             if (current.next != null) {
                 stringBuilder.append(", ")
             }
             current = current.next
         }
         stringBuilder.append("]")
         return stringBuilder.toString()
     }

     fun addLast(data: T) {
         val newNode = Node(data, null)
         if (isEmpty()) {
             first = newNode
         } else {
             var current = first
             while (current?.next != null) {
                 current = current.next
             }
             current?.next = newNode
         }
         size++
     }

     fun addSorted(data: T) {
         val newNode = Node(data, null)
         if (isEmpty() || data <= first!!.data) {
             newNode.next = first
             first = newNode
         } else {
             var current = first
             while (current?.next != null && data > current.next!!.data) {
                 current = current.next
             }
             newNode.next = current?.next
             current?.next = newNode
         }
         size++
     }

     fun appendList(newList: LinkedList<T>) {
         if (newList.isEmpty()) {
             return
         }
         if (isEmpty()) {
             first = newList.first
         } else {
             var current = first
             while (current?.next != null) {
                 current = current.next
             }
             current?.next = newList.first
         }
         size += newList.size()
     }

     fun forEach(action: (T) -> Unit) {
         var current = first
         while (current != null) {
             action(current.data)
             current = current.next
         }
     }

     fun firstWhere(condition: (T) -> Boolean): T? {
         var current = first
         while (current != null) {
             if (condition(current.data)) {
                 return current.data
             }
             current = current.next
         }
         return null
     }


     }
 



