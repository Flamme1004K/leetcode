class Solution {
    

    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = Stack<Int>()
        asteroids.forEach { asteroid ->
           if (asteroid < 0) {
               while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                   stack.pop()
               }

               if(!stack.isEmpty() && stack.peek() > 0) {
                   if(stack.peek() == Math.abs(asteroid)) {
                       stack.pop()
                   }
               } else {
                   stack.push(asteroid)
               }
           } else {
               stack.push(asteroid)
           }
        }

        val aliveAsteroids = IntArray(stack.size)
        for (i in aliveAsteroids.size downTo 1) {
            aliveAsteroids[i-1] = stack.pop()
        }
        return aliveAsteroids
    }

}