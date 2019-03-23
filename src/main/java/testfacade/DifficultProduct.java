package testfacade;

public class DifficultProduct {
    char nameChars[] = new char[7];

    DifficultProduct() {

    }

    public void setFirstCharacter(char c) {
        this.nameChars[0] = c;
    }

    public void setSecondCharacter(char c) {
        this.nameChars[1] = c;
    }
    public void setThirdCharacter(char c) {
        this.nameChars[2] = c;
    }
    public void setFourthCharacter(char c) {
        this.nameChars[3] = c;
    }
    public void setFifthCharacter(char c) {
        this.nameChars[4] = c;
    }
    public void setSixthCharacter(char c) {
        this.nameChars[5] = c;
    }
    public void setSeventhCharacter(char c) {
        this.nameChars[6] = c;
    }

    public String getName() {
        return new String(nameChars);
    }
}
