class CaesarCipher { 

    public static StringBuffer encrypt(String text1, int shift) { 
        StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i < text1.length(); i++) { 
            if (Character.isUpperCase(text1.charAt(i))) { 
                char ch = (char)(((int)text1.charAt(i) + shift - 65) % 26 + 65); 
                result.append(ch); 
            } 
            else { 
                char ch = (char)(((int)text1.charAt(i) + shift - 97) % 26 + 97); 
                result.append(ch); 
            } 
        } 
        return result; 
    }
  
    public static void main(String[] args) { 
        String text1 = "SWANSEA";
		String text2 = "ABERTAWE";
        int shift = 4;
		
        System.out.println("Text  : " + text1); 
        System.out.println("Encryption Shift : " + shift); 
        System.out.println("Encryption Cipher converted to: " + encrypt(text1, shift));
		System.out.println(" ");
		System.out.println("Text  : " + text2);
		System.out.println("Decryption Shift: " + shift);
		
		//This line uses Decryption specified by the type [Cipher(n) = De-cipher(26-n)]
		System.out.println("Decryption Cipher converted to: " + encrypt(text2, (26-shift)));
    }
}