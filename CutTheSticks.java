package JavaAlgorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CutTheSticks 
{
	


	    // Complete the cutTheSticks function below.
	    static int[] cutTheSticks(int[] arr) 
	    {   
	        //List to hold number of remaining sticks before each iteration
	        List<Integer> answerTemp=new ArrayList<Integer>();
	        //Sort sticks in ascending length
	        Arrays.sort(arr);
	        //List to hold sticks arranged in increasing order of length
	        List<Integer> list1=new ArrayList<Integer>();
	        for(int a:arr)
	        {
	            list1.add(a);
	        }
	        //Logic: Outer loop prints no of sticks before each iteration and exists 
	        // when none are left 
	        for(;;)
	        {   
	            //break loop if no sticks remain
	            if(list1.size()==0) break;
	            answerTemp.add(list1.size());
	            int min=list1.get(0);
	            //Logic: Inner loop removes sticks of minimum length from each stick
	            for(int i=0;i<list1.size();i++)
	            {
	                list1.set(i,list1.get(i)-min);
	            }
	            //remove all sticks of 0 length
	            list1.removeAll(Collections.singleton(0));
	            
	        }
	        int[] answer=new int[answerTemp.size()];
	        for(int i=0;i<answerTemp.size();i++)
	        {
	            answer[i]=answerTemp.get(i);
	        }
	        
	        return answer;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Jay\\Desktop\\Selenium,Drivers and Cucumber\\test.txt"));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        int[] result = cutTheSticks(arr);

	        for (int i = 0; i < result.length; i++) {
	            bufferedWriter.write(String.valueOf(result[i]));

	            if (i != result.length - 1) {
	                bufferedWriter.write("\n");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}

	
	
	
	

