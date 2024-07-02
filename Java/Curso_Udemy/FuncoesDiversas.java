public class FuncoesDiversas {
    public static void main(String[] args) {

        String  original = "12 abcde FGHI jklm NOPQ rstu VWXYZ 12";

        String LOWER     = original.toLowerCase();
        String UPPER     = original.toUpperCase();
        String TRIM      = original.trim();
        String SUBSTRING1= original.substring(2);
        String SUBSTRING2= original.substring(2, 11);
        String REPLACE1  = original.replace('a','1');
        String REPLACE2  = original.replace("abcd","1235");
        int INDEXOF      = original.indexOf("12");
        int LASTINDEXOF  = original.lastIndexOf("12");
        String LISTA = "UVA MAÇÃ BANANA ABACAXI LARANJA MELANCIA";
        String[] CORTAR = LISTA.split(" ");
        String FRUTA0 = CORTAR[0];
        String FRUTA1 = CORTAR[1];
        String FRUTA2 = CORTAR[2];
        String FRUTA3 = CORTAR[3];
        String FRUTA4 = CORTAR[4];
        String FRUTA5 = CORTAR[5];

        System.out.println("Orginal:       " + original);
        System.out.println("toLowerCase:   " + LOWER);
        System.out.println("toUpperCase:   " + UPPER);
        System.out.println("trim:          " + TRIM + " *Elimina espaços em branco da STRING");
        System.out.println("substring 1:   " + SUBSTRING1 + "   *Corta a String a partir do NÚMERO");
        System.out.println("substring 2:   " + SUBSTRING2 + "                             *Corta a String a partir do NÚMERO Até outro NUMERO");
        System.out.println("replace 1:     " + REPLACE1 + " *Substitui um caracter por outro.");
        System.out.println("replace 2:     " + REPLACE2 + " *Substitui uma cadeia de caracter por outra.");
        System.out.println("index of:      " + INDEXOF + "                                     *Mostra a primeira posição do caracter buscado");
        System.out.println("last index of: " + LASTINDEXOF + "                                    *Mostra a ultima posição do caracter buscado");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("LISTA DE COMPRAR COM VETORES");
        System.out.println("STRING Lista Original: " + LISTA);
        System.out.println("Valores da Lista Cortada: " + FRUTA0);
        System.out.println("Valores da Lista Cortada: " + FRUTA4);
        System.out.println("Valores da Lista Cortada: " + FRUTA1);
        System.out.println("Valores da Lista Cortada: " + FRUTA5);
        System.out.println("Valores da Lista Cortada: " + FRUTA3);
        System.out.println("Valores da Lista Cortada: " + FRUTA2);
    }
}
