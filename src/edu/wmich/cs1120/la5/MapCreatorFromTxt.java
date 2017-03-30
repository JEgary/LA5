package edu.wmich.cs1120.la5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 * 
 * @author Edgar
 * This class is responsible for reading from a .txt file to get the basic cost, elevation, and radiation of the area.
 * It puts that information into a 2D Array which is used by the GUI to generate a path.
 *
 */

public class MapCreatorFromTxt implements IMapCreator {
	private TerrainScanner scanner;
	private IArea area;
	private IArea[][] areaArray;

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		String line;
		String[] values = new String[3];
		Double basicEnergyCost;
		Double elevation;
		Double radiation;
		areaArray = new Area[10][10];
		ArrayList<IArea> OneDim = new ArrayList<IArea>();
		int index = 0;

		try {
			FileReader reader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(reader);

			while ((line = buffer.readLine()) != null) {
				values = line.split(" ");
				basicEnergyCost = Double.parseDouble(values[0]);
				elevation = Double.parseDouble(values[1]);
				radiation = Double.parseDouble(values[2]);
				area = new Area(basicEnergyCost, elevation, radiation, threshold);

				OneDim.add(area);

			}

			buffer.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Invalid file");
		} catch (IOException ex) {
			System.out.println("Error reading file");
		}

		int ind = 0;

		for (int row = 0; row < areaArray.length; row++) {
			for (int col = 0; col < areaArray.length; col++) {
				areaArray[row][col] = OneDim.get(ind);
				ind++;
			}
		}

		scanner.setTerrain(areaArray);

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
