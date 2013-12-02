package model;

public class ContaCorrente implements Conta {

    private double credito;
    private double saldo;
    private int codigo;
    
    public ContaCorrente(double saldo, int codigo, double credito) {
        this.credito = credito;
        this.saldo = saldo;
    }

    @Override
    public void saca(double valor) {
        if (valor <= (saldo + credito)) {
            saldo = -valor + saldo;

        }
    }

    @Override
    public void atualiza(double taxaSelic) {
        saldo = saldo + saldo * taxaSelic * 2;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
