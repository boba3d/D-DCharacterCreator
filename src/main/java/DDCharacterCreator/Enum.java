package DDCharacterCreator;

import com.sun.deploy.uitoolkit.ToolkitStore;
import com.sun.org.apache.regexp.internal.REDebugCompiler;


/**
 * A class for managing the Logic for the character based off rules in 5e
 * @author Marsol Daman, Lauren Lingeman
 * @version 1.0
 * @since 1.0
 * TODO Finish spells, cantrips, ideals, traits, bonds, flaws, features & traits, character backstory, allies & organizations, Additional Features & traits
 */
public class Enum {
    public enum EyeColor {
        BLUE,
        RED,
        GREEN,
        YELLOW,
        HAZEL,
        TEAL,
        GREY,
        BROWN,
        BLACK,
        WHITE,
        PINK,
        PURPLE,
        MAGENTA,
        PLUMCRAZY,
        ORANGE,
        RAINBOW,
        NONE
    }
    //PERSONALITY TRAITS, IDEALS, BONDS, FLAWS
    //4 PER BACKGROUND, RANDOMLY GENERATED FUNCTION BELOW
    String[] acolytePT={"I've enjoyed fine food, drink, and high society among my temple's elite.","I see omens in every event and action.", "I quote (or misquote) sacred lexls and proverbs in almost every situation. ","Nothing can shake my oplimislic attitude. "};
    String[] acolyteIdeals={"Faith","Aspiration", "Charity","Tradition"};
    String[] acolyteBonds={"I would die to recover an ancient relic of my faith that was lost long ago.","I owe my life to the priest who took me in when my parents died.", "I will do anything to protect the temple where I served.","Everything I do is for the common people."};
    String[] acolyteFlaws={"My piety sometimes leads me to blindly trust those that profess faith in my god.","I judge others harshly, and myself even more severely.", "I am suspicious of strangers and expect the worst of them.","I am inflexible in my thinking."};

    String[] noblePT={"I take great pains to always look my best and follow the latest fashions","If you do me an injury, I will crush you, ruin your name, and salt your fields.", "My favor, once lost, is lost forever.","The common folk love me for my kindness and generosity."};
    String[] nobleIdeals={"Respect","Responsibility", "Independence","Noble Obligation"};
    String[] nobleBonds={"I am in love with the heir of a family that my family despises.","The common folk must see me as a hero of the people", "My loyalty to my sovereign is unwavering.","I will face any challenge to win the approval of my family."};
    String[] nobleFlaws={"I have an insatiable desire for carnal pleasures.","In fact, the world does revolve around me.", "I hide a truly scandalous secret that could ruin my family forever.","I secretly believe that everyone is beneath me.\n"};

    String[] charlatanPT = {"I fall in and out of love easily.","I have a joke for every occasion", "Flattery is my preferred trick for getting what I want.", "I’m a born gambler who can't resist taking a risk for a potential payoff."};
    String[] charlatanBonds = {"Somewhere out there, I have a child who doesn’t know me.","A powerful person killed someone I love. Someday soon, I’ll have my revenge.", "I owe everything to my mentor", "I come from a noble family, and one day I’ll reclaim my lands." };
    String[] charlatanFlaws = {"I can’t resist a pretty face.","I'm always in debt.", "I’m too greedy for my own good.", "I can’t resist swindling people who are more powerful than me."};
    String[] charlatanIdeals = {"Independence","Fairness","Charity","Creativity"};

    String[] criminalPT = {"I am always calm, no matter what the situation.", "I am incredibly slow to trust.", "I blow up at the slightest insult.", "I would rather make a new friend than a new enemy."};
    String[] criminalIdeals={"Honor", "Charity", "Freedom", "Redemption"};
    String[] criminalBonds={"My ill-gotten gains go to support my family.", "I’m guilty of a terrible crime. I hope I can redeem myself for it.", "I’m trying to pay off an old debt I owe to a generous benefactor.", "Someone I loved died because of a mistake I made."};
    String[] criminalFlaws={"I have a “tell” that reveals when I'm lying.", "I turn tail and run when things look bad.", "If there’s a plan, I’ll forget it. If I don’t forget it, I’ll ignore it.", "An innocent person is in prison for a crime that I committed."};

    String[] folkheroPT={"I judge people by their actions, not their words.","If someone is in trouble, I’m always ready to lend help.","Thinking is for other people. I prefer action.","When I set my mind to something, I follow through no matter what gets in my way."};
    String[] folkheroIdeals={"Respect","Freedom","Sincerity","Might"};
    String[] folkheroBonds={"I have a family, but I have no idea where they are. ","I wish my childhood sweetheart had come with me to pursue my destiny.","I worked the land, I love the land, and I will protect the land.","I protect those who cannot protect themselves."};
    String[] folkheroFlaws={"The tyrant who rules my land will stop at nothing to see me killed.","Secretly, I believe that things would be better if I were a tyrant lording over the land.","I have a weakness for the vices of the city, especially hard drink.","I have trouble trusting in my allies."};

