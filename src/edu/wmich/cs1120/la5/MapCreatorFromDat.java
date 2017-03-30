package edu.wmich.cs1120.la5;

import java.io.*;
import java.io.IOException;
import edu.wmich.cs1120.la5.TerrainScanner; 

/**
 * @author Jason Gary
 * @param file name "terrain.dat" and threshold given by user
 * @return void
 */
public class MapCreatorFromDat implements IMapCreator {
	private TerrainScanner tS = new TerrainScanner();
	
<<<<<<< HEAD
	/**
	 * @author Jason Gary
	 * @param file name "terrain.dat" and threshold given by user
	 * @return void
	 */
=======
>>>>>>> branch 'master' of https://github.com/JEgary/LA5.git
	public void scanTerrain(String fileName, int threshold) throws IOException {
		Addition add = new Addition();
		Substraction sub = new Substraction();
		char biChar = 'o';
		
		RandomAccessFile datIn = new RandomAccessFile(fileName, "rw");
		
		Area[][] datArea = new Area[10][10];
		Expression val2 = new Expression();
		Expression val1 = new Expression();
		
		for(int row = 0; row<10; row++){
			for(int col = 0; col<10; col++){
				datArea[row][col]=new Area();
				datArea[row][col].setBasicEnergyCost(datIn.readDouble());
				datArea[row][col].setElevation(datIn.readDouble());
				datArea[row][col].setRadiation(datIn.readDouble());
				
				biChar= datIn.readChar();
				val1.setValue(datIn.readInt());
				val2.setValue(datIn.readInt());
			
//				if(biChar == '+'){
//					datIn.seek(add.perform(val1, val2));		
//				}else if (biChar == '-'){
//					datIn.seek(sub.perform(val1, val2));
//				} //seek( op result ( 3*Double.byte+1*Character.byte+ 2*Integer.byte)
			}
			
			
		}
		
		tS.setTerrain(datArea);

	}

	@Override
	public TerrainScanner getScanner() {
		
		return tS;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		tS = scanner;

	}

}
