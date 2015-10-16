/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol25;

import java.util.Scanner;

/**
 *
 * @author plagoromani
 */
public class Bol25 {

    
    public static void main(String[] args) {
        float millas,constante;
        constante = 1609.34f;
        Scanner obx = new Scanner(System.in);
        System.out.println("teclea millas :");
        millas = obx.nextFloat();
        System.out.println("resultado ="+millas + constante);
    }
    
}
