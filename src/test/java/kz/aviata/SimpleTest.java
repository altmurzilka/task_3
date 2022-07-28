package kz.aviata;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
// import com.codeborne.selenide.drivercommands.WebDriverWrapper;
import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeEach
    void openMainPage() {
        Selenide.open("https://railways-staging-monolith.dev.cloud.aviata.team/railways/");
    }

    @AfterEach
    void closePage(){
        WebDriverRunner.closeWindow();
    }

    @Test
    void assertTest() {

    }
}

//test {
//    useJUnitPlatform()
//}
