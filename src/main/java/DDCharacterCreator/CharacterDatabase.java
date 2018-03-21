package DDCharacterCreator;

import com.couchbase.lite.*;
import com.google.gson.Gson;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * A class for managing information in the database
 * @author Axel VanHoyweghen, Michael MacLean
 * @version 1.0
 * @since 1.0
 * TODO update character, fetch names of all characters, select character by name
 */
public class CharacterDatabase {
    private com.couchbase.lite.Database db;

    public boolean StartDatabase(Context context) {
        try {
            Manager manager = new Manager(context, Manager.DEFAULT_OPTIONS);
            db = manager.getDatabase("ddcreatorapp");
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
public Database getDatabase(){
        return db;
}

    public boolean addImage(String type, String imageloc, String imagename){
        Document doc  = db.createDocument();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        UUID uuid = UUID.randomUUID();
        Calendar calendar = GregorianCalendar.getInstance();
        long currentTime = calendar.getTimeInMillis();
        String currentTimeString = dateFormatter.format(calendar.getTime());

        String id = currentTime + "-" + uuid.toString();

        Map<String, Object> properties = new HashMap<>();
        properties.put("_id", id);
        properties.put("type", "CharacterImage");
        properties.put("created_at", currentTimeString);

        properties.put("Character", type);

        //put in db
            try{
                doc.putProperties(properties);
            }catch (Exception e){
                e.printStackTrace();
            }
        //attach image
        AddAttachment(doc, imageloc, imagename);
        return true;
    }


    private void AddAttachment(Document doc, String imageloc, String ImageName){
        //convert
            ByteArrayInputStream stream = null;
            ByteArrayOutputStream bitmap = new ByteArrayOutputStream();
            File input = new File(imageloc);

            try {
                BufferedImage image = ImageIO.read(input);
                ImageIO.write(image, "bmp", bitmap);
                stream = new ByteArrayInputStream(bitmap.toByteArray());
            }catch(Exception e){
                e.printStackTrace();
            }
        //add attachment
            UnsavedRevision newRev = doc.getCurrentRevision().createRevision();
            newRev.setAttachment(ImageName, "image/png", stream);
            try {
                newRev.save();
            }catch (Exception e){
                e.printStackTrace();
            }
    }


    public boolean addCharacter(Character c){
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        Calendar calendar = GregorianCalendar.getInstance();
        String currentTimeString = dateFormatter.format(calendar.getTime());

        Document d = db.createDocument();
        Map<String, Object> properties = new HashMap<>();
            properties.put("_id", "DDCHARACTER");
            properties.put("type", "CharacterObject");
            properties.put("created_at", currentTimeString);

            properties.put("Character", c);

        try{
            d.putProperties(properties);
        }
        catch(CouchbaseLiteException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public Character fetchCharacter(){
        Character c = null;
        Document retrievedDocument = db.getDocument("DDCHARACTER"); // Retrieve the document by id
        Object charObj = retrievedDocument.getProperties().get("Character");
        Gson gson = new Gson();
        String jsonString = gson.toJson(charObj, Map.class); //Convert the object to json string using Gson
        c = gson.fromJson(jsonString, Character.class); //convert the json st
        removeCharacter("DDCHARACTER");
        return c;
    }


    public boolean UpdateCharacter(Character c, String id){
        Document doc = db.getDocument(id);
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.putAll(doc.getProperties());
        properties.put("Character", c);
        try{
            doc.putProperties(properties);
        }
        catch(CouchbaseLiteException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }


    private boolean removeCharacter(String id){
        Document d = db.getDocument(id);
        try{
            d.delete();
        }
        catch(CouchbaseLiteException e){
            e.printStackTrace();
            return false;
        }
        return d.isDeleted();
    }
}
