import java.util.Scanner;

class ProgramTreningowy {

    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("=== Program Treningowy ===");
        System.out.println("==========================");
        System.out.println("Proszę wybrać partię mięśniową (Klata/Plecy):");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input.toLowerCase()) {
            case "klata":
                TreningKlaty.wykonajTrening();
                break;
            case "plecy":
                TreningPlecow.wykonajTrening();
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
                break;
        }

        scanner.close();
    }
}

class TreningKlaty {

    public static void wykonajTrening() {
        System.out.println("Wybrano trening dla klatki piersiowej.");
        System.out.println("Wykonaj następujące ćwiczenia:");
        String[] exercises = {
                "Wyciskanie sztangi na ławce płaskiej (6/8 powtórzeń x3)",
                "Rozpiętki na bramie (Do upadku mięśniowego)",
                "Dipy (10 powtórzeń x3)"
        };
        printExercises(exercises);
    }

    public static void printExercises(String[] exercises) {
        for (String exercise : exercises) {
            System.out.println("- " + exercise);
        }
    }
}

class TreningPlecow {

    public static void wykonajTrening() {
        System.out.println("Wybrano trening dla pleców.");
        System.out.println("Wykonaj następujące ćwiczenia:");
        String[] exercises = {
                "Martwy ciąg (6/8 powtórzeń x3)",
                "Wiosłowanie sztangą (10 powtórzeń x3)",
                "Podciąganie na drążku (Do upadku mięśniowego)"
        };
        printExercises(exercises);
    }

    public static void printExercises(String[] exercises) {
        for (String exercise : exercises) {
            System.out.println("- " + exercise);
        }
    }
}