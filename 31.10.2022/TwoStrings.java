import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result { 
    public static String twoStrings(String s1, String s2) {
       for(int i=0;i<s1.length();i++)
       {
           for(int j=0;j<s2.length();j++)
           {
             if(s1.charAt(i)==s2.charAt(j))
              return "YES";
           }
       }
            return "NO";
    }  
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();

            String result = Result.twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

