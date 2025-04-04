package ipv4

fun isValidIPv4(ipv4Address: String): Boolean {
    //"192.168.1.1"
    val segments:List<String> = ipv4Address.split(".")

    //1- check vaildition
    //2- segments<4
    // 3- segments>4
    // 4- missing segment "192..168.1.1"
    if(segments.size!=4)return false

   // check case for each segment in segments list
    for (segment in segments){

        //6- leading zero
        //if (segment[0]=='0')return false
        if (segment.length>1 && segment[0]=='0')return false

        if (segment.all { !it.isDigit() } && ' ' !in segment) return false

        //11- is empty    12- only dots
        if (segment.isEmpty()||segment.all { it=='.' }) return false


        //7-out of range
        //8- negative number
        val  num=segment.toInt()
        if (num !in 0..255)return false


    }


    return true
}











































