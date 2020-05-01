package dominio;

public class DesligadoException extends Exception {

    /**
     * SERIALIZANDO O APONTAMENTO AO OBJETO FORA DA MEMORIA
     */
    private static final long serialVersionUID = 1L;

    /**
     * ALOCA UMA INSTANCIA DO TIPO DesligadoException COM UMA MENSAGEM ESPECIFICA
     * @param {String} msg
     */
    DesligadoException(String msg) {
        super(msg);
    }

}