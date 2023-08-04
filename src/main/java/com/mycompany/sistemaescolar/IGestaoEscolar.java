/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemaescolar;

/**
 *
 * @author die-g
 */
public interface IGestaoEscolar {
    
    public void matricularAluno(String nome, String cpf, String ano, String turma);
    public void expulsarAluno(String matricula);
    public void cadastrarProfessor(String nome, String cpf);
}
