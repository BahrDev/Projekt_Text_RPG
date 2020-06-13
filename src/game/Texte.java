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
	
	public static String intro = "    /\\        | |             | |        | |              \n" + 
								 "   /  \\   _ __| | ____ _ _ __ | | ___   _| |__  _   _ ___ \n" + 
								 "  / /\\ \\ | '__| |/ / _` | '_ \\| |/ / | | | '_ \\| | | / __|\n" + 
								 " / ____ \\| |  |   < (_| | | | |   <| |_| | |_) | |_| \\__ \\\n" + 
								 "/_/    \\_\\_|  |_|\\_\\__,_|_| |_|_|\\_\\\\__,_|_.__/ \\__,_|___/\n" + 
								 "==========================================================\n" + 
								 "Dr�cke Enter zum starten!";
	
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
	
	public static String exitAbfrageForced = "Dr�cke Enter zum Beenden!";
	public static String exitAbfrageChoice = "Spiel beenden? Yes or No?";
	public static String exitSpielBeenden = "Spiel beendet.";
	
	public static String observeRoomToDark = "Es ist zu dunkel um irgendetwas zu erkennen.";
	
	public static String observeDoorMasterLocked = "Diese T�r ist mit Runen �berzogen.\n"
													+ "In ihrer mitte befindet sich eine gro�e rechteckige Vertiefung, als ob hier etwas herein geh�re.\n"
													+ "Als du sie ber�hrst, f�hlst du, wie deine Kraft durch deine Fingerspitzen entweicht.\n"
													+ "Schnell ziehst du die Hand wieder weg.";
	public static String observeDoorLocked = "Diese T�r ist mit einem simplen Schloss versehen. Du brauchst einen Schl�ssel um sie zu �ffnen.";
	public static String observeDoorUnpassable = "Dieser Durchgang ist versch�ttet und daher unpassierbar.";
	public static String observeDoorOpen = "Eine gew�hnliche T�r, sie ist nicht verriegelt.";
	public static String observeDoorNoExit= "Dort ist kein Ausgang.";
	
	public static String befolgeBefehlWohin = "Durch welche T�r m�chtest du gehen?";
	public static String befolgeBefehlWhichDoor = "Welche T�r m�chtest du dir denn ansehen?";
	public static String befolgeBefehlWhatToLookAt = "Was genau m�chtest du dir ansehen?";
	public static String befolgeBefehlWrongCommand = "Du m�chtest was tun?";
	
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
			+ "\nZeit einen Weg hier heraus zu finden."
			+ "\nDu k�nntest um Hilfe rufen."
			+ "\nWas m�chtest du tun?";
	
	public static String checkForDoors = "Dieser Raum hat T�ren im";

	public static String deathMessage = "Du erliegst deinen Wunden, deine Leiche wird auf Jahrhunderte hinaus in diesem Kerker verrotten.\nGame Over";

	public static String credits = "====================\n"
									+ "Ein Spiel von:\n"
									+ "Stefan Bahr\n"
									+ "Mit kreativer Unterst�tzung durch:\n"
									+ "Daniel Haynert\n"
									+ "====================";
	
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
		raumTexte[1][1] = "Dieser Raum geh�rt scheinbar zu einem uralten Gew�lbe.\n"
						+ "Bis auf dem Loch in der Decke und ein paar Tr�mmern am Boden, gibt es hier jedoch nichts besonderes.";
		raumTexte[2][1] = "Ein Tisch, ein Stuhl, ein Arbeitszimmer.\n"
						+ "An den W�nden entlang stehen viele Regale voll verstaubter alter B�cher.\n"
						+ "Die zerbr�seln, sobald du sie nur ber�hrst.";
		raumTexte[3][1] = "Sobald du diesen Raum betrittst, sp�rst du wie sich deine Nackenhaare aufstellen, hier knistert es vor Magie.\n" + 
						"Es ist eine lange Halle in der riesige S�ulen eine Decke halten, die zu hoch ist, als dass das Licht deiner Lampe sie erreichen w�rde.\n" + 
						"In der mitte des Raumes steht auf einem Altar eine goldene Truhe.\n" + 
						"Blass leuchtende Runen unbekannter Herkunft zieren Truhe, Altar und S�ulen.\n" + 
						"Sie erinnern vage an das Netz einer Spinne, mit der Truhe im Mittelpunkt.";
		raumTexte[4][1] = "Dieser Raum scheint aus nat�rlichem Sandstein geschlagen zu sein.\n" + 
						"Auf dem Boden findet man Schleifspuren von etwas sehr schwerem.";
		
		raumTexte[1][2] = "Eine Kaverne derren Boden mit schwarzen und wei�en Sechsecken gefliest ist.\n"
						+ "Jede der Fliesen weist ein ebenfalls sechseckiges Lochmuster auf.";
		raumTexte[2][2] = "Die W�nde dieses Raumes sind aus einem Material, so dunkel, dass es jegliches Licht zu schlucken scheint.\n" + 
						"Daher ist nicht genau klar, welche Form dieser Raum hat.";
		raumTexte[3][2] = "Dieser Raum wirkt befremdlich leer.\n"
						+ "In der Mitte steht ein steinerner Altar.\n"
						+ "Er ist genau so schmucklos und nichtssagend wie der Rest des Raumes.";
		raumTexte[4][2] = "Dieser gigantische Raum wirkt wie ein Bollwerk.\n"
						+ "Er besitzt sehr hohe W�nde und auf dem Boden flie�en in schmalen Rinnen eine rot Leuchtende Fl�ssigkeit.\n"
						+ "Steinerne Barrikaden teilen den Raum in mehrere Verteidigungslinien auf.\n"
						+ "Die Fl�ssigkeit die sachte durch die Rinnen l�uft scheint die Barrikaden zu speisen.\n"
						+ "Wozu, ist dir nicht klar.";
		
		raumTexte[1][3] = "Du findest dich in einem Wandschrank wieder!?\n"
						+ "Zumindest wirkt es so.\n"
						+ "Der Raum ist winzig und die W�nde sind holzvert�felt.\n"
						+ "An jeder Wand gibt es gleich mehrere Regalbretter.";
		raumTexte[2][3] = "Du befindest dich in einem schier endlos langen Gang.\n"
						+ "Er schl�ngelt sich langsam durch das Felsgestein.\n"
						+ "Alle paar Schritt findest du neue finstere Alkoven und Nischen.\n"
						+ "Gelegent st��t du auch auf einen Haufen Knochen, den irgendein Tier zusammen getragen haben muss.\n"
						+ "Hoffentlich ein Tier...";
		raumTexte[3][3] = "In diesem Raum gibt es nichts, au�er einem scheinbar bodenlosen Loch.\n"
						+ "Die Kanten sind abgerundet und abgenutzt.\n"
						+ "Es nimmt beinahe den gesamten Raum ein, nur ein schmaler Rand bleibt, um dich zur n�chsten T�r zu bringen.\n"
						+ "Nicht auszudenken was passiert w�hre, wenn du kein Licht dabei gehabt h�ttest.";
		raumTexte[4][3] = "Dieses Gew�lbe besitzt eine geziegelte Decke.\n"
						+ "In der Mitte des Raumes befindet sich ein rundes Becken gef�llt mir einer rot leuchtenden Fl�ssigkeit.\n"
						+ "Das Becken ist umgeben von roten und schwarzen Steinplatten.\n"
						+ "Das leuchtende Becken macht es schwer, genaueres im Raum zu erkennen.";
		
		raumTexte[1][4] = "Ein schmuckvoll gekachelter Raum aus ockerfarbenen Fliesen.\n"
						+ "In seiner Mitte wartet eine h�lzerne Truhe von mutigen Abenteurern gepl�ndert zu werden.";
		raumTexte[2][4] = "Dieser Raum scheint etwas besonderes zu sein.\n"
						+ "Von jeder T�r aus f�hrt eine Treppe hinunter in die Mitte des Raumes.\n"
						+ "Die T�r im S�den unterscheidet sich deutlich von allen T�ren die du bisher hier unten gesehen hast.\n"
						+ "Die W�nde werden von Fresken geziert, die schon zu gro�en Teilen deutlich verblasst sind.\n"
						+ "Sie erz�hlten wohl einst eine Geschichte, doch jetzt kannst du nicht viel mehr erkennen, als dass es wohl um einen W�rfel ging, der den Menschen sehr wichtig war.";
		raumTexte[3][4] = "Dies Raum scheint als Kaserne genutzt worden zu sein.\n"
						+ "Hier stehen drei�ig alte zerbrechliche Bettrahmen.\n"
						+ "Das Bettzeug ist von Motten zerfressen";
		raumTexte[4][4] = "Dieser Raum hat geziegelte W�nde und einen ebensolchen Boden.\n" + 
						"Unregelm��ig verteilt gibt es gr��ere Ziegel, die die Form widerlicher Fratzen haben.";
		
		raumTexte[5][2] = "";	
	}
		
	// -------------------- Items --------------------
	
	//itemID: 0 - Platzhalter
	public static String itemName0 = "Platzhalter";
	public static String itemBeschreibung0 = "Platzhalter";
	
	//itemID: 1 - Schl�ssel
	public static String itemName1 = "Schl�ssel";
	public static String itemBeschreibung1 = "Ein einfacher kleiner Schl�ssel aus Eisen.";
	public static String item1WhichDoor = "Welche T�r m�chtest du damit �ffnen?";
	public static String item1Success = "Die T�r wurde entriegelt, dein Schl�ssel bricht dabei ab.";
	public static String item1NotLocked = "Diese T�r ist nicht verschlossen.";
	
	//itemID: 2 - Heiltrank
	public static String itemName2 = "Heiltrank";
	public static String itemBeschreibung2 = "Ein pyramidenf�rmiges Fl�schchen, verkorkt und mit irisierend roter Fl�ssigkeit darin.";
	public static String item2FullHealth = "Du bist bereits bei voller Gesundheit.";
	
	//itemID: 3 - Schild
	public static String itemName3 = "Schild";
	public static String itemBeschreibung3 = "Ein stabiler Schild aus Stahl.\n"
											+ "Ihn ziert das Wappen eines unbekannten Reiches.\n"
											+ "Es zeigt einen roten stilisierten Vogel unter drei goldenen Dreiecken.";
	public static String item3Drop = "Du l�sst den Schild fallen, nun f�hlst du dich ein wenig schutzlos.";
	public static String item3DeEquip = "Du nimmst das Schild aus deiner Hand und h�ngst es an deinen Rucksack.";
	public static String item3Equip = "Du streifst das Schild �ber deinen Unterarm, es f�hlt sich robust an.";
	
	//itemID: 4 - Flusen
	public static String itemName4 = "Flusen";
	public static String itemBeschreibung4 = "Filzig und staubig. Die sind zu nicht zu gebrauchen.";
	
	//itemID: 5 - Kompass
	public static String itemName5 = "Kompass";
	public static String itemBeschreibung5 = "Ein rundes Ger�t aus Blech, es passt perfekt in deine Hand und seine Nadel zeigt stehts nach Norden.";
	public static String item5Use = "Deine Koordinaten";
	public static String item5ToDark = "Es ist zu dunkel um zu erkennen was dein Kompass anzeigt.";
	
	
	//itemID: 6 - Lampe
	public static String itemName6 = "Lampe";
	public static String itemBeschreibung6 = "Eine �l-Lampe, sie hat 4 kleine Scheiben und ein Drehknopf zum entz�nden.";
	public static String item6DropEffect = "Die Lampe geht aus, es wird dunkel.";
	public static String item6UseOff = "Du l�scht das Feuer deiner Lampe, es wird dunkel.";
	public static String item6UseOn = "Du z�ndest die Lampe an, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.";
	public static String item6ExtOff = "Das Feuer deiner Lampe erlischt, es wird dunkel.";
	public static String item6ExtOn = "Deine Lampe entz�ndet sich, das Licht erhellt die Dunkelheit grade genug, damit du deine Umgebung erkennen kannst.";
	
	//itemID: 7 - Arkankubus
	public static String itemName7 = "Arkankubus";
	public static String itemBeschreibung7 = "Ein W�rfel voll unermesslicher Magie.\n"
											+ "Er scheint aus einem dunklen Stein gefertigt zu sein, der dir aber unbekannt ist.\n"
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
	//itemID: 8 - Phiole
	public static String itemName8 = "Phiole";
	public static String itemBeschreibung8 = "Mhhh, lecker Zuckerwasser.";
	
	//itemID: 8 - Krafttrank
	public static String itemName9 = "Krafttrank";
	public static String itemBeschreibung9 = "Eine staubgraue Fl�ssigkeit in einer kleinen Flasche. Sieht nicht sehr appetitlich aus.";
	public static String item9Use = "Die Fl�ssigkeit schmeckt widerlich, aber einen Moment sp�ter sp�rst du einen Kraftschub durch alle deine Glieder.\n"
									+ "Du f�hlst dich, als k�nntest du B�ume ausrei�en.";
	
	// -------------------- Events --------------------
	
	//itemID: 20 - Finale
	public static String eventName20 = "evt_Finale";
	public static String eventBeschreibung20 = "Z�gerlich trittst du in das blendende Licht.\n"
												+ "Sofort �berkommt dich eine enorme Hitze die dir den Atem stocken l�sst.\n"
												+ "Nur langsam gew�hnen sich deine Augen an das helle Licht."
												+ "Doch als sie es endlich tun, kannst du D�nen erkennen."
												+ "Sand, wohin das Auge auch reicht."
												+ "Du musst dich in einer W�ste befinden."
												+ "Nur z�gerlich beginnst du zu realisieren, was dies eigentlich bedeutet."
												+ "Was nun?";
	
	//itemID: 21 - Bodenstacheln
	public static String eventName21 = "evt_Bodenstacheln";
	public static String eventBeschreibung21 = "Sobald du deinen Fu� aufsetzt, schie�en spitze Stahlspie�e aus dem Boden.";
	public static String event21SaveWord = "Schwarz";
	
	//itemID: 22- Pfeilfalle
	public static String eventName22 = "evt_Pfeilfalle";
	public static String eventBeschreibung22 = "Bevor du realisierst was du falsches getan hast, schie�en mehrere Bolzen aus den W�nden auf dich zu.";
	
	//itemID: 23 - Schluesselblocker
	public static String eventName23 = "evt_Schluesselblocker";
	public static String eventBeschreibung23 = "Die T�ren dieses Raumes scheinen auf dieser Seite keine Schl�ssell�cher zu besitzen.";
	public static String event23Trigger1 = "Schl�ssel";
	public static String event23Trigger2 = "T�r";
