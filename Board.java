import java.awt.*;

public class Board {

   int DENSITY_COEFFICIENT = 3;

   Tile[][] board;
   int rows;
   int cols;
   
   public Board(int desiredRows, int desiredCols) {
   
      rows = desiredRows;
      cols = desiredCols;
      board = new Tile[rows][cols];
      
      for(int r = 0; r<rows; r++) {
         for(int c = 0; c<cols; c++) {
            board[r][c] = new Tile();
         }
      }
      
   }
   
   public int getRows(){
      return rows;
   }
   
   public int getColumns(){
      return cols;
   }
   
   public void fillBoard(Tile[][] a, Point min, Point player) {
   
   //fill middle
   
      for(int r = 1; r<a.length-1; r++) {
         for(int c = 1; c<a[1].length-1; c++) {
            if (a[r][c].isOpen())
            {
               int wallchance = (int)(Math.random()*DENSITY_COEFFICIENT);
               if (wallchance == 0)
               {
                  a[r][c].close();
               }
            }
         }
      }
      
      //set minotaur
      int minotaurX = min.x;
      int minotaurY = min.y;
      
      
      a[minotaurX][minotaurY].open();
      a[minotaurX][minotaurY].flipMinotaur();
      
      //set player
      a[player.x][player.y].open();
      a[player.x][player.y].flipPlayer();
      
      //fill border
      for (int r  = 0;r<a.length;r++)
      {
         a[r][0].close();
         a[r][a[1].length-1].close();
         a[0][r].close();
         a[a.length-1][r].close();
      }
      
      //open exit and surrounding
      int exitspot = (int)(Math.random()*4);
      if (exitspot == 1)
      {
         a[minotaurX][a[1].length-1].open();
         a[minotaurX][a[1].length-1].makeExit(); //what does this stuff do?
                                                //
         a[minotaurX][a[1].length-2].open(); //throws errors about 25% of time
         a[minotaurX+1][a[1].length-2].open();
         a[minotaurX-1][a[1].length-2].open();
      }
      else if (exitspot == 0)
      {
         a[minotaurX][0].open();
         a[minotaurX][0].makeExit(); //IOB ERRORS EVERYWHERE
         
         a[minotaurX][1].open();
         a[minotaurX-1][1].open(); //help
         a[minotaurX+1][1].open(); //errors
      }
      else if (exitspot == 2)
      {
         a[0][minotaurY].open();
         a[0][minotaurY].makeExit();
         
         a[1][minotaurY].open();
         a[1][minotaurY-1].open();
         a[1][minotaurY+1].open();
      }
      else if (exitspot == 3)
      {
         a[a.length-1][minotaurY].open();
         a[a.length-1][minotaurY].makeExit();
         
         a[a.length-2][minotaurY].open();
         a[a.length-2][minotaurY-1].open();
         a[a.length-2][minotaurY+1].open();
      }            
   
   }
}
