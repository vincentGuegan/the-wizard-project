package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;


public class App {

    public void start(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        WizardInterface myWizardInterface = context.getBean("wizards", WizardInterface.class);

        context.close();

        System.out.println("");
        System.out.println("******************");
        System.out.println(myWizardInterface.giveAdvice());
        System.out.println("******************");
        System.out.println(myWizardInterface.changeDress());
    }

}