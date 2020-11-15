package files;

import java.io.*;


public class PasswordValidationApp {


    public static void main(String[] args) {
        //This will read a text file and will retrieve a phone number

        String filename = "//Users//vivianacano//Documents//JavaTraining//PasswordValidation.txt";
        File file = new File(filename);
        String[] passwords = new String[13];

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < passwords.length; i++) {
                passwords[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        } catch (IOException e) {
            System.out.println("ERROR: Couldn't read file");
        }

        /*Valid passwords:
        1. A number
        2. A letter
        3. Special character (! @ #)*/

        int n = 0;
        for (n = 0; n < passwords.length; n++) {
            try {

                if (!passwords[n].matches(.*[0-9].*)) {
                    throw new NumberException(passwords[n]);
                }
                if (!passwords[n].matches(".*[a-zA-Z].*")) {
                    throw new LetterException(passwords[n]);
                }
                if (!passwords[n].matches(".*[!@#].*")) {
                    throw new CharacterException(passwords[n]);
                }

                System.out.println(passwords[n]);
            } catch (NumberException e) {
                System.out.println(e.toString());
            } catch (CharacterException e) {
                System.out.println(e.toString());
            } catch (LetterException e) {
                System.out.println(e.toString());
            }
        }
    }
}

class NumberException extends Exception {
    String num;
    NumberException(String num) {
        this.num = num;
    }
    public String toString() {
        return "Pass " + num +" ERROR: NumberException ";
    }
}

class CharacterException extends Exception {
    String num;
    CharacterException(String num) {
        this.num = num;
    }
    public String toString() {
        return "Pass " + num+" ERROR: CharacterSpecialException (! @ #) ";
    }
}

class LetterException extends Exception {
    String num;
    LetterException(String num) {
        this.num = num;
    }
    public String toString() {
        return "Pass " + num+" ERROR: LetterException ";
    }
}


