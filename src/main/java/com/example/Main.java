package com.example;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        Libro libro2 = new Libro("Harry Potter", "J.K. Rowling");
        libro2.mostrarDetalles();

        Libro libro3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        libro3.mostrarDetalles();

        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
        cuenta.depositar(200);
        System.out.println(cuenta.getSaldo()); // Debería ser 700
        cuenta.retirar(1000); // Debería mostrar error de fondos insuficientes
        
        
        Estudiante estudiante = new Estudiante("Pedro", 21, 2.5);
        estudiante.mostrarInfo(); // Debería indicar REPROBADO
    }
}