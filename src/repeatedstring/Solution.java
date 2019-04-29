package repeatedstring;

/**
 *
 * @author sergio
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "ababababaabbba";
        long n = 10;
        //String s = "afcfffaged";
        //long n = 962645758455; // res = 192529151691
        
        System.out.println(repeatedString(s, n));
    }

    static long repeatedString(String s, long n) {
        long res = 0;
        int residuo = 0; // numero de veces que hacerce pequeño s para determinar 
        // cuantas posiciones debe tomar de s en caso de que no sea divisible s en n
        int ass = 0;//cantidad de 'a' en string s
        
            // cuanta ocurrencias de 'a' en string s
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    ass++;
                    //System.out.println("cuenta");
                }
            }

            if (n % s.length() == 0) {
                return ass * (n / s.length());
                //System.out.println("if "+ass+" "+s.length()+" "+n);
            } else {
                
                int div = (int) (n % s.length());
                //System.out.println("zxc: "+s.length()+" "+size_s);
                for (int i = 0; i < div; i++) {
                    if (s.charAt(i) == 'a') {
                        residuo++; // cuentas las apariciones de 'a' en la subcadena contando de 0 al residuo
                    }
                }

                return ass * (n / s.length())+residuo;
            }
    }

}
