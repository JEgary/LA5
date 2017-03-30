package edu.wmich.cs1120.la5;

import java.io.*;
import java.io.IOException;
import edu.wmich.cs1120.la5.TerrainScanner; 

public class MapCreatorFromDat implements IMapCreator {

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		Addition add = new Addition();
		Substraction sub = new Substraction();
		char biChar = 'o';
		
		fileName = "terrain.dat";

		RandomAccessFile datIn = new RandomAccessFile(fileName, "rw");
		
		Area[][] datArea = new Area[10][10];
		Expression val1, val2 = new Expression();
		
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

	}

	@Override
	public TerrainScanner getScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub

	}

}
