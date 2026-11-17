import java.util.Random;
import java.util.Scanner;

public class HigherLower {
    private static final Random RANDOM = new Random();
    private static final Youtuber[] YOUTUBER = {
            new Youtuber("Zee TV", 18_752_951L),
            new Youtuber("T-Series", 61_196_302L),
            new Youtuber("Cocomelon - Nursery Rhymes", 19_238_251L),
            new Youtuber("SET India", 31_180_559L),
            new Youtuber("WWE", 32_852_346L),
            new Youtuber("Movieclips", 17_149_705L)
    };

    public static void main(String[] args) {
        System.out.println("Higher / Lower - YouTube");
        System.out.println("Hat der naechste Kanal mehr oder weniger Abonnenten?");
        System.out.println("1: Mehr | 2: Weniger");

        try (Scanner eingabe = new Scanner(System.in)) {
            // TODO 1: Holt mit getRandomYoutuber() einen Startkanal.
            // Gebt seinen Namen und seine Abonnentenzahl aus.

            // TODO 2: Holt einen zweiten Kanal und zeigt nur seinen Namen an.
            // Zieht erneut, solange es dasselbe Objekt wie der Startkanal ist.

            // TODO 3: Fragt nach dem Tipp und lest ihn mit eingabe.nextInt() ein.

            // TODO 4: Vergleicht die Abonnentenzahlen mit getSubscribers().
            // Prueft, ob der Tipp stimmt. Bei Gleichstand gelten beide Tipps als richtig.
            // Deckt danach die Abonnentenzahl des zweiten Kanals auf.

            // TODO 5: Zaehlt richtige Tipps. Bei einem falschen Tipp endet das Spiel.

            // TODO 6: Wiederholt die Runden mit einer Schleife.
            // Nach einem Treffer wird der zweite Kanal zum neuen Vergleichskanal.
            // Gebt am Ende den Punktestand aus.

            // TODO Spaeter: Ersetzt die festen Daten durch das Einlesen von data.csv.
            // Danach kann eine Auswahl der Vergleichsgroesse hinzukommen.
        }
    }

    public static Youtuber getRandomYoutuber() {
        int index = RANDOM.nextInt(YOUTUBER.length);
        return YOUTUBER[index];
    }
}