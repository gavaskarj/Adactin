package org.hexa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//BaseClass/LibGloble/ Utilites / common / Automation 
public class LibGlobal {

	public static WebDriver driver; // Instance variable (class level access )
	// 1

	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	// 2
	public void maximize() {
		driver.manage().window().maximize();
	}

	// 3
	public void loadUrl(String url) {
		driver.get(url);

	}

	// 4
	public void sentValues(WebElement element, String text) {
		element.sendKeys(text);
	}
	// 5
	public void elementClick(WebElement element) {
		element.click();
	}

	// 6
	public void closeWindow() {
		driver.close();
	}

	// 7
	public void quitBrowser() {
		driver.quit();
	}

	// 8
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 9
	public String title() {
		String title = driver.getTitle();
		return title;
	}

	// 10
	public void minimize() {
		driver.manage().window().minimize();
	}

	// 11
	public Navigation navigate() {
		Navigation navigate = driver.navigate();
		return navigate;
	}

	// 12
	public TargetLocator switchTo() {
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
	}

	// 13
	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	// 14
	public void getWindowHandles(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(windowHandles);
		driver.switchTo().window(l.get(index));
	}

	// 15
	public void clear(WebElement element) {
		element.clear();
	}

	// 16
	public String getText(WebElement element, String text) {
		String text2 = element.getText();
		return text2;
	}

	// 17
	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	// 18
	public boolean idDisplay(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	// 19
	public boolean idEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	// 20
	public boolean idSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	// 21
	public void sumbit(WebElement element) {
		element.submit();
	}

	// 22
	public Point getLocation(WebElement element) {
		Point location = element.getLocation();
		return location;
	}

	// 23
	public Dimension getSize(WebElement element) {
		Dimension size = element.getSize();
		return size;
	}

	// 24
	public String getTagName(WebElement element) {
		String tagName = element.getTagName();
		return tagName;
	}

	// 25
	public Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	// 27
	public Alert acceptAlert() {
		Alert a = switchToAlert();
		a.accept();
		return a;
	}

	// 28
	public Alert dismissAlert() {
		Alert a = switchToAlert();
		a.dismiss();
		return a;
	}

	// 29
	public Alert sendKeysAlert(String keysToSend) {
		Alert a = switchToAlert();
		a.sendKeys(keysToSend);
		return a;
	}

	// 30
	public String getTextAlert(String keysToSend) {
		Alert a = switchToAlert();
		String text = a.getText();
		return text;
	}

	// 31
	public Navigation navigateTo(String url) {
		Navigation navigate = navigate();
		navigate.to(url);
		return navigate;
	}

	// 32
	public void forwardTo() {
		Navigation navigate = navigate();
		navigate.forward();
	}

	// 33
	public void backwordTo() {
		Navigation navigate = navigate();
		navigate.back();
	}

	// 34
	public void refreshTo() {
		Navigation navigate = navigate();
		navigate.refresh();
	}

	// 35
	public void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	// 36
	public void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	// 37
	public void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	// 38
	public void deselectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	// 39
	public void deselectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	// 40
	public void deselectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

	// 41
	public void deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	// 42
	public List<WebElement> getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	// 43
	public List<WebElement> getAllSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}

	// 44
	public boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	// 45
	public Actions moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		Actions element = a.moveToElement(target);
		element.perform();
		return element;
	}

	// 46
	public Actions dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		Actions element = a.dragAndDrop(source, target);
		element.perform();
		return element;
	}

	// 47
	public Actions doubleClick() {
		Actions a = new Actions(driver);
		Actions element = a.doubleClick();
		element.perform();
		return element;
	}

	// 48
	public Actions webElementDoubleClick(WebElement target) {
		Actions a = new Actions(driver);
		Actions element = a.doubleClick(target);
		element.perform();
		return element;
	}

	// 49
	public Actions contextClick() {
		Actions a = new Actions(driver);
		Actions element = a.contextClick();
		element.perform();
		return element;
	}

	// 50
	public Actions webElementContextClick(WebElement target) {
		Actions a = new Actions(driver);
		Actions element = a.contextClick(target);
		element.perform();
		return element;
	}

	// 51
	public void perform() {
		Actions a = new Actions(driver);
		a.perform();
	}

	// 52
	public void keyUp(CharSequence key) {
		Actions a = new Actions(driver);
		a.keyUp(key);
	}

	// 53
	public void keyUp(CharSequence key, WebElement target) {
		Actions a = new Actions(driver);
		a.keyUp(target, key);
	}

	// 54
	public void keyDown(CharSequence key) {
		Actions a = new Actions(driver);
		a.keyDown(key);
	}

	// 55
	public void keyDown(CharSequence key, WebElement target) {
		Actions a = new Actions(driver);
		a.keyDown(target, key);
	}

	// 56
	public void selectFramesById(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	// 57
	public void selectFramesByIndex(String index) {
		driver.switchTo().frame(index);
	}

	// 58
	public void selectFramesByWebElement(String frameElement) {
		driver.switchTo().frame(frameElement);
	}

	// 59
	public void parentFrame() {
		driver.switchTo().parentFrame();
	}

	// 60
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// 61
	public Rectangle getRect(WebElement element) {
		Rectangle rect = element.getRect();
		return rect;
	}

	// 62
	public int getHeight(WebElement element) {
		Rectangle rect = getRect(element);
		int height = rect.getHeight();
		return height;
	}

	// 63
	public Dimension getDimension(WebElement element) {
		Rectangle rect = getRect(element);
		Dimension dimension = rect.getDimension();
		return dimension;
	}

	// 64
	public Point getPoint(WebElement element) {
		Rectangle rect = getRect(element);
		Point point = rect.getPoint();
		return point;

	}

	// 65
	public int getWidth(WebElement element) {
		Rectangle rect = getRect(element);
		int width = rect.getWidth();
		return width;

	}

	// 66
	public int getX(WebElement element) {
		Rectangle rect = getRect(element);
		int x = rect.getX();
		return x;
	}

	// 67
	public int getY(WebElement element) {
		Rectangle rect = getRect(element);
		int y = rect.getY();
		return y;
	}

	// 68
	public void screenshot(String pathname) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File srcFile = tk.getScreenshotAs(OutputType.FILE);
		File destFile = new File(pathname);
		FileUtils.copyFile(srcFile, destFile);
	}

	public String getData(String sheet, int rownum, int cellnum) throws IOException {
		String value = null;
		File file = new File("C:\\Users\\praburaja\\eclipse-workspace2\\FrameWork\\TestData\\AdactinTestBed.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(rownum);
		Cell c = r.getCell(cellnum);
		int type = c.getCellType();
		// 0 --> Numbers and Date 
		// 1 --> String 
		if (type == 1) {
			value = c.getStringCellValue();
		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				value = dateFormat.format(d);
			}
			else {
				double d = c.getNumericCellValue();
				long l = (long) d; 
				value = String.valueOf(l);
			}
		} 
		return value;
	}

	
}
