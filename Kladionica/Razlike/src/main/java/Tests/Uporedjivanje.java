package Tests;

import java.util.ArrayList;
import java.util.List;

public class Uporedjivanje {

    static int brSpojeva1 = 0;
    static int brSpojeva2 = 0;
    static int brSpojeva3 = 0;
    static int brSpojeva4 = 0;
    static int brSpojeva5 = 0;
    static int brSpojeva6 = 0;
    static int brUkupnihSpojeva = 0;
   static List<String> utakmiceMkladionicaObične = new ArrayList<String>();
   static List<Utakmica> utakmiceMkladionicaBonus = new ArrayList<Utakmica>();
  static   List<Utakmica> utakmiceOkladionica = new ArrayList<Utakmica>();

    public static void main(String[] args) {





        utakmiceMkladionicaBonus.add(new Utakmica("Real Avila - Un.Adarve"));
        utakmiceMkladionicaBonus.add(new Utakmica("Santo Domingo - Chacaritas FC"));
        utakmiceMkladionicaBonus.add(new Utakmica("Municipal Turrialba - Santa Ana"));
        utakmiceMkladionicaBonus.add(new Utakmica("Venados - Pumas Tabasco"));
        utakmiceMkladionicaBonus.add(new Utakmica("UNAN-Managua - Ocotal"));
        utakmiceMkladionicaBonus.add(new Utakmica("Junior - U.Magdalena"));
        utakmiceMkladionicaBonus.add(new Utakmica("Villa Mitre - Ol.Bahia Blanca"));
        utakmiceMkladionicaBonus.add(new Utakmica("UNAM Pumas - Tigres"));
        utakmiceMkladionicaBonus.add(new Utakmica("Villa Espanola - Sud America"));
        utakmiceMkladionicaBonus.add(new Utakmica("Dinamo Z. - Bodo/Glimt"));
        utakmiceMkladionicaBonus.add(new Utakmica("Etoile-Carouge - Bruhl"));
        utakmiceMkladionicaBonus.add(new Utakmica("Antoniana - Central Norte"));
    //    utakmiceMkladionicaBonus.add(new Utakmica("Jeonbuk - Urawa"));
      //  utakmiceMkladionicaBonus.add(new Utakmica("U.Sucre - Palmaflor Atl."));
        utakmiceMkladionicaBonus.add(new Utakmica("The Strongest - Blooming"));
        utakmiceMkladionicaBonus.add(new Utakmica("Sao Paulo - Flamengo"));
        utakmiceMkladionicaBonus.add(new Utakmica("U.Concepcion - D.Santa Cruz"));
        utakmiceMkladionicaBonus.add(new Utakmica("Cobreloa - Melipilla"));
        utakmiceMkladionicaBonus.add(new Utakmica("Quilmes - Belgrano C."));
        utakmiceMkladionicaBonus.add(new Utakmica("Ind.Medellin - Millonarios"));
        utakmiceMkladionicaBonus.add(new Utakmica("Motagua - Cibao"));
        utakmiceMkladionicaBonus.add(new Utakmica("Alianza FC - Hankook"));
        utakmiceMkladionicaBonus.add(new Utakmica("Desamparados - Camioneros B.A."));
        utakmiceMkladionicaBonus.add(new Utakmica("CS Uruguay - Ad Aserri"));
        utakmiceMkladionicaBonus.add(new Utakmica("Limon Black Star - Cariari Pococi"));
        utakmiceMkladionicaBonus.add(new Utakmica("Hostoun - Dukla P."));
        utakmiceMkladionicaBonus.add(new Utakmica("Universidad O&M - Atletico Pantoja"));
        utakmiceMkladionicaBonus.add(new Utakmica("CD Olmedo - Imbabura"));
        utakmiceMkladionicaBonus.add(new Utakmica("CDJU Gualeguaychu - Douglas Haig"));
        utakmiceMkladionicaBonus.add(new Utakmica("Buhos ULVR - Manta"));
        utakmiceMkladionicaBonus.add(new Utakmica("MuSa - Ilves 2"));
        utakmiceMkladionicaBonus.add(new Utakmica("VJS - Tampere Utd"));
        utakmiceMkladionicaBonus.add(new Utakmica("Keflavik W - Selfoss W"));
     //   utakmiceMkladionicaBonus.add(new Utakmica("N.Mazandaran - Malavan"));
     //   utakmiceMkladionicaBonus.add(new Utakmica("Naft M.I.S. - Paykan"));
     //   utakmiceMkladionicaBonus.add(new Utakmica("Zob Ahan - Mes Rafsanjan"));
        utakmiceMkladionicaBonus.add(new Utakmica("Alessandria U19 - AlbinoLeffe U19"));
        utakmiceMkladionicaBonus.add(new Utakmica("Hur. Las Heras - Argentino MM"));
        utakmiceMkladionicaBonus.add(new Utakmica("Celaya - Cimarrones S."));
        utakmiceMkladionicaBonus.add(new Utakmica("Trabzonspor - FC Copenhagen"));
        utakmiceMkladionicaBonus.add(new Utakmica("Dorados de Sinaloa - Alacranes D."));
        utakmiceMkladionicaBonus.add(new Utakmica("Atlas W - Cl.Tijuana W"));
        utakmiceMkladionicaBonus.add(new Utakmica("Cl.America W - Cruz Azul W"));
        utakmiceMkladionicaBonus.add(new Utakmica("Necaxa W - Puebla W"));
        utakmiceMkladionicaBonus.add(new Utakmica("Santos Laguna W - U.A.N.L.- Tigres W"));
        utakmiceMkladionicaBonus.add(new Utakmica("Iskra - Buducnost P."));
        utakmiceMkladionicaBonus.add(new Utakmica("Yadanarbon - Ispe FC"));
        utakmiceMkladionicaBonus.add(new Utakmica("Sp.Las Parejas - Def. Pronunciamiento"));
        utakmiceMkladionicaBonus.add(new Utakmica("Brann W - LSK Kvinner W"));
        utakmiceMkladionicaBonus.add(new Utakmica("Kolbotn W - Lyn W"));
        utakmiceMkladionicaBonus.add(new Utakmica("Rosenborg W - Valerenga W"));
        utakmiceMkladionicaBonus.add(new Utakmica("Stabaek W - Avaldsnes W"));
        utakmiceMkladionicaBonus.add(new Utakmica("Estrela U23 - Famalicao U23"));
        utakmiceMkladionicaBonus.add(new Utakmica("Al-Shamal - Al-Arabi"));
        utakmiceMkladionicaBonus.add(new Utakmica("Al Riyadh - Al-Faisaly"));
        utakmiceMkladionicaBonus.add(new Utakmica("Al-Hazem - Jeddah Club"));
        utakmiceMkladionicaBonus.add(new Utakmica("Celtic B - Livingston 2"));
        utakmiceMkladionicaBonus.add(new Utakmica("Royal AM - Maritzburg Utd"));
        utakmiceMkladionicaBonus.add(new Utakmica("Richards Bay - Supersport Utd"));
        utakmiceMkladionicaBonus.add(new Utakmica("Rosengard W - Hacken W"));
       // utakmiceMkladionicaBonus.add(new Utakmica("Bavois - YF Juventus"));
        utakmiceMkladionicaBonus.add(new Utakmica("Cipolletti - Sportivo Est."));
       // utakmiceMkladionicaBonus.add(new Utakmica("Inhulets - Oleksandriya"));
        utakmiceMkladionicaBonus.add(new Utakmica("Miramar - Central Esp."));
        utakmiceMkladionicaBonus.add(new Utakmica("Gimnasia E.R. - Sarmiento Res."));
        utakmiceMkladionicaBonus.add(new Utakmica("FC Tulsa - Hartford Athl."));
        utakmiceMkladionicaBonus.add(new Utakmica("San Diego Loyal - Oakland Roots"));
        utakmiceMkladionicaBonus.add(new Utakmica("Forward Mad. - North Carolina"));
        utakmiceMkladionicaBonus.add(new Utakmica("North Carolina W - Portland Thorns W"));
        //utakmiceMkladionicaBonus.add(new Utakmica("Goytre Utd - Cwmbran Celtic"));
        utakmiceMkladionicaBonus.add(new Utakmica("Racing Cordoba - Sportivo Belgrano"));
        utakmiceMkladionicaBonus.add(new Utakmica("Izarra - Alaves B"));
        utakmiceMkladionicaBonus.add(new Utakmica("Orihuela - Hercules"));
        utakmiceMkladionicaBonus.add(new Utakmica("Leeds - Barnsley"));
        utakmiceMkladionicaBonus.add(new Utakmica("Bulle - Rapperswil"));
        utakmiceMkladionicaBonus.add(new Utakmica("Fluminense FC - Corinthians"));
        utakmiceMkladionicaBonus.add(new Utakmica("Guabira - Tomayapo"));
        utakmiceMkladionicaBonus.add(new Utakmica("Barcelona - Man.City"));
        utakmiceMkladionicaBonus.add(new Utakmica("HJS Akatemia - FC Jazz"));
        utakmiceMkladionicaBonus.add(new Utakmica("Ferro Gen. Pico - CA Liniers"));
        utakmiceMkladionicaBonus.add(new Utakmica("Amazulu - Golden Arrows"));
        utakmiceMkladionicaBonus.add(new Utakmica("Criciuma - Nacao"));
        utakmiceMkladionicaBonus.add(new Utakmica("Ilves-Kissat - Kaapo"));
        utakmiceMkladionicaBonus.add(new Utakmica("Al Ahly Cairo - Enppi"));
       // utakmiceMkladionicaBonus.add(new Utakmica("Ismaily Sc - Eastern Company SC"));
        utakmiceMkladionicaBonus.add(new Utakmica("Baden - Chiasso"));
        utakmiceMkladionicaBonus.add(new Utakmica("GrIFK - EPS"));
        utakmiceMkladionicaBonus.add(new Utakmica("Orlando P. - Marumo Gallants"));
        utakmiceMkladionicaBonus.add(new Utakmica("2 de Mayo - Sp.Iteno"));
        utakmiceMkladionicaBonus.add(new Utakmica("Boca Unidos - Def. de Belgrano"));
        utakmiceMkladionicaBonus.add(new Utakmica("Buckie Thistle - Brora Rangers"));
        utakmiceMkladionicaBonus.add(new Utakmica("Atletico Parana - U.Sunchales"));
        utakmiceMkladionicaBonus.add(new Utakmica("Consultants D. - Escorpiones"));
        utakmiceMkladionicaBonus.add(new Utakmica("Sansinena - Sol de Mayo"));
        utakmiceMkladionicaBonus.add(new Utakmica("Ciudad Bolivar - Ind.Chivilcoy"));
        utakmiceMkladionicaBonus.add(new Utakmica("Racing M. - Atenas"));
        utakmiceMkladionicaBonus.add(new Utakmica("Uruguay M. - Progreso"));
        utakmiceMkladionicaBonus.add(new Utakmica("Bremer - BSV Rehden"));
        utakmiceMkladionicaBonus.add(new Utakmica("Helsingor - Lyngby"));
        utakmiceMkladionicaBonus.add(new Utakmica("Juventud - CA Cerro"));
        utakmiceMkladionicaBonus.add(new Utakmica("RW Rankweil - Lauterach"));
        utakmiceMkladionicaBonus.add(new Utakmica("Esteli - Ferretti"));
        utakmiceMkladionicaBonus.add(new Utakmica("Wycombe - Bristol City"));
        utakmiceMkladionicaBonus.add(new Utakmica("Club Sp.Penarol - Circulo Dep"));
        utakmiceMkladionicaBonus.add(new Utakmica("Chippa Utd - TS Galaxy"));
        utakmiceMkladionicaBonus.add(new Utakmica("Barnechea - Magallanes"));
        utakmiceMkladionicaBonus.add(new Utakmica("Al Ahli SC - Al-Qaisumah"));
        utakmiceMkladionicaBonus.add(new Utakmica("Brechin - Stirling"));
        utakmiceMkladionicaBonus.add(new Utakmica("Crucero del Norte - San Martin Formosa"));
        utakmiceMkladionicaBonus.add(new Utakmica("Esteghlal F.C. - Mes Kerman"));
        utakmiceMkladionicaBonus.add(new Utakmica("Edinburgh City - Stranraer"));
        utakmiceMkladionicaBonus.add(new Utakmica("Managua FC - Jalapa"));
        utakmiceMkladionicaBonus.add(new Utakmica("PSV - Rangers"));
        utakmiceMkladionicaBonus.add(new Utakmica("Forest Green - Brighton"));
        utakmiceMkladionicaBonus.add(new Utakmica("Tranmere - Newcastle"));


        utakmiceOkladionica.add(new Utakmica("KKP Bydgoszcz (W)\n" +
                "UKS SMS Lodz (W)"));
        utakmiceOkladionica.add(new Utakmica("Pumas de la UNAM U20\n" +
                "Tigres de la UANL U20"));
        utakmiceOkladionica.add(new Utakmica("Portuguesa (W)\n" +
                "EC Taubate (W)"));
        utakmiceOkladionica.add(new Utakmica("Umm Salal\n" +
                "Al Sailiya"));
        utakmiceOkladionica.add(new Utakmica("FC Malacky\n" +
                "Dubnica"));
        utakmiceOkladionica.add(new Utakmica("Banik Horna Nitra\n" +
                "MFK Skalica"));
        utakmiceOkladionica.add(new Utakmica("MFK Kezmarok\n" +
                "Partizan Bardejov"));
        utakmiceOkladionica.add(new Utakmica("TJ Druzstevnik Trstice\n" +
                "KFC Komarno"));
        utakmiceOkladionica.add(new Utakmica("FC Slovan Hlohovec\n" +
                "Trencin"));
        utakmiceOkladionica.add(new Utakmica("Tj Slavoj Boleraz\n" +
                "Spartak Trnava"));
        utakmiceOkladionica.add(new Utakmica("FK Kechnec\n" +
                "MFK Vranov nad Toplou"));
        utakmiceOkladionica.add(new Utakmica("Malisheva\n" +
                "KF Ferizaj"));
        utakmiceOkladionica.add(new Utakmica("Mamelodi Sundowns\n" +
                "Stellenbosch FC"));
        utakmiceOkladionica.add(new Utakmica("Skovde AIK U21\n" +
                "Norrby IF U21"));
        utakmiceOkladionica.add(new Utakmica("Dukla Banska (W)\n" +
                "MFK Ruzomberok (W)"));
        utakmiceOkladionica.add(new Utakmica("FC Pivovar Velky Saris\n" +
                "MSK Tesla Stropkov"));
        utakmiceOkladionica.add(new Utakmica("SK Javornik Makov\n" +
                "MSK Novohrad Lucenec"));
        utakmiceOkladionica.add(new Utakmica("FK Cadca\n" +
                "Tatran Lip Mikulas"));
        utakmiceOkladionica.add(new Utakmica("MFK Spartak Medzev\n" +
                "Tatran Presov"));
        utakmiceOkladionica.add(new Utakmica("GrIFK\n" +
                "EPS"));
        utakmiceOkladionica.add(new Utakmica("HJS Akatemia\n" +
                "FC Jazz"));
        utakmiceOkladionica.add(new Utakmica("Bremer SV\n" +
                "SW Rehden"));
        utakmiceOkladionica.add(new Utakmica("MuSA\n" +
                "Tampereen Ilves II"));
        utakmiceOkladionica.add(new Utakmica("Pacos de Ferreira U19\n" +
                "Porto U19"));
        utakmiceOkladionica.add(new Utakmica("IFK Norrkoping U21\n" +
                "Brommapojkarna U21"));
        utakmiceOkladionica.add(new Utakmica("Solrod FC (W)\n" +
                "Naestved HG (W)"));
        utakmiceOkladionica.add(new Utakmica("Ilves Kissat\n" +
                "KaaPo"));
        utakmiceOkladionica.add(new Utakmica("FC Helsingor\n" +
                "Lyngby"));
        utakmiceOkladionica.add(new Utakmica("Racing Club (Uru)\n" +
                "Atenas"));
        utakmiceOkladionica.add(new Utakmica("Rosenborg BK (W)\n" +
                "Valerenga (W)"));
        utakmiceOkladionica.add(new Utakmica("SK Brann\n" +
                "Lsk Kvinner (W)"));
        utakmiceOkladionica.add(new Utakmica("Kolbotn (W)\n" +
                "Lyn (W)"));
        utakmiceOkladionica.add(new Utakmica("Stabaek (W)\n" +
                "Avaldsnes (W)"));
        utakmiceOkladionica.add(new Utakmica("Aalborg (W)\n" +
                "AGF Kvindefodbold (W)"));
        utakmiceOkladionica.add(new Utakmica("Waldhof Mannheim 07 II\n" +
                "FV Mosbach"));
        utakmiceOkladionica.add(new Utakmica("VJS\n" +
                "Tampere Utd"));
        utakmiceOkladionica.add(new Utakmica("Barnechea\n" +
                "Magallanes"));
        utakmiceOkladionica.add(new Utakmica("Al Shamal\n" +
                "Al Arabi (QAT)"));
        utakmiceOkladionica.add(new Utakmica("RW Rankweil\n" +
                "FC Lauterach"));
        utakmiceOkladionica.add(new Utakmica("Desamparados\n" +
                "Camioneros"));
        utakmiceOkladionica.add(new Utakmica("Viktoria Griesheim\n" +
                "Eint Frankfurt II"));
        utakmiceOkladionica.add(new Utakmica("Futbol Consultants Moravia\n" +
                "Escorpiones FC"));
        utakmiceOkladionica.add(new Utakmica("TIL 2020 (W)\n" +
                "Fortuna Alesund (W)"));
        utakmiceOkladionica.add(new Utakmica("Municipal Turrialba\n" +
                "Municipal Santa Ana"));
        utakmiceOkladionica.add(new Utakmica("SG Kinzenbach\n" +
                "SC Waldgirmes"));
        utakmiceOkladionica.add(new Utakmica("Ferro Carril Oeste GP\n" +
                "CA Liniers"));
        utakmiceOkladionica.add(new Utakmica("Orlando Pirates (SA)\n" +
                "Tshakhuma Tsha Madzivhadila"));
        utakmiceOkladionica.add(new Utakmica("Chippa Utd\n" +
                "TS Galaxy FC"));
        utakmiceOkladionica.add(new Utakmica("Bloemfontein Celtic\n" +
                "Maritzburg Utd"));
        utakmiceOkladionica.add(new Utakmica("AmaZulu\n" +
                "Golden Arrows"));
        utakmiceOkladionica.add(new Utakmica("SV Halstenbek-Rellingen\n" +
                "Teutonia 05 Ottensen"));
        utakmiceOkladionica.add(new Utakmica("SG VFR Dersim Russelsheim\n" +
                "FC Eddersheim"));
        utakmiceOkladionica.add(new Utakmica("CD Juventud Unida (G)\n" +
                "CA Douglas Haig"));
        utakmiceOkladionica.add(new Utakmica("SV Bad Rothenfelde\n" +
                "VfR Voxtrup"));
        utakmiceOkladionica.add(new Utakmica("Bulle\n" +
                "Rapperswil-Jona"));
        utakmiceOkladionica.add(new Utakmica("SC 1911 Kapellen Erft\n" +
                "FSV Duisburg"));
        utakmiceOkladionica.add(new Utakmica("Mulheimer FC 97\n" +
                "1. FC Monheim"));
        utakmiceOkladionica.add(new Utakmica("Red Bull Bragantino (W)\n" +
                "EC Realidade Jovem (W)"));
        utakmiceOkladionica.add(new Utakmica("FC Baden\n" +
                "Chiasso"));
        utakmiceOkladionica.add(new Utakmica("Etoile Carouge\n" +
                "SC Bruhl St Gallen"));
        utakmiceOkladionica.add(new Utakmica("Sao Paulo U20\n" +
                "FC Ska Brasil U20"));
        utakmiceOkladionica.add(new Utakmica("Palmeiras U20\n" +
                "Ituano FC U20"));
        utakmiceOkladionica.add(new Utakmica("VfL Benrath\n" +
                "Dusseldorf-West"));
        utakmiceOkladionica.add(new Utakmica("Miramar Misiones\n" +
                "Central Espanol"));
        utakmiceOkladionica.add(new Utakmica("Villa Espanola\n" +
                "Sud America"));
        utakmiceOkladionica.add(new Utakmica("FC Liege\n" +
                "Mandel Utd"));
        utakmiceOkladionica.add(new Utakmica("Uruguay Montevideo FC\n" +
                "Progreso"));
        utakmiceOkladionica.add(new Utakmica("VK Ninove\n" +
                "Francs Borains"));
        utakmiceOkladionica.add(new Utakmica("URSL Vise\n" +
                "Thes Sport"));
        utakmiceOkladionica.add(new Utakmica("Hoogstraten\n" +
                "K Sint-Eloois-Winkel"));
        utakmiceOkladionica.add(new Utakmica("Heist\n" +
                "Dessel Sport"));
        utakmiceOkladionica.add(new Utakmica("Ciudad de Bolivar\n" +
                "Independiente Chivilcoy"));
        utakmiceOkladionica.add(new Utakmica("SV Gerasdorf Stammersdorf\n" +
                "Dinamo Helfort"));
        utakmiceOkladionica.add(new Utakmica("Al Ahly Cairo\n" +
                "ENPPI"));
        utakmiceOkladionica.add(new Utakmica("Al Ahly Cairo\n" +
                "ENPPI"));
        utakmiceOkladionica.add(new Utakmica("Keflavik (W)\n" +
                "Selfoss (W)"));
        utakmiceOkladionica.add(new Utakmica("FC Muri\n" +
                "FC Rotkreuz"));
        utakmiceOkladionica.add(new Utakmica("Club 2 de Mayo\n" +
                "Sportivo Iteno"));
        utakmiceOkladionica.add(new Utakmica("Palmeiras (W)\n" +
                "Santos FC (W)"));
        utakmiceOkladionica.add(new Utakmica("Crucero del Norte\n" +
                "CS General San Mar"));
        utakmiceOkladionica.add(new Utakmica("Juventud De Las Piedras\n" +
                "Cerro"));
        utakmiceOkladionica.add(new Utakmica("Sansinena\n" +
                "Sol De Mayo"));
        utakmiceOkladionica.add(new Utakmica("Sevenoaks Town\n" +
                "Merstham"));
        utakmiceOkladionica.add(new Utakmica("Brechin\n" +
                "Stirling"));
        utakmiceOkladionica.add(new Utakmica("Tranmere\n" +
                "Newcastle"));
        utakmiceOkladionica.add(new Utakmica("Forest Green\n" +
                "Brighton"));
        utakmiceOkladionica.add(new Utakmica("Leeds\n" +
                "Barnsley"));
        utakmiceOkladionica.add(new Utakmica("Wycombe\n" +
                "Bristol City"));
        utakmiceOkladionica.add(new Utakmica("Stockton Town FC\n" +
                "Hebburn Town"));
        utakmiceOkladionica.add(new Utakmica("Corby Town FC\n" +
                "Cambridge City"));
        utakmiceOkladionica.add(new Utakmica("Edinburgh City\n" +
                "Stranraer"));
        utakmiceOkladionica.add(new Utakmica("Buckie Thistle\n" +
                "Brora Rangers"));
        utakmiceOkladionica.add(new Utakmica("Dinamo Zagreb\n" +
                "Bodo Glimt"));
        utakmiceOkladionica.add(new Utakmica("PSV\n" +
                "Rangers"));
        utakmiceOkladionica.add(new Utakmica("Trabzonspor\n" +
                "FC Copenhagen"));
        utakmiceOkladionica.add(new Utakmica("Huracan Las Heras\n" +
                "Argentino Monte Maiz"));
        utakmiceOkladionica.add(new Utakmica("Boca Unidos\n" +
                "Def Belgrano VR"));
        utakmiceOkladionica.add(new Utakmica("Guabira\n" +
                "Real Tomayapo"));
        utakmiceOkladionica.add(new Utakmica("Suchitepequez\n" +
                "Marquense"));
        utakmiceOkladionica.add(new Utakmica("Barcelona\n" +
                "Man City"));
        utakmiceOkladionica.add(new Utakmica("CDEF Puerto Quito\n" +
                "Chacaritas SC"));
        utakmiceOkladionica.add(new Utakmica("Olmedo\n" +
                "Imbabura Sporting Club"));
        utakmiceOkladionica.add(new Utakmica("CF America (W)\n" +
                "Cruz Azul (W)"));
        utakmiceOkladionica.add(new Utakmica("FC Atlas (W)\n" +
                "Club Tijuana (W)"));
        utakmiceOkladionica.add(new Utakmica("Uruguay de Coronado\n" +
                "11 de Abril"));
        utakmiceOkladionica.add(new Utakmica("Deportivo San Pedro\n" +
                "Quiche FC"));
        utakmiceOkladionica.add(new Utakmica("Juventud Pinulteca FC\n" +
                "CSD Sacachispas"));
        utakmiceOkladionica.add(new Utakmica("Univ de Concepcion\n" +
                "Club Deportes Santa Cruz"));
        utakmiceOkladionica.add(new Utakmica("Celaya\n" +
                "Cimarrones de Sonora"));
        utakmiceOkladionica.add(new Utakmica("Universitario (Sucre)\n" +
                "Atletico Palmaflor Vinto"));
        utakmiceOkladionica.add(new Utakmica("Villa Mitre\n" +
                "Olimpo"));
        utakmiceOkladionica.add(new Utakmica("Club Atletico Parana\n" +
                "CA Union de Sunchales"));
        utakmiceOkladionica.add(new Utakmica("Sportivo Penarol\n" +
                "Circulo Deportivo Otamendi"));
        utakmiceOkladionica.add(new Utakmica("Fluminense\n" +
                "Corinthians"));
        utakmiceOkladionica.add(new Utakmica("Criciuma\n" +
                "Nacao Esportes FC"));
        utakmiceOkladionica.add(new Utakmica("Junior FC Barranquilla\n" +
                "Union Magdalena"));
        utakmiceOkladionica.add(new Utakmica("Sportivo AC Las Parejas\n" +
                "Club Defensores de P"));
        utakmiceOkladionica.add(new Utakmica("Club Cipolletti\n" +
                "CS Estudiantes San Luis"));
        utakmiceOkladionica.add(new Utakmica("Gimnasia Conc del Uruguay\n" +
                "Sarmiento de Resistenc"));
        utakmiceOkladionica.add(new Utakmica("CA Racing\n" +
                "Sportivo Belgran"));
        utakmiceOkladionica.add(new Utakmica("Guayaquil SC\n" +
                "Manta FC"));
        utakmiceOkladionica.add(new Utakmica("CD Motagua\n" +
                "Cibao FC"));
        utakmiceOkladionica.add(new Utakmica("Venados FC\n" +
                "Pumas Tabasco"));
        utakmiceOkladionica.add(new Utakmica("Quilmes\n" +
                "Belgrano"));
        utakmiceOkladionica.add(new Utakmica("The Strongest\n" +
                "Blooming Santa Cruz"));
        utakmiceOkladionica.add(new Utakmica("Sao Paulo\n" +
                "Flamengo"));
        utakmiceOkladionica.add(new Utakmica("Cobreloa Calama\n" +
                "Deportes Melipilla"));
        utakmiceOkladionica.add(new Utakmica("Real Esteli FC\n" +
                "CD Walter Ferreti"));
        utakmiceOkladionica.add(new Utakmica("Club Necaxa (W)\n" +
                "Puebla FC (W)"));
        utakmiceOkladionica.add(new Utakmica("Ind Medellin\n" +
                "Millonarios"));
        utakmiceOkladionica.add(new Utakmica("C J Antoniana\n" +
                "CA Central Norte"));




        System.out.println(utakmiceMkladionicaBonus.size());
        System.out.println(utakmiceOkladionica.size());

       upisiSveRazlike();
        System.out.println("Br. Svih Spojenih utakmica: " + (brSpojeva1+brSpojeva2+brSpojeva3+brSpojeva4+brSpojeva5+brSpojeva6));
        System.out.println("Br. utakmica uslov1: " + brSpojeva1);
        System.out.println("Br. utakmica uslov2: " + brSpojeva2);
        System.out.println("Br. utakmica uslov3: " + brSpojeva3);
        System.out.println("Br. utakmica uslov4: " + brSpojeva4);
        System.out.println("Br. utakmica uslov5: " + brSpojeva5);

        //sortirajNiz(utakmiceMkladionicaBonus);
    }
    static Utakmica uporediIme( Utakmica utakmicaMaxbet) {
        Utakmica promenljiva = null;
        String imeM1 = utakmicaMaxbet.naziv.toLowerCase().substring(0, 4) ;
        String imeM2 = utakmicaMaxbet.naziv.toLowerCase().substring(utakmicaMaxbet.naziv.length()-5, utakmicaMaxbet.naziv.length());
        String imeM3 = utakmicaMaxbet.naziv.toLowerCase().substring(utakmicaMaxbet.naziv.length()-9, utakmicaMaxbet.naziv.length()-5);
        String imeM4 = utakmicaMaxbet.naziv.toLowerCase().substring(utakmicaMaxbet.naziv.length()-5, utakmicaMaxbet.naziv.length());
        String imeM5 = utakmicaMaxbet.naziv.toLowerCase().substring(1, 6) ;
        String imeM6 = utakmicaMaxbet.naziv.toLowerCase().substring(utakmicaMaxbet.naziv.length()-6, utakmicaMaxbet.naziv.length());

        for (int i = 0; i < utakmiceOkladionica.size(); i++) {

            //System.out.println(imeMaxbet);
            if (utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM1)&& utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM2)) {
              // System.out.println("*****Uspresno spareno: " + utakmicaMaxbet.naziv + " --1-- " + utakmiceOkladionica.get(i).naziv);
                brSpojeva1++;
                promenljiva =  utakmiceOkladionica.get(i);
               return promenljiva;
            }
            else if (utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM1) && utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM3)) {
         //   System.out.println("*****Uspresno spareno: " + utakmicaMaxbet.naziv + " --2--  " + utakmiceOkladionica.get(i).naziv);
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
             //   return utakmiceOrbit.get(i);
            }
            else if (utakmiceOkladionica.get(i).naziv.toLowerCase().contains(imeM5)) {
              //  System.out.println("*****Uspresno spareno: " + utakmicaMaxbet.naziv + " --5-- " + utakmiceOkladionica.get(i).naziv);
                brSpojeva5++;
             //   return utakmiceOrbit.get(i);
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
           // System.out.println("Utakmica: " + utakmicaMaxbet.naziv + " nije nadjen par");
        }


    }

    static void upisiSveRazlike() {
        //targetOrbit;
        for (int i = 0; i < utakmiceMkladionicaBonus.size(); i++) {
            Utakmica targetOrbit = uporediIme( utakmiceMkladionicaBonus.get(i));
            izracunajRazlika(utakmiceMkladionicaBonus.get(i), targetOrbit);
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

    }}