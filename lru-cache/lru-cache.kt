class LRUCache(_capacity: Int) {
    private var map: MutableMap<Int, Int>? = LinkedHashMap(_capacity, 0.75f, true)
    private val capacity = _capacity

    fun get(key: Int): Int {
        return map!!.getOrDefault(key, -1)
    }

    fun put(key: Int, value: Int) {
        map!![key] = value
        if (map!!.size > capacity) {
            val leastUsedKey = map!!.keys.iterator().next()
            map!!.remove(leastUsedKey)
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */