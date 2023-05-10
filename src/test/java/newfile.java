import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class newfile {
    @BeforeAll
    static void beforeALL(){
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void FirstTest(){

    }
}
