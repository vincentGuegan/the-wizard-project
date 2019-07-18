package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("GandalfId")
public class Gandalf implements WizardInterface {

    private Outfit myOutfit; //attribut

    @Autowired
    public Gandalf(Outfit myOutfit) {
        this.myOutfit = myOutfit;
    }

    @Override
    public String giveAdvice() {
        return "My name is Gandalf";
    }

    @Override
    public String changeDress() {
        return this.myOutfit.whatDressColor();
    }


}