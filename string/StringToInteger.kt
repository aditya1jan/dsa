fun main(){
    val str = "1234"
    val result = stringToInteger(str)
    println("Integer value = $result")
}
fun stringToInteger(s:String):Int{
    var index = 0
    var sign = 1
    var result:Long = 0
    if(index<s.length && s[index] == '-'){
        index++
    }
    if(index<s.length && s[index] == '+' || s[index] == '-')
    {
        sign = if(s[index] == '-') -1 else 1
        index++
    }
    while(index<s.length && s[index].isDigit()){
        val digit = s[index] - '0'
        if(result>Int.MAX_VALUE.toLong()/10 || result == Int.MAX_VALUE.toLong()/10 && digit>Int.MAX_VALUE.toLong()%10){
            return if(sign ==1) Int.MAX_VALUE else Int.MIN_VALUE
        }

    result = result*10+digit
    index++
    }
    return (result*sign).toInt()
}
fun Char.isDigit():Boolean{
    return this in '0'..'9'
}