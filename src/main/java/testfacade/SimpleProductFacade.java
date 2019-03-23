package testfacade;

public class SimpleProductFacade {
    DifficultProduct difficultProduct;
    SimpleProductFacade() {
        this.difficultProduct = new DifficultProduct();
    }

    public void setName(String name) {
        char[] nameChar = name.toCharArray();
        if(nameChar.length > 0) {
            difficultProduct.setFirstCharacter(nameChar[0]);
        }
        if(nameChar.length > 1) {
            difficultProduct.setSecondCharacter(nameChar[1]);
        }
        if(nameChar.length > 2) {
            difficultProduct.setThirdCharacter(nameChar[2]);
        }
        if(nameChar.length > 3) {
            difficultProduct.setFourthCharacter(nameChar[3]);
        }
        if(nameChar.length > 4) {
            difficultProduct.setFifthCharacter(nameChar[4]);
        }
        if(nameChar.length > 5) {
            difficultProduct.setSixthCharacter(nameChar[5]);
        }
        if(nameChar.length > 6) {
            difficultProduct.setSeventhCharacter(nameChar[6]);
        }
    }

    public String getName() {
        return difficultProduct.getName();
    }

}
