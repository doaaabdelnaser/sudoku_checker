package sudoku

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

}
fun isVaildSudoku(board:Array<CharArray>):Boolean{

    fun isVaild(sudokuBoard:List<Char>):Boolean{


         val items=sudokuBoard.filter { it!='_' }

        for (i in items){
            if(items.indexOf(i)!=0)
                return true
            else
                return false
        }
        // check duplicated
       //return items.filterIndexed { index, c -> items.indexOf(c) != index }.isEmpty()
         return items.none { c -> items.indexOf(c) != items.lastIndexOf(c)  }

    }
  /*  for (row  in board){
        //val rowList= row.toList()
        if (!isVaild(row.toList()))
            return false

    }

    for (column in 0 until board.size-1){
        val col=List(board.size){it->board[it][column]}
        if (!isVaild(col))return false
    }
*/

    for (row in 0 until board.size-1){
        if ( !isVaild(board[row].toList())) return false
        val col=List(board.size){it->board[it][row]}
        if (!isVaild(col))return false
    }


     val subgrideSize=Math.sqrt(board.size.toDouble()).toInt()

    for (rowGrid in 0 until subgrideSize) {
        for (columGrid in 0 until subgrideSize) {
            val subgrid = mutableListOf<Char>()

            for (row in rowGrid * subgrideSize until (rowGrid + 1) * subgrideSize) {
                for (col in columGrid * subgrideSize until (columGrid + 1) * subgrideSize) {
                    subgrid.add(board[row][col])
                }
            }
            if (!isVaild(subgrid))return false

        }
    }

    return true
}

/* for (rowGride in 0 until subgrideSize){
      for (colmGride in 0 until subgrideSize){
          val box = listOf(
              board[rowGride * subgrideSize][colmGride * subgrideSize], board[rowGride * subgrideSize][colmGride * subgrideSize + 1], board[rowGride * subgrideSize][colmGride *subgrideSize+ 2],
              board[rowGride * subgrideSize + 1][colmGride * subgrideSize], board[rowGride * subgrideSize + 1][colmGride * subgrideSize + 1], board[rowGride * subgrideSize + 1][colmGride * subgrideSize + 2],
              board[rowGride * subgrideSize + 2][colmGride * subgrideSize], board[rowGride * subgrideSize + 2][colmGride * subgrideSize + 1], board[rowGride * subgrideSize+ 2][colmGride * subgrideSize + 2]
          )*/