package br.com.lp3.apifornecedor.dto;

public class FornecedorDTO {

    private Long id;

    private String nome;

    private String razaosocial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaosocial;
    }

    public void setRazaoSocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public FornecedorDTO(Long id, String nome, String razaosocial) {
        super();
        this.id = id;
        this.nome = nome;
        this.razaosocial = razaosocial;
    }

    public FornecedorDTO() {
        super();
    }



}

