import java.io.File;

public class ShowDirectories {

    public static void main(String[] args) {
        File root = new File("C:\\"); // Change this to your root directory if different
        showDirectories(root, 0);
    }

    public static void showDirectories(File dir, int level) {
        if (dir.isDirectory()) {
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
            System.out.println("|-- " + dir.getName());
            File[] subDirs = dir.listFiles(File::isDirectory);
            if (subDirs != null) {
                for (File subDir : subDirs) {
                    showDirectories(subDir, level + 1);
                }
            }
        }
    }
}
