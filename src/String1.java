public class String1 {
    public void part1(String s,int b) {
        char[] Mass = s.toCharArray();
        int i = 0;
        int lastsentence=0,count=0;
        while (i < Mass.length) {

            if ((Mass[i] == ' ') ||(Mass[i] == ',')  )
            {
            count++;
            }
            else if ((Mass[i] == '.' ) ||(i==Mass.length-1))
            {
                if (count==b-1)
                {
                for(int r=lastsentence;r<i+1;r++) System.out.print(Mass[r]);
                System.out.println();
                }


                lastsentence=i+1;
                count=0;
            }
            i++;
        }

    }
    public void part2(String s)
    {
        char[] Mass = s.toCharArray();
        int count=0;
        if (Mass.length%5==0)
        {
            for (int i=0;i<Mass.length;i++)
            {
                if ((Mass[i]=='[') || (Mass[i]==']') || (Mass[i]=='(') ||(Mass[i]==')') ||
                        (Mass[i]=='{') || (Mass[i]=='}')) count++;
                System.out.print(Mass[i]);
            }
            System.out.println(" Count"+count);

        }
        else
        {
            for (int i=0;i<Mass.length;i++)
            {
                System.out.print(Mass[i]);

            }
            System.out.println();

        }

    }
}
