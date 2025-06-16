package model;

import javax.swing.JOptionPane;

public class OrdemServico {

    private int id;
    private String nomeCliente;
    private String telefone;
    private String servico;
    private double preco;
    private String dataRecepcao;
    private String dataRetirada;
    private String formaPagamento;
    private String jaPago;
    private String status = "Em serviço";

    public OrdemServico() {
    }

    public OrdemServico(int id, String nomeCliente, String telefone, String servico, double preco, String dataRecepcao, String formaPagamento, String jaPago) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
        this.servico = servico;
        this.preco = preco;
        this.dataRecepcao = dataRecepcao;
        this.formaPagamento = formaPagamento;
        this.jaPago = jaPago;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataRecepcao() {
        return dataRecepcao;
    }

    public void setDataRecepcao(String dataRecepcao) {
        this.dataRecepcao = dataRecepcao;
    }

    public String getJaPago() {
        return jaPago;
    }

    public void setJaPago(String jaPago) {
        this.jaPago = jaPago;
    }

    public static boolean validarPreco(String p) {
        if (p.matches(".*[^0-9.,].*")) {
            JOptionPane.showMessageDialog(null, "Valor inválido no preço! Favor verifique o preço digitado!");
            return false;
        } else {
            return true;
        }
    }

}
