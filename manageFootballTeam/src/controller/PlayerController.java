package controller;

import model.Formation;
import model.Player;
import service.PlayerService;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerController {
    PlayerService playerService = new PlayerService();

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int option = 0;
        do {
            System.out.println("***************Chọn đội hình*******************");
            System.out.println("Tiến hành lựa chọn 11 cầu thủ ngẫu nhiên theo các mô hình sau, chọn số tương ứng với đội hình:\n" +
                    "1. 1GK - 4DF - 4MF - 2FW\n" +
                    "2. 1GK - 4DF - 3MF - 3FW\n" +
                    "3. 1GK - 3DF - 5MF - 2FW");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Formation: 1GK - 4DF - 4MF - 2FW");
                    System.out.println("Picked players are");
                    ArrayList<Player> team1 = playerService.buildTeam(Formation.FORMATION1);
                    for (Player player : team1) {
                        System.out.println(player.toString());
                    }
                    break;
                }
                case 2: {
                    System.out.println("Formation: 1GK - 4DF - 3MF - 3FW");
                    System.out.println("Picked players are");
                    ArrayList<Player> team2 = playerService.buildTeam(Formation.FORMATION2);
                    for (Player player : team2) {
                        System.out.println(player.toString());
                    }
                    break;
                }
                case 3: {
                    System.out.println("Formation: 1GK - 3DF - 5MF - 2FW");
                    System.out.println("Picked players are");
                    ArrayList<Player> team3 = playerService.buildTeam(Formation.FORMATION3);
                    for (Player player : team3) {
                        System.out.println(player.toString());
                    }
                    break;
                }
            }
        } while (option != 0);
    }
}
