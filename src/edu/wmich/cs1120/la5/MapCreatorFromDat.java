package edu.wmich.cs1120.la5;

import java.io.*;
import java.io.IOException;
import edu.wmich.cs1120.la5.TerrainScanner; 

public class MapCreatorFromDat implements IMapCreator {

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		
		fileName = "terrain.dat";

		FileInputStream datInputStream = new FileInputStream(fileName);
		DataInputStream inputFile = new DataInputStream(datInputStream);
		
		//inputFile.read();
		
		Area[][] datArea = new Area[10][10];
		
		for(int row = 0; row<10; row++){
			for(int col = 0; col<10; col++){
				datArea[row][col].setElevation(inputFile.readInt());
				datArea[row][col].setBasicEnergyCost(inputFile.readDouble());
				datArea[row[col].setRadiation(inputFile.readDouble());
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
