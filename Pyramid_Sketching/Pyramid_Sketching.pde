final int BRICK_WIDTH = 30;
final int BRICK_HEIGHT = 12;
final int BRICKS_IN_BASE = 14;
final int PYRAMID_HEIGHT = BRICKS_IN_BASE;
final int WINDOW_X = 600;
final int WINDOW_Y = 200;
void setup(){
  size(WINDOW_X, WINDOW_Y);
  for(int i = 0; i < PYRAMID_HEIGHT; i++){
    for(int i2 = 0; i2 < BRICKS_IN_BASE - i; i2++){
      rect(((WINDOW_X-((BRICKS_IN_BASE-i)*BRICK_WIDTH))/2)+i2*BRICK_WIDTH, (WINDOW_Y-BRICK_HEIGHT)-i*BRICK_HEIGHT, BRICK_WIDTH, BRICK_HEIGHT);
    }
  }
}
