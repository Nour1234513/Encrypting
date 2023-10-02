

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
    }

}


// Here is some test for the lab, i couldnt run the Junit test in Visual Studio Code
// class EncryptionEngineTest {
	
	
// 	@Test
// 	void testEncrypt() {
// 		Controller controller = null;
// 		EncryptionEngine e = new EncryptionEngine(controller);
//         e.setEncryptionKey(3);

// 		assertEquals(e.encrypt("ABC"), "DEF");
// 		assertEquals(e.encrypt("XYZ"), "ABC");
// 		assertEquals(e.encrypt("InbyggdaSystem"), "LqebjjgdVbvwhp");

//         e.setEncryptionKey(3);
// 		assertEquals(e.encrypt("Hello"), "Dahhk");
// 	}

// 	void testDecrypt() {
// 		Controller controller = null;
// 		EncryptionEngine e = new EncryptionEngine(controller);
//         e.setEncryptionKey(3);
	
// 		assertEquals(e.decrypt("DEF"), "ABC");
// 		assertEquals(e.decrypt("ABC"), "XYZ");
//      assertEquals(e.decrypt("LqebjjgdVbvwhp"), "InbyggdaSystem");	

//         e.setEncryptionKey(22);
// 		assertEquals(e.decrypt("Dahhk"), "Hello");
// 	}

// }