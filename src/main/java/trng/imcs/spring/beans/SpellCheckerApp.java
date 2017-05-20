package trng.imcs.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpellCheckerApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
//        spellcheckerUsage(applicationContext);
        textEditorUsage(applicationContext);
    }

    private static void textEditorUsage(ApplicationContext applicationContext) {
        TextEditor textEditor = applicationContext.getBean(TextEditor.class);
        System.out.println(textEditor.checkSpelling("Hi Hellow Raj"));
    }

    private static void spellcheckerUsage(ApplicationContext applicationContext) {
        //      SpellChecker spellChecker =   (SpellChecker) applicationContext.getBean("spellChecker");
        SpellChecker spellChecker1 = applicationContext.getBean(SpellChecker.class);
//        SpellChecker spellchecker2 = applicationContext.getBean(SpellChecker.class);

//        System.out.println(spellChecker1 + "  " + spellchecker2);

        System.out.println(spellChecker1.check("Raj"));

    }
}
