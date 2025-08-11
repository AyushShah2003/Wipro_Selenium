package LabSessions_01_08;

import java.io.File;

public class listfilesDirectories {

	public static void main(String[] args) {
		String directoryPath = "E:\\Study\\Wipro\\Java\\WiproBatch2\\src";
        File dir = new File(directoryPath);

        if (dir.exists() && dir.isDirectory()) {
            String[] filesList = dir.list();
            if (filesList != null && filesList.length > 0) {
                System.out.println("Files and directories in: " + directoryPath);
                for (String name : filesList) {
                    System.out.println(name);
                }
            } else {
                System.out.println("Directory is empty.");
            }
        } else {
            System.out.println("The provided path is not a valid directory.");
        }
	}

}