fun main(){
    val str = "occurence"
    val result = getCharOccurence(str)
    for((char,count) in result)
    {
        
        print("$char$count")
    }
}
fun getCharOccurence(s:String):Map<Char,Int>{
    val occurence = mutableMapOf<Char,Int>()
    val ts = getSpaceRemoveString(s)
    for(char in ts)
    {
        occurence[char] = occurence.getOrDefault(char,0)+1
    }
    return occurence
}
fun getSpaceRemoveString(s:String):String{
    val str = StringBuilder()
    for(char in s)
    {
        if(char != ' ')
        {
            str.append(char)
        }
    }
    return str.toString()
}