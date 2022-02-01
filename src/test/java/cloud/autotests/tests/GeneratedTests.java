package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("auth test")
    void generatedTest() {
        step("open https://goldapple.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("subscription__inner input-field__input type=\"email\" button-primary", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://goldapple.ru/'", () ->
            open("https://goldapple.ru/"));

        step("Page title should have text '«Золотое яблоко» - интернет-магазин косметики и парфюмерии. Официальный сайт | Gold Apple'", () -> {
            String expectedTitle = "«Золотое яблоко» - интернет-магазин косметики и парфюмерии. Официальный сайт | Gold Apple";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://goldapple.ru/'", () ->
            open("https://goldapple.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}