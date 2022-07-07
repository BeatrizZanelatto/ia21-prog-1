/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibia;

/**
 *
 * @author Alunos
 */
public class Veiculos {
 private int passageiros;
 private int combustivel;
 private int consumo;

 public Veiculos(int pass, int comb, int cons){
 this.passageiros = pass;
 this.combustivel = comb;
 this.consumo = cons;
 }

 public int calcular_consumo(){
 return (this.combustivel*this.consumo);
 }

 public int get_passageiros(){
 return this.passageiros;
 }
}
