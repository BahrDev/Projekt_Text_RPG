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
	
	public static String intro = "    /\\        | |             | |        | |              \n" + 
								 "   /  \\   _ __| | ____ _ _ __ | | ___   _| |__  _   _ ___ \n" + 
								 "  / /\\ \\ | '__| |/ / _` | '_ \\| |/ / | | | '_ \\| | | / __|\n" + 
								 " / ____ \\| |  |   < (_| | | | |   <| |_| | |_) | |_| \\__ \\\n" + 
								 "/_/    \\_\\_|  |_|\\_\\__,_|_| |_|_|\\_\\\\__,_|_.__/ \\__,_|___/\n" + 
								 "==========================================================\n" + 
								 "Drücke Enter zum starten!";
	
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
	
	public static String exitAbfrageForced = "Drücke Enter zum Beenden!";
	public static String exitAbfrageChoice = "Spiel beenden? Yes or No?";
	public static String exitSpielBeenden = "Spiel beendet.";
	
	public static String observeRoomToDark = "Es ist zu dunkel um irgendetwas zu erkennen.";
	
	public static String observeDoorMasterLocked = "Diese Tür ist mit Runen überzogen.\n"
													+ "In ihrer mitte befindet sich eine große rechteckige Vertiefung, als ob hier etwas herein gehöre.\n"
													+ "Als du sie berührst, fühlst du, wie deine Kraft durch deine Fingerspitzen entweicht.\n"
													+ "Schnell ziehst du die Hand wieder weg.";
	public static String observeDoorLocked = "Diese Tür ist mit einem simplen Schloss versehen. Du brauchst einen Schlüssel um sie zu öffnen.";
	public static String observeDoorUnpassable = "Dieser Durchgang ist verschüttet und daher unpassierbar.";
	public static String observeDoorOpen = "Eine gewöhnliche Tür, sie ist nicht verriegelt.";
	public static String observeDoorNoExit= "Dort ist kein Ausgang.";
	
	public static String befolgeBefehlWohin = "Durch welche Tür möchtest du gehen?";
	public static String befolgeBefehlWhichDoor = "Welche Tür möchtest du dir denn ansehen?";
	public static String befolgeBefehlWhatToLookAt = "Was genau möchtest du dir ansehen?";
	public static String befolgeBefehlWrongCommand = "Du möchtest was tun?";
	
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
			+ "\nZeit einen Weg hier heraus zu finden."
			+ "\nDu könntest um Hilfe rufen."
			+ "\nWas möchtest du tun?";
	
	public static String checkForDoors = "Dieser Raum hat Türen im";

	public static String deathMessage = "Du erliegst deinen Wunden, deine Leiche wird auf Jahrhunderte hinaus in diesem Kerker verrotten.\nGame Over";

	public static String credits = "====================\n"
									+ "Ein Spiel von:\n"
									+ "Stefan Bahr\n"
									+ "Mit kreativer Unterstützung durch:\n"
									+ "Daniel Haynert\n"
									+ "====================";
	
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
		raumTexte[1][1] = "Dieser Raum gehört scheinbar zu einem uralten Gewölbe.\n"
						+ "Bis auf dem Loch in der Decke und ein paar Trümmern am Boden, gibt es hier jedoch nichts besonderes.";
		raumTexte[2][1] = "Ein Tisch, ein Stuhl, ein Arbeitszimmer.\n"
						+ "An den Wänden entlang stehen viele Regale voll verstaubter alter Bücher.\n"
						+ "Die zerbröseln, sobald du sie nur berührst.";
		raumTexte[3][1] = "Sobald du diesen Raum betrittst, spürst du wie sich deine Nackenhaare aufstellen, hier knistert es vor Magie.\n" + 
						"Es ist eine lange Halle in der riesige Säulen eine Decke halten, die zu hoch ist, als dass das Licht deiner Lampe sie erreichen würde.\n" + 
						"In der mitte des Raumes steht auf einem Altar eine goldene Truhe.\n" + 
						"Blass leuchtende Runen unbekannter Herkunft zieren Truhe, Altar und Säulen.\n" + 
						"Sie erinnern vage an das Netz einer Spinne, mit der Truhe im Mittelpunkt.";
		raumTexte[4][1] = "Dieser Raum scheint aus natürlichem Sandstein geschlagen zu sein.\n" + 
						"Auf dem Boden findet man Schleifspuren von etwas sehr schwerem.";
		
		raumTexte[1][2] = "Eine Kaverne derren Boden mit schwarzen und weißen Sechsecken gefliest ist.\n"
						+ "Jede der Fliesen weist ein ebenfalls sechseckiges Lochmuster auf.";
		raumTexte[2][2] = "Die Wände dieses Raumes sind aus einem Material, so dunkel, dass es jegliches Licht zu schlucken scheint.\n" + 
						"Daher ist nicht genau klar, welche Form dieser Raum hat.";
		raumTexte[3][2] = "Dieser Raum wirkt befremdlich leer.\n"
						+ "In der Mitte steht ein steinerner Altar.\n"
						+ "Er ist genau so schmucklos und nichtssagend wie der Rest des Raumes.";
		raumTexte[4][2] = "Dieser gigantische Raum wirkt wie ein Bollwerk.\n"
						+ "Er besitzt sehr hohe Wände und auf dem Boden fließen in schmalen Rinnen eine rot Leuchtende Flüssigkeit.\n"
						+ "Steinerne Barrikaden teilen den Raum in mehrere Verteidigungslinien auf.\n"
						+ "Die Flüssigkeit die sachte durch die Rinnen läuft scheint die Barrikaden zu speisen.\n"
						+ "Wozu, ist dir nicht klar.";
		
		raumTexte[1][3] = "Du findest dich in einem Wandschrank wieder!?\n"
						+ "Zumindest wirkt es so.\n"
						+ "Der Raum ist winzig und die Wände sind holzvertäfelt.\n"
						+ "An jeder Wand gibt es gleich mehrere Regalbretter.";
		raumTexte[2][3] = "Du befindest dich in einem schier endlos langen Gang.\n"
						+ "Er schlängelt sich langsam durch das Felsgestein.\n"
						+ "Alle paar Schritt findest du neue finstere Alkoven und Nischen.\n"
						+ "Gelegent stößt du auch auf einen Haufen Knochen, den irgendein Tier zusammen getragen haben muss.\n"
						+ "Hoffentlich ein Tier...";
		raumTexte[3][3] = "In diesem Raum gibt es nichts, außer einem scheinbar bodenlosen Loch.\n"
						+ "Die Kanten sind abgerundet und abgenutzt.\n"
						+ "Es nimmt beinahe den gesamten Raum ein, nur ein schmaler Rand bleibt, um dich zur nächsten Tür zu bringen.\n"
						+ "Nicht auszudenken was passiert währe, wenn du kein Licht dabei gehabt hättest.";
		raumTexte[4][3] = "Dieses Gewölbe besitzt eine geziegelte Decke.\n"
						+ "In der Mitte des Raumes befindet sich ein rundes Becken gefüllt mir einer rot leuchtenden Flüssigkeit.\n"
						+ "Das Becken ist umgeben von roten und schwarzen Steinplatten.\n"
						+ "Das leuchtende Becken macht es schwer, genaueres im Raum zu erkennen.";
		
		raumTexte[1][4] = "Ein schmuckvoll gekachelter Raum aus ockerfarbenen Fliesen.\n"
						+ "In seiner Mitte wartet eine hölzerne Truhe von mutigen Abenteurern geplündert zu werden.";
		raumTexte[2][4] = "Dieser Raum scheint etwas besonderes zu sein.\n"
						+ "Von jeder Tür aus führt eine Treppe hinunter in die Mitte des Raumes.\n"
						+ "Die Tür im Süden unterscheidet sich deutlich von allen Türen die du bisher hier unten gesehen hast.\n"
						+ "Die Wände werden von Fresken geziert, die schon zu großen Teilen deutlich verblasst sind.\n"
						+ "Sie erzählten wohl einst eine Geschichte, doch jetzt kannst du nicht viel mehr erkennen, als dass es wohl um einen Würfel ging, der den Menschen sehr wichtig war.";
		raumTexte[3][4] = "Dies Raum scheint als Kaserne genutzt worden zu sein.\n"
						+ "Hier stehen dreißig alte zerbrechliche Bettrahmen.\n"
						+ "Das Bettzeug ist von Motten zerfressen";
		raumTexte[4][4] = "Dieser Raum hat geziegelte Wände und einen ebensolchen Boden.\n" + 
						"Unregelmäßig verteilt gibt es größere Ziegel, die die Form widerlicher Fratzen haben.";
		
		raumTexte[5][2] = "";	
	}
		
	// -------------------- Items --------------------
	
	//itemID: 0 - Platzhalter
	public static String itemName0 = "Platzhalter";
	public static String itemBeschreibung0 = "Platzhalter";
	
	//itemID: 1 - Schlüssel
	public static String itemName1 = "Schlüssel";
	public static String itemBeschreibung1 = "Ein einfacher kleiner Schlüssel aus Eisen.";
	public static String item1WhichDoor = "Welche Tür möchtest du damit öffnen?";
	public static String item1Success = "Die Tür wurde entriegelt, dein Schlüssel bricht dabei ab.";
	public static String item1NotLocked = "Diese Tür ist nicht verschlossen.";
	
	//itemID: 2 - Heiltrank
	public static String itemName2 = "Heiltrank";
	public static String itemBeschreibung2 = "Ein pyramidenförmiges Fläschchen, verkorkt und mit irisierend roter Flüssigkeit darin.";
	public static String item2FullHealth = "Du bist bereits bei voller Gesundheit.";
	
	//itemID: 3 - Schild
	public static String itemName3 = "Schild";
	public static String itemBeschreibung3 = "Ein stabiler Schild aus Stahl.\n"
											+ "Ihn ziert das Wappen eines unbekannten Reiches.\n"
											+ "Es zeigt einen roten stilisierten Vogel unter drei goldenen Dreiecken.";
	public static String item3Drop = "Du lässt den Schild fallen, nun fühlst du dich ein wenig schutzlos.";
	public static String item3DeEquip = "Du nimmst das Schild aus deiner Hand und hängst es an deinen Rucksack.";
	public static String item3Equip = "Du streifst das Schild über deinen Unterarm, es fühlt sich robust an.";
	
	//itemID: 4 - Flusen
	public static String itemName4 = "Flusen";
	public static String itemBeschreibung4 = "Filzig und staubig. Die sind zu nicht zu gebrauchen.";
	
	//itemID: 5 - Kompass
	public static String itemName5 = "Kompass";
	public static String itemBeschreibung5 = "Ein rundes Gerät aus Blech, es passt perfekt in deine Hand und seine Nadel zeigt stehts nach Norden.";
	public static String item5Use = "Deine Koordinaten";
	public static String item5ToDark = "Es ist zu dunkel um zu erkennen was dein Kompass anzeigt.";
	
	
	//itemID: 6 - Lampe
	public static String itemName6 = "Lampe";
	public static String itemBeschreibung6 = "Eine Öl-Lampe, sie hat 4 kleine Scheiben und ein Drehknopf zum entzünden.";
	public static String item6DropEffect = "Die Lampe geht aus, es wird dunkel.";
	public static String item6UseOff = "Du löscht das Feuer deiner Lampe, es wird dunkel.";
	public static String item6UseOn = "Du zündest die Lampe an, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.";
	public static String item6ExtOff = "Das Feuer deiner Lampe erlischt, es wird dunkel.";
	public static String item6ExtOn = "Deine Lampe entzündet sich, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.";
	
	//itemID: 7 - Arkankubus
	public static String itemName7 = "Arkankubus";
	public static String itemBeschreibung7 = "Ein Würfel voll unermesslicher Magie.\n"
											+ "Er scheint aus einem dunklen Stein gefertigt zu sein, der dir aber unbekannt ist.\n"
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
	//itemID: 8 - Phiole
	public static String itemName8 = "Phiole";
	public static String itemBeschreibung8 = "Mhhh, lecker Zuckerwasser.";
	
	//itemID: 8 - Krafttrank
	public static String itemName9 = "Krafttrank";
	public static String itemBeschreibung9 = "Eine staubgraue Flüssigkeit in einer kleinen Flasche. Sieht nicht sehr appetitlich aus.";
	public static String item9Use = "Die Flüssigkeit schmeckt widerlich, aber einen Moment später spürst du einen Kraftschub durch alle deine Glieder.\n"
									+ "Du fühlst dich, als könntest du Bäume ausreißen.";
	
	// -------------------- Events --------------------
	
	//itemID: 20 - Finale
	public static String eventName20 = "evt_Finale";
	public static String eventBeschreibung20 = "Zögerlich trittst du in das blendende Licht.\n"
												+ "Sofort überkommt dich eine enorme Hitze die dir den Atem stocken lässt.\n"
												+ "Nur langsam gewöhnen sich deine Augen an das helle Licht."
												+ "Doch als sie es endlich tun, kannst du Dünen erkennen."
												+ "Sand, wohin das Auge auch reicht."
												+ "Du musst dich in einer Wüste befinden."
												+ "Nur zögerlich beginnst du zu realisieren, was dies eigentlich bedeutet."
												+ "Was nun?";
	
	//itemID: 21 - Bodenstacheln
	public static String eventName21 = "evt_Bodenstacheln";
	public static String eventBeschreibung21 = "Sobald du deinen Fuß aufsetzt, schießen spitze Stahlspieße aus dem Boden.";
	public static String event21SaveWord = "Schwarz";
	
	//itemID: 22- Pfeilfalle
	public static String eventName22 = "evt_Pfeilfalle";
	public static String eventBeschreibung22 = "Bevor du realisierst was du falsches getan hast, schießen mehrere Bolzen aus den Wänden auf dich zu.";
	
	//itemID: 23 - Schluesselblocker
	public static String eventName23 = "evt_Schluesselblocker";
	public static String eventBeschreibung23 = "Die Türen dieses Raumes scheinen auf dieser Seite keine Schlüssellöcher zu besitzen.";
	public static String event23Trigger1 = "Schlüssel";
	public static String event23Trigger2 = "Tür";
