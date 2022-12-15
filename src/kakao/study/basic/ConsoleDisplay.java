package kakao.study.basic;

import java.util.Arrays;

public class ConsoleDisplay {
    public static void main(String args[])
    {
        int [] ar = {1, 5, 3, 2, 4};

        for (int i = 0; i < ar.length - 1; i++)
        {
            for (int j = i + 1; j < ar.length; j++)
            {
                if (ar[i] > ar[j])
                {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
            System.out.println(Arrays.toString(ar));
        }




    }
}
