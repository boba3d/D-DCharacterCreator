package DDCharacterCreator;

public class Enum {
    public enum Class {
        // name, description
        BARBARIAN ("Barbarian", "A fierce warrior of primitive background" +
                    " who can enter a battle rage"),
        BARD ("Bard", "An inspiring magician whose power" +
                    " echoes the music of creation"),
        CLERIC ("Cleric", "A priestly champion who wields divine" +
                    " magic in service of a higher power"),
        DRUID ("Druid", "A priest of the Old Faith, wielding the" +
                    " powers of nature-moonlight and" +
                    " plant growth, fire and lightning-and" +
                    " adopting animal forms"),
        FIGHTER ("Fighter", "A master of martial combat, skilled with" +
                    " a variety of weapons and armor"),
        MONK ("Monk", "A master of martial arts, harnessing" +
                    " the power of the body in pursuit of" +
                    " physical and spiritual perfection"),
        PALADIN ("Paladin", "A holy warrior bound to a sacred oath"),
        RANGER ("Ranger", "A warrior who uses martial prowess and" +
                    " nature magic to combat threats on the" +
                    " edges of civilization"),
        ROGUE ("Rogue", "A scoundrel who uses stealth and" +
                    " trickery to overcome obstacles and" +
                    " enemies"),
        SORCERER ("Sorcerer", "A spellcaster who draws on inherent" +
                    " magic from a gift or bloodline"),
        WARLOCK ("Warlock", "A wielder of magic that is derived from" +
                    " a bargain with an extraplanar entity"),
        WIZARD ("Wizard", "A scholarly magic-user capable of" +
                    " manipulating the structures of reality");

        private final String name;
        private final String descrip;

        Class(String name, String descrip) {
            this.name = name;
            this.descrip = descrip;
        }

        public String toString() {return name;}

        public String getDescrip() {return descrip;}
    }

