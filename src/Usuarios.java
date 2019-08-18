
public class Usuarios {

    private String nome, senha, permissao;

    public Usuarios() {
    }

    public Usuarios(String nome, String senha, String permissao) {
        this.nome = nome;
        this.senha = senha;
        this.permissao = permissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

}
