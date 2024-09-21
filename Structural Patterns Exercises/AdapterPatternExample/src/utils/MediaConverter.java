package utils;

public class MediaConverter {

    public static String convert(String fileName, String fromFormat, String toFormat) {
        if (fromFormat.equalsIgnoreCase("avi")) {
            System.out.println("Converting " + fromFormat + " file to " + toFormat + "...");
            String newFileName = fileName.replace(".avi", ".mp4");
            System.out.println("Conversion successful. New file: " + newFileName);
            return newFileName;
        }
        return null;
    }
}
