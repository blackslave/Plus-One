/**
 * 建立一個比原陣列長度多1的陣列，以便處理進位問題。使用迴圈從尾到頭走訪，同時以carry記錄進位。
 * 若最後carry為1，則表示原陣列需進位，則回傳長度多1的陣列。
 * 否則照正常計算回傳。
 * @author black
 *
 */
public class Solution {
	public int[] plusOne(int[] digits) {
		int carry=0;
		int[] result = new int[digits.length+1];
		for(int i=digits.length-1;i>=0;i--)
		{
			digits[i]=digits[i]+carry;
			if(i==digits.length-1)	digits[i]++;
			if(digits[i]==10)
			{
				carry=1;
				digits[i]=0;
			}
			else
			{
				carry=0;
			}
			result[i+1]=digits[i];
		}
		if(carry==1)
		{
			result[0]=1;
			return result;
		}
		else
			return digits;
    }
}
