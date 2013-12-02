package model;

public class ContaPoupanca implements Conta {

    private double saldo;
    private int codigo;
    
    public ContaPoupanca(double saldo, int codigo) {
        this.saldo = saldo;
        this.codigo = codigo;
    }

    @Override
    public void saca(double valor) {
        if (valor <= (saldo)) {
            saldo = -valor + saldo;

        }
    }

    @Override
    public void atualiza(double taxaSelic) {
        saldo = saldo + saldo * taxaSelic * 3;
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