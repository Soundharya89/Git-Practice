import java.util.Scanner;
public class sam {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial state of the light signal (R/G/B): ");
        String initialSignal = scanner.nextLine().toUpperCase();  // Convert to uppercase to handle case-insensitive input

        System.out.print("Enter the number of minutes (K): ");
        int k = scanner.nextInt();

        String[] finalStates = getFinalStates(initialSignal, k);

        System.out.println("Final states of light signals after " + k + " minutes:");
        for (String state : finalStates) {
            System.out.print(state + " ");
        }
    }

    public static String[] getFinalStates(String initialSignal, int k) {
        char[] colors = {'R', 'G', 'B'};

        for (int i = 0; i < k; i++) {
            StringBuilder newSignal = new StringBuilder();

            for (char c : initialSignal.toCharArray()) {
                if (c == 'R') {
                    newSignal.append('G');
                } else if (c == 'G') {
                    newSignal.append('B');
                } else if (c == 'B') {
                    newSignal.append('R');
                }
            }

            initialSignal = newSignal.toString();
        }

        String[] finalStates = new String[initialSignal.length()];

        for (int i = 0; i < initialSignal.length(); i++) {
            finalStates[i] = getColorName(initialSignal.charAt(i));
        }

        return finalStates;
    }

    public static String getColorName(char colorCode) {
        switch (colorCode) {
            case 'R':
                return "Red";
            case 'G':
                return "Green";
            case 'B':
                return "Blue";
            default:
                return "Unknown";
        }
    }
}

