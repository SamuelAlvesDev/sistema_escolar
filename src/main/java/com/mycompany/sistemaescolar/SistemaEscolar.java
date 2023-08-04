/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemaescolar;

import com.mycompany.sistemaescolar.bancodedados.Alunos;

/**
 *
 * @author die-g
 */
public class SistemaEscolar {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Escola escola = new Escola();
        
        escola.cadastrarProfessor("professor", "700666");
        escola.matricularAluno("abigail", "66666","1", "B");
        
        escola.professor.lancarNota(escola.alunos.buscar("abigail","1", "B"), 10.0, "Matemática",1);
        escola.professor.lancarNota(escola.alunos.buscar("abigail","1", "B"), 10.0, "Matemática",2);
        escola.professor.lancarNota(escola.alunos.buscar("abigail","1", "B"), 5.0, "Matemática",3);
        escola.professor.lancarNota(escola.alunos.buscar("abigail","1", "B"), 10.0, "Matemática",4);
        
        escola.professor.lancarFalta(escola.alunos.buscar("abigail","1", "B"), "Português", 1);
        
        
        for(Disciplina i : escola.alunos.buscar("abigail","1", "B").getDisciplinasCursando()){
            System.out.println(i.getNome());
            System.out.println(i.getNota1());
            System.out.println(i.getNota2());
            System.out.println(i.getNota3());
            System.out.println(i.getNota4());
            System.out.println("Faltas: " + i.getFalta());
        }
        
        
        
        for(Aluno i : escola.alunos.buscarPorTurma("1", "B")){
            
            System.out.println(i.getNome() );
            System.out.println(i.getMatricula());
            System.out.println(i.getAno() + "-" + i.getTurma());
            System.out.println(i.statusAlunoDisciplina("Matemática"));
            System.out.println(i.statusAlunoDisciplina("Português"));
        }
            
    }

    
    
    
    
}
