import java.io.File;
 
public class ExeFileDetector {
 
    public static void detectExeFiles(String directoryPath) {
        File directory = new File(directoryPath);
 
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Detected .exe files:");
                for (File file : files) {
                    if (file.isFile() && file.getName().toLowerCase().endsWith(".exe")) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.err.println("Error listing files in the directory.");
            }
        } else {
            System.err.println("Invalid directory path.");
        }
    }
 
    public static void main(String[] args) {
        // Specify the directory you want to search for .exe files
        String directoryToSearch = "/path/to/your/directory";
 
        // Call the method to detect .exe files
        detectExeFiles(directoryToSearch);
    }
}
