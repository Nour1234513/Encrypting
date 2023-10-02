

public class EncryptionEngine {

   int encryptionkey;
   Controller controller;
   public  EncryptionEngine (Controller _controller){
    }

   public void setEncryptionkey(int encryptionkey) {
       this.encryptionkey = encryptionkey%26;
   }
   public int getEncryptionkey() {
     return encryptionkey; 
   }

public boolean checkForLetters (String textinput){
    for(int x=0;x<textinput.length();x++){
        if(Character.isLetter (textinput.charAt(x)))
        continue;
        else return false;
    }
    return true;
}
// public boolean checkNummbers (String inputKey){
//     for(int x=0;x<inputKey.length();x++){
//         if((inputKey.charAt(x)).isNumeric)
//         continue;
//         else return false;

//     }
//     return true;
// }

   public String encrypt(String inputText) {
    String output = "";
    for (int x = 0; x < inputText.length(); x++) {
        char w = inputText.charAt(x);
        int xi =w;
        if (w >= 'a' && w <= 'z') {
            output += (char) ((((xi - 'a') + encryptionkey) % 26) + 'a');
        }
        else if (w >= 'A' && w <= 'Z') {
            // char myChar = (char) ((((xi - 'A') + encryptionkey) % 26) + 'A');

            // output += myChar;'
        output += (char) ((((xi - 'A') + encryptionkey) % 26) + 'A');
        }
        else {
            
            output += w;
        }
    }

    return output;
}


  

   public String decrypt(String inputText){   
    String output = "";
    for (int x = 0; x < inputText.length(); x++) {
        char w = inputText.charAt(x);
        int xi =w;

        if (w >= 'a' && w <= 'z') {
            output += (char) ((xi - 'a' - getEncryptionkey() + 26)  % 26 + 'a');
        }

        else if (w >= 'A' && w <= 'Z') {
        output += (char)  ((xi - 'A' - getEncryptionkey() + 26)  % 26 + 'A');
        }

        else {
            output += w;
        }
    }
    return output;
   }
}
