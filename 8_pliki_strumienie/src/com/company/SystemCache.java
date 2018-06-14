package com.company;


import java.io.Serializable;
import java.util.*;

public class SystemCache implements Serializable {
    protected HashMap<Parameter, Double> cache = new HashMap<>();

    public void put(double [] input, double output)
    {
        this.cache.put(new Parameter(input),output);
    }

    public Double get(double [] input)
    {
        return this.cache.get( new Parameter(input));
    }

    public HashMap<Parameter, Double> getCache() {
        return cache;
    }

    public void setCache(HashMap<Parameter, Double> cache) {
        this.cache = cache;
    }

    public String show()
    {
        String result = "";
        for(Map.Entry<Parameter, Double> entry:cache.entrySet())
        {
            Parameter key = entry.getKey();
            Double output = entry.getValue();
            result +=(key.valuesToString() + "o," + output + "\r\n");
        }
        //System.out.println(result);


        return result;
    }

    public void rebuild(Scanner input)
    {
        ArrayList<Double> arr = new ArrayList<Double>();
        double output = 0.0;
        while(input.hasNext())
        {
            String data = input.next();
            String[] elem = data.split(",");

            boolean out = false;

            for(int i = 0; i < elem.length; i++)
            {
                if(elem[i].equals("o"))
                {
                    out = true;
                }
                else if(out == false)
                {
                    arr.add(Double.parseDouble(elem[i]));
                }
                else
                {
                    output = Double.parseDouble(elem[i]);
                }
            }

            double [] tab = new double[arr.size()];
            for(int i = 0; i < arr.size(); i++)
            {
                tab[i] = arr.get(i);
            }

            put(tab,output);
            arr.clear();

        }

    }

    protected class Parameter implements Serializable
    {
        private double[] values;

        public String valuesToString()
        {
            String result = "";
            for(double i : values){
                result += String.valueOf(i);
                result += ",";
            }
            return result;
        }

        public Parameter(double[] values)
        {
            this.values = values;
        }



        @Override
        public int hashCode()
        {
            return 31+ Arrays.hashCode(this.values);
        }

        @Override
        public boolean equals(Object obj)
        {
            if (this == obj)
                return true;

            if (obj == null)
                return false;

            if (this.getClass() != obj.getClass())
                return false;

            Parameter other = (Parameter) obj;

            if(!Arrays.equals(this.values, other.values))
                return false;

            return true;
        }
    }
}
