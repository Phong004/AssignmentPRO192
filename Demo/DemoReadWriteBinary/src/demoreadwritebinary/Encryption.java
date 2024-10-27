package demoreadwritebinary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {

    public static byte[] generateMD5(String fileName) throws Exception {
        return hashFile(fileName, "MD5");
    }

    public static void writeObjectToFile(String filepath, byte[] serObj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            try (ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.write(serObj);
                objectOut.close();
            }
            //System.out.println("The Object  was succesfully written to a file");
            fileOut.close();
        } catch (IOException ex) {
        }
    }

    public static byte[] readObjectFromFile(String filepath) throws IOException {
        try {
            //FileInputStream fileIn = new FileInputStream(filepath);
            //ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            File file = new File(filepath);
            byte[] checksum = Files.readAllBytes(file.toPath());//objectIn.read()dAllBytes();
            //objectIn.close();
            //fileIn.close();
            //System.out.println("The Object was succesfully reading from a file");
            return checksum;
        } catch (IOException ex) {
            throw ex;
        }
    }

    private static byte[] hashFile(String fileName, String algorithm)
            throws Exception {
        try (
                FileInputStream inputStream = new FileInputStream(fileName)) {
            MessageDigest digest = MessageDigest.getInstance(algorithm);

            byte[] bytesBuffer = new byte[1024];
            int bytesRead = -1;

            while ((bytesRead = inputStream.read(bytesBuffer)) != -1) {
                digest.update(bytesBuffer, 0, bytesRead);
            }
            inputStream.close();
            byte[] hashedBytes = digest.digest();

            return hashedBytes;
        } catch (NoSuchAlgorithmException | IOException ex) {
            throw new Exception(
                    "Could not generate hash from file", ex);
        }
    }
}
