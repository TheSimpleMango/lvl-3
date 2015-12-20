final int NROWS = 8;
final int NCOLUMNS = 8;
final int SQUARE_WIDTH = 50;
final int SQUARE_HEIGHT = 50;
void setup(){
  size(SQUARE_WIDTH*NCOLUMNS, SQUARE_HEIGHT*NROWS);
  for(int i = 0; i < NROWS; i++){
    for(int i2 = 0; i2 < NCOLUMNS; i2++){
      if((i2 % 2) - (i % 2) == 0){
        fill(255);
      }
      else{
        fill(0);
      }
      rect(i2*SQUARE_WIDTH, i*SQUARE_HEIGHT, SQUARE_WIDTH, SQUARE_HEIGHT);
    }
  }
}
