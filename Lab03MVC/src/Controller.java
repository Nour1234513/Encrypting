

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
        this.encryptionEngine.setEncryptionkey(Integer.parseInt( this.veiw.getEncryptionKey()));
        this.veiw.setOutputText(this.encryptionEngine.encrypt(this.veiw.getInputText()));
    }

    void decryptionButtonClicked(){
    this.encryptionEngine.setEncryptionkey(Integer.parseInt( this.veiw.getEncryptionKey()));
    this.veiw.setOutputText(this.encryptionEngine.decrypt(this.veiw.getInputText()));
    }
}