    String[] guildartPT={"I’m well known for my work, and I want to make sure everyone appreciates it.","I’m a snob who looks down on those who can’t appreciate fine art.","I’m full of witty aphorisms and have a proverb for every occasion.","I like to talk at length about my profession."};
    String[] guildartIdeals={"Community","Generosity","Freedom","Greed"};
    String[] guildartBonds={" I pursue wealth to secure someone’s love.","I owe my guild a great debt for forging me into the person I am today.","One day I will return to my guild and prove that I am the greatest artisan of them all.","The workshop where I learned my trade is the most important place in the world to me."};
    String[] guildartFlaws={"I’ll do anything to get my hands on something rare or priceless.","I’m quick to assume that someone is trying to cheat me.","I’m never satisfied with what I have— I always want more.","I would kill to acquire a noble title."};

    String[] entertainerPT={"I get bitter if I’m not the center of attention.","I know a story relevant to almost every situation.","I love a good insult, even one directed at me.","I’ll settle for nothing less than perfection."};
    String[] entertainerIdeals={"Beauty","Tradition","Creativity","Greed"};
    String[] entertainerBonds={"I want to be famous, whatever it takes.","I would do anything for the other members of my old troupe.","I will do anything to prove myself superior to my hated rival.","Someone stole my precious instrument, and someday I’ll get it back."};
    String[] entertainerFlaws={"I once satirized a noble who still wants my head. It was a mistake that I will likely repeat.","Despite my best efforts, I am unreliable to my friends.","I’ll do anything to win fame and renown.","I’m a sucker for a pretty face."};

    String[] hermitPT={"I am working on a grand philosophical theory and love sharing my ideas.","I am utterly serene, even in the face of disaster.","I feel tremendous empathy for all who suffer.","I’m oblivious to etiquette and social expectations."};
    String[] hermitIdeals={"Greater Good","Logic","Power","Free Thinking."};
    String[] hermitBonds={"Nothing is more important than the other members of my hermitage, order, or association.","My isolation gave me great insight into a great evil that only I can destroy.","Should my discovery come to light, it could bring ruin to the world.","I entered seclusion because I loved someone I could not have."};
    String[] hermitFlaws={"I let my need to win arguments overshadow friendships and harmony.","I am dogmatic in my thoughts and philosophy.","I like keeping secrets and won’t share them with anyone.","I’d risk too much to uncover a lost bit of knowledge."};

    String[] outlanderPT={"I feel far more comfortable around animals than people.","I was, in fact, raised by wolves.","I watch over my friends as if they were a litter of newborn pups.","I’m driven by a wanderlust that led me away from home."};
    String[] outlanderIdeals={"Change","Honor","Might","Nature"};
    String[] outlanderBonds={"I will bring terrible wrath down on the evildoers who destroyed my homeland.","I suffer awful visions of a coming disaster and will do anything to prevent it.","It is my duty to provide children to sustain my tribe.","An injury to the unspoiled wilderness of my home is an injury to me."};
    String[] outlanderFlaws={"I am slow to trust members of other races, tribes, and societies.","Violence is my answer to almost any challenge.","There’s no room for caution in a life lived to the fullest.","I am too enamored of ale, wine, and other intoxicants."};

    String[] sagePT={"I am horribly, horribly awkward in social situations.","I've read every book in the world’s greatest libraries—or I like to boast that I have.","I use polysyllabic words that convey the impression of great erudition.","There’s nothing I like more than a good mystery."};
    String[] sageIdeals={"Knowledge","Beauty","No Limits.","Self-Improvement."};
    String[] sageBonds={"I sold my soul for knowledge.","My life’s work is a series of tomes related to a specific field of lore.","I work to preserve a library, university, scriptorium, or monastery.","It is my duty to protect my students."};
    String[] sageFlaws={"I can’t keep a secret to save my life, or anyone else’s.","Unlocking an ancient mystery is worth the price of a civilization.","I overlook obvious solutions in favor of complicated ones.","I am easily distracted by the promise of information."};

    String[] sailorPT={"My friends know they can rely on me, no matter what.","I stretch the truth for the sake of a good story.","My language is as foul as an otyugh nest.","I never pass up a friendly wager."};
    String[] sailorIdeals={"Respect","Fairness","Aspiration","Mastery"};
    String[] sailorBonds={"The ship is most important—crewmates and captains come and go.","I was cheated out of my fair share of the profits, and I want to get my due.","I’m loyal to my captain first, everything else second.","I’ll always remember my first ship."};
    String[] sailorFlaws={"My pride will probably lead to my destruction.","Once I start drinking, it’s hard for me to stop.","I’ll say anything to avoid having to do extra work.","I follow orders, even if I think they’re wrong."};

