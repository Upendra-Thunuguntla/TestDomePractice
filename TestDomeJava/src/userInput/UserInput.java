package userInput;

public class UserInput {
    
    public static class TextInput {
    	
    	String value = "";
    	
    	public void add(char c) {
    		this.value = this.value+c;
    	}
    	
    	public String getValue() {
    		return this.value;
    	}
    }

    public static class NumericInput extends TextInput{
    	String value = ""; 
    			
    	public void add(char i) {
    		System.out.println((int)i);
    		if (i <=57 && i>=48) {
    			value = value+i;
    		}
    	}
    	
    	public String getValue() {
    		return this.value;
    	}
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}