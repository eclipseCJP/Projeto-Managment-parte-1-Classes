package br.com.classes;


public class Morador extends PessoaFisica{
    private Apartamento apartamento;
    private Veiculo veiculo;
    private Visitante visita;
    private Secretaria secretaria;
    private int idCondominio;
    private int idSecretaria;
    private int idVeiculo;
    private int idServico;
    private int idVisita;
    private int idAp;
    private int idEspaco;

    public Morador(Apartamento apartamento, Veiculo veiculo, Visitante visita, Secretaria secretaria, int idCondominio, int idSecretaria, int idVeiculo, int idServico, int idVisita, int idAp, int idEspaco, String nome, char sexo, String rg, String cpf) {
        super(nome, sexo, rg, cpf);
        this.apartamento = apartamento;
        this.veiculo = veiculo;
        this.visita = visita;
        this.secretaria = secretaria;
        this.idCondominio = idCondominio;
        this.idSecretaria = idSecretaria;
        this.idVeiculo = idVeiculo;
        this.idServico = idServico;
        this.idVisita = idVisita;
        this.idAp = idAp;
        this.idEspaco = idEspaco;
    }

    

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Visitante getVisita() {
        return visita;
    }

    public void setVisita(Visitante visita) {
        this.visita = visita;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public int getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(int idCondominio) {
        this.idCondominio = idCondominio;
    }

    public int getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(int idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getIdAp() {
        return idAp;
    }

    public void setIdAp(int idAp) {
        this.idAp = idAp;
    }

    public int getIdEspaco() {
        return idEspaco;
    }

    public void setIdEspaco(int idEspaco) {
        this.idEspaco = idEspaco;
    }
    
    
    
    
 
    @Override
    public void mostrarDadosPessoa() {
        
            System.out.println("Morador---------------");
            System.out.println("Nome:.."+this.getNome());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
            System.out.println("Cpf:.."+this.getCpf());
            apartamento.mostrarApartamento();
            veiculo.mostrarVeiculo();
            visita.mostrarDadosPessoa();
            secretaria.mostrarDadosPessoa();
       
    }
    
    
    
    
}
