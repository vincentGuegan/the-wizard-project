package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {

    private Outfit myOutfit; //attribut

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