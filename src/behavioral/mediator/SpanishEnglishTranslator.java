package behavioral.mediator;

public class SpanishEnglishTranslator implements Translator {

    @Override
    public String translate(String language, String message) {
        if(language.equalsIgnoreCase("SPANISH") 
            && message.equalsIgnoreCase("Hola amigas")) {
                return "Hello Friends";
            }

            if(language.equalsIgnoreCase("ENGLISH") 
            && message.equalsIgnoreCase("fine and you")) {
                return "Multa";
            }

            return "Unable to translate the text :(";

        }

    
}
