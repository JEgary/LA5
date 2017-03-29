package edu.wmich.cs1120.la5;

import java.io.FileOutputStream;
import java.io.IOException;

public class MapCreatorFromDat implements IMapCreator {

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		FileOutputStream datInput = new FileOutputStream(fileName);
		

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
