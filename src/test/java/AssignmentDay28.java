

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AssignmentDay28 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().window().maximize();


        String monthOfBirth = "Sep";
        String yearOfBirth = "1981";


        String AnnaMonthOfBirth = "Dec";
        String AnnaYearOfBirth = "1991";


        String departureMonth = "Jul";
        String departureYear = "2023";

        driver.findElement(By.xpath("//input[@id='product_3186']")).click();
        driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Alex");
        driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Samusev");
        driver.findElement(By.xpath("//textarea[@id='order_comments']"))
                .sendKeys("There is should be a bottle of Champaign in the room and two glasses");

        //click on Date of Birth field
        driver.findElement(By.xpath("//input[@id='dob']")).click();

        //Get months from the dropdown
        List<WebElement> months = driver.findElements(By
                .xpath("//select[@class='ui-datepicker-month']/option"));
        for(WebElement month: months) {
            if (month.getText().equals(monthOfBirth)) {
                month.click();
                break;
            } else {
                System.out.println("Error. Check the value of monthOfBirth variable");
            }
        }
        //Get year from the dropdown
        List<WebElement> years = driver.findElements(By
                .xpath("//select[@class='ui-datepicker-year']/option"));
        for(WebElement year: years) {
            if(year.getText().equals(yearOfBirth)) {
                year.click();
                break;
            } else {
                System.out.println("Error. Check the value of yearOfBirth variable");
            }
        }

        //Get date from the table
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[4]"))
                .click();



        driver.findElement(By.xpath("//input[@id='sex_1']")).click();
        driver.findElement(By.xpath("//input[@id='addmorepax']")).click();

        driver.findElement(By.xpath("//*[@id=\"select2-addpaxno-container\"]")).click();
        Thread.sleep(1000);
        List<WebElement> options = driver
                .findElements(By.xpath("//*[@id='select2-addpaxno-results']//li"));
        for(WebElement option: options) {
            if(option.getText().equals("add 1 more passenger (100%)")) {
                option.click();
                break;
            }
        }

        driver.findElement(By.xpath("//input[@id='travname2']")).sendKeys("Anna");
        driver.findElement(By.xpath("//input[@id='travlastname2']")).sendKeys("Lamonova");





        //click on Date of Birth field
        driver.findElement(By.xpath("//input[@id='dob2']")).click();

        //Get months from the dropdown
        List<WebElement> annaMonths = driver.findElements(By
                .xpath("//select[@class='ui-datepicker-month']/option"));
        for(WebElement month: annaMonths) {
            if (month.getText().equals(AnnaMonthOfBirth)) {
                month.click();
                break;
            } else {
                System.out.println("Error. Check the value of monthOfBirth variable");
            }
        }
        //Get year from the dropdown
        List<WebElement> annaYears = driver.findElements(By
                .xpath("//select[@class='ui-datepicker-year']/option"));
        for(WebElement year: annaYears) {
            if(year.getText().equals(AnnaYearOfBirth)) {
                year.click();
                break;
            } else {
                System.out.println("Error. Check the value of yearOfBirth variable");
            }
        }

        //Get date from the table
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[6]"))
                .click();

        //second passenger sex
        driver.findElement(By.xpath("//input[@id='sex2_2']")).click();

        driver.findElement(By.xpath("//span[@id='select2-paxtype2-container']")).click();

        List<WebElement> options2 = driver
                .findElements(By.xpath("//ul[@id='select2-paxtype2-results']//li"));
        for(WebElement option: options2) {
            if(option.getText().equals("Adult")) {
                option.click();
                break;
            }
        }

        //from city
        driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Belgrade");
        //to city
        driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Istanbul");

        //departure date
        driver.findElement(By.xpath("//input[@id='departon']")).click();

        //Get departure months from the dropdown
        List<WebElement> departureMonths = driver.findElements(By
                .xpath("//select[@class='ui-datepicker-month']/option"));
        for(WebElement month: departureMonths) {
            if (month.getText().equals(departureMonth)) {
                month.click();
                break;
            } else {
                System.out.println("Error. Check the value of departureMonth variable");
            }
        }
        //Get departure year from the dropdown
        List<WebElement> departureYears = driver.findElements(By
                .xpath("//select[@class='ui-datepicker-year']/option"));
        for(WebElement year: departureYears) {
            if(year.getText().equals(departureYear)) {
                year.click();
                break;
            } else {
                System.out.println("Error. Check the value of departureYear variable");
            }
        }

        //Get departure date from the table
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[1]"))
                .click();

        driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("Do not " +
                "forget to bring a kilo of pistachio for Tamara, as well as several packages of tea. For Anna we should " +
                "also buy pistachio");

        // --------------------------- Delivery options -------------------------------//

        driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();

        List<WebElement> deliveryOptions = driver
                .findElements(By.xpath("//ul[@id='select2-reasondummy-results']//li"));

        for(WebElement option: deliveryOptions) {
            if(option.getText().equals("Visa extension")) {
                option.click();
                break;
            }
        }

        driver.findElement(By.xpath("//input[@id='deliverymethod_3']")).click();
        driver.findElement(By.xpath("//input[@id='billname']")).sendKeys("Aleksandr");
        driver.findElement(By.xpath("//input[@id='billing_phone']"))
                .sendKeys("+90-505-687-85-94");
        driver.findElement(By.xpath("//input[@id='billing_email']"))
                .sendKeys("alex.samusev.81@gmail.com");

        //country
        List<WebElement> countries = driver
                .findElements(By.xpath("//ul[@id='select2-billing_country-results']//li"));

        for(WebElement country: countries) {
            if(country.getText().equals("Serbia")) {
                country.click();
                break;
            }
        }

        driver.findElement(By.xpath("//input[@id='billing_address_1']"))
                .sendKeys("4 George Raikovich st");
        driver.findElement(By.xpath("//input[@id='billing_address_2']"))
                .sendKeys("apt 10");
        driver.findElement(By.xpath("//input[@id='billing_city']"))
                .sendKeys("Novi Sad");

        //select district

        driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click();

        List<WebElement> districts = driver
                .findElements(By.xpath("//ul[@id='select2-billing_state-results']/li"));
        for(WebElement district: districts) {
            if(district.getText().equals("Vojvodina")) {
                district.click();
                break;
            }
        }

        //zip code
        driver.findElement(By.xpath("//input[@id='billing_postcode']"))
                .sendKeys("21000");

    }
}

