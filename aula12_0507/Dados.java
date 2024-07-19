/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula12_0507;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 22200545
 */
public class Dados {
    private String nome;
    private String email;
    
    public static List<Dados> Lista = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
           
}
