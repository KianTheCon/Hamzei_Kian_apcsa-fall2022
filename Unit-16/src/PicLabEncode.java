import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class PicLabEncode {
	
	
	
	/**
	 * Hide a black and white message in the current picture by changing the red to
	 * even and then setting it to odd if the message pixel is black
	 * 
	 * @param messagePict the picture with a message
	 */
	public void encode(Picture messagePict) {
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

	/**
	 * Method to decode a message hidden in the red value of the current picture
	 * 
	 * @return the picture with the hidden message
	 */
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
				if (currPixel.getRed() % 2 == 1) {
					messagePixel.setColor(Color.BLACK);
					count++;
				}
			}
		}
		System.out.println(count);
		return messagePicture;
	}
}
