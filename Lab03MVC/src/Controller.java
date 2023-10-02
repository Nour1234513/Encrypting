

// This is a dummy Controller, so the View compiles
public class Controller {
    View veiw;
    EncryptionEngine encryptionEngine;
    Controller( ){
        this.veiw= new View(this);
        this.encryptionEngine= new EncryptionEngine(this);
    }
    public static void main(String[] args) {
    Controller controller = new Controller();
    }
    
    void encryptionButtonClicked(){
<<<<<<< HEAD
        try {
        this.encryptionEngine.setEncryptionkey(Integer.parseInt( this.veiw.getEncryptionKey()));
        this.veiw.setOutputText(this.encryptionEngine.encrypt(this.veiw.getInputText()));
        } catch (NumberFormatException e){
            this.veiw.setOutputText("Wrong data type in Key!");
        }
        if (this.encryptionEngine.checkForLetters(this.veiw.getInputText()) == false) {
	        this.veiw.setOutputText("Wrong data type in  text!");
	    }
    }

    void decryptionButtonClicked(){
        try {
        this.encryptionEngine.setEncryptionkey(Integer.parseInt( this.veiw.getEncryptionKey()));
        this.veiw.setOutputText(this.encryptionEngine.decrypt(this.veiw.getInputText()));
        } catch (NumberFormatException e){
            this.veiw.setOutputText("Wrong data type in Key!");
        }
        if (this.encryptionEngine.checkForLetters(this.veiw.getInputText()) == false) {
	        this.veiw.setOutputText("Wrong data type in text!");
	    }
=======
        this.encryptionEngine.setEncryptionkey(Integer.parseInt( this.veiw.getEncryptionKey()));
        this.veiw.setOutputText(this.encryptionEngine.encrypt(this.veiw.getInputText()));
    }

    void decryptionButtonClicked(){
    this.encryptionEngine.setEncryptionkey(Integer.parseInt( this.veiw.getEncryptionKey()));
    this.veiw.setOutputText(this.encryptionEngine.decrypt(this.veiw.getInputText()));
>>>>>>> e481176478bcff3f97607e58af14171d09ecc89f
    }
}





