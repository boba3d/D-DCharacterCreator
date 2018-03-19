package DDCharacterCreator;

import com.couchbase.lite.Context;
import com.couchbase.lite.Document;
import com.couchbase.lite.JavaContext;
import com.couchbase.lite.Manager;
import javafx.application.Application;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;

public class Database {
    com.couchbase.lite.Database MyDB;
    Manager MyManager;


    public void StartDatabase(Context context) {
        try {
            MyManager = new Manager(context, Manager.DEFAULT_OPTIONS);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            MyDB = MyManager.getDatabase("ddcreatorapp");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void AddImage(String type, Image image){
        Document doc  = MyDB.createDocument();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        UUID uuid = UUID.randomUUID();
        Calendar calendar = GregorianCalendar.getInstance();
        long currentTime = calendar.getTimeInMillis();
        String currentTimeString = dateFormatter.format(calendar.getTime());

        String id = currentTime + "-" + uuid.toString();

        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("_id", id);
        properties.put("type", "Image");
        properties.put("created_at", currentTimeString);

        properties.put("Character", type);

        //put pictures in it.



        //put in db
        try{
            doc.putProperties(properties);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
