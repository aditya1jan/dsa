fun main(){
    val string = "Hello how are you"
    println("Original String: $string")
    println("Revere String: ${reverseString(string)}")
}
fun reverseString(s:String):String{
    val words = mutableListOf<String>()
    var currentWord = ""
    for(char in s)
    {
        if(char ==' ')
        {
            words.add(currentWord)
            currentWord = ""
        }
        else{
            currentWord +=char
        }
    }
    words.add(currentWord)
    val reverseWords = mutableListOf<String>()
    for(word in words){
        var reverseWord = reverseEachWord(word)
        reverseWords.add(reverseWord)
    }
    var result = StringBuilder()
    for(i in 0 until reverseWords.size)
    {
        result.append(reverseWords[i])
        if(i<reverseWords.size-1)
        {
            result.append(" ")
        }
    }
    return result.toString()
}

fun reverseEachWord(s:String):String{
    val charArray = s.toCharArray()
    var left = 0
    var right = charArray.size-1
    while(left<right){
        val temp = charArray[left]
        charArray[left] = charArray[right]
        charArray[right] = temp
        left++
        right--
    }
    return String(charArray)
}