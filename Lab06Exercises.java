//Name Andre Purits Date 13/11/14
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   import javax.swing.JOptionPane;
    public class Lab06Exercises 
   {
       public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/" + filename + ".map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
      
         task_01(); //go to the end of the row of beepers
         task_02(); //go to the beeper
         task_03(); //go to the wall
         task_04(); //go to the wall, pick up all the beepers (max one per pile)
         task_05(); //go to the wall, pick up all the beepers
         task_06(); //go to the end of the row of beepers, there is one gap
      }
       public static void task_01()	
      { //go to the end of the row of beepers
         Robot temp = new Robot(1, 1, Display.EAST, 0);
      int count = 0;
      while(karel.nextToABeeper()){  
      karel.pickBeeper();  
      count++;}
      System.out.println("Count is "+ count);
             
      public static void task_02()	
      { //go to the beeper
         Robot temp = new Robot(1, 2, Display.EAST, 0);
      	while(!temp.nextToABeeper()) {
         temp.move(); }
      }
       public static void task_03()	
      { //go to the wall
         Robot temp = new Robot(1, 3, Display.EAST, 0);
         while(temp.frontIsClear()) {
         temp.move(); }
      }
       public static void task_04()	
      { //go to the wall, pick up all the beepers (max one per pile)
         Robot temp = new Robot(1, 4, Display.EAST, 0);
         while(temp.frontIsClear()) {
         while(temp.nextToABeeper()) {
         temp.pickBeeper(); }
         temp.move();
         }
         if(!temp.frontIsClear() && temp.nextToABeeper()) {
         temp.pickBeeper();
      }
      }
       public static void task_05()	
      { //go to the wall, pick up all the beepers
         Robot temp = new Robot(1, 5, Display.EAST, 0);
         while(temp.frontIsClear()) {
         while(temp.nextToABeeper()) {
         temp.pickBeeper(); }
         temp.move();
         }
         while(!temp.frontIsClear() && temp.nextToABeeper()) {
         temp.pickBeeper();
      }

      }
       public static void task_06()
      { //go to the end of the row of beepers, there is one gap
         Robot temp = new Robot(1, 6, Display.EAST, 0);
         while(temp.nextToABeeper()) {
         temp.move(); }
         if(temp.frontIsClear()) {
         temp.move();
         while(temp.nextToABeeper()) {
         temp.move(); } }
      }
   }