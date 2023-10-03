//find the number of way in which you can invite n people to your party ,single or in pair
// n=4
public class Prashant {
    public static int partyGuest(int n) {
        if (n <= 1) {
            return 1;
        }
        // for Single guest invite
        int Single = partyGuest(n - 1);
        // for pair guset invite
        int pair = (n - 1) * partyGuest(n - 2);
        return Single + pair;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(partyGuest(n));
    }
}
