/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class jajal {
    public static void main(String[]args){
        org.joda.money.Money m=org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), 100000);
        System.out.println(m);
        System.out.println(m.getAmount().longValue());
    }
}