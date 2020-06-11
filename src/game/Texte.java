package game;

public class Texte {
	
	
	
	// -------------------- Schl�sselw�rter Eingabe --------------------
	
	
	public static String keyWordgo = "GEH";
	public static String keyWordObserve = "SCHAU";
	public static String keyWordUse = "BENUTZ";
	public static String keyWordPickup = "HEBE";
	public static String keyWordDrop = "FALLEN";
	public static String keyWordHelp = "HILF";
	public static String keyWordExit = "EXIT";
	public static String keyWordNorth = "NORD";
	public static String keyWordSouth = "S�D";
	public static String keyWordEast = "OST";
	public static String keyWordWest = "WEST";
	public static String keyWordInventory = "INVENTAR";
	public static String keyWordSelf = "SELBST";
	public static String keyWordRoom = "RAUM";
	public static String keyWordDoor = "T�R";
	
	
	// -------------------- Himmelsrichtungen --------------------
	
	public static String himmelsrichtungNorden = "Norden";
	public static String himmelsrichtungSueden = "S�den";
	public static String himmelsrichtungWesten = "Westen";
	public static String himmelsrichtungOsten = "Osten";
	
	

	// -------------------- Spielmechanik-Texte --------------------
	
	public static String goNeedArkaneKubus = "Du brauchst einen besonderen Schl�ssel um diese T�r zu �ffnen.";
	public static String goDoorLocked = "Diese T�r ist verschlossen.";
	public static String goDoorwayUnpassable = "Dieser Durchgang ist versch�ttet.";
	public static String goYouLeave = "Du verl�sst den Raum in Richtung";
	public static String goNoExit = "Dort ist kein Ausgang.";
	
	public static String useItem = "Welches Item meinst du genau?";
	
	public static String pickUpItem1 = "Du hast";
	public static String pickUpItem2 = "aufgehoben.";
	public static String pickUpItemToHeavy = "Dieses Item ist zu schwer, als dass du es noch tragen k�nntest.";
	public static String pickUpItemNotFound = "Du kannst dieses Item hier nirgendwo finden.";
	
	public static String dropItem1 = "Du hast";
	public static String dropItem2 = "fallen gelassen.";
	public static String dropItemNotFound = "Du kannst nichts fallen lassen, was du nicht besitzt.";
	
	public static String helpMessage = "Anmerk: Alle Item-Namen sind Case-Sensitive." + "\n"
			+ "Hilfe - Zeigt alle g�ltigen Befehle an." + "\n"
			+ "Geh HIMMELSRICHTUNG - Bewegt dich in die entsprechende Himmelsrichtung" + "\n"
			+ "Schau PARAMETER - Gibt Informationen �ber einen Raum, eine T�r oder ein Item." + "\n"
			+ "Hebe ITEM - Nimmt ein Item auf, welches in diesem Raum liegt." + "\n"
			+ "Fallenlassen ITEM - L�sst ein Item fallen" + "\n"
			+ "Benutze ITEM - Verwendet ein Item." + "\n"
			+ "Exit - Beendet das Spiel.";
	
	public static String exitGame = "Spiel beendet.";
	
	public static String observeRoomToDark = "Es ist zu dunkel um irgendetwas zu erkennen.";
	
	public static String observeDoorMasterLocked = "Diese T�r ist mit Runen �berzogen.\n"
													+ "In ihrer mitte befindet sich eine gro�e rechteckige Vertiefung, als ob hier etwas herein geh�re.\n"
													+ "Als du sie ber�hrst, f�hlst du, wie deine Kraft durch deine Fingerspitzen entweicht.\n"
													+ "Schnell ziehst du die Hand wieder weg.";
	public static String observeDoorLocked = "Diese T�r ist mit einem simplen Schloss versehen. Du brauchst einen Schl�ssel um sie zu �ffnen.";
	public static String observeDoorUnpassable = "Dieser Durchgang ist versch�ttet und daher unpassierbar.";
	public static String observeDoorOpen = "Eine gew�hnliche T�r, sie ist nicht verriegelt.";
	public static String observeDoorNoExit= "Dort ist kein Ausgang.";
	
	public static String befolgeBefehlWhichDoor = "Welche T�r m�chtest du dir denn ansehen?";
	
	public static String befolgeBefehlWhatToLookAt = "";
	
	public static String befolgeBefehlWrongCommand = "";
	
	public static String betreteRaumAgain = "Hier warst du schon einmal.";
	public static String betreteRaumToDark = "Es ist zu dunkel um irgendetwas zu erkennen.";
	
	public static String commandTranslatorItem = "Du kannst immer nur ein Item auf einmal benutzen.";

