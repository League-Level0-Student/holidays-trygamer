
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    
 ******************************************************************************/

import org.jointheleague.graphical.robot.Robot;


public class ChristmasTree {

	Robot k  = new Robot();
	
    public static void main(String[] args) {
        ChristmasTree ohChristmasTree = new ChristmasTree();
        ohChristmasTree.drawStar();
        ohChristmasTree.drawTreeBody();
        ohChristmasTree.drawTreeTrunk();
    }


    double treeWidth = 30;
    double scale = 1.1;    //This is how much the width of the tree increases with each layer down


    void drawTreeBody() {
        // 8. Change the color of the line the robot draws to forest green    
k.setPenColor(51,102,0);

        // 1. Make a variable for turnAmount and set it to 175
int turnAmount= 175;

        // 2. Start the Robot facing to the right
k.turn(90);


        // 5. Repeat steps 3 through 11, 11 times
for(int i=0; i<11; i++) {

            // 3. Move the robot the width of the tree
    k.move((int) treeWidth);
            // 4. Turn the robot the current turnAmount to the right
    k.turn(turnAmount);
            // 6. Set the treeWidth to the current treeWidth times the scale
    treeWidth=treeWidth*scale;
            // 7. Move the robot the width of a tree again
    k.move((int) treeWidth);
            // 9. Turn the robot the current turn amount to the LEFT
    k.turn(-turnAmount);
            // 10. Set the treeWidth to the current treeWidth times the scale again
    treeWidth=treeWidth*scale;
            // 11. Decrease turnAmount by 1
    turnAmount= turnAmount-1;
}

}
    
    void drawTreeTrunk() {
        // 1. Move the robot half the width of the tree
treeWidth=treeWidth/2;
    	k.move((int) treeWidth);

        // 2. Change the robot so that it is pointing straight down
k.turn(90);

        // 4. Set the pen width to the tree width divided by 10
k.setPenWidth(50);

        // 5. Change the color of the line the robot draws to brown


k.setPenColor(51,0,0);

        // 3. Move the robot a quarter the tree width
treeWidth=treeWidth/2;
k.move((int) treeWidth);

    }
    
    void drawStar() {
        // * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.
    
    	for(int i=0; i<5; i++) {
    		k.miniaturize();
    		k.penDown();
    		k.setPenColor(255,255,51);
    		k.setSpeed(10);
    		k.move(100);
    		k.turn(144);
    	}
    	
    	
    }


}

