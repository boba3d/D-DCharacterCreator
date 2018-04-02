package DDCharacterCreator;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;

import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.*;
import com.couchbase.client.java.document.json.*;
import com.couchbase.client.java.env.CouchbaseEnvironment;
import com.couchbase.client.java.env.DefaultCouchbaseEnvironment;

import java.io.FileOutputStream;
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

    public boolean CloseConnectionToDB(){
        bucket.close();
        bucket = null;
        return true;
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
        //FileOutputStream fos = new FileOutputStream("mybean.ser");
        //ObjectOutputStream oos = new ObjectOutputStream(fos);
        //oos.writeObject(mb);
        //oos.close();

        return true;
    }


    public Character fetchCharacter(){
        Character c = null;

        return c;
    }


    public boolean UpdateCharacter(Character c, String id){

        return true;
    }


    private boolean removeCharacter(String id){

        return true;
    }
}
