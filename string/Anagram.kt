fun main(){
    val s1 = "anagram"
    val s2 = "aangram"
    val result = isAnagram(s1,s2)
    println("string $s1 and $s2 is anagram = $result")
}

fun isAnagram(s1:String,s2:String):Boolean{
    val charFound = mutableMapOf<Char,Int>()
    if(s1.length!=s2.length){
        return false
    }
    for(char in s1){
        charFound[char] = charFound.getOrDefault(char,0)+1
    }
    for(char in s2)
    {
        if(!charFound.containsKey(char) || charFound[char]==0)
        {
            return false
        }
        charFound[char] = charFound[char]!!-1
    }
    return true
}