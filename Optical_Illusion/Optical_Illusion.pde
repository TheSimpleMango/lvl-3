final int BOXES_PER_SIDE = 4;
final int BOX_SIZE = 50;
final int BOX_SPACING = 10;
void setup(){
  size((BOXES_PER_SIDE*BOX_SIZE) + (BOX_SPACING * (BOXES_PER_SIDE + 1)), (BOXES_PER_SIDE*BOX_SIZE) + (BOX_SPACING * (BOXES_PER_SIDE + 1)));
  background(255);
  fill(0);
  for(int i = 0; i < BOXES_PER_SIDE; i++){
    for(int i2 = 0; i2 < BOXES_PER_SIDE; i2++){
      rect((BOX_SPACING * (i2 + 1)) + (BOX_SIZE * i2), (BOX_SPACING * (i + 1)) + (BOX_SIZE * i), BOX_SIZE, BOX_SIZE);
    }
  }
}