    String[] soldierPT={"I can stare down a hell hound without flinching.","I enjoy being strong and like breaking things.","I have a crude sense of humor.","I'm always polite and respectful."};
    String[] soldierIdeals={"Might","Live and Let Live.","Nation","Greater Good"};
    String[] soldierBonds={"I would still lay down my life for the people I served with.","Those who fight beside me are those worth dying for.","I fight for those who cannot fight for themselves.","My honor is my life."};
    String[] soldierFlaws={"I have little respect for anyone who is not a proven warrior.","I obey the law, even if the law causes misery.","My hatred of my enemies is blind and unreasoning.","I’d rather eat my armor than admit when I’m wrong."};

    public enum maleDwarfNames{
        Adrik, Alberich, Baern, Barendd, Brottor, Bruenor, Oain, Oarrak, Oelg, Eberk, Einkil, Fargrim, Flint, Gardain, Harbek, Kildrak, Morgran, Orsik, Oskar, Rangrim, Rurik, Taklinn, Thoradin, Thorin, Tordek, Traubon, Travok, Ulfgar, Veit, Vondal
    }
    public enum femaleDwarfNames {
        Amber, Artin, Audhild, Bardryn, Oagnal, Oiesa, Eldeth, Falkrunn, Finellen, Gunnloda, Gurdis, Helja, Hlin, Kathra, Kristryd, lide, Liftrasa, Mardred, Riswynn, Sannl, Torbera, Torgga, Vistra
    }
    public enum maleElfNames{
        Adran, Aelar, Aramil, Arannis, Aust, Beiro, Berrian, Carrie, Enialis, Erdan, Erevan, Galinndan, Hadarai, Heian, Himo, Immeral, Ivellios, Laucian, Mindartis, Paelias, Peren, Quarion, Riardon, Rolen, Soveliss, Thamior, Tharivol, Theren, Varis
    }
    public enum femaleElfNames{
        drie, Althaea, Anastrianna, Andraste, Antinua, Bethrynna, Birel, Caelynn, Orusilia, Enna, Felosial, lelenia,jelenneth, Keyleth, Leshanna, Lia, Meriele, Mialee, Naivara, Quelenna, Quillathe, Sariel, Shanairra, Shava, Silaqui, Theirastra, Thia, Vadania, Valanthe, Xanaphia
    }
    public enum maleHalflingNames{
        Alton, Ander, Cade, Corrin, Eldon, Errich, Finnan, Garret, Lindal, Lyle, Merric, Milo, Osborn, Perrin, Reed, Roscoe, Wellby
    }
    public enum femaleHalflingNames{
        Andry, Bree, Callie, Cora, Euphemia, Jillian, Kithri, Lavinia, Lidda, Merla, Nedda, Paela, Portia, Seraphina, Shaena, Trym, Vani, Verna
    }
    public enum maleHumanNames{
        Aseir, Bardeid, Haseid, Khemed, Mehmen, Sudeiman, Zasheir,Darvin, Dorn, Evendur, Gorstag, Grim, Helm, Malark, Morn, Randal, Stedd, Bor, Fodel, Glar, Grigor, Igan, Ivor, Kosef, Mival, Orel, Pavel, Sergor
    }
    public enum femaleHumanNames{
        Atala, Ceidil, Hama, Jasmal, Meilil, Seipora, Yasheira, Zasheida,Arveene, Esvele, Jhessail, Kerri, Lureene, Miri, Rowan, Shandri, Tessele,Alethra, Kara, Katernin, Mara, Natali, Olma, Tana, Zora
    }
    public enum maleDragonbornNames{
        Arjhan, Balasar, Bharash, Donaar, Ghesh, Heskan, Kriv, Medrash, Mehen, Nadarr, Pandjed, Patrin, Rhogar, Shamash, Shedinn, Tarhun, Torinn
    }
    public enum femaleDragonbornNames{
        Akra, Biri, Daar, Farideh, Harann, HaviJar, Jheri, Kava, Korinn, Mishann, NaJa, Perra, Raiann, Sora, Surina, Thava, Uadjit
    }
    public enum maleGnomeNames {
        Alston, Alvyn, Boddynock, Brocc, Burgell, Dimble, Eldon, Erky, Fonkin, Frug, Gerbo, Gimble, Glim, Jebeddo, Kellen, Namfoodle, Orryn, Roondar, Seebo, Sindri, Warryn, Wrenn, Zook
    }
    public enum femaleGnomeNames {
        Bimpnottin, Breena, Caramip, Carlin, Donella, Duvamil, ElIa, ElIyjobell, ElIywick, Lilli, Loopmottin, Lorilla, Mardnab, Nissa, Nyx, Oda, Orla, Roywyn, Shamil, Tana, Waywocket, Zanna
    }
    public enum maleHalfElf{
        Borivik, Faurgar, Jandar, Kanithar, Madislak, Ralmevik, Shaumar, Vladislak, Anton, Diero, Marcon, Pieron, Rimardo, Romero, Salazar, Umbero,Immeral, Ivellios, Laucian, Mindartis, Paelias, Peren, Quarion, Riardon, Rolen, Soveliss
    }
    public enum femaleHalfElf{
        Adrie, Althaea, Anastrianna, Andraste, Antinua, Bethrynna, Birel, Caelynn, Orusilia, Enna, Felosial, lelenia,jelenneth, Keyleth, Amafrey, Betha, Cefrey, Kethra, Mara, Olga, Silifrey, Westra
    }
    public enum maleHalfOrc{
        Deneh, Feng, Gell, Henk, Holg, Imsh, Kelh, Krusk, Mhurren, Ront, Shump, Thokk
    }
    public enum femaleHalfOrc{
        Baggi, Emen, Engong, Kansif, Myev, Neega, Ovak, Ownka, Shaulha, Sulha, Vola, Volen, Yevelda
    }
    public enum maleTiefling{
        Akmenos, Amnon, Barakas, Damakos, Ekemon, Iados, Kairon, Leucis, Melech, Mordai, Morthos, Pelaios, Skamos, Therai
    }
    public enum femaleTiefling{
        Akta, Anakis, Bryseis, Criella, Damaia, Ea, Kallista, Lerissa, Makaria, Nemeia, Orianna, Phelaia, Rieta
    }

