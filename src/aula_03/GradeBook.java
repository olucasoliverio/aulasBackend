package aula_03;

import java.util.Scanner;

public class GradeBook {
    private final String courseName;

    public GradeBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do curso: ");
        this.courseName = scanner.nextLine();
    }


    public void showMessage() {
        System.out.println("Nome do curso: " + courseName);
    }
}
