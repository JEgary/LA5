package edu.wmich.cs1120.la5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MapCreator implements IMapCreator {
	private TerrainScanner scanner;

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		String line;
		String[] values = new String[3];

		try {
			FileReader reader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(reader);

			while ((line = buffer.readLine()) != null) {

			}

			buffer.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Invalid file");
		} catch (IOException ex) {
			System.out.println("Error reading file");
		}

	}

	@Override
	public TerrainScanner getScanner() {
		return this.scanner;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;

	}

}
