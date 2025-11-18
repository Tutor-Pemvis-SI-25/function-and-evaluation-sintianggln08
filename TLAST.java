//sintia Geni Audi Nainggolan - 12S25035

import java.util.*;
import java.lang.Math;

public class TLAST {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totalData;
        String command;
        int[] deskripsi = new int[10], kode = new int[10], matkul = new int[10], dosen = new int[10], deadline = new int[10], ketID = new int[10], status = new int[10];
        int[] kesulitan = new int[10], hari = new int[10];
        double[] prioritas = new double[10];

        totalData = 0;
        while (!command.equals("---")) {
            command = input.nextLine();
            if (command.equals("AddTask")) {
                addTask();
            } else {
                if (UpdateTask) {
                    UpdateTask();
                } else {
                    if (ShowAssignment) {
                        ShowAssignment();
                    } else {
                        if (command.equals("---")) {
                        }
                    }
                }
            }
        }
    }
    
    public static void addTask() {
        if (totalData < 10) {
            Deskripsi[totalData] = input.nextLine();
        } else {
            if (Deskripsi[totalData] == "---") {
            }
        }
    }
}
