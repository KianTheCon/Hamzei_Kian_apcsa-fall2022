import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to set the red and green to 0 */
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  /** Method to negate all pixels in a picture*/
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(-pixelObj.getRed()+255);
        pixelObj.setGreen(-pixelObj.getGreen()+255);
        pixelObj.setBlue(-pixelObj.getBlue()+255);
      }
    }
  }
  
  /** Method to make all pixels a shade a gray*/
  public void grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	  int avg = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue())/3;
    	  pixelObj.setRed(avg);
          pixelObj.setGreen(avg);
          pixelObj.setBlue(avg);
      }
    }
  }
  
  /** Method to fix underwater picture and make the fish more visible*/
  public void fixUnderwater()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	  pixelObj.setRed((int)(pixelObj.getRed()*4.75));
//          pixelObj.setGreen(pixelObj.getGreen()*1);
//          pixelObj.setBlue(pixelObj.getBlue()*1);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
   * vertical mirror in the center of the picture
   * from right to left*/
 public void mirrorVerticalRightToLeft()
 {
   Pixel[][] pixels = this.getPixels2D();
   Pixel leftPixel = null;
   Pixel rightPixel = null;
   int width = pixels[0].length;
   for (int row = 0; row < pixels.length; row++)
   {
     for (int col = width / 2; col < width; col++)
     {
       leftPixel = pixels[row][col];
       rightPixel = pixels[row][width - 1 - col];
       rightPixel.setColor(leftPixel.getColor());
     }
   } 
 }
 
 /** Method that mirrors the picture around a 
  * horizontal mirror in the center of the picture
  * from top to bottom*/
public void mirrorHorizontal()
{
  Pixel[][] pixels = this.getPixels2D();
  Pixel leftPixel = null;
  Pixel rightPixel = null;
  int height = pixels.length;
  for (int col = 0; col < pixels[0].length; col++)
  {
    for (int row = 0; row < height / 2; row++)
    {
      leftPixel = pixels[row][col];
      rightPixel = pixels[height - 1 - row][col];
      rightPixel.setColor(leftPixel.getColor());
    }
  } 
}

/** Method that mirrors the picture around a 
 * horizontal mirror in the center of the picture
 * from bottom to top*/
public void mirrorHorizontalBotToTop()
{
 Pixel[][] pixels = this.getPixels2D();
 Pixel leftPixel = null;
 Pixel rightPixel = null;
 int height = pixels.length;
 for (int col = 0; col < pixels[0].length; col++)
 {
   for (int row = height/2; row < height; row++)
   {
     leftPixel = pixels[row][col];
     rightPixel = pixels[height - 1 - row][col];
     rightPixel.setColor(leftPixel.getColor());
   }
 } 
}

/** Method that mirrors the picture around a 
 * horizontal mirror in the center of the picture
 * from bottom to top*/