//	public static String event23EndText = "Du betrittst den Raum und hörst, wie sich die andere Tür automatisch entriegelt.";
	
	//itemID: 24 - TürVernichter
	public static String eventName24 = "evt_TuerVernichter";
	public static String eventBeschreibung24 = "Grade betrittst du den Raum, da gibt es eine starke erschütterung.\n"
												+ "Der Gang hinter dir bricht in sich zusammen.\n"
												+ "Dir kommt eine Staubwolke entgegen, die dich sofort einhüllt.";
	
	//itemID: 25 - Bodenloses Loch
	public static String eventName25 = "evt_BodenlosesLoch";
	public static String eventBeschreibung25 = "Du kannst nicht sehen wohin du gehst.\n"
												+ "Plötzlich tritt dein Fuß ins Leere.\n"
												+ "Dann das flaue Gefühl im Magen, wenn man fällt.\n"
												+ "Mehrmals schlägst du hart gegen grobe Wände.\n"
												+ "Du verlierst das Bewusstsein, bevor du den Boden erreichst.";
	
	//itemID: 26 - Trankpuzzle
	public static String eventName26 = "evt_TrankPuzzle";
	public static String eventBeschreibung26 = "In der Mitte des Raumes stehen fünf kleine Säulen, beleuchtet von einer nicht auszumachenden Lichtquelle.\n" + 
												"Auf jeder dieser etwa armdicken Säulen stehen Fläschchen die Flüssigkeiten unterschiedlicher Farbe enthalten.\n" + 
												"Als du dich näherst ertönt eine glockenhelle Stimme:\n" + 
												"\"Der Trank den du suchst ist eine Mixtur aus zwei seiner Brüder.\n" + 
												"Wähle weise!\"\n" + 
												"Welchen Trank willst du von seinem Podest nehmen?\n" + 
												"- den rubin-farbenen Trank\n" + 
												"- den smaragd-farbenen Trank\n" + 
												"- den amethyst-farbenen Trank\n" + 
												"- den bernstein-farbenen Trank\n" + 
												"- den saphir-farbenen Trank";
	public static String event26RichtigeAntwort = "amethyst";
	public static String event26FalscheAntwort1 = "rubin";
	public static String event26FalscheAntwort2 = "smaragd";
	public static String event26FalscheAntwort3 = "bernstein";
	public static String event26FalscheAntwort4 = "saphir";
	public static String event26EndText = "Du nimmst die Flasche vom Podest.\n"
											+ "In einer Stichflamme entzünden sich die anderen Flaschen.\n"
											+ "Zurück bleiben nur kleine Häufchen an feiner grauer Asche.";
	public static String event26ToHeavyText = "Die Flasche ist zu sperrig um damit komfortabel reisen zu können.\n"
												+ "Du stellst sie vorsichtig auf dem Boden ab.";
	
	//itemID: 27 - GiftPfeilPuzzle
	public static String eventName27 = "evt_GiftPfeilPuzzle";
	public static String eventBeschreibung27 = "In diesem Raum gibt es an der rechten Wand in einer Reihe neun Hebel.\n" + 
												"An der gegenüberliegenden Wand gibt es nur einen einzigen Hebel.\n" + 
												"Es gibt kleine Löcher an den Wänden die scheinbar wahllos im Raum verteilt sind.\n" + 
												"Sie sind grade groß genug damit dort 1-2 Finger hinein passen würden.\n" + 
												"An der Decke hängt ein Gitterkäfig in dem du einen Schlüssel funkeln sehen kannst.\n" + 
												"Über dem einsamen Hebel steht in den Stein gemeißelt:\n" + 
												"\"Wieviel Gliedmaße haben die sieben mal sieben Freunde des einarmigen Alrik?\"\n" +
												"Welche Hebel möchtest du also nach unten ziehen, bevor du den Hebel gegenüber ziehst?";
	public static String event27Trigger = "Hebel";
	public static String[] event27RichtigeAntwort = {"2", "3", "7"};
	public static String[] event27AltRichtigeAntwort = {"zwei", "drei", "sieben"};
	public static String[] event27FalscheAntwort = {"1", "4", "5", "6", "8", "9"};
	public static String[] event27AltFalscheAntwort = {"eins", "vier", "fünf", "sechs", "sieben", "acht"};
	public static String event27EndText = "Der Gitterkäfig an der Decke öffnet sich und der Schlüssel fällt zu Boden.";
	public static String event27FehlerText = "Aus dem Löchern in der Wand schießen kleine vergiftete Pfeile.";
	
	//itemID: 28 - ArmFallenPuzzle
	public static String eventName28 = "evt_ArmFallenPuzzle";
	public static String eventBeschreibung28 = "An der rechten Wand steht ein Tresor, er ist mit Eisen beschlagen und wirkt sehr massiv.\n" + 
												"Gegenüberliegend steht an der Wand gemeißelt:\n" + 
												"\"Alle 100011 Männer einer Oase sind verheiratet und haben jeweils 11 Kinder.\n" + 
												"Wieviele Menschen leben an der Oase?\"\n" + 
												"Unter dem Schriftzug sind 5 Steinplatten in die Wand eingelassen, jede davon mit einem armdicken Loch in der Mitte.\n" + 
												"Die Steinplatten sind folgendermaßen beschriftet:\n" + 
												"- 2C\n" + 
												"- B7\n" + 
												"- D8\n" + 
												"- AF\n" + 
												"- 15\n" + 
												"An der letzten Steinplatte hängt ein Skelett, dessen Arm noch immer in dem Loch der Platte steckt.";
	public static String event28RichtigeAntwort = "AF";
	public static String event28FalscheAntwort1 = "2C";
	public static String event28FalscheAntwort2 = "B7";
	public static String event28FalscheAntwort3 = "D8";
	public static String event28FalscheAntwort4 = "15";
	public static String event28EndText = "Vorsichtig steckst du deinen Arm in das Loch, dass du für das richtige hälst.\n"
									+ "Als du etwa bis zum Ellenbogen darin steckst, ertasten deine Finger eine Art von Griff.\n"
									+ "Zunächst ziehst du, merkst dann aber dass er sich nur drehen lässt.\n"
									+ "Das Geräusch der Mechanik lässt dich zusammen zucken, doch dir passiert nichts schlimmes.\n"
									+ "Hinter dir kannst du höhren, wie der Safe sich entriegelt.";
	public static String event28FehlerText = "Du spürst einen stechenden Schmerz als etwas deinen unterarm durchbohrt.\n"
									+ "Schnell willst du ihn wieder heraus ziehen, doch was auch immer in deinem Arm steckt, hindert dich daran ihn zu bewegen.\n"
									+ "Horror macht sich auf deinem Gesicht breit, als du realisierst, was dies bedeutet.";
	
	//itemID: 29 - SphinxPuzzle
	public static String eventName29 = "evt_SphinxPuzzle";
	public static String eventBeschreibung29 = "Als du den ersten Schritt in den Raum hinein setzt, taucht hinter einer der Säulen eine Sphinx auf, die sich dir in den Weg stellt.\n" + 
												"Sie spricht zu dir mit einer hellen weiblichen Stimme:\n" + 
												"\"Ich bin die Wächterin dieses Schatzes, willst du ihn haben, musst du mein Rätsel lösen.\n" + 
												"Antwortest du richtig, dann löse ich das Siegel.\n" + 
												"Antwortest du falsch, dann fresse ich dich.\n" + 
												"Schweigst du, kannst du von dannen ziehen.\"\n" + 
												"Auf ihrem Gesicht zeichnet sich ein raubtierhaftes Lächeln ab.\n"
												+ "Dann sagt sie:\n" + 
												"\"Ich brülle. Ich töte.\n" + 
												"Ich verschlinge am Stück.\n" + 
												"Ich habe weder Zähne und noch Zunge,\n" + 
												"und doch hast du kein Glück.\n" + 
												"Was bin ich?";
	public static String event29RichtigeAntwort = "Lawine";
	public static String event29EndText = "Die Spinx lächelt mysteriös, nickt dann aber.\n"
										+ "Sie umrundet langsam den Altar und setzt dann eine ihrer mächtigen Pranken auf die Truhe.\n"
										+ "Schritt für Schritt beginnen die Runen zu erlöschen, angefangen mit den äußeren auf den Säulen.\n"
										+ "Als das Licht der letzten Rune verglimmt, öffnet sich mit zuckenden Blitzen der Deckel der Truhe.\n"
										+ "Selbst nachdem das Schauspiel beendet ist, kannst du immer noch spüren, wie dir deine Haare zu berge stechen.\n"
										+ "Du näherst dich der goldenen Truhe während sich die Sphinx zurück zieht.\n"
										+ "Darin liegt ein Kubus und sofort wird dir eines klar.\n"
										+ "In diesem Gegenstand liegt mehr Macht, als du dir vorzustellen vermagst.";
	public static String event29FehlerText = "Die Sphinx gibt einen enttäuschten laut von sich.\n"
										+ "Dann reißt sie ihr Löwenmaul auf und springt dich an.\n"
										+ "Es gibt nicht viel, dass du tun kannst.\n"
										+ "Sie beißt zu, deine Knochen brechen, Schmerz überwältigt dich.\n"
										+ "Das letzte was du von dieser Welt wahrnehmen kannst, ist der metallische Geschmack von Blut.";
	public static String[] event29SaveWords = {"GEH", "BENUTZ", "SCHAU", "HEB", "FALLEN", "HILF", "TEST", "EXIT"};											
	
	//itemID: 30 - Altar
	public static String eventName30 = "evt_Altar";
	public static String eventBeschreibung30 = "";
	public static String event30Trigger1 = "lege";
	public static String event30Trigger2 = "alle";
	public static String event30Trigger3 = "Altar";
	public static String event30EndText = "Plötzlich kommt ein Wind auf und wirbelt deine Flusen durch den Raum.\n"
										+ "Es werden immer mehr und mehr Flusen, es bildet sich ein richtige Tornado um dich herum.\n"
										+ "So schnell wie es angefangen hat, endet es auch.\n"
										+ "Zurück bleibt nur eine Menge staubiger Flusen die sich kniehoch in den Ecken des Raumes gesammelt haben.\n"
										+ "Und eine Flasche die auf dem Altar steht.";
	
	//itemID: 31 - altFinale
	public static String eventName31 = "evt_Finale";
	public static String eventBeschreibung31 = "Dein Sprungt fühlt sich fast schon zu einfach an.\n"
											+ "Mit leichtigkeit segelst du fast 10 Schritt hoch in die Luft, durch die Öffnung in der Decke.\n"
											+ "Oben angekommen findest du dich in einem Gebäude wieder.\n"
											+ "Es ist aus großen Sandsteinquadern gemacht, vielleicht ein alter Tempel.\n"
											+ "Um ein kleines Feuer herum, sitzen drei junge Männer.\n"
											+ "Entsetzen macht sich auf ihren Gesichtern breit, als sie dich zu erkennen scheinen.\n"
											+ "Mit einem mal wird dir wieder bewusst, warum du eigentlich in dieses Loch gefallen bist.\n"
											+ "Sie haben dich gestoßen.\n"
											+ "Mit übermenschlicher Kraft stürzt du auf sie zu und prügelst auf sie ein.\n"
											+ "Keiner von ihnen rührt sich mehr, als du mit ihnen fertig bist.\n"
											+ "Niemand wird dich je wieder herum schubsten.\n";
	public static String event31Trigger = "spring";

	



	
	
	
	
	
}