	public static String startMessage = "Du erwachst. "
			+ "\nDeine Gliedma�en tun dir weh. "
			+ "\nDu weist nicht wo du bist. "
			+ "\nDu liegst in einer S�ule aus Licht."
			+ "\nEs scheint aus einem Loch in der Decke zu kommen."
			+ "\nGro� genug, als das du h�ttest hindurch fallen k�nnen."
			+ "\nAu�erhalb des Kegels aus Licht ist nur finsterste Dunkelheit."
			+ "\nZu deinem F��en liegen Tr�mmer von Ziegelsteinen und eine alte �l-Lampe."
			+ "\nZeit einen Weg hier raus zu finden."
			+ "\nWas m�chtest du tun?";
	
	public static String checkForDoors = "Dieser Raum hat T�ren im";

	public static String deathMessage = "Du erliegst deinen Wunden, deine Leiche wird auf Jahrhunderte hinaus in diesem Kerker verrotten.\nGame Over";

	// -------------------- Helden-Texte --------------------
	
	
	public static String heldzeigeGewicht = "Belastung";
	
	public static String heldZeigeInventar = "Dein Inventar besteht aus diesen Items";
	
	public static String heldZeigeLeben = "Leben";
	
	public static String heldHeilung1 = "Du wurdest um";
	public static String heldHeilung2 = "Leben geheilt.";
	public static String heldHeilung3 = "Du sp�rst keine Ver�nderung.";
	
	public static String heldSchaden1 = "Mit deinem Schild konntest du den Schaden abwehren.";
	public static String heldSchaden2 = "Du hast";
	public static String heldSchaden3 = "Schaden bekommen.";
	
	public static String heldKraftRauf = "Du f�hlst dich st�rker.";
	
	
	// -------------------- R�ume --------------------

	public static String[][] raumTexte = new String[6][6];
	
	public static void addRaumTexte() {	
		raumTexte[1][1] = "";
		raumTexte[2][1] = "";
		raumTexte[3][1] = "";
		raumTexte[4][1] = "";
		
		raumTexte[1][2] = "";
		raumTexte[2][2] = "";
		raumTexte[3][2] = "";
		raumTexte[4][2] = "";
		
		raumTexte[1][3] = "";
		raumTexte[2][3] = "";
		raumTexte[3][3] = "";
		raumTexte[4][3] = "";
		
		raumTexte[1][4] = "";
		raumTexte[2][4] = "";
		raumTexte[3][5] = "";
		raumTexte[4][5] = "";
		
		raumTexte[5][2] = "";	
	}
		
	// -------------------- Items --------------------
	
	//itemID: 0
	public static String itemName0 = "Platzhalter";
	public static String itemBeschreibung0 = "Platzhalter";
	
	//itemID: 1
	public static String itemName1 = "Schl�ssel";
	public static String itemBeschreibung1 = "Ein einfacher kleiner Schl�ssel aus Eisen.";
	public static String item1WhichDoor = "Welche T�r m�chtest du damit �ffnen?";
	public static String item1Success = "Die T�r wurde entriegelt, dein Schl�ssel bricht dabei ab.";
	public static String item1NotLocked = "Diese T�r ist nicht verschlossen.";
	
	//itemID: 2
	public static String itemName2 = "Heiltrank";
	public static String itemBeschreibung2 = "Ein pyramidenf�rmiges Fl�schchen, verkorkt und mit irisierend roter Fl�ssigkeit darin.";
	public static String item2FullHealth = "Du bist bereits bei voller Gesundheit.";
	
	//itemID: 3
	public static String itemName3 = "Schild";
	public static String itemBeschreibung3 = "Ein stabiler Schild aus Stahl.\n"
											+ "Ihn ziert das Wappen eines unbekannten Reiches.\n"
											+ "Es zeigt einen roten stilisierten Vogel unter drei goldenen Dreiecken.";
	public static String item3Drop = "Du l�sst den Schild fallen, nun f�hlst du dich ein wenig schutzlos.";
	public static String item3Equip = "Du nimmst das Schild aus deiner Hand und h�ngst es an deinen Rucksack.";
	public static String item3DeEquip = "Du streifst das Schild �ber deinen Unterarm, es f�hlt sich robust an.";
	
	//itemID: 4
	public static String itemName4 = "Flusen";
	public static String itemBeschreibung4 = "Filzig und staubig. Die sind zu nicht zu gebrauchen.";
	
