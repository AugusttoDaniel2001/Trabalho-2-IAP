package Modelo;

/**
 *
 * @author Arthur
 */
public class Fornece {
    private int qto_fornecida;
    private Fornecedor fornecedor;
    private Insumo insumo;

    public int getQto_fornecida() {
        return qto_fornecida;
    }

    public void setQto_fornecida(int qto_fornecida) {
        this.qto_fornecida = qto_fornecida;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
}
