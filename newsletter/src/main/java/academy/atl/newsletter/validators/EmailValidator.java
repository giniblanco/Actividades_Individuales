package academy.atl.newsletter.validators;

public class EmailValidator {

    public boolean esValido(String email){
        //Chequear que el email sea valido
        if(!email.contains("@")){
            return false;
        }
        if(!email.contains(".")){
            return false;
        }
        if (email.endsWith("@")) {
            return false;
        }
        String[] parts = email.split("@");
        if(parts.length > 2){
            return false;
        }

        if(email.contains(" ")){
            return false;
        }

        if(email.length() > 255){
            return false;
        }

        //comienzo verificacion punto despues de arroba
        // obtener índices de los puntos                gin.gin.cre.i.s@sage.com
        int length = email.length();
        int[] p = new int[length];
        int puntoIndex = 0;
        for(int i = 0; i < length; i++) {
            if (email.charAt(i) == '.') {
                p[puntoIndex] = i;
                puntoIndex++;
            }
        }

        // ubicación del ultimo punto
        int ubicacionUltimoPunto = 0;
        for (int i = p.length - 1; i >= 0; i--) {
            // si es cero, entonces devolveme el valor del casillero anterior
            if (p[i] != 0) {
                ubicacionUltimoPunto = p[i];
                break;
            }
        }

        // ubicación del arroba
        int ubicacionArroba = 0;
        for(int i = 0; i < length; i++) {
            if (email.charAt(i) == '@') {
                ubicacionArroba = i;
            }
        }

        // comparacion de ubicaciones
        if(ubicacionArroba > ubicacionUltimoPunto) {
            return false;
        }
        //fin comprobación punto despues de arroba

        // comprobacion de caracteres especiales

        for(char c : email.toCharArray()) {
            if(!Character.isLetterOrDigit(c) && c != '.' && c != '@' && c != '-' && c != '_') {
                return false;
            }
        }

        return true;
    }
}
