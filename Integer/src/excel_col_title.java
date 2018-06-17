
/*
 * Given a positive integer, return its corresponding column title as 
 * appear in an Excel sheet.
 * 
 * Ex:
 *  1 -> A
    2 -> B
    3 -> C
    
    27 -> AA
    28 -> AB 
 */
public class excel_col_title {

	public String convertToTitle(int n) {
        
        if (n <= 0) return "";
        StringBuilder res = new StringBuilder();
        while (n!=0) {
            n--;
            res.append((char) ('A' + (n % 26)));
            n =n/26;
        }
        return res.reverse().toString();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		excel_col_title e=new excel_col_title();
		System.out.println(e.convertToTitle(2000));
	}

}
