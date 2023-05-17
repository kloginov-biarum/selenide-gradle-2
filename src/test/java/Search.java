import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Search {

    @Test
    public void validSearch(){
        open("https://duckduckgo.com/");
    }


}
