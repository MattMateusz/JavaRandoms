package org.algorythms;

public class Powers {

    public static String check(int numb, int base) {
        int powerLevel = 1;
        String logValue = "";
        int baseNumb = base;
            while(base <= numb) {
                if(base == numb){
                    logValue = "Number " +numb+ " is " +baseNumb+ " to power of " +powerLevel + ".";
                    return logValue;
                }
                base = base * baseNumb;
                powerLevel++;
            }
        logValue = numb + " isn't a power of " +baseNumb;
        return logValue;
    }
}
