package DDCharacterCreator;

import com.couchbase.lite.*;

import javax.imageio.ImageIO;
import java.awt.*;
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
public class Database {
    private com.couchbase.lite.Database db;
    /**
     * Start the database
     * @param context The context to use
     * @return true on success
     */
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

    /**
     * Add an image to the database
     * @param type The image type
     * @param imageloc The image to add
     * @return true on success
     */
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

    /**
     * Add a character to the database
     * @param c The character to add
     * @return true on success
     */
    public boolean addCharacter(Character c){
        Document d = db.createDocument();
        Map<String, Object> p = new HashMap<>();

        View v = db.getExistingView("characters");
        // basic info
        p.put("type", "Character");
        p.put("Char", c);
        p.put("name", c.getCharName());
        p.put("class", c.getCharClass());
        p.put("level", c.getCharLevel());
        p.put("background", c.getCharBackground());
        p.put("race", c.getCharRace());
        p.put("alignment", c.getCharAlignment());
        p.put("exp", c.getCharExperiencePoints());
        p.put("pname", c.getCharPlayerName());

        // saving throws
        p.put("strength", c.getCharStrength());
        p.put("dexterity", c.getCharDexterity());
        p.put("constitution", c.getCharConstitution());
        p.put("intelligence", c.getCharIntelligence());
        p.put("wisdom", c.getCharWisdom());
        p.put("charisma", c.getCharCharisma());

        p.put("skills", c.getCharSkills());

        p.put("armorClass", c.getCharArmorClass());
        p.put("initiative", c.getCharInitiative());
        p.put("speed", c.getCharSpeed());
        p.put("hpmax", c.getCharHitPointMaximum());
        p.put("hitdie", c.getCharHitDice());

        // attacks
        p.put("atkName", c.getCharATKName());
        p.put("atkBonus", c.getCharATKBonus());
        p.put("atkType", c.getCharATKDamageType());

        // Equipment
        p.put("cp", c.getCharCP());
        p.put("sp", c.getCharSP());
        p.put("ep", c.getCharEP());
        p.put("gp", c.getCharGP());
        p.put("pp", c.getCharPP());

        // Appearance
        p.put("appearance", c.getCharAppearance());
        p.put("age", c.getCharAge());
        p.put("height", c.getCharHeight());
        p.put("weight", c.getCharWeight());
        p.put("eye", c.getCharEyeColor());
        p.put("skin", c.getCharSkin());
        p.put("hair", c.getCharHair());
        p.put("symbol", c.getCharSymbol());
        p.put("backstory", c.getCharBackstory());
        p.put("addtltraits", c.getCharAdditionalFeaturesTraits());
        p.put("treasure", c.getTreasure());

        try{
            d.putProperties(p);
        }
        catch(CouchbaseLiteException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Fetch a character
     * @param id The UUID of the character to pull
     * @return The character from the database, or null if it doesn't exist
     */
    public Character fetchCharacter(int id){
        Document d = db.getDocument(Integer.toString(id));
        Map<String, Object> p = d.getProperties();
        if(p.isEmpty()) return null;

        Character c = new Character();

        try{
            c.setCharName((String)p.get("name"));
            c.setCharClass((Enum.Class)p.get("class"));
            c.setCharLevel((Integer)p.get("level"));
            c.setCharBackground((Enum.Background)p.get("background"));
            c.setCharRace((Enum.Race)p.get("race"));
            c.setCharAlignment((Enum.Alignment)p.get("alignment"));
            c.setCharExperiencePoints((Integer)p.get("exp"));
            c.setCharPlayerName((String)p.get("pname"));

            c.setCharStrength((Integer)p.get("strength"));
            c.setCharDexterity((Integer)p.get("dexterity"));
            c.setCharConstitution((Integer)p.get("constitution"));
            c.setCharIntelligence((Integer)p.get("intelligence"));
            c.setCharWisdom((Integer)p.get("wisdom"));

            c.setCharSkills((CharacterSkills)p.get("skills"));

            c.setCharArmorClass((Integer)p.get("armorClass"));
            c.setCharInitiative((Integer)p.get("initiative"));
            c.setCharSpeed((Integer)p.get("speed"));
            c.setCharHitPointMaximum((Integer)p.get("hpmax"));
            c.setCharHitDice((Integer)p.get("hitdie"));

            c.setCharATKDamageType((String)p.get("atkName"));
            c.setCharATKBonus((Integer)p.get("atkBonus"));
            c.setCharATKDamageType((String)p.get("atkType"));

            c.setCharCP((Integer)p.get("cp"));
            c.setCharSP((Integer)p.get("sp"));
            c.setCharEP((Integer)p.get("ep"));
            c.setCharGP((Integer)p.get("gp"));
            c.setCharPP((Integer)p.get("pp"));

            c.setCharAppearance((String)p.get("appearance"));
            c.setCharAge((Integer)p.get("age"));
            c.setCharHeight((String)p.get("height"));
            c.setCharWeight((String)p.get("weight"));
            c.setCharEyeColor((Enum)p.get("eye"));
            c.setCharSkin((Enum)p.get("skin"));
            c.setCharHair((Enum)p.get("hair"));
            c.setCharSymbol((String)p.get("backstory"));
            c.setCharAdditionalFeaturesTraits((String)p.get("addtltraits"));
            c.setTreasure((String)p.get("treasure"));
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return c;
    }

    /**
     * Delete a character from the database
     * @param id The UUID to delete
     * @return true on success
     */
    public boolean removeCharacter(int id){
        Document d = db.getDocument(Integer.toString(id));

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
