package game;

public class Texte {
	
	
	
	// -------------------- Schlüsselwörter Eingabe --------------------
	
	
	public static String keyWordgo = "GEH";
	public static String keyWordObserve = "SCHAU";
	public static String keyWordUse = "BENUTZ";
	public static String keyWordPickup = "HEBE";
	public static String keyWordDrop = "FALLEN";
	public static String keyWordHelp = "HILF";
	public static String keyWordExit = "EXIT";
	public static String keyWordNorth = "NORD";
	public static String keyWordSouth = "SÜD";
	public static String keyWordEast = "OST";
	public static String keyWordWest = "WEST";
	public static String keyWordInventory = "INVENTAR";
	public static String keyWordSelf = "SELBST";
	public static String keyWordRoom = "RAUM";
	public static String keyWordDoor = "TÜR";
	
	
	// -------------------- Himmelsrichtungen --------------------
	
	public static String himmelsrichtungNorden = "Norden";
	public static String himmelsrichtungSueden = "Süden";
	public static String himmelsrichtungWesten = "Westen";
	public static String himmelsrichtungOsten = "Osten";
	
	

	// -------------------- Spielmechanik-Texte --------------------
	
	public static String goNeedArkaneKubus = "Du brauchst einen besonderen Schlüssel um diese Tür zu öffnen.";
	public static String goDoorLocked = "Diese Tür ist verschlossen.";
	public static String goDoorwayUnpassable = "Dieser Durchgang ist verschüttet.";
	public static String goYouLeave = "Du verlässt den Raum in Richtung";
	public static String goNoExit = "Dort ist kein Ausgang.";
	
	public static String useItem = "Welches Item meinst du genau?";
	
	public static String pickUpItem1 = "Du hast";
	public static String pickUpItem2 = "aufgehoben.";
	public static String pickUpItemToHeavy = "Dieses Item ist zu schwer, als dass du es noch tragen könntest.";
	public static String pickUpItemNotFound = "Du kannst dieses Item hier nirgendwo finden.";
	
	public static String dropItem1 = "Du hast";
	public static String dropItem2 = "fallen gelassen.";
	public static String dropItemNotFound = "Du kannst nichts fallen lassen, was du nicht besitzt.";
	
	public static String helpMessage = "Anmerk: Alle Item-Namen sind Case-Sensitive." + "\n"
			+ "Hilfe - Zeigt alle gültigen Befehle an." + "\n"
			+ "Geh HIMMELSRICHTUNG - Bewegt dich in die entsprechende Himmelsrichtung" + "\n"
			+ "Schau PARAMETER - Gibt Informationen über einen Raum, eine Tür oder ein Item." + "\n"
			+ "Hebe ITEM - Nimmt ein Item auf, welches in diesem Raum liegt." + "\n"
			+ "Fallenlassen ITEM - Lässt ein Item fallen" + "\n"
			+ "Benutze ITEM - Verwendet ein Item." + "\n"
			+ "Exit - Beendet das Spiel.";
	
	public static String exitGame = "Spiel beendet.";
	
	public static String observeRoomToDark = "Es ist zu dunkel um irgendetwas zu erkennen.";
	
	public static String observeDoorMasterLocked = "Diese Tür ist mit Runen überzogen.\n"
													+ "In ihrer mitte befindet sich eine große rechteckige Vertiefung, als ob hier etwas herein gehöre.\n"
													+ "Als du sie berührst, fühlst du, wie deine Kraft durch deine Fingerspitzen entweicht.\n"
													+ "Schnell ziehst du die Hand wieder weg.";
	public static String observeDoorLocked = "Diese Tür ist mit einem simplen Schloss versehen. Du brauchst einen Schlüssel um sie zu öffnen.";
	public static String observeDoorUnpassable = "Dieser Durchgang ist verschüttet und daher unpassierbar.";
	public static String observeDoorOpen = "Eine gewöhnliche Tür, sie ist nicht verriegelt.";
	public static String observeDoorNoExit= "Dort ist kein Ausgang.";
	
	public static String befolgeBefehlWhichDoor = "Welche Tür möchtest du dir denn ansehen?";
	
	public static String befolgeBefehlWhatToLookAt = "";
	
	public static String befolgeBefehlWrongCommand = "";
	
	public static String betreteRaumAgain = "Hier warst du schon einmal.";
	public static String betreteRaumToDark = "Es ist zu dunkel um irgendetwas zu erkennen.";
	
	public static String commandTranslatorItem = "Du kannst immer nur ein Item auf einmal benutzen.";

	public static String startMessage = "Du erwachst. "
			+ "\nDeine Gliedmaßen tun dir weh. "
			+ "\nDu weist nicht wo du bist. "
			+ "\nDu liegst in einer Säule aus Licht."
			+ "\nEs scheint aus einem Loch in der Decke zu kommen."
			+ "\nGroß genug, als das du hättest hindurch fallen können."
			+ "\nAußerhalb des Kegels aus Licht ist nur finsterste Dunkelheit."
			+ "\nZu deinem Füßen liegen Trümmer von Ziegelsteinen und eine alte Öl-Lampe."
			+ "\nZeit einen Weg hier raus zu finden."
			+ "\nWas möchtest du tun?";
	
	public static String checkForDoors = "Dieser Raum hat Türen im";

	public static String deathMessage = "Du erliegst deinen Wunden, deine Leiche wird auf Jahrhunderte hinaus in diesem Kerker verrotten.\nGame Over";

	// -------------------- Helden-Texte --------------------
	
	
	public static String heldzeigeGewicht = "Belastung";
	
