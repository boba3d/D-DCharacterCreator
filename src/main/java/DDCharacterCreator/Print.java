package DDCharacterCreator;

import DDCharacterCreator.Utilities.Format;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import java.awt.print.PrinterJob;
import java.io.*;


import java.net.URI;
import java.net.URL;
import java.util.Map;

public class Print {

    private String src = "D-DCharCreatorSheets.pdf";
    private PdfDocument pdfDoc = null;
    private PdfAcroForm form = null;
    private Map<String, PdfFormField> fields;

    public void printChar(Character myChar, String SaveLocation ){
        if(myChar == null){
            System.out.println("character is null!");
            return;
        }

        String destination;
        if(SaveLocation == null){
            String fileName = myChar.getCharPlayerName();
            String home = System.getProperty("user.home");
            destination = new File(home+"/Downloads/D-DCharachterSheet-"+ fileName +".pdf").toString();
        }
        else{
            destination = SaveLocation;
            if(!destination.substring(destination.length() - 4).equals(".pdf"))
                destination += ".pdf";
        }

        try {
            System.out.println(destination);
            pdfDoc = new PdfDocument(new PdfReader(src), new PdfWriter(destination));
            form = PdfAcroForm.getAcroForm(pdfDoc, true);
        }catch (Exception e){
            System.out.println(e);
            return;
        }

        fields = form.getFormFields();
        /*for (Map.Entry entry : fields.entrySet()) {
            System.out.println("fields.get(\"" + entry.getKey() + "\").setValue();");
        }*/

        setFields(myChar);

        form.flattenFields();

        pdfDoc.close();
    }

