public class CalcularFerias {
    private Double salario;
    private String tipo;
    private Double ferias;

    public CalcularFerias ( Double salario , String tipo , Double ferias ) {
        this.salario = salario;
        this.tipo = tipo;
        this.ferias = ferias;
    }

    public CalcularFerias ( ) {

    }

    public Double calcularFerias ( ) {
        if ( tipo.equals("CLT") ) {
            return (salario + (salario / 3))- (salario * 0.08);
        } else if ( tipo.equals("PJ") ) {
            return salario * 0.10;
        } else if ( tipo.equals("Estagiario") ) {
            return (salario * 15) / 30;
        } else {
            return (salario / 2 );
        }
    }

}
