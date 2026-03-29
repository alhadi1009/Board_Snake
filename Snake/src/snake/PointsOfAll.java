/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

import java.awt.Point;
import java.util.*;

/**
 *
 * @author Al Hadi
 */
public class PointsOfAll {
    public static Point[] Paths= new Point[101];
    public static ArrayList<ArrayList<Integer>> Snakes = new ArrayList<>();
   public  static ArrayList<ArrayList<Integer>> Ladders = new ArrayList<>();
   
   public static ArrayList<Integer> Teleports = new ArrayList<>(Arrays.asList(41, 24, 79, 98, 30));

    
    
    private static final int x = 12;
    
    
    static {
        AddPath();
    }
    private static void AddPath()
    {
        Paths[0]=new Point(450+x,450+x);
        Paths[1]=new Point(400+x,450+x);
        Paths[2]=new Point(350+x,450+x);      
        Paths[3]=new Point(300+x,450+x);
        Paths[4]=new Point(250+x,450+x);
        Paths[5]=new Point(200+x,450+x);     
        Paths[6]=new Point(150+x,450+x);    
        Paths[7]=new Point(100+x,450+x);   
        Paths[8]=new Point(50+x,450+x);  
        Paths[9]=new Point(0+x,450+x);  
        Paths[10]=new Point(0+x,400+x); 
        Paths[11]=new Point(50+x,400+x);  
        Paths[12]=new Point(100+x,400+x);   
       Paths[13]=new Point(150+x,400+x); 
        Paths[14]=new Point(200+x,400+x); 
        Paths[15]=new Point(250+x,400+x);
        Paths[16]=new Point(300+x,400+x);   
        Paths[17]=new Point(350+x,400+x); 
        Paths[18]=new Point(400+x,400+x);    
        Paths[19]=new Point(450+x,400+x); 
        Paths[20]=new Point(450+x,350+x); 
        
        Paths[21]=new Point(400+x,350+x); 
        Paths[22]=new Point(350+x,350+x); 
        Paths[23]=new Point(300+x,350+x); 
        Paths[24]=new Point(250+x,350+x); 
        Paths[25]=new Point(200+x,350+x); 
        
        Paths[26]=new Point(150+x,350+x); 
        Paths[27]=new Point(100+x,350+x); 
        Paths[28]=new Point(50+x,350+x); 
        Paths[29]=new Point(0+x,350+x); 
        
        Paths[30]=new Point(0+x,300+x); 
        Paths[31]=new Point(50+x,300+x); 
        Paths[32]=new Point(100+x,300+x); 
        Paths[33]=new Point(150+x,300+x); 
        Paths[34]=new Point(200+x,300+x); 
        Paths[35]=new Point(250+x,300+x); 
        Paths[36]=new Point(300+x,300+x); 
        Paths[37]=new Point(350+x,300+x); 
        Paths[38]=new Point(400+x,300+x); 
        Paths[39]=new Point(450+x,300+x); 
        Paths[40]=new Point(450+x,250+x); 
        Paths[41]=new Point(400+x,250+x); 
        Paths[42]=new Point(350+x,250+x); 
        Paths[43]=new Point(300+x,250+x); 
        Paths[44]=new Point(250+x,250+x); 
        Paths[45]=new Point(200+x,250+x); 
        Paths[46]=new Point(150+x,250+x); 
        Paths[47]=new Point(100+x,250+x); 
        Paths[48]=new Point(50+x,250+x); 
        Paths[49]=new Point(0+x,250+x); 
        Paths[50]=new Point(0+x,200+x); 
        Paths[51]=new Point(50+x,200+x); 
        Paths[52]=new Point(100+x,200+x); 
        Paths[53]=new Point(150+x,200+x); 
        Paths[54]=new Point(200+x,200+x); 
        Paths[55]=new Point(250+x,200+x); 
        Paths[56]=new Point(300+x,200+x); 
        Paths[57]=new Point(350+x,200+x); 
        Paths[58]=new Point(400+x,200+x); 
        Paths[59]=new Point(450+x,200+x); 
        
        // After 60;
        Paths[60]=new Point(450+x,150+x); 
        Paths[61]=new Point(400+x,150+x); 

        Paths[62]=new Point(350+x,150+x); 
        Paths[63]=new Point(300+x,150+x); 
        Paths[64]=new Point(250+x,150+x); 
        Paths[65]=new Point(200+x,150+x); 
         Paths[66]=new Point(150+x,150+x); 
        Paths[67]=new Point(100+x,150+x); 
        Paths[68]=new Point(50+x,150+x); 
        Paths[69]=new Point(0+x,150+x); 
        Paths[70]=new Point(0+x,100+x); 
        Paths[71]=new Point(50+x,100+x); 
        Paths[72]=new Point(100+x,100+x); 
        Paths[73]=new Point(150+x,100+x); 
        Paths[74]=new Point(200+x,100+x); 
        Paths[75]=new Point(250+x,100+x); 
        Paths[76]=new Point(300+x,100+x); 
        Paths[77]=new Point(350+x,100+x); 
        Paths[78]=new Point(400+x,100+x); 
        Paths[79]=new Point(450+x,100+x); 
        Paths[80]=new Point(450+x,50+x); //ok
        
        Paths[81]=new Point(400+x,50+x); 
        Paths[82]=new Point(350+x,50+x); 
        Paths[83]=new Point(300+x,50+x); 
        Paths[84]=new Point(250+x,50+x); 
        Paths[85]=new Point(200+x,50+x); 
        Paths[86]=new Point(150+x,50+x); 
        Paths[87]=new Point(100+x,50+x); 
        Paths[88]=new Point(50+x,50+x); 
        Paths[89]=new Point(0+x,50+x); 
        Paths[90]=new Point(0+x,0+x); 
        Paths[91]=new Point(50+x,0+x); 
        Paths[92]=new Point(100+x,0+x); 
        Paths[93]=new Point(150+x,0+x); 
        Paths[94]=new Point(200+x,0+x); 
        Paths[95]=new Point(250+x,0+x); 
        Paths[96]=new Point(300+x,0+x); 
        Paths[97]=new Point(350+x,0+x); 
        Paths[98]=new Point(400+x,0+x); 
        Paths[99]=new Point(450+x,0+x); 
        Paths[100]=new Point(500+x,0+x); 
  }
  
static {
Snakes.add(new ArrayList<>(Arrays.asList(50, 49, 48, 31, 32)));
Snakes.add(new ArrayList<>(Arrays.asList(88, 87, 72, 71, 68, 51, 47)));
Snakes.add(new ArrayList<>(Arrays.asList(67, 52, 47, 32, 27, 12, 7)));
Snakes.add(new ArrayList<>(Arrays.asList(93, 86, 73, 74, 75, 64, 55, 56, 43, 36, 37, 22, 17)));
Snakes.add(new ArrayList<>(Arrays.asList(81, 82, 83, 76, 63, 64, 65, 66, 53)));
Snakes.add(new ArrayList<>(Arrays.asList(60, 61, 62, 57, 42, 43, 44, 45, 34, 25)));
}
static {
Ladders.add(new ArrayList<>(Arrays.asList(2, 18, 20)));
Ladders.add(new ArrayList<>(Arrays.asList(85, 95)));
Ladders.add(new ArrayList<>(Arrays.asList(7, 11, 29)));
Ladders.add(new ArrayList<>(Arrays.asList(45, 53, 67, 71)));
Ladders.add(new ArrayList<>(Arrays.asList(56, 62, 78)));
Ladders.add(new ArrayList<>(Arrays.asList(25, 33, 47)));
}


}
