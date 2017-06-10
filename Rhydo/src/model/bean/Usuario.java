
package model.bean;

public class Usuario extends Cadastro{
    private String login;
    private String senha;
    private int tipo;
    private int score;
    private int totalSub;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTotalSub() {
        return totalSub;
    }

    public void setTotalSub(int totalSub) {
        this.totalSub = totalSub;
    }
    
    
}
