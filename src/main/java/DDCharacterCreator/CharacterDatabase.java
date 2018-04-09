package DDCharacterCreator;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;

import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.*;
import com.couchbase.client.java.document.json.*;
import com.couchbase.client.java.env.CouchbaseEnvironment;
import com.couchbase.client.java.env.DefaultCouchbaseEnvironment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 * A class for managing information in the database
 * @author Axel VanHoyweghen, Michael MacLean
 * @version 1.0
 * @since 1.0
 * TODO update character, fetch names of all characters, select character by name
 */
public class CharacterDatabase {
        static Bucket bucket;

    public boolean OpenConnectionToDB() {
        CouchbaseEnvironment env = DefaultCouchbaseEnvironment.builder()
                .connectTimeout(180 * 1000) // 180 Seconds
                .keepAliveInterval(3600 * 1000) // 3600 Seconds
                .queryTimeout(1000000)
                .build();
        Cluster cluster = CouchbaseCluster.create(env,"cbapi.axelvh.com");
        bucket = cluster.openBucket("DDCreator", "DDCreator1234");
        System.out.println(cluster.diagnostics().toString());
        return true;
    }

    public boolean CloseConnectionToDB() throws NullPointerException{
        if(bucket !=null) {
            bucket.close();
            bucket = null;
            return true;
        }else{
            return false;
        }
    }


    public boolean addImage(String race, String id, String imageloc){

        OpenConnectionToDB();
        JsonObject Image = JsonObject.create()
                .put("type", "characterappearance")
                .put("race", race)
                .put("image",imageloc);

        bucket.upsert(JsonDocument.create(id, Image));
        return true;
    }

    public void addAllImages(){
        addImage("darkelf", "characters_darkelf_darkelf2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/darkelf/dark-elf-female.jpg");

        addImage("highelf", "characters_highelf_highelf1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/highelf/high-elf-female.jpg");
        addImage("highelf", "characters_highelf_highelf2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/highelf/high-elf-male.jpg");

        addImage("woodelf", "characters_woodelf_woodelf1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/woodelf/wood-elf-female.jpg");
        addImage("woodelf", "characters_woodelf_woodelf2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/woodelf/wood-elf-male.jpg");

        addImage("halfelf", "characters_halfelf_halfelf1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/halfelf/half-elf-female.jpg");
        addImage("halfelf", "characters_halfelf_halfelf2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/halfelf/half-elf-male.jpg");

        addImage("human", "characters_human_human1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/human/human-calishite-female.jpg");
        addImage("human", "characters_human_human2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/human/human-calishite-male.jpg");

        addImage("stouthalfling", "characters_stouthalfling_stouthalfling1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/stout/stout-halfling-female.jpg");
        addImage("stouthalfling", "characters_stouthalfling_stouthalfling2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/stout/stout-halfling-male.jpg");

        addImage("lightfoothalfling", "characters_lightfoothalfling_lightfoothalfling1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/lightfoot/Lightfoot-Halfling-male.jpg");
        addImage("lightfoothalfling", "characters_lightfoothalfling_lightfoothalfling2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/lightfoot/lightfoot-halfling-female.jpg");

        addImage("halforc", "characters_halforc_halforc1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/half-orc-female.jpg");
        addImage("halforc", "characters_halforc_halforc2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/half-orc-male.jpg");

        addImage("rockgnome", "characters_rockgnome_rockgnome1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/rock-gnome-female.jpg");
        addImage("rockgnome", "characters_rockgnome_rockgnome2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/rock-gnome-male.jpg");

        addImage("forestgnome", "characters_forestgnome_forestgnome1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/forest-gnome-female.jpg");
        addImage("forestgnome", "characters_forestgnome_forestgnome2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/forest-gnome-male.jpg");

        addImage("tiefling", "characters_tiefling_tiefling1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/tiefling-female.jpg");
        addImage("tiefling", "characters_tiefling_tiefling2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/tiefling-male.jpg");

        addImage("hilldwarf", "characters_hilldwarf_hilldwarf1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/hill-dwarf-female.jpg");
        addImage("hilldwarf", "characters_hilldwarf_hilldwarf2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/hill-dwarf-male.jpg");

        addImage("mountaindwarf", "characters_mountaindwarf_mountaindwarf1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/mountain-dwarf-female.jpg");
        addImage("mountaindwarf", "characters_mountaindwarf_mountaindwarf2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/mountain-dwarf-male.jpg");

        addImage("dragonborn", "characters_dragonborn_dragonborn1","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/dragonborn-female.jpg");
        addImage("dragonborn", "characters_dragonborn_dragonborn2","https://s3.us-east-2.amazonaws.com/ddcharactorcreator/characters/dragonborn-male.jpg");
    }

    public LinkedList<String> getImages(Character myChar){
        LinkedList<String> imgList = new LinkedList<>();
        String race = myChar.getCharRace().name().toLowerCase();

        boolean done = false;
        int i = 1;
        while(!done) {
            String link = "characters_" + race + "_" + race + i;

            JsonDocument jsonDocument = bucket.get(link);
            if(jsonDocument != null){
                //System.out.println(jsonDocument.content().getString("image"));
                imgList.add(jsonDocument.content().getString("image"));
            }else{
                done = true;
            }
            i++;
        }
        return imgList;
    }


    public boolean SaveCharacter(Character c) throws Exception{
        FileOutputStream fos = new FileOutputStream("char.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();

        return true;
    }


    public Character fetchCharacter() throws Exception{
        Character c = null;
        FileInputStream fis = new FileInputStream("char.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        c = (Character) ois.readObject();
        ois.close();
        return c;
    }
}