//	public static String event23EndText = "Du betrittst den Raum und h�rst, wie sich die andere T�r automatisch entriegelt.";
	
	//itemID: 24 - T�rVernichter
	public static String eventName24 = "evt_TuerVernichter";
	public static String eventBeschreibung24 = "Grade betrittst du den Raum, da gibt es eine starke ersch�tterung.\n"
												+ "Der Gang hinter dir bricht in sich zusammen.\n"
												+ "Dir kommt eine Staubwolke entgegen, die dich sofort einh�llt.";
	
	//itemID: 25 - Bodenloses Loch
	public static String eventName25 = "evt_BodenlosesLoch";
	public static String eventBeschreibung25 = "Du kannst nicht sehen wohin du gehst.\n"
												+ "Pl�tzlich tritt dein Fu� ins Leere.\n"
												+ "Dann das flaue Gef�hl im Magen, wenn man f�llt.\n"
												+ "Mehrmals schl�gst du hart gegen grobe W�nde.\n"
												+ "Du verlierst das Bewusstsein, bevor du den Boden erreichst.";
	
	//itemID: 26 - Trankpuzzle
	public static String eventName26 = "evt_TrankPuzzle";
	public static String eventBeschreibung26 = "In der Mitte des Raumes stehen f�nf kleine S�ulen, beleuchtet von einer nicht auszumachenden Lichtquelle.\n" + 
												"Auf jeder dieser etwa armdicken S�ulen stehen Fl�schchen die Fl�ssigkeiten unterschiedlicher Farbe enthalten.\n" + 
												"Als du dich n�herst ert�nt eine glockenhelle Stimme:\n" + 
												"\"Der Trank den du suchst ist eine Mixtur aus zwei seiner Br�der.\n" + 
												"W�hle weise!\"\n" + 
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
											+ "In einer Stichflamme entz�nden sich die anderen Flaschen.\n"
											+ "Zur�ck bleiben nur kleine H�ufchen an feiner grauer Asche.";
	public static String event26ToHeavyText = "Die Flasche ist zu sperrig um damit komfortabel reisen zu k�nnen.\n"
												+ "Du stellst sie vorsichtig auf dem Boden ab.";
	
	//itemID: 27 - GiftPfeilPuzzle
	public static String eventName27 = "evt_GiftPfeilPuzzle";
	public static String eventBeschreibung27 = "In diesem Raum gibt es an der rechten Wand in einer Reihe neun Hebel.\n" + 
												"An der gegen�berliegenden Wand gibt es nur einen einzigen Hebel.\n" + 
												"Es gibt kleine L�cher an den W�nden die scheinbar wahllos im Raum verteilt sind.\n" + 
												"Sie sind grade gro� genug damit dort 1-2 Finger hinein passen w�rden.\n" + 
												"An der Decke h�ngt ein Gitterk�fig in dem du einen Schl�ssel funkeln sehen kannst.\n" + 
												"�ber dem einsamen Hebel steht in den Stein gemei�elt:\n" + 
												"\"Wieviel Gliedma�e haben die sieben mal sieben Freunde des einarmigen Alrik?\"\n" +
												"Welche Hebel m�chtest du also nach unten ziehen, bevor du den Hebel gegen�ber ziehst?";
	public static String event27Trigger = "Hebel";
	public static String[] event27RichtigeAntwort = {"2", "3", "7"};
	public static String[] event27AltRichtigeAntwort = {"zwei", "drei", "sieben"};
	public static String[] event27FalscheAntwort = {"1", "4", "5", "6", "8", "9"};
	public static String[] event27AltFalscheAntwort = {"eins", "vier", "f�nf", "sechs", "sieben", "acht"};
	public static String event27EndText = "Der Gitterk�fig an der Decke �ffnet sich und der Schl�ssel f�llt zu Boden.";
	public static String event27FehlerText = "Aus dem L�chern in der Wand schie�en kleine vergiftete Pfeile.";
	
	//itemID: 28 - ArmFallenPuzzle
	public static String eventName28 = "evt_ArmFallenPuzzle";
	public static String eventBeschreibung28 = "An der rechten Wand steht ein Tresor, er ist mit Eisen beschlagen und wirkt sehr massiv.\n" + 
												"Gegen�berliegend steht an der Wand gemei�elt:\n" + 
												"\"Alle 100011 M�nner einer Oase sind verheiratet und haben jeweils 11 Kinder.\n" + 
												"Wieviele Menschen leben an der Oase?\"\n" + 
												"Unter dem Schriftzug sind 5 Steinplatten in die Wand eingelassen, jede davon mit einem armdicken Loch in der Mitte.\n" + 
												"Die Steinplatten sind folgenderma�en beschriftet:\n" + 
												"- 2C\n" + 
												"- B7\n" + 
												"- D8\n" + 
												"- AF\n" + 
												"- 15\n" + 
												"An der letzten Steinplatte h�ngt ein Skelett, dessen Arm noch immer in dem Loch der Platte steckt.";
	public static String event28RichtigeAntwort = "AF";
	public static String event28FalscheAntwort1 = "2C";
	public static String event28FalscheAntwort2 = "B7";
	public static String event28FalscheAntwort3 = "D8";
	public static String event28FalscheAntwort4 = "15";
	public static String event28EndText = "Vorsichtig steckst du deinen Arm in das Loch, dass du f�r das richtige h�lst.\n"
									+ "Als du etwa bis zum Ellenbogen darin steckst, ertasten deine Finger eine Art von Griff.\n"
									+ "Zun�chst ziehst du, merkst dann aber dass er sich nur drehen l�sst.\n"
									+ "Das Ger�usch der Mechanik l�sst dich zusammen zucken, doch dir passiert nichts schlimmes.\n"
									+ "Hinter dir kannst du h�hren, wie der Safe sich entriegelt.";
	public static String event28FehlerText = "Du sp�rst einen stechenden Schmerz als etwas deinen unterarm durchbohrt.\n"
									+ "Schnell willst du ihn wieder heraus ziehen, doch was auch immer in deinem Arm steckt, hindert dich daran ihn zu bewegen.\n"
									+ "Horror macht sich auf deinem Gesicht breit, als du realisierst, was dies bedeutet.";
	
	//itemID: 29 - SphinxPuzzle
	public static String eventName29 = "evt_SphinxPuzzle";
	public static String eventBeschreibung29 = "Als du den ersten Schritt in den Raum hinein setzt, taucht hinter einer der S�ulen eine Sphinx auf, die sich dir in den Weg stellt.\n" + 
												"Sie spricht zu dir mit einer hellen weiblichen Stimme:\n" + 
												"\"Ich bin die W�chterin dieses Schatzes, willst du ihn haben, musst du mein R�tsel l�sen.\n" + 
												"Antwortest du richtig, dann l�se ich das Siegel.\n" + 
												"Antwortest du falsch, dann fresse ich dich.\n" + 
												"Schweigst du, kannst du von dannen ziehen.\"\n" + 
												"Auf ihrem Gesicht zeichnet sich ein raubtierhaftes L�cheln ab.\n"
												+ "Dann sagt sie:\n" + 
												"\"Ich br�lle. Ich t�te.\n" + 
												"Ich verschlinge am St�ck.\n" + 
												"Ich habe weder Z�hne und noch Zunge,\n" + 
												"und doch hast du kein Gl�ck.\n" + 
												"Was bin ich?";
	public static String event29RichtigeAntwort = "Lawine";
	public static String event29EndText = "Die Spinx l�chelt mysteri�s, nickt dann aber.\n"
										+ "Sie umrundet langsam den Altar und setzt dann eine ihrer m�chtigen Pranken auf die Truhe.\n"
										+ "Schritt f�r Schritt beginnen die Runen zu erl�schen, angefangen mit den �u�eren auf den S�ulen.\n"
										+ "Als das Licht der letzten Rune verglimmt, �ffnet sich mit zuckenden Blitzen der Deckel der Truhe.\n"
										+ "Selbst nachdem das Schauspiel beendet ist, kannst du immer noch sp�ren, wie dir deine Haare zu berge stechen.\n"
										+ "Du n�herst dich der goldenen Truhe w�hrend sich die Sphinx zur�ck zieht.\n"
										+ "Darin liegt ein Kubus und sofort wird dir eines klar.\n"
										+ "In diesem Gegenstand liegt mehr Macht, als du dir vorzustellen vermagst.";
	public static String event29FehlerText = "Die Sphinx gibt einen entt�uschten laut von sich.\n"
										+ "Dann rei�t sie ihr L�wenmaul auf und springt dich an.\n"
										+ "Es gibt nicht viel, dass du tun kannst.\n"
										+ "Sie bei�t zu, deine Knochen brechen, Schmerz �berw�ltigt dich.\n"
										+ "Das letzte was du von dieser Welt wahrnehmen kannst, ist der metallische Geschmack von Blut.";
	public static String[] event29SaveWords = {"GEH", "BENUTZ", "SCHAU", "HEB", "FALLEN", "HILF", "TEST", "EXIT"};											
	
	//itemID: 30 - Altar
	public static String eventName30 = "evt_Altar";
	public static String eventBeschreibung30 = "";
	public static String event30Trigger1 = "lege";
	public static String event30Trigger2 = "alle";
	public static String event30Trigger3 = "Altar";
	public static String event30EndText = "Pl�tzlich kommt ein Wind auf und wirbelt deine Flusen durch den Raum.\n"
										+ "Es werden immer mehr und mehr Flusen, es bildet sich ein richtige Tornado um dich herum.\n"
										+ "So schnell wie es angefangen hat, endet es auch.\n"
										+ "Zur�ck bleibt nur eine Menge staubiger Flusen die sich kniehoch in den Ecken des Raumes gesammelt haben.\n"
										+ "Und eine Flasche die auf dem Altar steht.";
	
	//itemID: 31 - altFinale
	public static String eventName31 = "evt_Finale";
	public static String eventBeschreibung31 = "Dein Sprungt f�hlt sich fast schon zu einfach an.\n"
											+ "Mit leichtigkeit segelst du fast 10 Schritt hoch in die Luft, durch die �ffnung in der Decke.\n"
											+ "Oben angekommen findest du dich in einem Geb�ude wieder.\n"
											+ "Es ist aus gro�en Sandsteinquadern gemacht, vielleicht ein alter Tempel.\n"
											+ "Um ein kleines Feuer herum, sitzen drei junge M�nner.\n"
											+ "Entsetzen macht sich auf ihren Gesichtern breit, als sie dich zu erkennen scheinen.\n"
											+ "Mit einem mal wird dir wieder bewusst, warum du eigentlich in dieses Loch gefallen bist.\n"
											+ "Sie haben dich gesto�en.\n"
											+ "Mit �bermenschlicher Kraft st�rzt du auf sie zu und pr�gelst auf sie ein.\n"
											+ "Keiner von ihnen r�hrt sich mehr, als du mit ihnen fertig bist.\n"
											+ "Niemand wird dich je wieder herum schubsten.\n";
	public static String event31Trigger = "spring";

	



	
	
	
	
	
}
