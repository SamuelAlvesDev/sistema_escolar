/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaescolar;

import com.mycompany.sistemaescolar.bancodedados.Disciplinas;
import java.util.ArrayList;

/**
 *
 * @author die-g
 */
public class Professor extends Pessoa {

    
    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }

    
   
    public void lancarNota(Aluno aluno,double nota, String nomeDisciplina,int unidade){
       
        switch (unidade) {
            case 1:
                aluno.disciplinasCursando.addNota1(nomeDisciplina, nota);
                break;
            case 2:
                aluno.disciplinasCursando.addNota2(nomeDisciplina, nota);
                break;
            case 3:
                aluno.disciplinasCursando.addNota3(nomeDisciplina, nota);
                break;
            case 4:
                aluno.disciplinasCursando.addNota4(nomeDisciplina, nota);
                break;
            default:
                break;
        }
       
    
    }
    
    public void lancarFalta(Aluno aluno,String nomeDisciplina, int falta){
        aluno.disciplinasCursando.addFalta(nomeDisciplina, falta);
    }
    
}
