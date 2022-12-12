

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import static java.lang.Double.parseDouble;

public class ExcelTable {
    public static Firma firma;

    public static List<String> listSvihStringova = new ArrayList<>();
    public static List<Firma> listaFirmi = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello");

        procitajTabelu();
        napraviObjekteFirma();
        stampajFirme();
        upisiUTabelu();

    }

    static void stampajFirme() {
        for (int i = 0; i < listaFirmi.size(); i++) {
            listaFirmi.get(i).stampa();
        }

    }

    static void procitajTabelu() {
        try {


            File f = new File("./src/a2.xls");
            Workbook wb = WorkbookFactory.create(f);
            Sheet mySheet = wb.getSheetAt(0);
            Iterator<Row> rowIter = mySheet.rowIterator();


            for (Iterator<Row> rowIterator = mySheet.rowIterator(); rowIterator.hasNext(); ) {
                Iterator<Cell> cellIterator1 = ((Row) rowIterator.next()).cellIterator();
                listSvihStringova.add(((Cell) cellIterator1.next()).toString());


            }
        } catch (Exception e) {
            System.out.println("Doslo je do greske prilikom povezivanja sa xlsx fajlom");
            e.printStackTrace();

        }

    }

    static void upisiUTabelu() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH mm ss");
        XSSFSheet sheet = workbook.createSheet(time.format(formatter));//formira shit
        sheet.setColumnWidth(1, 10000); // širi kolonu
        sheet.setColumnWidth(2, 10000);
        sheet.setColumnWidth(3, 5000);
        int rownum = 0;
        Row row = sheet.createRow(rownum++);
        int cellnum = 1;
        Cell cell = row.createCell(cellnum++);
        cell.setCellValue("Naziv");
        cell = row.createCell(cellnum++);
        cell.setCellValue("Adresa");
        cell = row.createCell(cellnum++);
        cell.setCellValue("Pib");
        cell = row.createCell(cellnum++);
        cell.setCellValue("Status");
        cell = row.createCell(cellnum++);
        cell.setCellValue("Broj Zaposlenih");
        cell = row.createCell(cellnum++);
        cell.setCellValue("Prihodi");

        for (int i = 0; i < listaFirmi.size(); i++) {

            row = sheet.createRow(rownum++);
            Firma firma = listaFirmi.get(i);
            int cellnum1 = 1;
            Cell cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(firma.naziv);
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(firma.adresa);
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(firma.pib);
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(firma.status);
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(firma.brojZaposlenih);
            cell1 = row.createCell(cellnum1++);
            cell1.setCellValue(firma.prihodi);


        }

        try {
            LocalDate date = LocalDate.now();
            DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd-MM-yyyy");//format datuma
            FileOutputStream out = new FileOutputStream(new File("Tabela - " + date.format(formatterData) + " - " + time.format(formatter) + ".xlsx"));
            workbook.write(out);
            out.close();

        } catch (Exception e) {
            System.out.println("Greska pri memorisanju fajla");
            e.printStackTrace();
        }

    }

    static void napraviObjekteFirma() {
        for (int i = 0; i < listSvihStringova.size() / 11; i++) {
            String prihodi = listSvihStringova.get(i * 11 + 10).substring(0, listSvihStringova.get(i * 11 + 10).lastIndexOf(","));
            String pib = listSvihStringova.get(i * 11 + 4);
            Double pibD = parseDouble(pib);//prebacivanje u duble da bi se odsekla decimala E7
            pib = String.format("%.0f", pibD); //formatiranje
            prihodi = prihodi.replaceAll("[,.]", ""); // brisanje iz stringa svih znakova interpunkcije

            listaFirmi.add(new Firma(listSvihStringova.get(i * 11), listSvihStringova.get(i * 11 + 6), pib,
                    listSvihStringova.get(i * 11 + 2).contains("AKTIVAN") ? true : false,
                    parseDouble(listSvihStringova.get(i * 11 + 8).contains("-") ? "0" : listSvihStringova.get(i * 11 + 8)),
                    parseDouble(prihodi)));

        }

    }
}
