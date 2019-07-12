package modelo;

abstract class Pessoa implements PessoaInterface {

    protected String nome;
    protected String endereco;
    protected String bairro;
    protected String cpf;

    @Override
    public String enderecoCompleto() {
        String enderecoCompleto = endereco + " " + bairro;
        return enderecoCompleto;
    }

    @Override
    public String cpfFormatado() {
        char[] arrayCpf = this.cpf.toCharArray();
        String cpfFormatado = "";
        
        for(int i = 0; i < arrayCpf.length; i++) {
            cpfFormatado = cpfFormatado + arrayCpf[i];
            
            if (i == 2 | i == 5) {
                cpfFormatado = cpfFormatado+".";
            }
            
            if (i == 8) {
                cpfFormatado = cpfFormatado+"-";
            }
            
        }
        
        return cpfFormatado;
    }

    @Override
    public String nomeMaiusculo() {
        String nomeMaiusculo = this.nome.toUpperCase();
        nomeMaiusculo = nomeMaiusculo.trim();
        return nomeMaiusculo;
    }

    @Override
    public String nomeMinusculo() {
        String nomeMinusculo = this.nome.toLowerCase();
        nomeMinusculo = nomeMinusculo.trim();
        return nomeMinusculo;
    }

}
