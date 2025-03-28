fun main(){
    val str = "babcd"
    val result = getLongestPalindrome(str)
    println("Longest plaindrome string = $result")
}

fun getLongestPalindrome(s:String):String{
    if(s.isEmpty())
    {
        return ""
    }
    var longestPalindrome = ""

fun getString(left:Int,right:Int):String{
    var l = left
    var r = right
    while(l>=0&&r<s.length&& s[l]==s[r])
    {
        l--
        r++
    }
    return getSubString(l+1,r,s)
}

    for(i in s.indices)
    {
        val palindrome1 = getString(i,i)
        if(palindrome1.length>longestPalindrome.length)
        {
            longestPalindrome = palindrome1
        }
        val palindrome2 = getString(i,i+1)
        if(palindrome2.length>longestPalindrome.length)
        {
            longestPalindrome = palindrome2
        }
    }
    return longestPalindrome
}
fun getSubString(start:Int,end:Int,s:String):String{
    val str = StringBuilder()
    for(i in start until end)
    {
        str.append(s[i])
    }
    return str.toString()
}