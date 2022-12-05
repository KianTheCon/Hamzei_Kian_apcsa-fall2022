/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test the myCollage method */
  public static void testMyCollage()
  {
    Picture canvas = new Picture("src/640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/swan.jpg");
    swan.edgeDetection(30);
    swan.explore();
  }
  
  /** Method to test edgeDetection2 */
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("src/swan.jpg");
    swan.edgeDetection2(30);
    swan.explore();
  }
  
  /** Method to test keepOnlyBlue*/
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("src/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test negate*/
  public static void testNegate()
  {
    Picture beach = new Picture("src/beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  /** Method to test grayscale*/
  public static void testGrayscale()
  {
    Picture beach = new Picture("src/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  /** Method to test fixUnderwater*/
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("src/water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }
  
  /** Method to test mirrorVerticalRightToLeft*/
  public static void testMirrorVerticalRightToLeft() {
	  Picture caterpillar = new Picture("src/caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorVerticalRightToLeft();
	  caterpillar.explore();
	  
  }
  
  /** Method to test mirrorHorizontal*/
  public static void testMirrorHorizontal() {
	  Picture caterpillar = new Picture("src/caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorHorizontal();
	  caterpillar.explore();
	  
  }
  
  /** Method to test mirrorHorizontalBotToTop*/
  public static void testMirrorHorizontalBotToTop() {
	  Picture caterpillar = new Picture("src/caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorHorizontalBotToTop();
	  caterpillar.explore();
	  
  }
  
  /** Method to test mirrorDiagonal*/
  public static void testMirrorDiagonal() {
	  Picture beach = new Picture("src/beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
	  
  }
  
  /** Method to test mirrorArms*/
  public static void testMirrorArms() {
	  Picture snowman = new Picture("src/snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
	  
  }
  
  /** Method to test mirrorGull*/
  public static void testMirrorGull() {
	  Picture gull = new Picture("src/seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
	  
  }
  
  /** Method to test copyB*/
  public static void testCopy() {
	  Picture gull = new Picture("src/seagull.jpg");
	  gull.explore();
	  gull.copyB(gull, 238, 400, 234, 238, 322, 345);
	  gull.explore();
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
//    testNegate();
    testGrayscale();
//    testFixUnderwater();
//    testMirrorVertical();
//    testMirrorVerticalRightToLeft();
//	  testMirrorHorizontal();
//	  testMirrorHorizontalBotToTop();
//	  testMirrorDiagonal();
	//testMirrorTemple();
    testMirrorArms();
//    testMirrorGull();
    //testMirrorDiagonal();
//    testCollage();
//	  testMyCollage();
//    testCopy();
//    testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}