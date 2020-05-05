import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        if(s.length()==1 || s.length()==0)
        {
            return 0;
        }

        char ch=s.charAt(0); //this can be either A or B;
        int delete=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                delete++; //I need to delete this;
            }
            else
            {
                ch=s.charAt(i);
                //Now this is our alternate char.
            }
        }

        return delete;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
