package br.com.classes;

import java.util.ArrayList;

public class Condominio extends PessoaJuridica{
    private ArrayList<PessoaFisica>morador;
    private String endereco;
    private ArrayList<Apartamento> apartamento;
    private ArrayList<Espaco> espaco;
    private ArrayList<Documento> documento;

    public Condominio(ArrayList<PessoaFisica> morador, String endereco, ArrayList<Apartamento> apartamento, ArrayList<Espaco> espaco, ArrayList<Documento> documento, String nome, String cnpj) {
        super(nome, cnpj);
        this.morador = morador;
        this.endereco = endereco;
        this.apartamento = apartamento;
        this.espaco = espaco;
        this.documento = documento;
    }

    public Condominio(ArrayList<PessoaFisica> morador, String nome, String cnpj) {
        super(nome, cnpj);
        this.morador = morador;
    }

   
    

    public ArrayList<PessoaFisica> getMorador() {
        return morador;
    }

    public void setMorador(ArrayList<PessoaFisica> morador) {
        this.morador = morador;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Apartamento> getApartamento() {
        return apartamento;
    }

    public void setApartamento(ArrayList<Apartamento> apartamento) {
        this.apartamento = apartamento;
    }

    public ArrayList<Espaco> getEspaco() {
        return espaco;
    }

    public void setEspaco(ArrayList<Espaco> espaco) {
        this.espaco = espaco;
    }

    public ArrayList<Documento> getDocumento() {
        return documento;
    }

    public void setDocumento(ArrayList<Documento> documento) {
        this.documento = documento;
    }
    
    public void mostrarListaMoradores(){
        for (PessoaFisica pessoaFisica : morador) {
            pessoaFisica.mostrarDadosPessoa();
        }
    }

    @Override
    public void mostrarDadosEmpresa() {
        System.out.println("nome:.."+this.getNome());
        System.out.println("cnpj:.."+this.getCnpj());
        System.out.println("endereco:.."+this.getEndereco());
    }
    
    
}
