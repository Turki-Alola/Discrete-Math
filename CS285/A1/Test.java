
package CS285.A1;

public class Test {

    public static void main(String[] args) {
        // W = Week,WD = Week Day, WE = Week End, SD = Study day, GD = Gym Day 

        final String[] W = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Week Day"};
        final String[] WD = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "", "", "Work Day"};
        final String[] WE = {"", "", "", "", "", "Friday", "Saturday", "Week End"};
        final String[] SD = {"Sunday", "", "Tuesday", "", "Thursday", "", "Saturday", "Study day"};
        final String[] GD = {"", "Monday", "", "Wednesday", "", "Friday", "", "Gym Day"};

        Set set = new Set();
        set.union(WD, true, WE, false);
        set.intersection(WD, false, SD, true);
        set.difference(WD, false, SD, false);
        set.complement(WD);
    }

}
