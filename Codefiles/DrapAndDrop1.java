import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DragAndDrop1{
	
	public static void main(String a[]){
	
		WebDriver  driver= new FirefoxDriver();
		driver.get("/home/dinesh/Desktop/tests-parallel/SeleniumPrac/Chapter 2/HTML/DragAndDrop.html");
	WebElement src=		driver.findElement(By.id("draggable"));
	WebElement dest=		driver.findElement(By.id("droppable"));
	
	Action action =  new Actions(driver);
	
	action.dragAndDrop(src, dest).perform();
	
	}

}

