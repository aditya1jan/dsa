fun main(){
    val str = "abccbba"
    val result = getLongestSubStringLength(str)
    println("Longest sub string length = $result")
}
fun getLongestSubStringLength(s:String):Int{
    if(s.isEmpty())
    {
        return 0
    }
    val charIndex = mutableMapOf<Char,Int>()
    var start = 0
    var maxLength = 0
    for((end,char) in s.withIndex())
    {
        if(charIndex.containsKey(char) && charIndex[char]!! >= start)
        {
            start = charIndex[char]!! + 1
        }
        charIndex[char] = end
        if(maxLength < end-start+1)
        {
            maxLength = end-start+1
        }  
    }
    return maxLength
}