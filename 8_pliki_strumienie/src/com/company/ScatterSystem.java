package com.company;

public class ScatterSystem {

    public static Double makeOperation(double[] input)
    {
        Double output = 0.0;
        for(double i : input)
        {
            output += i;
        }
        return output;
    }
}
