package CS285.A1;

import java.util.Arrays;

public class Set {

    int[] temp = {0, 0, 0, 0, 0, 0, 0};     //values are 0 by default so that it wont need to be changed unless the condition is met
    String comA = "";   // used for printing purposes, default is empty
    String comB = "";   // which will be changed if the complement flag is true

    public Set() {
    }

    // NEW: if you call it with 2 arguments the flags are false by default
    public void union(String[] a, String[] b) {
        union(a, false, b, false);
    }

    public void union(String[] a, boolean ac, String[] b, boolean bc) {
        // clones the array passed so that the algorithim wont change the array passed
        //incase it is used later durring the run time
        String[] tempA = a.clone();
        String[] tempB = b.clone();
        if (ac) {
            tempA = complement(tempA);
            comA = " Complement";
        }
        if (bc) {
            tempB = complement(tempB);
            comB = " Complement";
        }

        System.out.println(tempA[7] + comA + " Union " + tempB[7] + comB);
        for (int i = 0; i < tempA.length - 1; i++) {
            // if either is not empty then the condition is met
            if (!tempA[i].equals("") || !tempB[i].equals("")) {
                temp[i] = 1;
            }
        }
        System.out.println(Arrays.toString(temp) + "\n");
        resetTemp();
    }

    public void testS(String[] a) {
        System.out.println(Arrays.toString(a));
    }

    // NEW: if you call it with 2 arguments the flags are false by default
    public void intersection(String[] a, String[] b) {
        intersection(a, false, b, false);
    }

    public void intersection(String[] a, boolean ac, String[] b, boolean bc) {
        String[] tempA = a.clone();
        String[] tempB = b.clone();
        if (ac) {
            tempA = complement(tempA);
            comA = " Complement";
        }
        if (bc) {
            tempB = complement(tempB);
            comB = " Complement";
        }

        System.out.println(tempA[7] + comA + " Intersection " + tempB[7] + comB);
        for (int i = 0; i < tempA.length - 1; i++) {
            // both must be not empty for condition to be met
            if ((!tempA[i].equals("") && !tempB[i].equals(""))) {
                temp[i] = 1;
            }
        }
        System.out.println(Arrays.toString(temp) + "\n");
        resetTemp();
    }

    // NEW: if you call it with 2 arguments the flags are false by default
    public void exclusiveOr(String[] a, String[] b) {
        exclusiveOr(a, false, b, false);
    }

    public void exclusiveOr(String[] a, boolean ac, String[] b, boolean bc) {
        String[] tempA = a.clone();
        String[] tempB = b.clone();
        if (ac) {
            tempA = complement(tempA);
            comA = " Complement";
        }
        if (bc) {
            tempB = complement(tempB);
            comB = " Complement";
        }

        System.out.println(tempA[7] + comA + " Exclusive Or " + tempB[7] + comB);
        for (int i = 0; i < tempA.length - 1; i++) {
            // t/f or f/t exclusively for the condition to be met
            if ((tempA[i].equals("") ^ tempB[i].equals(""))) {
                temp[i] = 1;
            }
        }
        System.out.println(Arrays.toString(temp) + "\n");
        resetTemp();

    }

    public String[] complement(String[] a) {
        String[] tempA = a;
        System.out.println(tempA[7] + " Complement ");
        for (int i = 0; i < tempA.length - 1; i++) {
            // if an index is empty you put somthing in it, doesnt matter what, so that the other method recognize it as true
            if (tempA[i].equals("")) {
                tempA[i] = "1";
            } else { // if its not them make it empty so the other methods recognize it as false
                tempA[i] = "";
            }
        }
        System.out.println(Arrays.toString(tempA) + "\n");
        return tempA;
    }
    // since only the temp array is returned it needs to be reseted incase of future use later durring the run time 
    // O(c) so it wont affect performance to a noticable degree

    private void resetTemp() {
        temp[0] = 0;
        temp[1] = 0;
        temp[2] = 0;
        temp[3] = 0;
        temp[4] = 0;
        temp[5] = 0;
        temp[6] = 0;
        comA = "";
        comB = "";
    }
    public boolean isEmpty(){
        return true;
        
    }

    public void difference(String[] a, boolean ac, String[] b, boolean bc) {
        String[] tempA = a.clone();
        String[] tempB = b.clone();
        if (ac) {
            tempA = complement(tempA);
            comA = " Complement";
        }
        if (bc) {
            tempB = complement(tempB);
            comB = " Complement";
        }

        System.out.println(tempA[7] + comA + " Difference " + tempB[7] + comB);
        for (int i = 0; i < tempA.length - 1; i++) {
            // you subtract the index of b from the domain of a, so you only need to check
            // if a has something and b doesnt at any given indext, then the condition is met
            // otherwise it will always be false so you do nothing since the default value of
            // temp[i] is 0
            if ((!tempA[i].equals("") && tempB[i].equals(""))) {
                temp[i] = 1;
            }
        }
        System.out.println(Arrays.toString(temp) + "\n");
        resetTemp();

    }

}
