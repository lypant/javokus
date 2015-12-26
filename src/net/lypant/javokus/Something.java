package net.lypant.javokus;

public class Something
{
    public boolean isEven(int number)
    {
        boolean result;
        
        if(number % 2 == 0)
        {
            result = true;
        }
        else
        {
            result = false;
        }

        return result;
    }
}
