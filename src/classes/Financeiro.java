package classes;

import java.math.BigDecimal;

/**
 *
 * @author bello
 */
public class Financeiro {

    private int idFinanceiro;
    private BigDecimal clienteTotal;
    private BigDecimal clienteSinal;
    private BigDecimal gastoEmpresa;
    private BigDecimal pagamentoFuncionarios;
    private BigDecimal lucroTotal;
    private Cliente cliente;
    
   

    public Financeiro() {
    }


    public int getIdFinanceiro() {
        return idFinanceiro;
    }

    public void setIdFinanceiro(int idFinanceiro) {
        this.idFinanceiro = idFinanceiro;
    }

    public BigDecimal getClienteTotal() {
        return clienteTotal;
    }

    public void setClienteTotal(BigDecimal clienteTotal) {
        this.clienteTotal = clienteTotal;
    }

    public BigDecimal getClienteSinal() {
        return clienteSinal;
    }

    public void setClienteSinal(BigDecimal clienteSinal) {
        this.clienteSinal = clienteSinal;
    }

    public BigDecimal getGastoEmpresa() {
        return gastoEmpresa;
    }

    public void setGastoEmpresa(BigDecimal gastoEmpresa) {
        this.gastoEmpresa = gastoEmpresa;
    }

    public BigDecimal getPagamentoFuncionarios() {
        return pagamentoFuncionarios;
    }

    public void setPagamentoFuncionarios(BigDecimal pagamentoFuncionarios) {
        this.pagamentoFuncionarios = pagamentoFuncionarios;
    }

    public BigDecimal getLucroTotal() {
        return lucroTotal;
    }

    public void setLucroTotal(BigDecimal lucroTotal) {
        this.lucroTotal = lucroTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

   

}
