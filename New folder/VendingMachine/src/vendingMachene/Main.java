package vendingMachene;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		File[] listFiles = file.listFiles();
		for(File f : listFiles) {
			Path path = Path.of(f.getAbsolutePath());
			try {
				List<String> lines=Files.readAllLines(path);
				Recipe recipe = new Recipe(lines.get(0), Double.parseDouble(lines.get(1)));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
