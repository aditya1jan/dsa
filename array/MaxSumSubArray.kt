fun main() {
    val arr = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val subarrayMap = mutableMapOf<Int, List<Int>>()

    var currentMax = arr[0]
    var maxSoFar = arr[0]
    var tempStart = 0
    var start = 0
    var end = 0

    for (i in 1 until arr.size) {
        if (arr[i] > currentMax + arr[i]) {
            currentMax = arr[i]
            tempStart = i
        } else {
            currentMax += arr[i]
        }

        if (currentMax > maxSoFar) {
            maxSoFar = currentMax
            start = tempStart
            end = i
        }
    }

    // Extract the subarray and put in map
    val maxSubarray = mutableListOf<Int>()
    for (i in start..end) {
        maxSubarray.add(arr[i])
    }

    subarrayMap[maxSoFar] = maxSubarray

    // Print result
    println("Maximum Subarray Sum: ${maxSoFar}")
    println("Subarray: ${subarrayMap[maxSoFar]}")
}
