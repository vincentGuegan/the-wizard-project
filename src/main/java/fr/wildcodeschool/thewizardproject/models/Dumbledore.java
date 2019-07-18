package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {

    private Outfit myOutfit; //attribut

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