	//itemID: 5
	public static String itemName5 = "Kompass";
	public static String itemBeschreibung5 = "Ein rundes Ger�t aus Blech, es passt perfekt in deine Hand und seine Nadel zeigt stehts nach Norden.";
	public static String item5Use = "Deine Koordinaten";
	public static String item5ToDark = "Es ist zu dunkel um zu erkennen was dein Kompass anzeigt.";
	
	
	//itemID: 6
	public static String itemName6 = "Lampe";
	public static String itemBeschreibung6 = "Eine �l-Lampe, sie hat 4 kleine Scheiben und ein Drehknopf zum entz�nden.";
	public static String item6DropEffect = "Die Lampe geht aus, es wird dunkel.";
	public static String item6UseOn = "Du l�scht das Feuer deiner Lampe, es wird dunkel.";
	public static String item6UseOff = "Du z�ndest die Lampe an, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.";
	public static String item6ExtOn = "Das Feuer deiner Lampe erlischt, es wird dunkel.";
	public static String item6ExtOff = "Deine Lampe entz�ndet sich, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.";
	
	//itemID: 7
	public static String itemName7 = "Arkankubus";
	public static String itemBeschreibung7 = "Ein W�rfel voll unermesslicher Magie.\n"
											+ "Er misst etwa 20 cm Kantenl�nge und ist mit blau leuchtenden Runen verziert.\n"
											+ "Was diese Schrift bedeuten soll wei�t du nicht.\n"
											+ "Jedoch sp�rst du, dass deine H�nde an dem W�rfel zu kleben scheinen, es kostet f�rmlich Kraft sie zu l�sen.\n";
	public static String item7WhichDoor = "Was genau willst du mit dem Kubus anstellen?";
	public static String item7Success = "Als du dich der T�r mit dem Kubus n�herst, gleitet er dir ruckartig aus der Hand.\n"
										+ "Er donnert gegen die T�r und steckt nun genau in der daf�r vorgesehenen �ffnung.\n"
										+ "Der Einschlag f�hrt dir durch alle Glieder und l�sst dich f�r einen Augenblick gel�hmt zur�ck.\n"
										+ "Der Kubus leuchtet nocheinmal hell auf, bevor seine Runen erl�schen.\n"
										+ "Daraufhin beginnt der Boden zu beben und die T�r f�hrt langsam in den Boden hinein.\n"
										+ "Dahinter kannst du nur blendend helles Licht erkennen, deine Augen wollen sich nicht wirklich daran gew�hnen.";
	public static String item7NotLocked = "Der Kubus bewirkt hier nichts.";
	//itemID: 8
	public static String itemName8 = "Phiole";
	public static String itemBeschreibung8 = "Mhhh, lecker Zuckerwasser.";
	
	//itemID: 8
	public static String itemName9 = "Krafttrank";
	public static String itemBeschreibung9 = "Eine staubgraue Fl�ssigkeit in einer kleinen Flasche. Sieht nicht sehr appetitlich aus.";
	public static String item9Use = "Die Fl�ssigkeit schmeckt widerlich, aber einen Moment sp�ter sp�rst du einen Kraftschub durch alle deine Glieder.\n"
									+ "Du f�hlst dich, als k�nntest du B�ume ausrei�en.";
	
	// -------------------- Events --------------------
	
	//itemID: 20 - Finale
	public static String eventName20 = "";
	public static String eventBeschreibung20 = "";
	
	//itemID: 21 - Bodenstacheln
	public static String eventName21 = "";
	public static String eventBeschreibung21 = "";
	
	//itemID: 22- Pfeilfalle
	public static String eventName22 = "";
	public static String eventBeschreibung22 = "";
	
	//itemID: 23 - KeyBlocker
	public static String eventName23 = "";
	public static String eventBeschreibung23 = "";
		
	//itemID: 24 - T�rVernichter
	public static String eventName24 = "";
	public static String eventBeschreibung24 = "";
	
	//itemID: 25 - Bodenloses Loch
	public static String eventName25 = "";
	public static String eventBeschreibung25 = "";
	
	//itemID: 26 - Trankpuzzle
	public static String eventName26 = "";
	public static String eventBeschreibung26 = "";
	
	//itemID: 27 - GiftPfeilPuzzle
	public static String eventName27 = "";
	public static String eventBeschreibung27 = "";
	
	//itemID: 28 - ArmFallenPuzzle
	public static String eventName28 = "";
	public static String eventBeschreibung28 = "";
	
	//itemID: 29 - SphinxPuzzle
	public static String eventName29 = "";
	public static String eventBeschreibung29 = "";
			
	//itemID: 30 - Altar
	public static String eventName30 = "";
	public static String eventBeschreibung30 = "";
	
	//itemID: 31 - altFinale
	public static String eventName31 = "";
	public static String eventBeschreibung31 = "";

	



	
	
	
	
	
}
