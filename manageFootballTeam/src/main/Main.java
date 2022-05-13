package main;

import controller.PlayerController;
import model.Formation;
import model.Player;
import service.PlayerService;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PlayerController playerController = new PlayerController();
        playerController.run();
    }
}
