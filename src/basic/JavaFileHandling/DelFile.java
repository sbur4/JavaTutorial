package src.basic.JavaFileHandling;

import java.io.File; // Import the File class

public class DelFile {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}

/*
 * Del Folder import java.io.File;
 *
 * public class DeleteFolder { public static void main(String[] args) { File
 * myObj = new File("C:\\Users\\MyName\\Test"); if (myObj.delete()) {
 * System.out.println("Deleted the folder: " + myObj.getName()); } else {
 * System.out.println("Failed to delete the folder."); } } }
 *
 */