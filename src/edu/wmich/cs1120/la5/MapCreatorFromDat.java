package edu.wmich.cs1120.la5;

import java.io.*;
import java.io.IOException;
import edu.wmich.cs1120.la5.TerrainScanner; 

public class MapCreatorFromDat implements IMapCreator {
	TerrainScanner tS = new TerrainScanner();
	
	/**
	 * @author Jason Gary
	 * @param file name "terrain.dat" and threshold given by user
	 * @return void
	 */
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
				datArea[row][col].setBasicEnergyCost(datIn.readDouble());
				datArea[row][col].setElevation(datIn.readDouble());
				datArea[row][col].setRadiation(datIn.readDouble());
				
				biChar= datIn.readChar();
				val1.setValue(datIn.readInt());
				val2.setValue(datIn.readInt());
				
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
