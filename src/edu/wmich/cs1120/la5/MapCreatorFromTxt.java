package edu.wmich.cs1120.la5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.wmich.cs1120.la3.Area;
import edu.wmich.cs1120.la3.TerrainScanner;

public class MapCreatorFromTxt implements IMapCreator {
	private TerrainScanner scanner;
	private IArea area;

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		String line;
		String[] values = new String[3];
		Double basicEnergyCost;
		Double elevation;
		Double radiation;
		
		try {
			FileReader reader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(reader);

			while ((line = buffer.readLine()) != null){
				values = line.split(" ");
				basicEnergyCost = Double.parseDouble(values[0]);
				elevation = Double.parseDouble(values[1]);
				radiation = Double.parseDouble(values[2]);
				area = new Area(basicEnergyCost, elevation, radiation, threshold);
			
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