    public enum Class {
        // name, description
        BARBARIAN("Barbarian", "A fierce warrior of primitive background" +
                " who can enter a battle rage"),
        BARD("Bard", "An inspiring magician whose power" +
                " echoes the music of creation"),
        CLERIC("Cleric", "A priestly champion who wields divine" +
                " magic in service of a higher power"),
        DRUID("Druid", "A priest of the Old Faith, wielding the" +
                " powers of nature-moonlight and" +
                " plant growth, fire and lightning-and" +
                " adopting animal forms"),
        FIGHTER("Fighter", "A master of martial combat, skilled with" +
                " a variety of weapons and armor"),
        MONK("Monk", "A master of martial arts, harnessing" +
                " the power of the body in pursuit of" +
                " physical and spiritual perfection"),
        PALADIN("Paladin", "A holy warrior bound to a sacred oath"),
        RANGER("Ranger", "A warrior who uses martial prowess and" +
                " nature magic to combat threats on the" +
                " edges of civilization"),
        ROGUE("Rogue", "A scoundrel who uses stealth and" +
                " trickery to overcome obstacles and" +
                " enemies"),
        SORCERER("Sorcerer", "A spellcaster who draws on inherent" +
                " magic from a gift or bloodline"),
        WARLOCK("Warlock", "A wielder of magic that is derived from" +
                " a bargain with an extraplanar entity"),
        WIZARD("Wizard", "A scholarly magic-user capable of" +
                " manipulating the structures of reality");

        private final String name;
        private final String descrip;

        Class(String name, String descrip) {
            this.name = name;
            this.descrip = descrip;
        }

        public String toString() {
            return name;
        }

        public String getDescrip() {
            return descrip;
        }
    }

    // Enum data type with the backgrounds
    // Name, # of languages,, # of Musical Instruments, Starting Gold, Equipment
    public enum Background{
        ACOLYTE("Acolyte",2,0,15,"Set of common clothes, Holy Symbol, Prayer book, 5 sticks of incense, Vestments"),
        CHARLATAN("Charlatan", 0, 0, 15, "Set of Fine Clothes, Disguise Kit, 1 Charlaton tool, Forgery Kit"),
        CRIMINAL("Criminal",0, 0, 15, "Set of dark common clothes including a hood and a crowbar, One type of gaming set, thieves’ tools"),
        ENTERTAINER("Entertainer", 0, 1, 15, "A Costume, Disguise kit, Favor of an admirer"),
        FOLK_HERO("Folk Hero", 0, 0, 10, "Set of common clothes, One type of artisan’s tools, vehicles (land),  A shovel, An iron pot"),
        GUILD_ARTISAN("Guild Artisan", 1, 0, 15, "Set of traveler’s clothes, One type of artisan’s tools, a letter of introduction from your guild"),
        HERMIT("Hermit", 1,0,5,"Set of common clothes, Herbalism kit, A scroll case stuffed full of notes from your studies or prayers, a Winter blanket"),
        NOBLE("Noble", 1, 0, 25,"Set of Fine Clothes, A Signet Ring, A Scroll of Pedigree, One type of gaming set"),
        OUTLANDER("Outlander", 1, 1, 10, "Set of traveler’s clothes, A staff, a hunting trap, a trophy from an animal you killed"),
        SAGE("Sage", 2, 0, 10, "Set of common clothes, A bottle of black ink, a quill, a small knife, a letter from a dead colleague posing a question you have not yet been able to answer"),
        SAILOR("Sailor", 0, 0, 10,"Set of common clothes, Navigator’s tools, Vehicles, A belaying pin (club), 50 feet of silk rope, a lucky charm"),
        SOLDIER("Solider",0 ,0 , 10, "Set of common clothes, An insignia of rank, a trophy taken from a fallen enemy, One type of gaming set, vehicles (land), a set of bone dice or deck of cards");

        private final String name;
        private final String equipment;
        private final int languages;
        private final int musical_instruments;
        private final int gold;

