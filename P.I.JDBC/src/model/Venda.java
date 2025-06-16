package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Venda {

    int id;
    private String produtos;
    private String descricao;
    private String data;
    private double valorTotal;
    private double desconto;
    private String formaPagamento;

    public Venda() {
    }

    public Venda(String descricao, String data, double valorTotal, double desconto) {
        this.descricao = descricao;
        this.data = data;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getProdutos() {
        return produtos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public static boolean validarProdutos(String p) {
        if (p.matches(".*[1-5].*")) {
            return true;
        } else if (p.isEmpty() || p.isBlank()) {
            System.out.print("Campo vazio! Digite algo ==> ");
        } else {
            System.out.print("Valor Inválido! Tente novamente um valor válido ==> ");
        }
        return false;
    }

    public static boolean validarData(String d) {
        if (d.matches("[0-9]{2}[-||/][0-9]{2}[-||/][0-9]{2}") & !d.isEmpty() & !d.isBlank()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "ADSFASDFDSAf");
        }
        return false;
    }

    public static boolean validarPreco(String p) {
        if (p.matches(".*[^0-9.,].*")) {
            JOptionPane.showMessageDialog(null, "Valor inválido no preço! Favor verifique o preço digitado!");
            return false;
        } else {
            return true;
        }
    }

    public static boolean validarDesconto(String d) {
        if (d.matches(".*[^0-9.,].*")) {
            JOptionPane.showMessageDialog(null, "Valor inválido no desconto! Favor verifique o preço digitado!");
            return false;
        } else {
            return true;
        }
    }
}
