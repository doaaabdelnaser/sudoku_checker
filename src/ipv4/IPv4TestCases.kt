package ipv4


fun main(){

    // 1-vaild IPv4
    val ipv41:String ="192.168.1.1"
    println(checkValidation(ipv41, isValidIPv4 (ipv41),true))


    //2- Only 3 segments
    val ipv42:String= "192.168.1"
    println( checkValidation(ipv42, isValidIPv4 (ipv42),false))


    // 3-5 segments
    val ipv43:String="192.168.1.1.1"
   println( checkValidation(ipv43, isValidIPv4 (ipv43),false))

    //4- Missing segment
    val ipv44:String="192..168.1.1"
    println( checkValidation(ipv44, isValidIPv4 (ipv44),false))

    // 6-Leading zero
    val ipv47:String ="019.168.1.1"
    println(checkValidation(ipv47, isValidIPv4 (ipv47),false))

    // 7-Out of range
    val ipv46:String="256.168.1.1"
    println(checkValidation(ipv46, isValidIPv4 (ipv46),false))

    // 8-Negative number
    val ipv411:String ="192.168.-1.1"
    println( checkValidation(ipv411, isValidIPv4 (ipv411),false))



// 9-Contains letter
    val ipv48:String ="192.168.a.1"
    checkValidation(ipv48, isValidIPv4 (ipv48),false)


  /*//10-Contains space
    val ipv49:String ="192.168.1 .1"
    checkValidation(ipv49, isValidIPv4 (ipv49),false)*/


   // 11-Empty string
    val ipv412:String =""
    println( checkValidation(ipv412, isValidIPv4 (ipv412),false))


   // 12-Just dots
    val ipv413:String ="..."
    println( checkValidation(ipv413, isValidIPv4 (ipv413),false))



}

fun  checkValidation(input :String,resualt:Boolean,excpectedResult:Boolean):String{
    return if (resualt == excpectedResult)
        "Test Success and sudoku result is $resualt"
          else
              "Test Failed"
}