	public static String heldZeigeInventar = "Dein Inventar besteht aus diesen Items";
	
	public static String heldZeigeLeben = "Leben";
	
	public static String heldHeilung1 = "Du wurdest um";
	public static String heldHeilung2 = "Leben geheilt.";
	public static String heldHeilung3 = "Du spürst keine Veränderung.";
	
	public static String heldSchaden1 = "Mit deinem Schild konntest du den Schaden abwehren.";
	public static String heldSchaden2 = "Du hast";
	public static String heldSchaden3 = "Schaden bekommen.";
	
	public static String heldKraftRauf = "Du fühlst dich stärker.";
	
	
	// -------------------- Räume --------------------

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
	public static String itemName1 = "Schlüssel";
	public static String itemBeschreibung1 = "Ein einfacher kleiner Schlüssel aus Eisen.";
	public static String item1WhichDoor = "Welche Tür möchtest du damit öffnen?";
	public static String item1Success = "Die Tür wurde entriegelt, dein Schlüssel bricht dabei ab.";
	public static String item1NotLocked = "Diese Tür ist nicht verschlossen.";
	
	//itemID: 2
	public static String itemName2 = "Heiltrank";
	public static String itemBeschreibung2 = "Ein pyramidenförmiges Fläschchen, verkorkt und mit irisierend roter Flüssigkeit darin.";
	public static String item2FullHealth = "Du bist bereits bei voller Gesundheit.";
	
	//itemID: 3
	public static String itemName3 = "Schild";
	public static String itemBeschreibung3 = "Ein stabiler Schild aus Stahl.\n"
											+ "Ihn ziert das Wappen eines unbekannten Reiches.\n"
											+ "Es zeigt einen roten stilisierten Vogel unter drei goldenen Dreiecken.";
	public static String item3Drop = "Du lässt den Schild fallen, nun fühlst du dich ein wenig schutzlos.";
	public static String item3Equip = "Du nimmst das Schild aus deiner Hand und hängst es an deinen Rucksack.";
	public static String item3DeEquip = "Du streifst das Schild über deinen Unterarm, es fühlt sich robust an.";
	
	//itemID: 4
	public static String itemName4 = "Flusen";
	public static String itemBeschreibung4 = "Filzig und staubig. Die sind zu nicht zu gebrauchen.";
	
	//itemID: 5
	public static String itemName5 = "Kompass";
	public static String itemBeschreibung5 = "Ein rundes Gerät aus Blech, es passt perfekt in deine Hand und seine Nadel zeigt stehts nach Norden.";
	public static String item5Use = "Deine Koordinaten";
	public static String item5ToDark = "Es ist zu dunkel um zu erkennen was dein Kompass anzeigt.";
	
	
	//itemID: 6
	public static String itemName6 = "Lampe";
	public static String itemBeschreibung6 = "Eine Öl-Lampe, sie hat 4 kleine Scheiben und ein Drehknopf zum entzünden.";
	public static String item6DropEffect = "Die Lampe geht aus, es wird dunkel.";
	public static String item6UseOn = "Du löscht das Feuer deiner Lampe, es wird dunkel.";
	public static String item6UseOff = "Du zündest die Lampe an, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.";
	public static String item6ExtOn = "Das Feuer deiner Lampe erlischt, es wird dunkel.";
	public static String item6ExtOff = "Deine Lampe entzündet sich, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.";
	
	//itemID: 7
	public static String itemName7 = "Arkankubus";
	public static String itemBeschreibung7 = "Ein Würfel voll unermesslicher Magie.\n"
											+ "Er misst etwa 20 cm Kantenlänge und ist mit blau leuchtenden Runen verziert.\n"
											+ "Was diese Schrift bedeuten soll weißt du nicht.\n"
											+ "Jedoch spürst du, dass deine Hände an dem Würfel zu kleben scheinen, es kostet förmlich Kraft sie zu lösen.\n";
	public static String item7WhichDoor = "Was genau willst du mit dem Kubus anstellen?";
	public static String item7Success = "Als du dich der Tür mit dem Kubus näherst, gleitet er dir ruckartig aus der Hand.\n"
										+ "Er donnert gegen die Tür und steckt nun genau in der dafür vorgesehenen Öffnung.\n"
										+ "Der Einschlag fährt dir durch alle Glieder und lässt dich für einen Augenblick gelähmt zurück.\n"
										+ "Der Kubus leuchtet nocheinmal hell auf, bevor seine Runen erlöschen.\n"
										+ "Daraufhin beginnt der Boden zu beben und die Tür fährt langsam in den Boden hinein.\n"
										+ "Dahinter kannst du nur blendend helles Licht erkennen, deine Augen wollen sich nicht wirklich daran gewöhnen.";
	public static String item7NotLocked = "Der Kubus bewirkt hier nichts.";
	//itemID: 8
	public static String itemName8 = "Phiole";
	public static String itemBeschreibung8 = "Mhhh, lecker Zuckerwasser.";
	
	//itemID: 8
	public static String itemName9 = "Krafttrank";
	public static String itemBeschreibung9 = "Eine staubgraue Flüssigkeit in einer kleinen Flasche. Sieht nicht sehr appetitlich aus.";
	public static String item9Use = "Die Flüssigkeit schmeckt widerlich, aber einen Moment später spürst du einen Kraftschub durch alle deine Glieder.\n"
									+ "Du fühlst dich, als könntest du Bäume ausreißen.";
	
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
		
	//itemID: 24 - TürVernichter
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
