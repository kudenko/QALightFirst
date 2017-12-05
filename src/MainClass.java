import static libs.LibClass.*;

import money.Bitcoin;
import money.Dollar;
import money.Euro;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;





public class MainClass {
    public static void main(String [] args) throws InterruptedException {
       // System.out.println("hello world");

//        int var1;
//        var1 = 5;
//        int var2 = 10;

    //        int result = var1 + var2;
    //        System.out.println(result);

        sum(5, 10);

//        int var3 = 15;
//        int var4 = 20;
//
//        System.out.println(var3 +

//        sum(15, 20);
//
//        sum("Test", "123");
//
//        sum("777", 5);
//
//        System.out.println(sum(77, "77"));
//
//        System.out.println(sum(77, "77a"));
//
//        LibClass libClass = new LibClass();
//
//        libClass.multiplication(3, 6);
//
//        System.out.println(libClass.divide(3 ,  2));
//
//        System.out.println(libClass.divide(1.08 ,  0));
//
//        Sorts sort = new Sorts();
//
////        sort.bubbleSort();
////
////        sort.quickSort();
//        System.out.println(libClass.divide(3 ,  2));
//    try {
//        System.out.println(libClass.divide((byte) 2, (byte) 0));
//    }catch (ArithmeticException e){
//        System.out.println("error");
//    }
//
//        int [] arr1 = {1, 3, 4, 5, 7, 8, 9, 444, 33, 22, 33, 11};

    //libClass.comparisonArrayWithValue(11, arr1);

//        List<String> ourList;
//
//        ourList = new ArrayList();
//
//        ourList.add("test");
//        ourList.add("test1");
//        System.out.println(ourList);
//
//        System.out.println(ourList.get(0));
//
////        for (int i = 0; i < ourList.size(); i++) {
////            System.out.println(ourList.get(i));
////        }
//
//        for (String el: ourList
//             ) {
//            System.out.println(el);
//        }
//
//        List<List<String>> ourListList = new ArrayList<>();
//        ourListList.add(ourList);
//        ourListList.add(ourList);
//        System.out.println(ourListList);
//
//        ourListList.get(1).add("test33");
//        System.out.println(ourListList);
//
//        List<String> ourList1 = new ArrayList<>();
//        ourList1.add("test");
//        ourList1.add("test1");
//        ourList1.add("test33");
//        System.out.println(ourList == ourList1);
//        System.out.println(ourList.equals(ourList1));
//
//        Map<String, String> ourMap = new HashMap<>();
//        ourMap.put("zey", "value");
//        ourMap.put("login", "atest21");
//        ourMap.put("yogin1", "test22");
//        ourMap.put("login2", "ztest23");
//        ourMap.put("login3", "test24");
//
//        System.out.println(ourMap.get("login"));
//        System.out.println(ourMap.size());
//        System.out.println(ourMap);
//
//        List<Map<String, String>> ourListMap = new ArrayList<>();
//        ourListMap.add(ourMap);
//
//
//
//
 //FirefoxDriver driver;
        // Create a new instance of the Firefox driver


//        //try driver web
//        System.setProperty("webdriver.chrome.driver", "/home/grey/newdriver/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        //Launch the Online Store Website
//        driver.get("http://www.store.demoqa.com");
//
//        // Print a Log In message to the screen
//        System.out.println("Successfully opened the website www.Store.Demoqa.com");
//
//        //Wait for 5 Sec
//        Thread.sleep(5000);
//
//        // Close the driver
//        driver.quit();
//        //end driver

//        //last hometask
//        Dog dog = new Dog(33, "myDog", "black");
//        dog.makeSound();
//
//        Bird bird = new Bird(15, "BigBird", "Blue", 10);
//        bird.makeSound();
//        bird.fly();
//
//        Fish fish = new Fish(25, "Nemo", "silver", 250);
//        fish.diveToDepth();
//        // end last hometask


        //lesson 30.11

        Dollar dollar = new Dollar(20, 1.15, 0.98, "dollar");

        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(20);
        System.out.println(dollar.getKursNBU());

        Euro euro = new Euro(31, 1.15, 0.95, "euro");
        System.out.println(euro.getKursNBU());
        euro.setKursNBU(36);
        System.out.println(euro.getKursNBU());

        final String nameDollar = "DOLLAR";

        System.out.println(nameDollar + " " + dollar.getKursNBU());

        dollar.exchangeHrnToCurrency(1000);
        dollar.exchangeCurrencyToHrn(100);

        Bitcoin bitcoin = new Bitcoin(11000, 1.15, 0.88, "bitcoin");
        bitcoin.exchangeCurrencyToHrn(100);
        bitcoin.exchangeHrnToCurrency(200);

        //end lesson 30.11
        //bitcoin class false могу купить, не могу продать.
    }
}
