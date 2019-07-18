package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("DumbledoreId")
public class Dumbledore implements WizardInterface {

    private Outfit myOutfit; //attribut

    @Autowired
    public Dumbledore(Outfit myOutfit) {
        this.myOutfit = myOutfit;
    }

    @Override
    public String giveAdvice() {
        return "My name is Dumbledore";
    }

    @Override
    public String changeDress() {
        return this.myOutfit.whatDressColor();
    }


}