        Background(String name, int languages, int musical_instruments, int gold, String equipment){
        this.name= name;
        this.languages=languages;
        this.musical_instruments=musical_instruments;
        this.gold=gold;
        this.equipment=equipment;
        }
    }

    //Tools
    public enum Tools {
        Alchemist_Supplies,
        Brewer_Supplies,
        Calligrapher_Supplies,
        Carpenter_Tools,
        Cartographer_Tools,
        Cobbler_Tools,
        Cook_Utensils,
        Glassblower_Tools,
        Jewelers_Tools,
        Leatherworker_Tools,
        Mason_Tools,
        Painter_Supplies,
        Potter_Tools,
        Smith_Tools,
        Tinker_Tools,
        Weaver_Tools,
        Woodcarver_Tools,
        Disguise_Kit,
        Forgery_Kit,
        Gaming_Set,
        Dice_Set,
        Dragonchess_Set,
        Playing_card_Set,
        Three_Dragon_Ante_Set,
        Herbalism_Kit,
        Navigator_Tools,
        Poisoner_Kit,
        Thieves_Tools
    }

    //Musical Instruments
    public enum MusicalInstruments {
        BAGPIPES,
        DRUM,
        DULCIMER,
        FLUTE,
        LUT,
        LYRE,
        HORN,
        PANFLUTE,
        SHAWM,
        VIOL
    }