public void mirrorDiagonal()
{
 Pixel[][] pixels = this.getPixels2D();
 Pixel leftPixel = null;
 Pixel rightPixel = null;
 
 int height = pixels.length;
 int width = pixels[0].length;
 for (int row = 0; row < height; row++)
 {
   for (int col = row; col >=0; col--)
   {
     leftPixel = pixels[row][col];
     rightPixel = pixels[col][row];
     rightPixel.setColor(leftPixel.getColor());
   }
 } 
}
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
  
  /** Mirror just part of a picture of a snowman so that it has 4 arms*/
  public void mirrorArms()
  {
    int mirrorPoint = 200;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int col = 104; col < 293; col++)
    {
      for (int row = 158; row < mirrorPoint; row++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a snowman */
  public void mirrorGull()
  {
    int mirrorPoint = 345;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 234; row < 322; row++)
    {

      for (int col = 238; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  /** copy from the passed fromPic to the
   * specified startRow and startCol in the
   * current picture
   * @param fromPic the picture to copy from
   * @param startRow the start row to copy to
   * @param startCol the start col to copy to
   * 
   * @param copySRow the start row to copy from
   * @param copySCol the start col to copy from
   * @param copyERow the end row to copy from
   * @param copyEcol the end col to copy from
   */
 public void copyB(Picture fromPic, int startRow, int startCol, int copySRow, int copySCol, int copyERow, int copyECol)
 {
   Pixel fromPixel = null;
   Pixel toPixel = null;
   Pixel[][] toPixels = this.getPixels2D();
   Pixel[][] fromPixels = fromPic.getPixels2D();
   for (int fromRow = copySRow, toRow = startRow; 
        fromRow < copyERow &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
   {
     for (int fromCol = copySCol, toCol = startCol; 
          fromCol < copyECol &&
          toCol < toPixels[0].length;  
          fromCol++, toCol++)
     {
       fromPixel = fromPixels[fromRow][fromCol];
       toPixel = toPixels[toRow][toCol];
       toPixel.setColor(fromPixel.getColor());
     }
   }   
 }
  

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("src/flower1.jpg");
    Picture flower2 = new Picture("src/flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("src/collage.jpg");
  }
  
  /** Method to create a personalized collage of several pictures */
  public void myCollage()
  {
    Picture gull1 = new Picture("src/seagull.jpg");
    Picture gull2 = new Picture("src/seagull.jpg");
    Picture gull3 = new Picture("src/seagull.jpg");
    Picture gullb = new Picture("src/seagull.jpg");
    gull1.zeroBlue();
    gull2.keepOnlyBlue();
    gull3.mirrorGull();
    gullb.mirrorVerticalRightToLeft();
    this.copy(gullb, 0, 0);
    this.copyB(gull1, 100, 400, 234, 238, 322, 345);
    this.copyB(gull2, 200, 400, 234, 238, 322, 345);
    this.copyB(gull3, 300, 400, 234, 348, 322, 455);
    this.write("src/collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  /** Method to show large changes in color 
   * @param edgeDist the distance for finding edges
   */
 public void edgeDetection2(int edgeDist)
 {
   Pixel leftPixel = null;
   Pixel rightPixel = null;
   Pixel[][] pixels = this.getPixels2D();
   Color rightColor = null;
   for (int row = 0; row < pixels.length - 1; row++)
   {
     for (int col = 0; 
          col < pixels[0].length-1; col++)
     {
       leftPixel = pixels[row][col];
       rightPixel = pixels[row+1][col];
       rightColor = rightPixel.getColor();
       if (leftPixel.colorDistance(rightColor) < 
           edgeDist)
         leftPixel.setColor(Color.WHITE);
       else
         leftPixel.setColor(Color.BLACK);
     }
   }
 }
 
 /** EXAMPLE ENCODE
	 * Hide a black and white message in the current picture by changing the red to
	 * even and then setting it to odd if the message pixel is black
	 * 
	 * @param messagePict the picture with a message
	 */
 	public void exencode(Picture messagePict) {
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel messagePixel = null;
		int count = 0;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				// if the current pixel red is odd make it even
				currPixel = currPixels[row][col];
				if (currPixel.getRed() % 2 == 1)
					currPixel.setRed(currPixel.getRed() - 1);
				messagePixel = messagePixels[row][col];
				if (messagePixel.colorDistance(Color.BLACK) < 50) {
					currPixel.setRed(currPixel.getRed() + 1);
					count++;
				}
			}
		}
		System.out.println(count);
	}

	/**EXAMPLE DECODE
	 * Method to decode a message hidden in the red value of the current picture
	 * 
	 * @return the picture with the hidden message
	 */
	public Picture exdecode() {
		Pixel[][] pixels = this.getPixels2D();
		int height = this.getHeight();
		int width = this.getWidth();
		Pixel currPixel = null;

		Pixel messagePixel = null;
		Picture messagePicture = new Picture(height, width);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		int count = 0;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				currPixel = pixels[row][col];
				messagePixel = messagePixels[row][col];
				if (currPixel.getRed() % 2 == 1) {
					messagePixel.setColor(Color.BLACK);
					count++;
				}
			}
		}
		System.out.println(count);
		return messagePicture;
	}

 
 	public void encode(Picture messagePict) {
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel messagePixel = null;
		int count = 0;
		ArrayList<Pixel> blackPixels = new ArrayList<Pixel>();
		int i = 0;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {

				currPixel = currPixels[row][col];
				int b = currPixel.getBlue();
				if(currPixel.getBlue() % 4 == 0) {
					b++;
				}
				
				int r = Math.round(((float)currPixel.getRed()/10)) *10;
				r = r>=255 ? 250: r;
				this.setBasicPixel(col, row, new Color(r, currPixel.getGreen(), currPixel.getBlue()).getRGB());

				messagePixel = messagePixels[row][col];
				if (messagePixel.colorDistance(Color.BLACK) < 50) {
					blackPixels.add(currPixels[row][col]);
					i++;
					
				}
				this.setBasicPixel(col, row, new Color(r, currPixel.getGreen(), b).getRGB());
				
			}
		}
		System.out.println(blackPixels.size() + "");
		
		 
		for(Pixel b : blackPixels) {
			boolean newFound = false;
			int vTranslate = 0;
			int r = 0;
			while(!newFound) {
				vTranslate = (int)(Math.random() * 10) * (Math.random() >= .5 ? 1: -1);
				r = currPixels[b.getY() + vTranslate][b.getX()].getRed() + Math.abs(vTranslate);
				newFound = this.getPixel(b.getX(), b.getY() + vTranslate).getRed() % 10 == 0 && r < 256 && r > 0;
			}
			int gdiff = 0;
			boolean bo = false;
			if(vTranslate < 0) {gdiff = (this.getPixel(b.getX(), b.getY() + vTranslate).getGreen() % 2); bo = true;}
			else gdiff = -1 * ((this.getPixel(b.getX(), b.getY() + vTranslate).getGreen() % 2) - 1);
			
			int bl = currPixels[b.getY() + vTranslate][b.getX()].getBlue();
			int a = bl % 4;
			bl = bl + ((a >= 2) ? 4-a: -a);
			this.setBasicPixel(b.getX(), b.getY() + vTranslate, new Color(currPixels[b.getY() + vTranslate][b.getX()].getRed() + Math.abs(vTranslate), currPixels[b.getY() + vTranslate][b.getX()].getGreen() - gdiff, bl).getRGB());


		}
	}
	
	public Picture decode() {
		Pixel[][] pixels = this.getPixels2D();
		int height = this.getHeight();
		int width = this.getWidth();
		Pixel currPixel = null;

		Pixel messagePixel = null;
		Picture messagePicture = new Picture(height, width);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		int count = 0;
		
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
				currPixel = pixels[row][col];
				messagePixel = messagePixels[row][col];
				int r = 1;
				if(currPixel.getGreen() % 2 == 0 && row != 480) r = -1;
				if ((this.getPixel(col, row).getBlue()) % 4 == 0) {

					messagePixels[row - (r * (currPixel.getRed() % 10))][col].setColor(Color.black);
					count++;
				}
			}
		}
		System.out.println(count);
		return messagePicture;
	}
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
	  Picture beach = new Picture("src/beach.jpg");
	  Picture encoded = new Picture("src/apple_icon.jpg");
//	  Picture encoded = new Picture("src/msg.jpg");
	  encoded.explore();
	  beach.explore();
	  beach.encode(encoded);
	  beach.explore();
	  beach.decode().explore();
	  
	  
//    beach.explore();
//    beach.zeroBlue();
//    beach.explore();
	  
  }
  
} // this } is the end of class Picture, put all new methods before this
