package lab3;

import java.util.*;


/**
 * 3.	Дана строка. Разделить строку на фрагменты по три подряд идущих символа.
 * В каждом фрагменте средний символ заменить на случайный символ,
 * не совпадающий ни с одним из символов этого фрагмента.
 *Вывести в консоль фрагменты, упорядоченные по алфавиту.
  * <p>
 * @author Nik Rusanov
 */
public class StringFragmentsReplaces {

    List<String> parts =  new ArrayList<>();
    private final int separatorSize;

    public StringFragmentsReplaces(String str, int separateBy) {
        if(str.isEmpty()|| separateBy >= str.length() || separateBy <= 0 ) {
            throw new IllegalArgumentException("empty String or small separator");
        }
        separatorSize = separateBy;
        getParts(str);
    }

    private  void getParts(String str) {
        int len = str.length();
        for (int i = 0; i < len; i += separatorSize)
        {
            parts.add(str.substring(i, Math.min(len, i + separatorSize)));
        }
    }

    public List<String> separate() {

        char[] chars;
        for (int i = 0 ; i <  parts.size(); ++i) {
             chars = parts.get(i).toCharArray();

//             for (char ch : chars) {
//                 System.out.println(ch);
//             }
             replace(chars);
             parts.set(i,String.valueOf(chars));
        }
        Collections.sort(parts);
        return  parts;

    }

    private void replace(char[] chars) {
            if (chars.length  < separatorSize) return;
            do  {
                chars[1] =  getRandomChar();
            } while (chars[0] == chars[1] || chars[1] == chars[2]);
        }


    private char getRandomChar() {
        Random random = new Random();
        int codePoint;
        while (!Character.isAlphabetic(codePoint = random.nextInt(97) + 25)) ;
        return (char) codePoint;
    }


}