    public enum Race {
        // name, size category, base walking speed, str, dex, con, int, wis, cha, description
        HILLDWARF("Hill Dwarf", "Medium", 25, 0, 0, 2, 0, 1, 0,
                "Kingdoms rich in ancient grandeur, halls carved into the roots of mountains, the echoing of picks and hammers in deep mines and blazing forges, a commitment to clan and tradition, and a burning hatred of goblins and orcs—these common threads unite all dwarves.\n\n" + "As a hill dwarf, you have keen senses, deep intuition, and remarkable resilience. The gold dwarves of Faerûn in their mighty southern kingdom are hill dwarves, as are the exiled Neidar and the debased Klar of Krynn in the Dragonlance setting."),
        MOUNTAINDWARF("Mountain Dwarf", "Medium", 25, 2, 0, 2, 0, 0, 0,
                "Kingdoms rich in ancient grandeur, halls carved into the roots of mountains, the echoing of picks and hammers in deep mines and blazing forges, a commitment to clan and tradition, and a burning hatred of goblins and orcs—these common threads unite all dwarves.\n\n" + "As a mountain dwarf, you’re strong and hardy, accustomed to a difficult life in rugged terrain. You’re probably on the tall side (for a dwarf), and tend toward lighter coloration. The shield dwarves of northern Faerûn, as well as the ruling Hylar clan and the noble Daewar clan of Dragonlance, are mountain dwarves."),
        HIGHELF("High Elf", "Medium", 30, 0, 2, 0, 1, 0, 0,
                "Elves are a magical people of otherworldly grace, living in the world but not entirely part of it. They live in places of ethereal beauty, in the midst of ancient forests or in silvery spires glittering with faerie light, where soft music drifts through the air and gentle fragrances waft on the breeze. Elves love nature and magic, art and artistry, music and poetry, and the good things of the world.\n\n" + "As a high elf, you have a keen mind and a mastery of at least the basics of magic. In many of the worlds of D&D, there are two kinds of high elves. One type (which includes the gray elves and valley elves of Greyhawk, the Silvanesti of Dragonlance, and the sun elves of the Forgotten Realms) is haughty and reclusive, believing themselves to be superior to non-elves and even other elves. The other type (including the high elves of Greyhawk, the Qualinesti of Dragonlance, and the moon elves of the Forgotten Realms) are more common and more friendly, and often encountered among humans and other races.\n\n" + "The sun elves of Faerûn (also called gold elves or sunrise elves) have bronze skin and hair of copper, black, or golden blond. Their eyes are golden, silver, or black. Moon elves (also called silver elves or gray elves) are much paler, with alabaster skin sometimes tinged with blue. They often have hair of silver-white, black, or blue, but various shades of blond, brown, and red are not uncommon. Their eyes are blue or green and flecked with gold."),
        WOODELF("Wood Elf", "Medium", 30, 0, 2, 0, 0, 1, 0,
                "Elves are a magical people of otherworldly grace, living in the world but not entirely part of it. They live in places of ethereal beauty, in the midst of ancient forests or in silvery spires glittering with faerie light, where soft music drifts through the air and gentle fragrances waft on the breeze. Elves love nature and magic, art and artistry, music and poetry, and the good things of the world.\n\n" + "As a wood elf, you have keen senses and intuition, and your fleet feet carry you quickly and stealthily through your native forests. This category includes the wild elves (grugach) of Greyhawk and the Kagonesti of Dragonlance, as well as the races called wood elves in Greyhawk and the Forgotten Realms. In Faerûn, wood elves (also called wild elves, green elves, or forest elves) are reclusive and distrusting of non-elves.\n\n" + "Wood elves’ skin tends to be copperish in hue, sometimes with traces of green. Their hair tends toward browns and blacks, but it is occasionally blond or copper-colored. Their eyes are green, brown, or hazel."),
        DARKELF("Dark Elf", "Medium", 30, 0, 2, 0, 0, 0, 1,
                "Elves are a magical people of otherworldly grace, living in the world but not entirely part of it. They live in places of ethereal beauty, in the midst of ancient forests or in silvery spires glittering with faerie light, where soft music drifts through the air and gentle fragrances waft on the breeze. Elves love nature and magic, art and artistry, music and poetry, and the good things of the world.\n\n" + "Descended from an earlier subrace of dark-skinned elves, the drow were banished from the surface world for following the goddess Lolth down the path to evil and corruption. Now they have built their own civilization in the depths of the Underdark, patterened after the way of Lolth. Also called dark elves, the drow have black skin that resembles polished obsidian and stark white or pale yellow hair. They commonly have very pale eyes (so pale as to be mistaken for white) in shades of lilac, silver, pink, red, and blue. They tend to be smaller and thinner than most elves."),
        LIGHTFOOT("Lightfoot Halfling", "Small", 25, 0, 2, 0, 0, 0, 1,
                "The comforts of home are the goals of most halflings’ lives: a place to settle in peace and quiet, far from marauding monsters and clashing armies; a blazing fire and a generous meal; fine drink and fine conversation. Though some halflings live out their days in remote agricultural communities, others form nomadic bands that travel constantly, lured by the open road and the wide horizon to discover the wonders of new lands and peoples. But even these wanderers love peace, food, hearth, and home, though home might be a wagon jostling along a dirt road or a raft floating downriver.\n\n" + "As a lightfoot halfling, you can easily hide from notice, even using other people as cover. You’re inclined to be affable and get along well with others. In the Forgotten Realms, lightfoot halflings have spread the farthest and thus are the most common variety. Lightfoots are more prone to wanderlust than other halflings, and often dwell alongside other races or take up a nomadic life. In the world of Greyhawk, these halflings are called hairfeet or tallfellows."),
        STOUT("Stout Halfling", "Small", 25, 0, 2, 1, 0, 0, 0,
                "The comforts of home are the goals of most halflings’ lives: a place to settle in peace and quiet, far from marauding monsters and clashing armies; a blazing fire and a generous meal; fine drink and fine conversation. Though some halflings live out their days in remote agricultural communities, others form nomadic bands that travel constantly, lured by the open road and the wide horizon to discover the wonders of new lands and peoples. But even these wanderers love peace, food, hearth, and home, though home might be a wagon jostling along a dirt road or a raft floating downriver.\n\n" + "As a stout halfling, you’re hardier than average and have some resistance to poison. Some say that stouts have dwarven blood. In the Forgotten Realms, these halflings are called stronghearts, and they’re most common in the south."),
        HUMAN("Human", "Medium", 30, 1, 1, 1, 1, 1, 1,
                "In the reckonings of most worlds, humans are the youngest of the common races, late to arrive on the world scene and short-lived in comparison to dwarves, elves, and dragons. Perhaps it is because of their shorter lives that they strive to achieve as much as they can in the years they are given. Or maybe they feel they have something to prove to the elder races, and that’s why they build their mighty empires on the foundation of conquest and trade. Whatever drives them, humans are the innovators, the achievers, and the pioneers of the worlds."),
        DRAGONBORN("Dragonborn", "Medium", 30, 2, 0, 0, 0, 0, 1,
                "Born of dragons, as their name proclaims, the dragonborn walk proudly through a world that greets them with fearful incomprehension. Shaped by draconic gods or the dragons themselves, dragonborn originally hatched from dragon eggs as a unique race, combining the best attributes of dragons and humanoids. Some dragonborn are faithful servants to true dragons, others form the ranks of soldiers in great wars, and still others find themselves adrift, with no clear calling in life."),
        FORESTGNOME("Forest Gnome", "Small", 25, 0, 1, 0, 2, 0, 0,
                "A constant hum of busy activity pervades the warrens and neighborhoods where gnomes form their close-knit communities. Louder sounds punctuate the hum: a crunch of grinding gears here, a minor explosion there, a yelp of surprise or triumph, and especially bursts of laughter. Gnomes take delight in life, enjoying every moment of invention, exploration, investigation, creation, and play.\n\n" + "As a forest gnome, you have a natural knack for illusion and inherent quickness and stealth. In the worlds of D&D, forest gnomes are rare and secretive. They gather in hidden communities in sylvan forests, using illusions and trickery to conceal themselves from threats or to mask their escape should they be detected. Forest gnomes tend to be friendly with other good-spirited woodland folk, and they regard elves and good fey as their most important allies. These gnomes also befriend small forest animals and rely on them for information about threats that might prowl their lands."),
        ROCKGNOME("Rock Gnome", "Small", 25, 0, 0, 1, 2, 0, 0,
                "A constant hum of busy activity pervades the warrens and neighborhoods where gnomes form their close-knit communities. Louder sounds punctuate the hum: a crunch of grinding gears here, a minor explosion there, a yelp of surprise or triumph, and especially bursts of laughter. Gnomes take delight in life, enjoying every moment of invention, exploration, investigation, creation, and play.\n\n" + "As a rock gnome, you have a natural inventiveness and hardiness beyond that of other gnomes. Most gnomes in the worlds of D&D are rock gnomes, including the tinker gnomes of the Dragonlance setting."),
        HALFELF("Half-elf", "Medium", 30, 0, 0, 0, 0, 0, 2,
                "Walking in two worlds but truly belonging to neither, half-elves combine what some say are the best qualities of their elf and human parents: human curiosity, inventiveness, and ambition tempered by the refined senses, love of nature, and artistic tastes of the elves. Some half-elves live among humans, set apart by their emotional and physical differences, watching friends and loved ones age while time barely touches them. Others live with the elves, growing restless as they reach adulthood in the timeless elven realms, while their peers continue to live as children. Many half-elves, unable to fit into either society, choose lives of solitary wandering or join with other misfits and outcasts in the adventuring life."),
        HALFORC("Half-orc", "Medium", 30, 2, 0, 1, 0, 0, 0,
                "Whether united under the leadership of a mighty warlock or having fought to a standstill after years of conflict, orc and human tribes sometimes form alliances, joining forces into a larger horde to the terror of civilized lands nearby. When these alliances are sealed by marriages, half-orcs are born. Some half-orcs rise to become proud chiefs of orc tribes, their human blood giving them an edge over their full-blooded orc rivals. Some venture into the world to prove their worth among humans and other more civilized races. Many of these become adventurers, achieving greatness for their mighty deeds and notoriety for their barbaric customs and savage fury."),
        TIEFLING("Tiefling", "Medium", 30, 0, 0, 0, 1, 0, 2,
                "To be greeted with stares and whispers, to suffer violence and insult on the street, to see mistrust and fear in every eye: this is the lot of the tiefling. And to twist the knife, tieflings know that this is because a pact struck generations ago infused the essence of Asmodeus—overlord of the Nine Hells—into their bloodline. Their appearance and their nature are not their fault but the result of an ancient sin, for which they and their children and their children’s children will always be held accountable.");

