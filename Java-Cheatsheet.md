# Java-Cheatsheet - Die ersten Schritte

## 1. Das kleinste Programm

Die Datei heisst `Sandbox.java`. Klassenname und Dateiname muessen zusammenpassen.

```java
public class Sandbox {
    public static void main(String[] args) {
        System.out.println("Hallo Welt!");
    }
}
```

Euren eigenen Code schreibt ihr zunaechst zwischen die geschweiften Klammern der `main`-Methode. Die Anweisungen werden von oben nach unten ausgefuehrt.

## 2. Variablen - Werte merken

Eine Variable hat einen **Datentyp**, einen **Namen** und einen **Wert**.

```java
int alter = 14;
```

Allgemeiner Aufbau: `Datentyp name = wert;`

| Datentyp | Wofuer? | Beispiel |
| --- | --- | --- |
| `int` | Ganze Zahlen | `int punkte = 0;` |
| `long` | Besonders grosse ganze Zahlen | `long aufrufe = 47_548_839_843L;` |
| `double` | Kommazahlen | `double preis = 2.50;` |
| `boolean` | Wahr oder falsch | `boolean gefunden = false;` |
| `char` | Ein einzelnes Zeichen | `char auswahl = 'A';` |
| `String` | Text | `String name = "Alex";` |

- Kommazahlen werden im Code mit einem **Punkt** geschrieben: `2.50`.
- Text steht in **doppelten** Anfuehrungszeichen, ein `char` in **einfachen**.
- `String` wird grossgeschrieben, die anderen Datentypen in der Tabelle klein.
- Das `L` kennzeichnet eine `long`-Zahl. Unterstriche in Zahlen verbessern nur die Lesbarkeit.
- Ein `int` reicht von -2.147.483.648 bis 2.147.483.647. Fuer groessere Zahlen braucht ihr zum Beispiel `long`.

## 3. Werte aendern

```java
int punkte = 0;
punkte = 5;
punkte = punkte + 1;
punkte++;
```

Der Datentyp steht nur beim Anlegen der Variablen davor. `punkte++` erhoeht den Wert um eins. Nach diesen vier Zeilen ist `punkte` gleich `7`.

Ein Wert, der nicht mehr geaendert werden darf:

```java
final int MAX_VERSUCHE = 7;
```

## 4. Etwas ausgeben

```java
String name = "Alex";
int punkte = 3;

System.out.println("Hallo!");
System.out.println(name);
System.out.println("Punkte: " + punkte);
System.out.print("Dein Tipp: ");
```

`println` beginnt nach der Ausgabe eine neue Zeile. `print` bleibt in derselben Zeile. Mit `+` koennt ihr Text und Werte verbinden.

## 5. Rechnen

| Zeichen | Bedeutung | Beispiel | Ergebnis |
| --- | --- | --- | --- |
| `+` | Plus | `5 + 2` | `7` |
| `-` | Minus | `5 - 2` | `3` |
| `*` | Mal | `5 * 2` | `10` |
| `/` | Geteilt | `5 / 2` | `2` |
| `%` | Rest einer Division | `5 % 2` | `1` |

**Achtung:** Ganze Zahl geteilt durch ganze Zahl ergibt in Java wieder eine ganze Zahl.

```java
double ergebnis = 5.0 / 2;  // 2.5
int summe = (3 + 2) * 4;   // 20
```

## 6. Werte vergleichen

Ein Vergleich ergibt immer `true` oder `false`.

| Zeichen | Bedeutung | Beispiel |
| --- | --- | --- |
| `==` | Gleich | `tipp == zugposition` |
| `!=` | Ungleich | `tipp != zugposition` |
| `<` | Kleiner | `tipp < zugposition` |
| `>` | Groesser | `tipp > zugposition` |
| `<=` | Kleiner oder gleich | `punkte <= 10` |
| `>=` | Groesser oder gleich | `alter >= 14` |

**Wichtig:** `=` weist einen Wert zu. `==` vergleicht Werte.

Textinhalte vergleicht ihr mit `.equals()`, nicht mit `==`:

```java
String name = "Alex";
boolean gleicherName = name.equals("Alex");
```

## 7. Entscheidungen mit if / else

```java
int tipp = 40;
int zugposition = 65;

if (tipp < zugposition) {
    System.out.println("Die gesuchte Zahl ist hoeher.");
} else if (tipp > zugposition) {
    System.out.println("Die gesuchte Zahl ist niedriger.");
} else {
    System.out.println("Gefunden!");
}
```

`if` bedeutet **wenn**, `else if` bedeutet **sonst wenn**, `else` bedeutet **sonst**.

Bedingungen verbinden:

```java
boolean imBereich = tipp >= 1 && tipp <= 100;
boolean passendeAuswahl = tipp == 1 || tipp == 2;
boolean nichtGefunden = !gefunden;
```

`&&` = und, `||` = oder, `!` = nicht. Die letzte Zeile setzt voraus, dass eine `boolean`-Variable namens `gefunden` existiert.

## 8. Eingaben mit Scanner

Vollstaendiges Beispiel fuer eine Zahleneingabe:

```java
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        try (Scanner eingabe = new Scanner(System.in)) {
            System.out.print("Wie alt bist du? ");
            int alter = eingabe.nextInt();
            System.out.println("Du bist " + alter + " Jahre alt.");
        }
    }
}
```

Im Run-Fenster eine ganze Zahl eingeben und **Enter** druecken.

- `eingabe.nextInt()` liest eine ganze Zahl.
- `eingabe.nextLine()` liest eine Textzeile.
- Wenn auf `nextInt()` eine Texteingabe mit `nextLine()` folgt, zuerst einmal zusaetzlich `eingabe.nextLine();` aufrufen. Das verbraucht den uebrig gebliebenen Zeilenumbruch.
- Fuer den Einstieg setzen wir passende Eingaben voraus.

## 9. Wiederholen mit while

```java
int versuch = 1;

while (versuch <= 3) {
    System.out.println("Versuch " + versuch);
    versuch++;
}
```

Der Block wird wiederholt, **solange** die Bedingung wahr ist. Hier erscheinen die Versuche 1, 2 und 3. Aendert sich die Bedingung nie, kann eine Endlosschleife entstehen.

## 10. Die wichtigsten Schreibregeln

- Anweisungen wie Zuweisungen und Methodenaufrufe enden mit `;`.
- Bloecke stehen zwischen `{` und `}`. Hinter dem Kopf von `if` oder `while` steht kein Semikolon.
- Gross- und Kleinschreibung zaehlt: `punkte` und `Punkte` sind verschiedene Namen.
- Variablen klein beginnen und ohne Leerzeichen schreiben: `anzahlVersuche`.
- Mit `//` beginnt ein Kommentar bis zum Zeilenende. Er wird nicht ausgefuehrt.
- Beispiele sind einzeln gedacht. Fuegt nicht alle Bloecke unveraendert zusammen, sonst werden manche Variablen mehrfach angelegt.