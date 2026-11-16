# Zugverwaltung - Einzelarbeit

Dieses Geruest gehoert zu den sieben Aufgaben und der Bonusaufgabe aus dem Aufgabenblatt. Die Loesungen bleiben offen. Bearbeite die nummerierten TODOs der Reihe nach, nicht alle Dateien gleichzeitig.

## Start in IntelliJ

- Starte die `main`-Methode in `Zugverwaltung.java` ueber das gruene Dreieck.
- Die vorhandene Modulkonfiguration enthaelt diesen Ordner als zusaetzlichen Quellordner. Falls IntelliJ die Aenderung nicht uebernimmt, lade das Projekt neu oder markiere `Zugverwaltung` als Sources Root.
- Das Geruest gibt zunaechst nur eine Begruessung aus. Weitere Ausgaben und Eingaben entstehen durch deine Implementierung.
- Das Zug-Suchspiel bleibt eine eigene Anwendung mit eigener `main`-Methode.

## Aufgabe 1 - Klasse Train erstellen

Ergaenze in `Train.java` die Attribute `trainNumber`, `platform` und `delay`. Erstelle einen Konstruktor sowie Getter und Setter. Erzeuge in `Zugverwaltung.main` mindestens drei Objekte und gib ihre Daten aus.

## Aufgabe 2 - Objektverhalten ergaenzen

Erweitere `Train` um `increaseDelay(int minutes)`, `isDelayed()` und `printInformation()`. Probiere die Methoden an deinen Objekten aus.

## Aufgabe 3 - Vererbung

Lass `RegionalTrain` und `HighSpeedTrain` von `Train` erben und ergaenze `maxSpeed`. Die vorbereiteten Klassen haben noch keine Oberklasse. Ergaenze auch passende Konstruktoren.

## Aufgabe 4 - Polymorphie

Implementiere `getTrainType()` in `Train` und ueberschreibe die Methode in den abgeleiteten Klassen. Rufe sie fuer verschiedene Zugarten ueber Referenzen vom Typ `Train` auf.

## Aufgabe 5 - Bahnsteig-Konflikte erkennen

Erweitere `Train` um `arrival` und `departure`. Erkenne zeitliche Ueberschneidungen am selben Bahnsteig.

Klaere vorab mit deinem Betreuer: Welche Rolle spielt die Verspaetung? Gilt eine Abfahrt genau zur Ankunft des naechsten Zuges schon als Konflikt? Fuer den Einstieg koennt ihr Zeiten innerhalb desselben Tages betrachten.

## Aufgabe 6 - CSV-Datei einlesen

Lies `zuege.csv` ein und erstelle aus jeder Datenzeile ein `Train`-Objekt. Die Datei verwendet Kommas als Trennzeichen. Zeiten stehen im Format `HH:mm`, Verspaetungen in Minuten. Die erste Zeile ist eine Kopfzeile und kein Zug.

Der Dateipfad ist relativ zum Arbeitsverzeichnis der Run-Konfiguration: Bei Projektwurzel als Arbeitsverzeichnis lautet er `Zugverwaltung/zuege.csv`, bei diesem Aufgabenordner als Arbeitsverzeichnis nur `zuege.csv`.

## Aufgabe 7 - Klasse Station

Ergaenze `Station` um `name` und eine `List<Train>`. Implementiere `addTrain(...)`, `removeTrain(...)`, `showAllTrains()` und `calculateAverageDelay()`. Ueberlege, welche Parameter und Rueckgabetypen gebraucht werden und wie eine leere Station behandelt wird.

## Bonus - Konsolenbasiertes Zugverwaltungssystem

Ergaenze einen Pseudo-Login mit Benutzername, Passwort und Anmeldebestaetigung. Nutze nur erfundene Zugangsdaten: Das ist eine Uebung, keine echte sichere Anmeldung.

Zeige anschliessend wiederholt dieses Menue an:

1. Alle Zuginformationen anzeigen
2. Zug hinzufuegen
3. Zug entfernen
4. Verspaetung eines Zuges aendern
5. Alle Zuege einer Station anzeigen
6. Durchschnittliche Verspaetung berechnen
7. Bahnsteig-Konflikte anzeigen
8. Programm beenden

Verwende dafuer die bereits erstellten Klassen `Train`, `RegionalTrain`, `HighSpeedTrain` und `Station`.