        private final String name;
        private final String size;
        private final int speed;
        private final int str;
        private final int dex;
        private final int con;
        private final int intel;
        private final int wis;
        private final int cha;
        private final String descrip;

        Race(String name, String size, int speed, int str, int dex, int con, int intel, int wis, int cha, String descrip) {
            this.name = name;
            this.size = size;
            this.speed = speed;
            this.str = str;
            this.dex = dex;
            this.con = con;
            this.intel = intel;
            this.wis = wis;
            this.cha = cha;
            this.descrip = descrip;
        }

        public String toString() {
            return name;
        }

        public String getSize() {
            return size;
        }

        public int getSpeed() {
            return speed;
        }

        public int getStr() {
            return str;
        }

        public int getDex() {
            return dex;
        }

        public int getCon() {
            return con;
        }

        public int getIntel() {
            return intel;
        }

        public int getWis() {
            return wis;
        }

        public int getCha() {
            return cha;
        }

        public String getDescrip() {
            return descrip;
        }
    }


    public enum Alignment {
        LAWFULGOOD("Lawful Good"),
        LAWFULNEUTRAL("Lawful Neutral"),
        LAWFULEVIL("Lawful Evil"),
        NEUTRALGOOD("Neutral Good"),
        TRUENEUTRAL("True Neutral"),
        NEUTRALEVIL("Neutral Evil"),
        CHAOTICGOOD("Chaotic Good"),
        CHAOTICNEUTRAL("Chaotic Neutral"),
        CHAOTICEVIL("Chaotic Evil");

        private final String salign;

        Alignment(String salign) {
            this.salign = salign;
        }

        public String toString() {
            return salign;
        }
    }

    /*Marsol Daman
    //ADD LOGIC DOWN HERE
     */
    public void checkRace(Character character) {

        switch (character.getCharRace()) {
            case HIGHELF:
                character.setCharDexterity(+2);
                character.setCharIntelligence(+1);
                break;
            case DARKELF:
                character.setCharDexterity(+2);
                character.setCharWisdom(+1);
                break;
            case WOODELF:
                character.setCharDexterity(+2);
                character.setCharCharisma(+1);
                break;
            case HALFELF:
                character.setCharCharisma(+2);
                // two other ability scores of your choice increase by 1. TELL NOAH TELL NOAH TELL NOAH
                break;
            case HUMAN:
                character.setCharDexterity(+1);
                character.setCharCharisma(+1);
                character.setCharConstitution(+1);
                character.setCharWisdom(+1);
                character.setCharStrength(+1);
                character.setCharIntelligence(+1);
                break;
            case STOUT:
                character.setCharDexterity(+2);
                character.setCharConstitution(+1);
                break;
            case LIGHTFOOT:
                character.setCharDexterity(+2);
                character.setCharCharisma(+1);
                break;
            case HALFORC:
                character.setCharStrength(+2);
                character.setCharConstitution(+1);
                break;
            case ROCKGNOME:
                character.setCharIntelligence(+2);
                character.setCharConstitution(+1);
                break;
            case FORESTGNOME:
                character.setCharIntelligence(+2);
                character.setCharDexterity(+1);
                break;
            case TIEFLING:
                character.setCharIntelligence(+2);
                character.setCharCharisma(+1);
                break;
            case HILLDWARF:
                character.setCharConstitution(+2);
                character.setCharWisdom(+1);
                break;
            case MOUNTAINDWARF:
                character.setCharStrength(+2);
                character.setCharConstitution(+2);
                break;
            case DRAGONBORN:
                character.setCharStrength(+2);
                character.setCharCharisma(+1);
                break;

        }
    }

