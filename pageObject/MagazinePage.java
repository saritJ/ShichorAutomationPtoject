package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MagazinePage extends BasePage {

	@FindBy(css = ".articles-page__list div:nth-child(1) > a")
	private WebElement firstCard;

	@FindBy(css = ".articles-page__list div:nth-child(1) > a h4")
	private WebElement firstCardTitle;

	@FindBy(css = "div.articles-page__list  div:nth-child(1) > a > div.article-card__destination")
	private WebElement firstCityName;

	// Constructor
	public MagazinePage(WebDriver driver) {
		super(driver);
	}

	public void clickOnFirstCard() {
		click(firstCard);
	}

	public String getTitle() {
		return getText(firstCardTitle);
	}

	public String getCityName() {
		return getText(firstCityName);
	}

}
