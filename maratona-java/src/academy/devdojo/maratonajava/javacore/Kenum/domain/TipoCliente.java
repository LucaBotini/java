package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoCliente {
    NATURAL_PERSON(1, "Natural Person"),
    LEGAL_ENTITY(2,"Legal Entity");

    private int value;
    private String nameReport;
    TipoCliente(int valor, String nameReport) {
        this.value = valor;
        this.nameReport = nameReport;
    }

    public String getNameReport() {
        return nameReport;
    }

    public static TipoCliente typeCustomerByReport(String nameReport){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNameReport().equals(nameReport)){
                return tipoCliente;
            }
        }
        return null;
    };

}
