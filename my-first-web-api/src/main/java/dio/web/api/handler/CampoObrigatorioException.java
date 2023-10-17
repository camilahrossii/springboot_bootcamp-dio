package dio.web.api.handler;

public class CampoObrigatorioException extends BusinessException{
    public CampoObrigatorioException(String campo) {
        super("O campo $d é obrigatório.", campo);
    }
    
}
