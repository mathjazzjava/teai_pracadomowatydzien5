package com.mathjazz.grawalutowa;

import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.Scanner;

//@Service
public class Game {

    public Game() {

        String yourCurrency="PLN";
        double yourRates=0;

        Random rnd = new Random();
        int a = rnd.nextInt(32);

        CurrencyController cc = new CurrencyController();

        switch (a) {
            case 0:
                yourCurrency = "CAD";
                yourRates = cc.getCurrency().getRates().getCAD();
                break;
            case 1:
                yourCurrency = "HKD";
                yourRates = cc.getCurrency().getRates().getHKD();
                break;
            case 2:
                yourCurrency = "ISK";
                yourRates = cc.getCurrency().getRates().getISK();
                break;
            case 3:
                yourCurrency = "PHP";
                yourRates = cc.getCurrency().getRates().getPHP();
                break;
            case 4:
                yourCurrency = "DKK";
                yourRates = cc.getCurrency().getRates().getDKK();
                break;
            case 5:
                yourCurrency = "HUF";
                yourRates = cc.getCurrency().getRates().getHUF();
                break;
            case 6:
                yourCurrency = "CZK";
                yourRates = cc.getCurrency().getRates().getCZK();
                break;
            case 7:
                yourCurrency = "AUD";
                yourRates = cc.getCurrency().getRates().getAUD();
                break;
            case 8:
                yourCurrency = "RON";
                yourRates = cc.getCurrency().getRates().getRON();
                break;
            case 9:
                yourCurrency = "SEK";
                yourRates = cc.getCurrency().getRates().getSEK();
                break;
            case 10:
                yourCurrency = "IDR";
                yourRates = cc.getCurrency().getRates().getIDR();
                break;
            case 11:
                yourCurrency = "INR";
                yourRates = cc.getCurrency().getRates().getINR();
                break;
            case 12:
                yourCurrency = "BRL";
                yourRates = cc.getCurrency().getRates().getBRL();
                break;
            case 13:
                yourCurrency = "RUB";
                yourRates = cc.getCurrency().getRates().getRUB();
                break;
            case 14:
                yourCurrency = "HRK";
                yourRates = cc.getCurrency().getRates().getHRK();
                break;
            case 15:
                yourCurrency = "JPY";
                yourRates = cc.getCurrency().getRates().getJPY();
                break;
            case 16:
                yourCurrency = "THB";
                yourRates = cc.getCurrency().getRates().getTHB();
                break;
            case 17:
                yourCurrency = "CHF";
                yourRates = cc.getCurrency().getRates().getCHF();
                break;
            case 18:
                yourCurrency = "SGD";
                yourRates = cc.getCurrency().getRates().getSGD();
                break;
            case 19:
                yourCurrency = "PLN";
                yourRates = cc.getCurrency().getRates().getPLN();
                break;
            case 20:
                yourCurrency = "BGN";
                yourRates = cc.getCurrency().getRates().getBGN();
                break;
            case 21:
                yourCurrency = "TRY";
                yourRates = cc.getCurrency().getRates().getTRY();
                break;
            case 22:
                yourCurrency = "CNY";
                yourRates = cc.getCurrency().getRates().getCNY();
                break;
            case 23:
                yourCurrency = "NOK";
                yourRates = cc.getCurrency().getRates().getNOK();
                break;
            case 24:
                yourCurrency = "NZD";
                yourRates = cc.getCurrency().getRates().getNZD();
                break;
            case 25:
                yourCurrency = "ZAR";
                yourRates = cc.getCurrency().getRates().getZAR();
                break;
            case 26:
                yourCurrency = "USD";
                yourRates = cc.getCurrency().getRates().getUSD();
                break;
            case 27:
                yourCurrency = "MXN";
                yourRates = cc.getCurrency().getRates().getMXN();
                break;
            case 28:
                yourCurrency = "ILS";
                yourRates = cc.getCurrency().getRates().getILS();
                break;
            case 29:
                yourCurrency = "GBP";
                yourRates = cc.getCurrency().getRates().getGBP();
                break;
            case 30:
                yourCurrency = "KRW";
                yourRates = cc.getCurrency().getRates().getKRW();
                break;
            case 31:
                yourCurrency = "MYR";
                yourRates = cc.getCurrency().getRates().getMYR();
                break;
        }

        yourRates=(double)Math.round(yourRates*100)/100;

        System.out.println("Odgadnij aktualny kurs: " +yourCurrency + " uwzględniając 2 miejsca po przecinku (użyj przecinka):");

        Scanner sc = new Scanner(System.in);
        double shot;
        int counter = 0;

        do {
            shot = sc.nextDouble();
            sc.nextLine();
            if (shot > yourRates)
                System.out.println("Za dużo!");
            else {
                if(shot < yourRates)
                    System.out.println("Za mało!");
            }
            counter++;
        }
        while (shot != yourRates);

        System.out.println("Gratulacje! Udało się za: " +counter + " razem.");
    }
}
