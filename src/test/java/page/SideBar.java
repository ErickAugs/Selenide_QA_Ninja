package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SideBar {
    public SelenideElement loggerUser(){
        return $(".user .info span");
    }

}
