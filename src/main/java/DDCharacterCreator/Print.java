package DDCharacterCreator;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;

import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintJobAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.event.PrintJobAttributeListener;
import javax.print.event.PrintJobListener;
import java.awt.*;
import java.awt.print.PrinterJob;
import java.io.*;
import java.lang.reflect.Executable;
import java.util.Map;

public class Print {

    String src = "D-DCharCreatorSheets.pdf";
    PdfDocument pdfDoc = null;
    PdfAcroForm form = null;
    Map<String, PdfFormField> fields;

    public boolean printChar(Character myChar, String destination){
        try {
            pdfDoc = new PdfDocument(new PdfReader(src), new PdfWriter(destination));
            form = PdfAcroForm.getAcroForm(pdfDoc, true);
        }catch (Exception e){
            System.out.println(e);
        }

        fields = form.getFormFields();
        /*for (Map.Entry entry : fields.entrySet()) {
            System.out.println("fields.get(\"" + entry.getKey() + "\").setValue();");
        }*/

        setFields(myChar);

        form.flattenFields();
        pdfDoc.close();

        PrintPDF(destination);
        return true;
    }

    private void setFields(Character myChar){
        //set all fields
        //charater main fields
        fields.get("CharacterNameP2").setValue(myChar.getCharName());
        fields.get("CharacterNameP1").setValue(myChar.getCharName());
        if(myChar.getCharClass() != null && myChar.getCharLevel() != null) {
            fields.get("ClassLevel").setValue(myChar.getCharClass().name() + " & " + myChar.getCharLevel());
        }
        if(myChar.getCharRace() != null) {
            fields.get("Race").setValue(myChar.getCharRace().name());
        }
        if(myChar.getCharBackground() !=null){
            fields.get("Background").setValue(myChar.getCharBackground().name());
        }
        if(myChar.getCharAlignment() !=null){
            fields.get("Alignment").setValue(myChar.getCharAlignment().name());
        }
        if(myChar.getCharPlayerName() !=null){
            fields.get("PlayerName").setValue(myChar.getCharPlayerName());
        }
        if(myChar.getCharExperiencePoints() !=null){
            fields.get("ExperiencePoints").setValue(myChar.getCharExperiencePoints().toString());
        }
        if(myChar.getCharAge() !=null) {
            fields.get("Age").setValue(myChar.getCharAge().toString());
        }
        if(myChar.getCharEyeColor() != null) {
            //fields.get("Eyes").setValue(myChar.getCharEyeColor());
        }
        if(myChar.getCharHeight() !=null){
            fields.get("Height").setValue(myChar.getCharHeight());
        }
        if(myChar.getCharSkin() != null) {
            //fields.get("Skin").setValue(myChar.getCharSkin());
        }
        if(myChar.getCharWeight() !=null){
            fields.get("Weight").setValue(myChar.getCharWeight());
        }
        if(myChar.getCharHair() != null) {
            //fields.get("Hair").setValue(myChar.getCharHair());
        }

        //Saving Throws
        if (myChar.getCharStrength() != null) {
            fields.get("Strength1").setValue(myChar.getCharStrength().toString());
            fields.get("Strength2").setValue(Integer.toString(myChar.getCharStrength() - 10));
            fields.get("ST_Strength").setValue(myChar.getCharStrength().toString());
        }
        if(myChar.getCharDexterity() != null) {
            fields.get("Dexterity1").setValue(myChar.getCharDexterity().toString());
            fields.get("Dexterity2").setValue(Integer.toString(myChar.getCharDexterity() - 10));
            fields.get("ST_Dexterity").setValue(myChar.getCharDexterity().toString());
        }
        if(myChar.getCharConstitution() != null) {
            fields.get("Constitution1").setValue(myChar.getCharConstitution().toString());
            fields.get("Constitution2").setValue(Integer.toString(myChar.getCharConstitution() - 10));
            fields.get("ST_Constitution").setValue(myChar.getCharConstitution().toString());
        }
        if(myChar.getCharIntelligence() != null) {
            fields.get("Intelligence1").setValue(myChar.getCharIntelligence().toString());
            fields.get("Intelligence2").setValue(Integer.toString(myChar.getCharIntelligence() - 10));
            fields.get("ST_Intelligence").setValue(myChar.getCharIntelligence().toString());
        }
        if(myChar.getCharWisdom() != null) {
            fields.get("Wisdom1").setValue(myChar.getCharWisdom().toString());
            fields.get("Wisdom2").setValue(Integer.toString(myChar.getCharWisdom() - 10));
            fields.get("ST_Wisdom").setValue(myChar.getCharWisdom().toString());
        }
        if(myChar.getCharCharisma() != null) {
            fields.get("Charisma1").setValue(myChar.getCharCharisma().toString());
            fields.get("Charisma2").setValue(Integer.toString(myChar.getCharCharisma() - 10));
            fields.get("ST_Charisma").setValue(myChar.getCharCharisma().toString());
        }

        //Skills
        if(myChar.getCharSkills().getCharAcrobatics() != null) {
            fields.get("Skills_Acrobatics").setValue(myChar.getCharSkills().getCharAcrobatics().toString());
        }
        if(myChar.getCharSkills().getCharAnimalHandling() != null) {
            fields.get("Skills_AnimalHandling").setValue(myChar.getCharSkills().getCharAnimalHandling().toString());
        }
        if(myChar.getCharSkills().getCharArcana() != null) {
            fields.get("Skills_Arcana").setValue(myChar.getCharSkills().getCharArcana().toString());
        }
        if(myChar.getCharSkills().getCharAthletics() != null) {
            fields.get("Skills_Athletics").setValue(myChar.getCharSkills().getCharAthletics().toString());
        }
        if(myChar.getCharSkills().getCharDeception() != null) {
            fields.get("Skills_Deception").setValue(myChar.getCharSkills().getCharDeception().toString());
        }
        if(myChar.getCharSkills().getCharHistory() != null) {
            fields.get("Skills_History").setValue(myChar.getCharSkills().getCharHistory().toString());
        }
        if(myChar.getCharSkills().getCharInsight() != null) {
            fields.get("Skills_Insight").setValue(myChar.getCharSkills().getCharInsight().toString());
        }
        if(myChar.getCharSkills().getCharIntimidation() != null) {
            fields.get("Skills_Intimidation").setValue(myChar.getCharSkills().getCharIntimidation().toString());
        }
        if(myChar.getCharSkills().getCharInvestigation() != null) {
            fields.get("Skills_Investigation").setValue(myChar.getCharSkills().getCharInvestigation().toString());
        }
        if(myChar.getCharSkills().getCharMedicine() != null) {
            fields.get("Skills_Medicine").setValue(myChar.getCharSkills().getCharMedicine().toString());
        }
        if(myChar.getCharSkills().getCharNature() != null) {
            fields.get("Skills_Nature").setValue(myChar.getCharSkills().getCharNature().toString());
        }
        if(myChar.getCharSkills().getCharPerception()  != null) {
            fields.get("Skills_Perception").setValue(myChar.getCharSkills().getCharPerception().toString());
        }
        if(myChar.getCharSkills().getCharPerformance() != null) {
            fields.get("Skills_Performance").setValue(myChar.getCharSkills().getCharPerformance().toString());
        }
        if(myChar.getCharSkills().getCharPersuasion() != null) {
            fields.get("Skills_Persuasion").setValue(myChar.getCharSkills().getCharPersuasion().toString());
        }
        if(myChar.getCharSkills().getCharReligion() != null) {
            fields.get("Skills_Religion").setValue(myChar.getCharSkills().getCharReligion().toString());
        }
        if(myChar.getCharSkills().getCharSleightOfHand() != null) {
            fields.get("Skills_SleightOfHand").setValue(myChar.getCharSkills().getCharSleightOfHand().toString());
        }
        if(myChar.getCharSkills().getCharStealth() != null) {
            fields.get("Skills_Stealth").setValue(myChar.getCharSkills().getCharStealth().toString());
        }
        if(myChar.getCharSkills().getCharSurvival() != null) {
            fields.get("Skills_Survival").setValue(myChar.getCharSkills().getCharSurvival().toString());
        }

        //top middle fields
        if(myChar.getCharArmorClass() != null) {
            fields.get("ArmorClass").setValue(myChar.getCharArmorClass().toString());
        }
        if(myChar.getCharInitiative() != null) {
            fields.get("Initiative").setValue(myChar.getCharInitiative().toString());
        }
        if(myChar.getCharSpeed() != null) {
            fields.get("Speed").setValue(myChar.getCharSpeed().toString());
        }
        if(myChar.getCharHitPointMaximum() != null) {
            fields.get("HitPointMaximum").setValue(myChar.getCharHitPointMaximum().toString());
        }
        if(myChar.getCharHitDice() != null) {
            fields.get("HitDice").setValue(myChar.getCharHitDice().toString());
        }

        //lower part first page
        //fields.get("PassiveWisdom").setValue();
        if(myChar.getCharCP() != null) {
            fields.get("Equipment_CP").setValue(myChar.getCharCP().toString());
        }
        if(myChar.getCharSP() != null) {
            fields.get("Equipment_SP").setValue(myChar.getCharSP().toString());
        }
        if(myChar.getCharEP() != null) {
            fields.get("Equipment_EP").setValue(myChar.getCharEP().toString());
        }
        if(myChar.getCharGP() != null) {
            fields.get("Equipment_GP").setValue(myChar.getCharGP().toString());
        }
        if(myChar.getCharPP() != null) {
            fields.get("Equipment_PP").setValue(myChar.getCharPP().toString());
        }

        //Page 2
        //fields.get("CharacterAppearance").setValue();
        //fields.get("Symbol_Picture_af_image").setValue();
        //fields.get("Symbol_Name").setValue();
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
}
