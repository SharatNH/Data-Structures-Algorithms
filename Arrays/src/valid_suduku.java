
/*
 * https://leetcode.com/problems/valid-sudoku/description/
 * Determine if a Sudoku is valid,
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * A valid Sudoku board (partially filled) is not necessarily solvable.
 *  Only the filled cells need to be validated.
 */
public class valid_suduku {
	
	
	    public boolean isValidSudoku(char[][] board) {
	        
	        //valid rows
	        for(int i=0;i<board.length;i++){
	            boolean[] check=new boolean[9];
	            for(int j=0;j<board[0].length;j++){
	                if(board[i][j]!='.')
	                {
	                    if(check[(int)board[i][j]-'1'])
	                       return false;
	                    else
	                        check[(int)board[i][j]-'1']=true;       
	                }
	            }
	            
	            
	         
	        }
	        
	        //valid colums
	        for(int i=0;i<board[0].length;i++){
	            boolean[] check=new boolean[9];
	            for(int j=0;j<board.length;j++){
	                if(board[j][i]!='.'){
	                    if(check[(int)board[j][i]-'1'])
	                        return false;
	                    else
	                        check[(int)board[j][i]-'1']=true;
	                }
	            }        
	        }
	        
	        System.out.println("safe till here");
	        //valid cube check
	        for(int block=0;block<9;block++){
	            boolean[] check=new boolean[board.length];
	            for(int i=(block/3)*3;i<=((block/3)*3)+2;i++){
	                for(int j=(block%3)*3;j<=((block%3)*3)+2;j++){
	                    //System.out.println("i and j:"+ i+" "+j+" "+board[i][j]);
	                    if(board[i][j]!='.'){
	                       // System.out.println("non . value"+board[i][j]);
	                    if(check[(int)board[i][j]-'1'])
	                        return false;
	                    else
	                        check[(int)board[i][j]-'1']=true;
	                }
	                }                
	            }
	            System.out.println("block: "+block);
	        }
	        return true;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//["..4...63.",".........","5......9.","...56....","4.3.....1","...7.....","...5.....",".........","........."]
		valid_suduku suduku=new valid_suduku();
		//suduku.isValidSudoku(input);
	}

}
