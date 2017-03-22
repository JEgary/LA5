package edu.wmich.cs1120.la5;
//Edgar
import java.io.IOException;

public interface IMapCreator {
void scanTerrain(String fileName, int threshold) throws IOException;
TerrainScanner getScanner();
void setScanner(TerrainScanner scanner);
}
