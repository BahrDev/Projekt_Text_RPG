# Projekt_Text_RPG
Eine Übungsaufgabe aus dem Modul Anwendungsentwicklung. 
Wurde mir zugespielt von einer Mitschülerin, die mir ein halbes Jahr vorraus ist. 
Werde die Aufgabe eigenständig bearbeiten und hier Updaten.


Die Aufgabe leutet im Original wie folgt:

Schreiben Sie ein textbasiertes Adventure-Spiel mit folgenden Spielbedingungen:

- Der Held befindet sich irgendwo in einem Gebäude
- Das Gebäude besteht aus Räumen
- Das Gebäude hat einen Ausgang
- Ziel des Spieles ist es, das Gebäude zu verlassen
- Der Held kann sich von Raum zu Raum vor und zurück durch Türen bewegen
- Jeder Raum hat mindestens eine/oder keine Tür in eine der Himmelsrichtungen
- Jeder Raum beinhaltet bestimmte Gegenstände(oder auch keine)
	-Gegenstände lassen sich folgendermassen einteilen: 
		1. Gegenstände, welche der Held mitnehmen kann
		2. Gegenstände, welche ein Rätsel stellen (Um damit ein Item freizugeben)
		3. Gegenstände, welche sich nicht mitnehmen lassen
		4. Gegenstände, welche man essen kann, beeinflussen die Primärfähigkeiten Kraft und Leben positiv/negativ 
		5. Jeder mitnehmbare Gegenstand hat ein Gewicht
		6. Der Held kann, abhängig von seiner Kraft, Gegenstände eines bestimmten Gesamtgewichts tragen
		7. Gegenstände, welche sich erst öffnen lassen/etwas freigeben, wenn ein bestimmter anderer Gegenstand dafür eingesetzt wird
		8. Evtl. geben bestimmte Gegenstände beim betrachten nur Tipps/Hinweise

- Mitnehmbare Gegenstände kann der Held in jedem beliebigen Raum wieder ablegen
- Befehle werden textgesteurt abgesetzt ("nehme Gegenstand", "verlasse Raum süden" ...) -> Parser interpretiert diese Eingaben und wandelt sie
  in Befehle um.
- Als Hilfsfunktion kann man sich alle gültigen Befehle ausgeben lassen(z.b. mit "help commands")
- Manche Türen sind abgeschossen (passendes Item Schlüssel muss gefunden werden)
- Ausgangstür ist grundsätzlich immer abgeschlossen
- Beim Betreten eines Raumes wird eine Kurzbeschreibung des Raumes ausgegeben ("Kleine, dunkle Kammer" .....)
- Man kann sich alle Gegenstände des Raumes ausgeben lassen
- Zu jedem Gegenstand kann man eine Kurzbeschreibung und Hinweise ausgeben lassen
- Sinkt die Primärfähigkeit "Leben" auf 0, so stirbt der Held

Entwerfen Sie ein OOP-Klassenkonzept, welches in der Lage ist, das beschriebene Problem zu lösen!
Eine Zentrale Klasse "Spiel" soll dabei die Spiellogik steuern. 

Entwerfen Sie eine Spielwelt. welche aus Räumen, Türen und Items besteht. Es soll immer dieselbe Welt am Anfang des Spiels geladen und
bespielbar sein(Der Einfachheit halber).

Seien Sie kreativ. 

Tipp: Benutzen Sie für jedes Raum-Objekt intern ein HashMap für die Verwaltung der Ausgänge. 


