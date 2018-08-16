/**
 * 傳入一個整數陣列，以最左位為最高位元，最右位為最低位元，將其整數陣列數值+1後回傳。
 * 如：
 * Input: [1,2,3]
 * Output: [1,2,4]
 * @author black
 *
 */
public class plusOne {
	public static void main(String []args){
		Solution Solution = new Solution();
		int [] digits ={9,9,9,2};
		digits =Solution.plusOne(digits);
		for(int i=0;i<digits.length;i++)
		{
			System.out.print(digits[i]);
		}
	}
}
