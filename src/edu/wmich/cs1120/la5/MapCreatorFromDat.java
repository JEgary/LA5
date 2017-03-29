package edu.wmich.cs1120.la5;

import java.io.*;
import java.io.IOException;

public class MapCreatorFromDat implements IMapCreator {

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		fileName= "Terrain.dat";

		FileInputStream datInputStream = new FileInputStream(fileName);
		DataInputStream inputFile = new DataInputStream(datInputStream);
		
		//inputFile.read

		

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
