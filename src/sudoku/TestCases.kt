package sudoku


fun main(){
    // vaild and comleted sudoku board

  val boardVaild:Array<CharArray> = arrayOf(
    charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
    charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
    charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
    charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
    charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
    charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
    charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
    charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
    charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9'))
    println( checkVailidationCases(boardVaild, isVaildSudoku(boardVaild),true))




// vaild empty sudoku board
   val boardVaild2:Array<CharArray>  = arrayOf(
       charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
       charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
       charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
       charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
       charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
       charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
       charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
       charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
       charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_')
   )
   println( checkVailidationCases(boardVaild2, isVaildSudoku(boardVaild2),true))

// invaild row
// Duplicate '3' in the same row

     val invaildRowBoadrd: Array<CharArray> =arrayOf(
         charArrayOf('5', '3', '3', '_', '7', '_', '_', '_', '_'),
         charArrayOf('6', '_', '_', '1', '9', '5', '_', '_', '_'),
         charArrayOf('_', '9', '8', '_', '_', '_', '_', '6', '_'),
         charArrayOf('8', '_', '_', '_', '6', '_', '_', '_', '3'),
         charArrayOf('4', '_', '_', '8', '_', '3', '_', '_', '1'),
         charArrayOf('7', '_', '_', '_', '2', '_', '_', '_', '6'),
         charArrayOf('_', '6', '_', '_', '_', '_', '2', '8', '_'),
         charArrayOf('_', '_', '_', '4', '1', '9', '_', '_', '5'),
         charArrayOf('_', '_', '_', '_', '8', '_', '_', '7', '9')
     )
      println( checkVailidationCases(invaildRowBoadrd, isVaildSudoku(invaildRowBoadrd),false))

// Duplicate '5' in the same column
     val  invaildColumnBoard :Array<CharArray> =arrayOf(
         charArrayOf('5', '3', '_', '_', '7', '_', '_', '_', '_'),
         charArrayOf('6', '_', '_', '1', '9', '5', '_', '_', '_'),
         charArrayOf('5', '9', '8', '_', '_', '_', '_', '6', '_'),
         charArrayOf('8', '_', '_', '_', '6', '_', '_', '_', '3'),
         charArrayOf('4', '_', '_', '8', '_', '3', '_', '_', '1'),
         charArrayOf('7', '_', '_', '_', '2', '_', '_', '_', '6'),
         charArrayOf('_', '6', '_', '_', '_', '_', '2', '8', '_'),
         charArrayOf('_', '_', '_', '4', '1', '9', '_', '_', '5'),
         charArrayOf('_', '_', '_', '_', '8', '_', '_', '7', '9')
     )

    println( checkVailidationCases(invaildColumnBoard, isVaildSudoku(invaildColumnBoard),false))

    //Invalid 3x3 subgrid

    val invaildSubGrideBoard :Array<CharArray> =arrayOf(
        charArrayOf('5', '3', '_', '_', '7', '_', '_', '_', '_'),
        charArrayOf('6', '_', '_', '1', '9', '5', '_', '_', '_'),
        charArrayOf('_', '9', '8', '_', '_', '_', '_', '6', '_'),
        charArrayOf('8', '_', '_', '_', '6', '_', '_', '_', '3'),
        charArrayOf('4', '_', '_', '8', '_', '3', '_', '_', '1'),
        charArrayOf('7', '_', '_', '_', '2', '_', '_', '_', '6'),
        charArrayOf('_', '6', '_', '_', '_', '_', '2', '8', '_'),
        charArrayOf('_', '_', '_', '4', '1', '9', '_', '8', '5'),
        charArrayOf('_', '_', '_', '_', '8', '_', '_', '7', '9')
    )
    println( checkVailidationCases(invaildSubGrideBoard, isVaildSudoku(invaildSubGrideBoard),false))

     // only on cell fill
    //only one row or colum completed

//Valid 4x4 Sudoku (Dynamic sudoku)
    val dynamicVaildBoard:Array<CharArray> = arrayOf(
        charArrayOf('1', '2', '3', '4'),
        charArrayOf('3', '4', '1', '2'),
        charArrayOf('2', '1', '4', '3'),
        charArrayOf('4', '3', '2', '1')
    )
   println( checkVailidationCases(dynamicVaildBoard, isVaildSudoku(dynamicVaildBoard),true))

    //invaild sdynamic sudoku
val dynamicInvaildBoard :Array<CharArray> = arrayOf(
    charArrayOf('1', '2', '3', '3'),
    charArrayOf('3', '4', '1', '2'),
    charArrayOf('2', '1', '4', '3'),
    charArrayOf('4', '3', '2', '1')
)
  println( checkVailidationCases(dynamicInvaildBoard, isVaildSudoku(dynamicInvaildBoard),false))



   // vaild empty sudoku board
    val boardVaildzero:Array<CharArray>  = arrayOf(
        charArrayOf('_', '_', '0', '_', '_', '_', '_', '_', '_'),
        charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
        charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
        charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
        charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
        charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
        charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
        charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_'),
        charArrayOf('_', '_', '_', '_', '_', '_', '_', '_', '_')
    )
    println( checkVailidationCases(boardVaildzero, isVaildSudoku(boardVaildzero),false))


}

fun checkVailidationCases(board: Array<CharArray>, result: Boolean, expectedResult: Boolean): String {
    return if (result == expectedResult)
        "Test Passed $result"
          else
            "Test Failed $result"
}