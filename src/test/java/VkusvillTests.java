import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;
import pages.MainPage;
import helpers.AssertHelper;
import pages.NavigationPage;

import static com.codeborne.selenide.Selenide.$$;

public class VkusvillTests extends TestBase {
    AssertHelper assertion = new AssertHelper();
    MainPage mainPage = new MainPage();
    NavigationPage navigationPage = new NavigationPage();

    @DisplayName("Проверить работу попапа 'Меню'")
    @Test
    @Tag("Medium")
    void menuPopupCheckTest() {
        mainPage.clickMenu();
        assertion.textExist("Медиа");
    }

    @DisplayName("Проверить работу попапа 'Каталог'")
    @Test
    @Tag("Medium")
    void catalogPopupCheckTest() {
        mainPage.hoverCatalog();
        mainPage.clickNewProducts();
        assertion.textExist("Новинки");
    }

    @DisplayName("Проверить переход на страницу рецептов")
    @Test
    @Tag("Medium")
    void recipesPageCheckTest() {
        mainPage.clickRecipes();
        assertion.textExist("Рецепты");
    }

//    @DisplayName("Проверить переход на страницу вакансий")
//    @Test
//    @Tag("Medium")
//    void vacanciesPageCheckTest() {
//        mainPage.clickVacancies();
//        assertion.textExist("Работа");
//    }
//
//    @DisplayName("Проверить переход в корзину")
//    @Test
//    @Tag("Medium")
//    void cartPageCheckTest() {
//        mainPage.clickCart();
//        assertion.textExist("Корзина");
//    }
//
//    @DisplayName("Проверить поиск магазина по адресу")
//    @Test
//    @Tag("High")
//    public void testFindShopByAddress() {
//        navigationPage.pickShops();
//        navigationPage.selectRegion("Тверь");
//        navigationPage.selectCity("Тверской проспект 8");
//
//        assertion.numberOfElements(1, $$(".VV21_MapPanelShops__Item"));
//
//        navigationPage.selectShopByStreet("проспект 8");
//
//        assertion.existElementWithText(".VV21_MapPanelCard__Phone", "+7 (929) 096-79-67");
//    }
}