    public enum Race {
        // name, size category, base walking speed, str, dex, con, int, wis, cha, description
        HILLDWARF ("Hill Dwarf", "Medium", 25, 0, 0, 2, 0, 1, 0,
                "Kingdoms rich in ancient grandeur, halls carved into the roots of mountains, the echoing of picks and hammers in deep mines and blazing forges, a commitment to clan and tradition, and a burning hatred of goblins and orcs—these common threads unite all dwarves.\n\n" + "As a hill dwarf, you have keen senses, deep intuition, and remarkable resilience. The gold dwarves of Faerûn in their mighty southern kingdom are hill dwarves, as are the exiled Neidar and the debased Klar of Krynn in the Dragonlance setting."),
        MOUNTAINDWARF ("Mountain Dwarf", "Medium", 25, 2, 0, 2, 0, 0, 0,
                "Kingdoms rich in ancient grandeur, halls carved into the roots of mountains, the echoing of picks and hammers in deep mines and blazing forges, a commitment to clan and tradition, and a burning hatred of goblins and orcs—these common threads unite all dwarves.\n\n" + "As a mountain dwarf, you’re strong and hardy, accustomed to a difficult life in rugged terrain. You’re probably on the tall side (for a dwarf), and tend toward lighter coloration. The shield dwarves of northern Faerûn, as well as the ruling Hylar clan and the noble Daewar clan of Dragonlance, are mountain dwarves."),
        HIGHELF ("High Elf", "Medium", 30, 0, 2, 0, 1, 0, 0,
                "Elves are a magical people of otherworldly grace, living in the world but not entirely part of it. They live in places of ethereal beauty, in the midst of ancient forests or in silvery spires glittering with faerie light, where soft music drifts through the air and gentle fragrances waft on the breeze. Elves love nature and magic, art and artistry, music and poetry, and the good things of the world.\n\n" + "As a high elf, you have a keen mind and a mastery of at least the basics of magic. In many of the worlds of D&D, there are two kinds of high elves. One type (which includes the gray elves and valley elves of Greyhawk, the Silvanesti of Dragonlance, and the sun elves of the Forgotten Realms) is haughty and reclusive, believing themselves to be superior to non-elves and even other elves. The other type (including the high elves of Greyhawk, the Qualinesti of Dragonlance, and the moon elves of the Forgotten Realms) are more common and more friendly, and often encountered among humans and other races.\n\n" + "The sun elves of Faerûn (also called gold elves or sunrise elves) have bronze skin and hair of copper, black, or golden blond. Their eyes are golden, silver, or black. Moon elves (also called silver elves or gray elves) are much paler, with alabaster skin sometimes tinged with blue. They often have hair of silver-white, black, or blue, but various shades of blond, brown, and red are not uncommon. Their eyes are blue or green and flecked with gold."),
        WOODELF ("Wood Elf", "Medium", 30, 0, 2, 0, 0, 1, 0,
                "Elves are a magical people of otherworldly grace, living in the world but not entirely part of it. They live in places of ethereal beauty, in the midst of ancient forests or in silvery spires glittering with faerie light, where soft music drifts through the air and gentle fragrances waft on the breeze. Elves love nature and magic, art and artistry, music and poetry, and the good things of the world.\n\n" + "As a wood elf, you have keen senses and intuition, and your fleet feet carry you quickly and stealthily through your native forests. This category includes the wild elves (grugach) of Greyhawk and the Kagonesti of Dragonlance, as well as the races called wood elves in Greyhawk and the Forgotten Realms. In Faerûn, wood elves (also called wild elves, green elves, or forest elves) are reclusive and distrusting of non-elves.\n\n" + "Wood elves’ skin tends to be copperish in hue, sometimes with traces of green. Their hair tends toward browns and blacks, but it is occasionally blond or copper-colored. Their eyes are green, brown, or hazel."),
        DARKELF ("Dark Elf", "Medium", 30, 0, 2, 0, 0, 0, 1,
                "Elves are a magical people of otherworldly grace, living in the world but not entirely part of it. They live in places of ethereal beauty, in the midst of ancient forests or in silvery spires glittering with faerie light, where soft music drifts through the air and gentle fragrances waft on the breeze. Elves love nature and magic, art and artistry, music and poetry, and the good things of the world.\n\n" + "Descended from an earlier subrace of dark-skinned elves, the drow were banished from the surface world for following the goddess Lolth down the path to evil and corruption. Now they have built their own civilization in the depths of the Underdark, patterened after the way of Lolth. Also called dark elves, the drow have black skin that resembles polished obsidian and stark white or pale yellow hair. They commonly have very pale eyes (so pale as to be mistaken for white) in shades of lilac, silver, pink, red, and blue. They tend to be smaller and thinner than most elves."),
        LIGHTFOOT ("Lightfoot Halfling", "Small", 25, 0, 2, 0, 0, 0, 1,
                "The comforts of home are the goals of most halflings’ lives: a place to settle in peace and quiet, far from marauding monsters and clashing armies; a blazing fire and a generous meal; fine drink and fine conversation. Though some halflings live out their days in remote agricultural communities, others form nomadic bands that travel constantly, lured by the open road and the wide horizon to discover the wonders of new lands and peoples. But even these wanderers love peace, food, hearth, and home, though home might be a wagon jostling along a dirt road or a raft floating downriver.\n\n" + "As a lightfoot halfling, you can easily hide from notice, even using other people as cover. You’re inclined to be affable and get along well with others. In the Forgotten Realms, lightfoot halflings have spread the farthest and thus are the most common variety. Lightfoots are more prone to wanderlust than other halflings, and often dwell alongside other races or take up a nomadic life. In the world of Greyhawk, these halflings are called hairfeet or tallfellows."),
        STOUT ("Stout Halfling", "Small", 25, 0, 2, 1, 0, 0, 0,
                "The comforts of home are the goals of most halflings’ lives: a place to settle in peace and quiet, far from marauding monsters and clashing armies; a blazing fire and a generous meal; fine drink and fine conversation. Though some halflings live out their days in remote agricultural communities, others form nomadic bands that travel constantly, lured by the open road and the wide horizon to discover the wonders of new lands and peoples. But even these wanderers love peace, food, hearth, and home, though home might be a wagon jostling along a dirt road or a raft floating downriver.\n\n" + "As a stout halfling, you’re hardier than average and have some resistance to poison. Some say that stouts have dwarven blood. In the Forgotten Realms, these halflings are called stronghearts, and they’re most common in the south." ),
        HUMAN ("Human", "Medium", 30, 1, 1, 1, 1, 1, 1,
                "In the reckonings of most worlds, humans are the youngest of the common races, late to arrive on the world scene and short-lived in comparison to dwarves, elves, and dragons. Perhaps it is because of their shorter lives that they strive to achieve as much as they can in the years they are given. Or maybe they feel they have something to prove to the elder races, and that’s why they build their mighty empires on the foundation of conquest and trade. Whatever drives them, humans are the innovators, the achievers, and the pioneers of the worlds."),
        DRAGONBORN ("Dragonborn", "Medium", 30, 2, 0, 0, 0, 0, 1,
                "Born of dragons, as their name proclaims, the dragonborn walk proudly through a world that greets them with fearful incomprehension. Shaped by draconic gods or the dragons themselves, dragonborn originally hatched from dragon eggs as a unique race, combining the best attributes of dragons and humanoids. Some dragonborn are faithful servants to true dragons, others form the ranks of soldiers in great wars, and still others find themselves adrift, with no clear calling in life."),
        FORESTGNOME ("Forest Gnome", "Small", 25, 0, 1, 0, 2, 0, 0,
                "A constant hum of busy activity pervades the warrens and neighborhoods where gnomes form their close-knit communities. Louder sounds punctuate the hum: a crunch of grinding gears here, a minor explosion there, a yelp of surprise or triumph, and especially bursts of laughter. Gnomes take delight in life, enjoying every moment of invention, exploration, investigation, creation, and play.\n\n" + "As a forest gnome, you have a natural knack for illusion and inherent quickness and stealth. In the worlds of D&D, forest gnomes are rare and secretive. They gather in hidden communities in sylvan forests, using illusions and trickery to conceal themselves from threats or to mask their escape should they be detected. Forest gnomes tend to be friendly with other good-spirited woodland folk, and they regard elves and good fey as their most important allies. These gnomes also befriend small forest animals and rely on them for information about threats that might prowl their lands."),
        ROCKGNOME ("Rock Gnome", "Small", 25, 0, 0, 1, 2, 0, 0,
                "A constant hum of busy activity pervades the warrens and neighborhoods where gnomes form their close-knit communities. Louder sounds punctuate the hum: a crunch of grinding gears here, a minor explosion there, a yelp of surprise or triumph, and especially bursts of laughter. Gnomes take delight in life, enjoying every moment of invention, exploration, investigation, creation, and play.\n\n" + "As a rock gnome, you have a natural inventiveness and hardiness beyond that of other gnomes. Most gnomes in the worlds of D&D are rock gnomes, including the tinker gnomes of the Dragonlance setting."),
        HALFELF ("Half-elf", "Medium", 30, 0, 0, 0, 0, 0, 2,
                "Walking in two worlds but truly belonging to neither, half-elves combine what some say are the best qualities of their elf and human parents: human curiosity, inventiveness, and ambition tempered by the refined senses, love of nature, and artistic tastes of the elves. Some half-elves live among humans, set apart by their emotional and physical differences, watching friends and loved ones age while time barely touches them. Others live with the elves, growing restless as they reach adulthood in the timeless elven realms, while their peers continue to live as children. Many half-elves, unable to fit into either society, choose lives of solitary wandering or join with other misfits and outcasts in the adventuring life."),
        HALFORC ("Half-orc", "Medium", 30, 2, 0, 1, 0, 0, 0,
                "Whether united under the leadership of a mighty warlock or having fought to a standstill after years of conflict, orc and human tribes sometimes form alliances, joining forces into a larger horde to the terror of civilized lands nearby. When these alliances are sealed by marriages, half-orcs are born. Some half-orcs rise to become proud chiefs of orc tribes, their human blood giving them an edge over their full-blooded orc rivals. Some venture into the world to prove their worth among humans and other more civilized races. Many of these become adventurers, achieving greatness for their mighty deeds and notoriety for their barbaric customs and savage fury."),
        TIEFLING ("Tiefling", "Medium", 30, 0, 0, 0, 1, 0, 2,
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

        public String toString() {return name;}

        public String getSize() {return size;}

        public int getSpeed() {return speed;}

        public int getStr() {return str;}

        public int getDex() {return dex;}

        public int getCon() {return con;}

        public int getIntel() {return intel;}

        public int getWis() {return wis;}

        public int getCha() {return cha;}

        public String getDescrip() {return descrip;}
    }

    public enum Alignment {
        LAWFULGOOD ("Lawful Good"),
        LAWFULNEUTRAL ("Lawful Neutral"),
        LAWFULEVIL ("Lawful Evil"),
        NEUTRALGOOD ("Neutral Good"),
        TRUENEUTRAL ("True Neutral"),
        NEUTRALEVIL ("Neutral Evil"),
        CHAOTICGOOD ("Chaotic Good"),
        CHAOTICNEUTRAL ("Chaotic Neutral"),
        CHAOTICEVIL ("Chaotic Evil");

        private final String salign;

        Alignment(String salign) {
            this.salign = salign;
        }

        public String toString() {return salign;}
    }
}
