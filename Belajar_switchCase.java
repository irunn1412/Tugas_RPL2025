/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar_switch.pkgcase;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Belajar_switchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int jurusan;
       
Scanner in=new Scanner(System.in);
System.out.print("pilihan:\n1.RPL\n2.TKJ\n3.Animasi\n\n Masukan pilihan:");
jurusan=in.nextInt();
switch(jurusan){
    case 1 : System.out.println("Anda memilih jurusan RPL");
        break;
    case 2 :System.out.println("Anda memilih jurusan TKJ");
        break;
    case 3 :System.out.println("Anda memilih jurusan Animasi");
        break;
        default:
            System.out.println("Pilihan tidak tersedia");
            }
        }
    
    }
