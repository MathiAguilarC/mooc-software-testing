package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        // Modifica el desplazamiento para evitar números mayores que 26
        shift = shift % 26;

        for (int i = 0; i < length; i++) {
            currentChar = message.charAt(i);

            // Verifica si el carácter es válido
            if (currentChar < 'a' || currentChar > 'z') {
                return "invalid";
            }

            // Aplica el desplazamiento, teniendo en cuenta el rango de letras
            currentChar = (char) (currentChar + shift);

            // Ajusta si el carácter se sale del rango
            if (currentChar > 'z') {
                currentChar = (char) (currentChar - 26);
            } else if (currentChar < 'a') {
                currentChar = (char) (currentChar + 26);
            }

            // Agrega el carácter cifrado al StringBuilder
            sb.append(currentChar);
        }

        return sb.toString();
    }
}
