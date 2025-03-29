fun main(){
    val stringArray = arrayOf("eat","tea","tan","ate","nat","bat")
    val result = groupAnagram(stringArray)
    println("$result")
}
fun groupAnagram(sArray:Array<String>):List<List<String>>{
    val groupAnagramMap = mutableMapOf<String,MutableList<String>>()

    fun sortString(s:String):String{
        val charArray = s.toCharArray()
        for(i in 0 until charArray.size-1){
            for(j in 0 until charArray.size-i-1){
                if(charArray[j]>charArray[j+1]){
                    val temp = charArray[j]
                    charArray[j] = charArray[j+1]
                    charArray[j+1] = temp
                }
            }
        }
        return String(charArray)
    }

    for(str in sArray){
        var getSortedStr = sortString(str)
        groupAnagramMap.getOrPut(getSortedStr){mutableListOf()}.add(str)
    }
    return groupAnagramMap.values.toList()
}