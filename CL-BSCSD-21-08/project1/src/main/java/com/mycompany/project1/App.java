/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;

/**
 *
 * @author Deneth
 */
public class App 
{ 

    public App() {
    }

    public static void main(String args[])
    {
        System.out.println("Helo World");
        //initializing 1
        int x[]=new int[3];

        x[0]=10;
        x[1]=20;
        x[2]=30;


        for(int y=0;y<x.length;y++)
        {
            System.out.println(x[y]);
        }

        //initializing 2
        int w[]={100,200,300,400,500,600};
        for(int z=0;z<w.length;z++)
        {
            System.out.println(w[z]);
        }
    }   

}