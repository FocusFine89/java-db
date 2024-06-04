package NikitaIvanov.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id) {
        super("Non è stato trovato nessun elemento con ID: " + id);
    }
}
