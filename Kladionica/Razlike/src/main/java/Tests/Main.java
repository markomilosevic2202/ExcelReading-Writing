package Tests;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
//        String a = "17.08. 11:30";
//        System.out.println(a.substring(0,6));
//        System.out.println(a.substring(7,12));
//        List<Utakmica> utakmiceMaxbet = new ArrayList<Utakmica>();
//        utakmiceMaxbet.add(new Utakmica( "ydfvdavcda-sadfsd",1.54,1.33,1.22,"02.5", "11:56"));
//        utakmiceMaxbet.add(new Utakmica( "ydfvddvd-sadfsd",1.54,1.33,1.22,"03.5", "11:56"));
//
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        LocalTime time = LocalTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH mm ss");
//        DecimalFormat df = new DecimalFormat("#.##"); // format kvota
//        XSSFSheet sheet = workbook.createSheet(time.format(formatter));//formira shit
//        sheet.setColumnWidth(1, 10000); // širi kolonu
//        int rownum = 0;
//        Row row = sheet.createRow(rownum++);
//        int cellnum = 1;
//        Cell cell = row.createCell(cellnum++);
//        cell.setCellValue("Datum");
//        cell = row.createCell(cellnum++);
//        cell.setCellValue("Vreme");
//        cell = row.createCell(cellnum++);
//        cell.setCellValue("Naziv");
//        cell = row.createCell(cellnum++);
//        cell.setCellValue("Kec");
//        cell = row.createCell(cellnum++);
//        cell.setCellValue("Razlika Kec");
//        cell = row.createCell(cellnum++);
//        cell.setCellValue("Dvojka");
//        cell = row.createCell(cellnum++);
//        cell.setCellValue("Razlika Dvojka");
//        cell = row.createCell(cellnum++);
//        cell.setCellValue("X");
//
//
//        for (int i = 0; i < utakmiceMaxbet.size(); i++) {
//
//            row = sheet.createRow(rownum++);
//            Utakmica utakmica = utakmiceMaxbet.get(i);
//            int cellnum1 = 1;
//            Cell cell1 = row.createCell(cellnum1++);
//            cell1.setCellValue(utakmica.datuma);
//            cell1 = row.createCell(cellnum1++);
//            cell1.setCellValue(utakmica.vreme);
//            cell1 = row.createCell(cellnum1++);
//            cell1.setCellValue(utakmica.naziv);
//            cell1 = row.createCell(cellnum1++);
//            cell1.setCellValue(Double.parseDouble(df.format(utakmica.kec)));
//            cell1 = row.createCell(cellnum1++);
//            cell1.setCellValue(Double.parseDouble(df.format(utakmica.razlikaKec)));
//            cell1 = row.createCell(cellnum1++);
//            cell1.setCellValue(Double.parseDouble(df.format(utakmica.dvojka)));
//            cell1 = row.createCell(cellnum1++);
//            cell1.setCellValue(Double.parseDouble(df.format(utakmica.razlikaDvojka)));
//            cell1 = row.createCell(cellnum1++);
//            cell1.setCellValue(Double.parseDouble(df.format(utakmica.x)));
//
//        }

//        System.setProperty("webdriver.chrome.driver",
//                "src/main/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        String url = "https://www.tutorialspoint.com/about/about_careers.htm";
//        driver.get(url);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        // identify element and click()
//        WebElement l=driver.findElement(By.linkText("Terms of Use"));
//        l.click();
//        // explicit wait condition
//      //  WebDriverWait w = new WebDriverWait(driver, 0x3);
//        // presenceOfElementLocated condition
//      //  w.until(ExpectedConditions.presenceOfElementLocated (By.cssSelector("h1")));
//        // get text of element and print
//        System.out.println("Element present having text:" + l.getText());
//        driver.quit();
        String a = "Esteli - Ferretti";

        System.out.println(a.substring(0,4));
        System.out.println(a.substring(a.length()-4,a.length()));
//        System.out.println(a.substring(0,4));
//        System.out.println(a.substring(0,4));
    }
}