    /*
    MD>> This will check what the character's background is and randomly assign it Personality Traits, ideals, bonds, and flaws
     */
    public void checkBackground(Character character) {
        Dice dice = new Dice();
        int temp;
        switch (character.getCharBackground()) {
            case ACOLYTE:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(acolytePT[temp]);
                character.setCharIdeals(acolyteIdeals[temp]);
                character.setCharBonds(acolyteBonds[temp]);
                character.setCharFlaws(acolyteFlaws[temp]);
            case CHARLATAN:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(charlatanPT[temp]);
                character.setCharIdeals(charlatanIdeals[temp]);
                character.setCharBonds(charlatanBonds[temp]);
                character.setCharFlaws(charlatanFlaws[temp]);
            case CRIMINAL:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(criminalPT[temp]);
                character.setCharIdeals(criminalIdeals[temp]);
                character.setCharBonds(criminalBonds[temp]);
                character.setCharFlaws(criminalFlaws[temp]);
            case ENTERTAINER:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(entertainerPT[temp]);
                character.setCharIdeals(entertainerIdeals[temp]);
                character.setCharBonds(entertainerBonds[temp]);
                character.setCharFlaws(entertainerFlaws[temp]);
            case FOLK_HERO:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(folkheroPT[temp]);
                character.setCharIdeals(folkheroIdeals[temp]);
                character.setCharBonds(folkheroBonds[temp]);
                character.setCharFlaws(folkheroFlaws[temp]);
            case GUILD_ARTISAN:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(guildartPT[temp]);
                character.setCharIdeals(guildartIdeals[temp]);
                character.setCharBonds(guildartBonds[temp]);
                character.setCharFlaws(guildartFlaws[temp]);
            case HERMIT:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(hermitPT[temp]);
                character.setCharIdeals(hermitIdeals[temp]);
                character.setCharBonds(hermitBonds[temp]);
                character.setCharFlaws(hermitFlaws[temp]);
            case NOBLE:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(noblePT[temp]);
                character.setCharIdeals(nobleIdeals[temp]);
                character.setCharBonds(nobleBonds[temp]);
                character.setCharFlaws(nobleFlaws[temp]);
            case OUTLANDER:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(outlanderPT[temp]);
                character.setCharIdeals(outlanderIdeals[temp]);
                character.setCharBonds(outlanderBonds[temp]);
                character.setCharFlaws(outlanderFlaws[temp]);
            case SAGE:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(sagePT[temp]);
                character.setCharIdeals(sageIdeals[temp]);
                character.setCharBonds(sageBonds[temp]);
                character.setCharFlaws(sageFlaws[temp]);
                break;
            case SAILOR:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(sailorPT[temp]);
                character.setCharIdeals(sailorIdeals[temp]);
                character.setCharBonds(sailorBonds[temp]);
                character.setCharFlaws(sailorFlaws[temp]);
                break;
            case SOLDIER:
                temp = dice.Roll(4,1);
                character.setCharPersonalityTraits(soldierPT[temp]);
                character.setCharIdeals(soldierIdeals[temp]);
                character.setCharBonds(soldierBonds[temp]);
                character.setCharFlaws(soldierFlaws[temp]);
                break;
        }
    }

    //ADD LOGIC DOWN HERE
    public void checkClass(Character character) {
        switch (character.getCharClass()) {
            case BARBARIAN:
                character.setCharHitDice(12);
                break;
            case BARD:
                character.setCharHitDice(8);
                break;
            case CLERIC:
                character.setCharHitDice(8);
                break;
            case DRUID:
                character.setCharHitDice(8);
                break;
            case FIGHTER:
                character.setCharHitDice(10);
                break;
            case MONK:
                character.setCharHitDice(8);
                break;
            case PALADIN:
                character.setCharHitDice(10);
                break;
            case RANGER:
                character.setCharHitDice(10);
                break;
            case ROGUE:
                character.setCharHitDice(8);
                break;
            case SORCERER:
                character.setCharHitDice(6);
                break;
            case WARLOCK:
                character.setCharHitDice(8);
                break;
            case WIZARD:
                character.setCharHitDice(6);
                break;
        }
    }


}