    private void setFields(Character myChar) {
        //set all fields
        //charater main fields
            String charname = myChar.getCharName().toLowerCase();
            charname = charname.substring(0,1).toUpperCase() + charname.substring(1);
            fields.get("CharacterNameP2").setFontSize(22);
            fields.get("CharacterNameP1").setFontSize(22);
            fields.get("CharacterNameP2").setValue(charname);
            fields.get("CharacterNameP1").setValue(charname);

        if (myChar.getCharClass() != null && myChar.getCharLevel() != null) {
            fields.get("ClassLevel").setValue(myChar.getCharClass().name() + " & " + myChar.getCharLevel());
        }
        if (myChar.getCharRace() != null) {
            String Race = myChar.getCharRace().name().toLowerCase();
            Race = Race.substring(0,1).toUpperCase() + Race.substring(1);
            fields.get("Race").setFontSize(14);
            fields.get("Race").setValue(Race);
        }
        if (myChar.getCharBackground() != null) {
            String Background = myChar.getCharBackground().name().toLowerCase();
            Background = Background.substring(0,1).toUpperCase() + Background.substring(1);
            fields.get("Background").setFontSize(14);
            fields.get("Background").setValue(Background);
        }
        if (myChar.getCharAlignment() != null) {
            fields.get("Alignment").setValue(myChar.getCharAlignment().name());
        }
        if (myChar.getCharPlayerName() != null) {
            String PlayerName =myChar.getCharPlayerName().toLowerCase();
            PlayerName = PlayerName.substring(0,1).toUpperCase() + PlayerName.substring(1);
            fields.get("PlayerName").setFontSize(14);
            fields.get("PlayerName").setValue(PlayerName);
        }
        if (myChar.getCharExperiencePoints() != null) {
            fields.get("ExperiencePoints").setValue(myChar.getCharExperiencePoints().toString());
        }
        //page2 top
        if (myChar.getCharAge() != null) {
            fields.get("Age").setFontSize(14);
            fields.get("Age").setValue(myChar.getCharAge().toString());
        }
        if (myChar.getCharEyeColor() != null) {
            String Eyes =myChar.getCharEyeColor().name().toLowerCase();
            Eyes = Eyes.substring(0,1).toUpperCase() + Eyes.substring(1);
            fields.get("Eyes").setFontSize(14);
            fields.get("Eyes").setValue(Eyes);
        }
        if (myChar.getCharHeight() != null) {
            fields.get("Height").setFontSize(14);
            fields.get("Height").setValue(Format.convertInchesToFtIn(myChar.getCharHeight()));
        }

        if (myChar.getCharWeight() != null) { 
            fields.get("Weight").setFontSize(14);
            fields.get("Weight").setValue(Format.convertInchesToFtIn(myChar.getCharWeight()));
        }

        //Saving Throws
        if (myChar.getCharStrength() != null) {
            fields.get("Strength1").setValue(myChar.getCharStrength().toString());
            fields.get("Strength2").setValue(Integer.toString(myChar.getCharStrength()));
            fields.get("ST_Strength").setValue(myChar.getCharStrength().toString());
        }
        if (myChar.getCharDexterity() != null) {
            fields.get("Dexterity1").setValue(myChar.getCharDexterity().toString());
            fields.get("Dexterity2").setValue(Integer.toString(myChar.getCharDexterity()));
            fields.get("ST_Dexterity").setValue(myChar.getCharDexterity().toString());
        }
        if (myChar.getCharConstitution() != null) {
            fields.get("Constitution1").setValue(myChar.getCharConstitution().toString());
            fields.get("Constitution2").setValue(Integer.toString(myChar.getCharConstitution()));
            fields.get("ST_Constitution").setValue(myChar.getCharConstitution().toString());
        }
        if (myChar.getCharIntelligence() != null) {
            fields.get("Intelligence1").setValue(myChar.getCharIntelligence().toString());
            fields.get("Intelligence2").setValue(Integer.toString(myChar.getCharIntelligence()));
            fields.get("ST_Intelligence").setValue(myChar.getCharIntelligence().toString());
        }
        if (myChar.getCharWisdom() != null) {
            fields.get("Wisdom1").setValue(myChar.getCharWisdom().toString());
            fields.get("Wisdom2").setValue(Integer.toString(myChar.getCharWisdom()));
            fields.get("ST_Wisdom").setValue(myChar.getCharWisdom().toString());
        }
        if (myChar.getCharCharisma() != null) {
            fields.get("Charisma1").setValue(myChar.getCharCharisma().toString());
            fields.get("Charisma2").setValue(Integer.toString(myChar.getCharCharisma()));
            fields.get("ST_Charisma").setValue(myChar.getCharCharisma().toString());
        }

        //Skills
        if (myChar.getCharSkills().getCharAcrobatics() != null) {
            fields.get("Skills_Acrobatics").setValue(myChar.getCharSkills().getCharAcrobatics().toString());
        }
        if (myChar.getCharSkills().getCharAnimalHandling() != null) {
            fields.get("Skills_AnimalHandling").setValue(myChar.getCharSkills().getCharAnimalHandling().toString());
        }
        if (myChar.getCharSkills().getCharArcana() != null) {
            fields.get("Skills_Arcana").setValue(myChar.getCharSkills().getCharArcana().toString());
        }
        if (myChar.getCharSkills().getCharAthletics() != null) {
            fields.get("Skills_Athletics").setValue(myChar.getCharSkills().getCharAthletics().toString());
        }
        if (myChar.getCharSkills().getCharDeception() != null) {
            fields.get("Skills_Deception").setValue(myChar.getCharSkills().getCharDeception().toString());
        }
        if (myChar.getCharSkills().getCharHistory() != null) {
            fields.get("Skills_History").setValue(myChar.getCharSkills().getCharHistory().toString());
        }
        if (myChar.getCharSkills().getCharInsight() != null) {
            fields.get("Skills_Insight").setValue(myChar.getCharSkills().getCharInsight().toString());
        }
        if (myChar.getCharSkills().getCharIntimidation() != null) {
            fields.get("Skills_Intimidation").setValue(myChar.getCharSkills().getCharIntimidation().toString());
        }
        if (myChar.getCharSkills().getCharInvestigation() != null) {
            fields.get("Skills_Investigation").setValue(myChar.getCharSkills().getCharInvestigation().toString());
        }
        if (myChar.getCharSkills().getCharMedicine() != null) {
            fields.get("Skills_Medicine").setValue(myChar.getCharSkills().getCharMedicine().toString());
        }
        if (myChar.getCharSkills().getCharNature() != null) {
            fields.get("Skills_Nature").setValue(myChar.getCharSkills().getCharNature().toString());
        }
        if (myChar.getCharSkills().getCharPerception() != null) {
            fields.get("Skills_Perception").setValue(myChar.getCharSkills().getCharPerception().toString());
        }
        if (myChar.getCharSkills().getCharPerformance() != null) {
            fields.get("Skills_Performance").setValue(myChar.getCharSkills().getCharPerformance().toString());
        }
        if (myChar.getCharSkills().getCharPersuasion() != null) {
            fields.get("Skills_Persuasion").setValue(myChar.getCharSkills().getCharPersuasion().toString());
        }
        if (myChar.getCharSkills().getCharReligion() != null) {
            fields.get("Skills_Religion").setValue(myChar.getCharSkills().getCharReligion().toString());
        }
        if (myChar.getCharSkills().getCharSleightOfHand() != null) {
            fields.get("Skills_SleightOfHand").setValue(myChar.getCharSkills().getCharSleightOfHand().toString());
        }
        if (myChar.getCharSkills().getCharStealth() != null) {
            fields.get("Skills_Stealth").setValue(myChar.getCharSkills().getCharStealth().toString());
        }
        if (myChar.getCharSkills().getCharSurvival() != null) {
            fields.get("Skills_Survival").setValue(myChar.getCharSkills().getCharSurvival().toString());
        }

        //top middle fields
        if (myChar.getCharArmorClass() != null) {
            fields.get("ArmorClass").setValue(myChar.getCharArmorClass().toString());
        }
        if (myChar.getCharInitiative() != null) {
            fields.get("Initiative").setValue(myChar.getCharInitiative().toString());
        }
        if (myChar.getCharSpeed() != null) {
            fields.get("Speed").setValue(myChar.getCharSpeed().toString());
        }
        if (myChar.getCharHitPointMaximum() != null) {
            fields.get("HitPointMaximum").setValue(myChar.getCharHitPointMaximum().toString());
        }
        if (myChar.getCharHitDice() != null) {
            fields.get("HitDice").setValue("D" + myChar.getCharHitDice().toString());
        }

        //lower part first page
        //fields.get("PassiveWisdom").setValue();

        if (myChar.getCharEquipment() != null) {
            fields.get("Equipment").setFontSize(11);
            fields.get("Equipment").setValue(myChar.getCharEquipment());
        }

        if (myChar.getCharCP() != null) {
            fields.get("Equipment_CP").setValue(myChar.getCharCP().toString());
        }
        if (myChar.getCharSP() != null) {
            fields.get("Equipment_SP").setValue(myChar.getCharSP().toString());
        }
        if (myChar.getCharEP() != null) {
            fields.get("Equipment_EP").setValue(myChar.getCharEP().toString());
        }
        if (myChar.getCharGP() != null) {
            fields.get("Equipment_GP").setValue(myChar.getCharGP().toString());
        }
        if (myChar.getCharPP() != null) {
            fields.get("Equipment_PP").setValue(myChar.getCharPP().toString());
        }

        //Top right part first page
            if (myChar.getCharPersonalityTraits() != null){
                fields.get("PersonalityTraits").setFontSize(11);
                fields.get("PersonalityTraits").setValue(myChar.getCharPersonalityTraits());
            }
            if(myChar.getCharIdeals() != null){
                fields.get("Ideals").setFontSize(11);
                fields.get("Ideals").setValue(myChar.getCharIdeals());
            }
            if(myChar.getCharBonds() != null){
                fields.get("Bonds").setFontSize(11);
                fields.get("Bonds").setValue(myChar.getCharBonds());
            }
            if(myChar.getCharFlaws() != null){
                fields.get("Flaws").setFontSize(11);
                fields.get("Flaws").setValue(myChar.getCharFlaws());
            }
        //Page 2
        if(myChar.getCharAppearance() != null) {
            Document document = new Document(pdfDoc);
            try {
                ImageData imageData = ImageDataFactory.create(new URL(myChar.getCharAppearance()));
                Image image = new Image(imageData);
                image.scaleToFit(170,225);
                image.setFixedPosition(2,29,445);
                document.add(image);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    private void PrintPDF(String Destination) {
        PrinterJob printerjob = PrinterJob.getPrinterJob();
        PrintService printservice = null;

        if (printerjob.printDialog()) {
            printservice = printerjob.getPrintService();
        }


        if(printservice != null) {
            try {
                FileInputStream fis = new FileInputStream(Destination);
                Doc document = new SimpleDoc(fis, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
                DocPrintJob printjob = printservice.createPrintJob();
                printjob.print(document, new HashPrintRequestAttributeSet());
                fis.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }else{
            System.out.println("No service found");
        }
    }

    private void AddCharAppearance(){

    }

}
