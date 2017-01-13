package mainclasses;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class Imgtobyte {
	
	public byte[] extractBytes () throws IOException {
		Path p=Paths.get("C:/Users/bsant/Desktop/images.jpg");
		 // open image
		 File imgPath = new File(p.toString());
		 BufferedImage bufferedImage = ImageIO.read(imgPath);

		 // get DataBufferBytes from Raster
		 WritableRaster raster = bufferedImage .getRaster();
		 DataBufferByte data   = (DataBufferByte) raster.getDataBuffer();
System.out.println(data.getData());
		 return ( data.getData() );
		}
}
