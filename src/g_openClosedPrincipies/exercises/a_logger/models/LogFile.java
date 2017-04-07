package g_openClosedPrincipies.exercises.a_logger.models;

import g_openClosedPrincipies.exercises.a_logger.interfaces.File;

public class LogFile implements File {

    private int size;

    public LogFile() {
        this.setSize(0);
    }

    @Override
    public void write(String message) {
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new java.io.File("../")))) {
//            bufferedWriter.write(message);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        this.increaseSize(message);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    private void increaseSize(String message) {
        int currentSize = 0;
        for (char symbol : message.toCharArray()) {
            if (Character.isAlphabetic(symbol)) {
                currentSize += symbol;
            }
        }
        this.setSize(this.getSize() + currentSize);
    }
}
