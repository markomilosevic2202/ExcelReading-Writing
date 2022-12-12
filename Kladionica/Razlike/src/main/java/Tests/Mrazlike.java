package Tests;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mrazlike extends Basic {
    static int brSpojeva1 = 0;
    static int brSpojeva2 = 0;
    static int brSpojeva3 = 0;
    static int brSpojeva4 = 0;
    static int brSpojeva5 = 0;
    static int brSpojeva6 = 0;
    static int brUkupnihSpojeva = 0;
    static int brojNesparenihUtakmica = 0;
    protected String mkladionicaUrl = "https://www.maxbet.rs/ibet-web-client/#/home/leaguesWithMatches";
    ;
   // protected String okladionicaUrl = "https://orbitxch.com/customer/inplay/highlights/1";
    protected String okladionicaUrl = "https://orbitxch.com/customer/sport/1";

    String kec;

    String x;
    // String dvojka;
    List<Utakmica> utakmiceMkladionicaObične = new ArrayList<Utakmica>();
    static List<Utakmica> utakmiceMkladionicaBonus = new ArrayList<Utakmica>();

    List<Utakmica> utakmiceOkladionica = new ArrayList<Utakmica>();


    Random rand = new Random();


//    @Test(priority = 10)
//    public void skiniObicneKvoteM() throws InterruptedException {
//        driver.get(mkladionicaUrl);
//        mkladionica.podesiVremePregleda(3); // postavljanje klizaca na zeljenu vrednos i = 2 je 24h
//        Thread.sleep(1000);
//        mkladionica.getButtonFutbal().click();
//        mkladionica.getButtonIzaberiSve().click();
//        mkladionica.skrolovanjeNadole(5);
//        utakmiceMkladionicaObične = mkladionica.getUtkmiceMkladionica();
//        //mkladionica.stampajUtakmiceM();
//        Thread.sleep(rand.nextInt(2000));
//
//
//    }

    @Test(priority = 20)
    public void skiniBonusKvoteM() throws InterruptedException {
        driver.get(mkladionicaUrl);
        mkladionica.podesiVremePregleda(2);
        Thread.sleep(2000);
        mkladionica.getButtonFutbal().click();
       mkladionica.getButtonIzaberiSve().click();
        Thread.sleep(2000);
        mkladionica.getButtonBonusKvote().click();
        mkladionica.skrolovanjeNadole(15);
        utakmiceMkladionicaBonus = mkladionica.getUtkmiceMkladionica();
       // mkladionica.stampajUtakmiceM();
        Thread.sleep(rand.nextInt(5000));
    }

    //   @Test(priority = 30)
//    public void skiniKvoteO() throws InterruptedException {
//        driver.get(okladionicaUrl);
//        Thread.sleep(7000);
//        oKladionica.getButtonSoccer().click();
//        Thread.sleep(5000);
//        oKladionica.skrolovanjeNadole(16);
//        utakmiceOkladionica = oKladionica.getUtakmiceO();
//
//    }
    @Test(priority = 31)
    public void skiniKvoteOpoStranicama() throws InterruptedException {

        driver.get(okladionicaUrl);
        Thread.sleep(5000);
        oKladionica.setTime();
       oKladionica.getButtonSoccerPoStranicama().click();



        for (int i = 0; i < 8; i++) {
            Thread.sleep(1000);
            oKladionica.skrolovanjeNadole(2);
            oKladionica.getUtakmiceO();
            oKladionica.waitButtonNextClickable();
            oKladionica.getButtonNext().click();
        }
        utakmiceOkladionica = oKladionica.getUtakmiceO();
        System.out.println("Velicina niza: " + utakmiceOkladionica.size());
       // oKladionica.stampajUtakmiceO();

    }

    @Test(priority = 40)
    public void izracunajRazlike() throws InterruptedException {
        upisiSveRazlike(utakmiceMkladionicaBonus, utakmiceOkladionica);

        sortirajNiz(utakmiceMkladionicaBonus);
        upisiUExcelu(utakmiceMkladionicaBonus);
        System.out.println("Br. Svih Spojenih utakmica: " + (brSpojeva1+brSpojeva2+brSpojeva3+brSpojeva4+brSpojeva5+brSpojeva6));
        System.out.println("Br. utakmica uslov1: " + brSpojeva1);
        System.out.println("Br. utakmica uslov2: " + brSpojeva2);
        System.out.println("Br. utakmica uslov3: " + brSpojeva3);
        System.out.println("Br. utakmica uslov4: " + brSpojeva4);
        System.out.println("Br. utakmica uslov5: " + brSpojeva5);
        System.out.println("Br. utakmica : " + (brSpojeva1+brSpojeva2+brSpojeva3+brSpojeva4+brSpojeva5));
        System.out.println("Breoj nesparenih utakmica: " + brojNesparenihUtakmica);

    }

    static Utakmica uporediIme( Utakmica utakmicaMaxbet, List<Utakmica> utakmiceOkladionica ) {

        String imeM1 = utakmicaMaxbet.naziv.toLowerCase().substring(0, 4) ;
        String imeM2 = utakmicaMaxbet.naziv.toLowerCase().substring(utakmicaMaxbet.naziv.length()-3, utakmicaMaxbet.naziv.length());
        String imeM3 = utakmicaMaxbet.naziv.toLowerCase().substring(utakmicaMaxbet.naziv.length()-9, utakmicaMaxbet.naziv.length()-5);
        String imeM4 = utakmicaMaxbet.naziv.toLowerCase().substring(utakmicaMaxbet.naziv.length()-5, utakmicaMaxbet.naziv.length());
        String imeM5 = utakmicaMaxbet.naziv.toLowerCase().substring(1, 6) ;
        String imeM6 = utakmicaMaxbet.naziv.toLowerCase().substring(utakmicaMaxbet.naziv.length()-6, utakmicaMaxbet.naziv.length());

        for (int i = 0; i < utakmiceOkladionica.size(); i++) {
            Utakmica promenljiva = null;
            //System.out.println(imeMaxbet);
            if (utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM1)&& utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM2)) {
                 System.out.println("*****Uspresno spareno: " + utakmicaMaxbet.naziv + " --1-- " + utakmiceOkladionica.get(i).naziv);
                brSpojeva1++;
                promenljiva =  utakmiceOkladionica.get(i);
                return promenljiva;
            }
            else if (utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM1) && utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM3)) {
                System.out.println("*****Uspresno spareno: " + utakmicaMaxbet.naziv + " --2--  " + utakmiceOkladionica.get(i).naziv);
                brSpojeva2++;
                promenljiva =  utakmiceOkladionica.get(i);
                return promenljiva;
            }
            else if (utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM4)) {
                //    System.out.println("*****Uspresno spareno: " + utakmicaMaxbet.naziv + "  --3--  " + utakmiceOkladionica.get(i).naziv);
                brSpojeva3++;
                promenljiva =  utakmiceOkladionica.get(i);
                return promenljiva;
            }
            else if (utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM4)) {
                System.out.println("*****Uspresno spareno: " + utakmicaMaxbet.naziv + " --4-- " + utakmiceOkladionica.get(i).naziv);
                brSpojeva4++;
                promenljiva =  utakmiceOkladionica.get(i);
                  return promenljiva;
            }
            else if (utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM5)) {
                //  System.out.println("*****Uspresno spareno: " + utakmicaMaxbet.naziv + " --5-- " + utakmiceOkladionica.get(i).naziv);
                brSpojeva5++;
                promenljiva =  utakmiceOkladionica.get(i);
                  return promenljiva;
            }


        }
        return null;
    }

    static void izracunajRazlika(Utakmica utakmicaMaxbet, Utakmica utakmicaOrbit) {

        double razlika = 0;
        try {
//
            utakmicaMaxbet.setRazlikaKec(utakmicaMaxbet.kec - utakmicaOrbit.kec);
            utakmicaMaxbet.setRazlikaDvojka(utakmicaMaxbet.dvojka - utakmicaOrbit.dvojka);

        } catch (Exception e) {
            System.out.println("Utakmica: " + utakmicaMaxbet.naziv + " nije nadjen par");
            brojNesparenihUtakmica ++;
        }


    }

    static void upisiSveRazlike(List<Utakmica> utakmiceMaxbet, List<Utakmica> utakmiceOrbit) {
        Utakmica targetOrbit;
        for (int i = 0; i < utakmiceMaxbet.size(); i++) {
            targetOrbit = uporediIme( utakmiceMaxbet.get(i),utakmiceOrbit);
            izracunajRazlika(utakmiceMaxbet.get(i), targetOrbit);
        }


    }

    static void sortirajNiz(List<Utakmica> utakmiceMaxbet) {
        Utakmica temp;
        for (int i = 0; i < utakmiceMaxbet.size() - 1; i++) {
            for (int j = i + 1; j < utakmiceMaxbet.size(); j++) {
                if (utakmiceMaxbet.get(i).razlikaKec < utakmiceMaxbet.get(j).razlikaKec) {
                    temp = utakmiceMaxbet.get(j);
                    utakmiceMaxbet.set(j, utakmiceMaxbet.get(i));
                    utakmiceMaxbet.set(i, temp);
                }
            }
        }
//        for (int i = 0; i < utakmiceMaxbet.size() - 1; i++) {
//            for (int j = i + 1; j < utakmiceMaxbet.size(); j++) {
//                if (utakmiceMaxbet.get(i).razlikaKec < utakmiceMaxbet.get(j).razlikaDvojka) {
//                    temp = utakmiceMaxbet.get(j);
//                    utakmiceMaxbet.set(j, utakmiceMaxbet.get(i));
//                    utakmiceMaxbet.set(i, temp);
//                }
//
//            }
//        }
    }

    static void upisiUExcelu(List<Utakmica> utakmiceMaxbet) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH mm ss");
        DecimalFormat df = new DecimalFormat("#.##"); // format kvota
        XSSFSheet sheet = workbook.createSheet(time.format(formatter));//formira shit
        sheet.setColumnWidth(3, 10000); // širi kolonu
        int rownum = 0;
        Row row = sheet.createRow(rownum++);
        int cellnum = 1;
        Cell cell = row.createCell(cellnum++);
        cell.setCellValue("Datum");
        cell = row.createCell(cellnum++);
        cell.setCellValue("Vreme");
        cell = row.createCell(cellnum++);
        cell.setCellValue("Naziv");
        cell = row.createCell(cellnum++);
        cell.setCellValue("Kec");
        cell = row.createCell(cellnum++);
        cell.setCellValue("Razlika Kec");
        cell = row.createCell(cellnum++);
        cell.setCellValue("Dvojka");
        cell = row.createCell(cellnum++);
        cell.setCellValue("Razlika Dvojka");
        cell = row.createCell(cellnum++);
        cell.setCellValue("X");


        for (int i = 0; i < utakmiceMaxbet.size(); i++) {

            row = sheet.createRow(rownum++);
            Utakmica utakmica = utakmiceMaxbet.get(i);
            int cellnum1 = 1;
            Cell cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(utakmica.datuma);
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(utakmica.vreme);
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(utakmica.naziv);
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(Double.parseDouble(df.format(utakmica.kec)));
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(Double.parseDouble(df.format(utakmica.razlikaKec)));
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(Double.parseDouble(df.format(utakmica.dvojka)));
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(Double.parseDouble(df.format(utakmica.razlikaDvojka)));
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(Double.parseDouble(df.format(utakmica.x)));

        }
        try {
            LocalDate date = LocalDate.now();
            DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd-MM-yyyy");//format datuma
            FileOutputStream out = new FileOutputStream(new File(date.format(formatterData) + " - " + time.format(formatter) + ".xlsx"));
            workbook.write(out);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}