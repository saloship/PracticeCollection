package grokkingcodingpattern.slidingwindow

fun main() {
   // SlidingPatterns.testAverageSizeOfK()
   // SlidingPatterns.testMaxSumSubArrayWithSizeK()
   // SlidingPatterns.testFinMinArrayWithSumK()
    SlidingPatterns.testLongestSubStringWithKDistinct()
}

object SlidingPatterns {

    fun testFinMinArrayWithSumK() {
        val inputArray = intArrayOf(1, 3, 2, 6, -1, 4, 1, 8, 9)
        println(finMinArrayWithSumK(inputArray, 9))
    }

    fun testMaxSumSubArrayWithSizeK() {
        val inputArray = intArrayOf(1, 3, 2, 6, -1, 4, 1, 8, 2)
        println(maxSumSubArrayWithSizeK(inputArray, 3) == 13)
    }

    fun testAverageSizeOfK() {
        val inputArray = intArrayOf(1, 3, 2, 6, -1, 4, 1, 8, 2)
        (getAverageOfSizeK(inputArray, 5).forEach { print("${it}, ") })
    }

    fun testLongestSubStringWithKDistinct() {
        var testString1 = "jhjhjahjhjahsjahsjhjhjasasas"
        println(longestSubStringWithKDistinct(testString1, 3) == 12)
    }

    private fun getAverageOfSizeK(array: IntArray, windowSize: Int): Array<Float?> {
        val avgArray = arrayOfNulls<Float>(array.size - windowSize + 1)
        var startIndex = 0
        var sum = 0.0f
        for(endIndex in 0..array.size-1) {
            sum += array[endIndex]
            if(endIndex >= windowSize - 1) {
                avgArray[startIndex] = sum/windowSize
                sum -= array[startIndex]
                startIndex++
            }
        }
        return avgArray
    }

    private fun maxSumSubArrayWithSizeK(array: IntArray, windowSize: Int): Int {
        var maxSumInt = 0
        var minIndex = 0
        var currentSum = 0;

        for(endIndex in 0..array.size -1) {
            currentSum = currentSum + array[endIndex]

            if(endIndex >= windowSize-1) {
                maxSumInt = Math.max(currentSum, maxSumInt)
                currentSum -= array[minIndex]
                minIndex++
            }
        }
        return maxSumInt
    }

    private fun finMinArrayWithSumK(array: IntArray, sum: Int): Int {
        var windowStart = 0;
        var currentSum = 0;
        var currentSize = 0;
        var minSize = Integer.MAX_VALUE;
        for(windowEnd in 0..array.size-1) {
            currentSum += array[windowEnd]
            currentSize++
            while (currentSum >= sum && windowStart <= windowEnd) {
                minSize = Math.min(minSize, currentSize)
                currentSize--
                currentSum -= array[windowStart]
                windowStart++
            }
        }
        return minSize
    }

    private fun longestSubStringWithKDistinct(str: String, maxChars: Int): Int {
        var map = hashMapOf<Char, Int>()
        var maxLength = Integer.MIN_VALUE
        var startIndex = 0
        for (endIndex in 0..str.length - 1) {
            var endChar: Char = str[endIndex]
            map[endChar] = map.getOrDefault(endChar, 0) + 1

            while(map.size > maxChars) {
                var startChar = str[startIndex]
                map[startChar] = map.get(startChar)!! - 1
                if(map[startChar] == 0) {
                    map.remove(startChar)
                }
                startIndex++
            }

            maxLength = Math.max(maxLength, (endIndex - startIndex + 1))
        }

        return maxLength
    }

    private fun maxFruitCountOfTwoTypes(str: String): Int {
        var maxFruitsType: Int = 2
        var map = hashMapOf<Char, Int>()
        var maxLength = Integer.MIN_VALUE
        var startIndex = 0
        for (endIndex in 0..str.length - 1) {
            var endChar: Char = str[endIndex]
            map[endChar] = map.getOrDefault(endChar, 0) + 1

            while(map.size > maxFruitsType) {
                var startChar = str[startIndex]
                map[startChar] = map.get(startChar)!! - 1
                if(map[startChar] == 0) {
                    map.remove(startChar)
                }
                startIndex++
            }
            maxLength = Math.max(maxLength, (endIndex - startIndex + 1))
        }

        return maxLength
    }
}