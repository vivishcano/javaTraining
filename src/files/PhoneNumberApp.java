package files;

import java.io.*;


public class PhoneNumberApp {

    public static void main (String [] args){
        //This will read a text file and will retrieve a phone number

        String filename = "//Users//vivianacano//Documents//JavaTraining//PhoneNumber.txt";
        File file= new File(filename);
        String[] phoneNumbers= new String[9];

        try {
            BufferedReader br= new BufferedReader( new FileReader(file));
            for (int i=0; i< phoneNumbers.length;i++) {
                phoneNumbers[i] = br.readLine();

            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        } catch (IOException e) {
        System.out.println("ERROR: Couldn't read file");
        }

        //Valid phone number:
        //10 digits
        //Area code cannot start in 0 or 9
        //There can be 911 in the phone
        for (int i=0; i< phoneNumbers.length;i++) {
            try {
                if (phoneNumbers[i].length() != 10) {
                    throw new TenDigitException(phoneNumbers[i]);
                }
                if (phoneNumbers[i].substring(0, 1).equals("0") || phoneNumbers[i].substring(0, 1).equals("9")) {
                    throw new AreaCodeException(phoneNumbers[i]);
                }
                for (int n = 0; n < phoneNumbers[i].length() - 2; n++) {
                    if (phoneNumbers[i].substring(n, (n + 1)).equals("9")) {
                        if (phoneNumbers[i].substring((n + 1), (n + 3)).equals("11")) {
                            throw new EmergencyException(phoneNumbers[i]);
                        }
                    }
                }
                System.out.println(phoneNumbers[i]);
            } catch (TenDigitException e) {
                System.out.println(e.toString());
            } catch (AreaCodeException e) {
                System.out.println(e.toString());
            } catch (EmergencyException e) {
                System.out.println(e.toString());
            }
        }
    }
}

class TenDigitException extends Exception{
    String num;
    TenDigitException(String num){
      this.num=num;
    }
    public String toString() {
        return "Error: TenDigitException " +
                "num='" + num + '\'';
    }
}
class AreaCodeException extends Exception{
    String num;
    AreaCodeException(String num){
        this.num=num;
    }
    public String toString() {
        return "Error: AreaCodeException " +
                "num='" + num + '\'';
    }
}
class EmergencyException extends Exception{
    String num;
    EmergencyException(String num){
        this.num=num;
    }
    public String toString() {
        return "Error: EmergencyException " +
                "num='" + num + '\'';
    }
}


