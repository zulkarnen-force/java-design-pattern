package behavioral.mediator;

public class User {

    private String name, language, message;

    public User(){};

    public User(String name, String language, String message) {
        this.name = name;
        this.language = language;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String translate(){
        return new SpanishEnglishTranslator().translate(this.language, this.message);
    }
    
}
