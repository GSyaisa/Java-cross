package com.company;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
	// write your code here


     Car[] array = new Car[5];

     array[0] = new Car();
     array[0].setId(100);
     array[0].setMark("Bentley");
     array[0].setModel("Continental");
     array[0].setColor("Blue");
     array[0].setYear(2017);
     array[0].setPrice(360000);
     array[0].setReg_numb(1648);

     array[1] = new Car();
     array[1].setId(101);
     array[1].setMark("Bentley");
     array[1].setModel("Mulsanne");
     array[1].setColor("Black");
     array[1].setYear(2019);
     array[1].setPrice(480000);
     array[1].setReg_numb(5555);

     array[2] = new Car();
     array[2].setId(102);
     array[2].setMark("Bugatti");
     array[2].setModel("Divo");
     array[2].setColor("Grey");
     array[2].setYear(2008);
     array[2].setPrice(280000);
     array[2].setReg_numb(8914);

     array[3] = new Car();
     array[3].setId(103);
     array[3].setMark("Mercedes");
     array[3].setModel("AMG");
     array[3].setColor("Green");
     array[3].setYear(2018);
     array[3].setPrice(500000);
     array[3].setReg_numb(8913);

     array[4] = new Car();
     array[4].setId(104);
     array[4].setMark("Volswagen");
     array[4].setModel("Tiguan");
     array[4].setColor("White");
     array[4].setYear(2008);
     array[4].setPrice(180000);
     array[4].setReg_numb(8944);


     for(int i = 0; i < 3; i++){
      System.out.println("car" + i + ": " + array[i]);
     }

     Car.carsByMark(array);
     Car.carsByModelAndYear(array);
     Car.carsByYearAndPrice(array);

    }


}
