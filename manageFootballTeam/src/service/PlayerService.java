package service;

import model.Formation;
import model.Player;
import model.Position;

import java.util.ArrayList;
import java.util.Random;

public class PlayerService {
    private ArrayList<Player> players;

    public PlayerService() {
        init();
    }

    public PlayerService(ArrayList<Player> players) {
        this.players = players;
    }


    private void init() {
        players = new ArrayList<>();
        players.add(new Player(1, "Bùi Tấn Trường", Position.GK));
        players.add(new Player(2, "Đặng Văn Lâm", Position.GK));
        players.add(new Player(3, "Nguyễn Văn Hoàng", Position.GK));
        players.add(new Player(4, "Quan Văn Chuẩn", Position.GK));

        // Các cầu thủ thuộc vị trí hậu vệ
        players.add(new Player(5, "Đỗ Duy Mạnh", Position.DF));
        players.add(new Player(6, "Nguyễn Thành Chung", Position.DF));
        players.add(new Player(7, "Trần Đình Trọng", Position.DF));
        players.add(new Player(8, "Nguyễn Phong Hồng Duy", Position.DF));
        players.add(new Player(9, "Vũ Văn Thanh", Position.DF));
        players.add(new Player(10, "Bùi Tiến Dũng", Position.DF));
        players.add(new Player(11, "Quế Ngọc Hải", Position.DF));
        players.add(new Player(12, "Hồ Tấn Tài", Position.DF));
        players.add(new Player(13, "Phạm Xuân Mạnh", Position.DF));
        players.add(new Player(14, "Đỗ Thanh Thịnh", Position.DF));

        // Các cầu thủ thuộc vị trí tiền vệ
        players.add(new Player(15, "Nguyễn Quang Hải", Position.MF));
        players.add(new Player(16, "Phạm Đức Huy", Position.MF));
        players.add(new Player(17, "Lương Xuân Trường", Position.MF));
        players.add(new Player(18, "Nguyễn Tuấn Anh", Position.MF));
        players.add(new Player(19, "Trần Minh Vương", Position.MF));
        players.add(new Player(20, "Phan Văn Đức", Position.MF));
        players.add(new Player(21, "Nguyễn Hoàng Đức", Position.MF));
        players.add(new Player(22, "Lý Công Hoàng Anh", Position.MF));

        // Các cầu thủ thuộc vị trí tiền đạo
        players.add(new Player(23, "Phạm Tuấn Hải", Position.FW));
        players.add(new Player(24, "Nguyễn Văn Toàn", Position.FW));
        players.add(new Player(25, "Nguyễn Công Phượng", Position.FW));
        players.add(new Player(26, "Hà Đức Chinh", Position.FW));
        players.add(new Player(27, "Nguyễn Tiến Linh", Position.FW));
    }

    // Tạo danh sách cầu thủ với số lượng cầu thủ mỗi vị trí đã được chỉ định sẵn
    public ArrayList<Player> buildTeam(Formation formation) {
        ArrayList<Player> list = new ArrayList<>();
        switch (formation) {
            case FORMATION1: {
                list = buildTeam(1, 4, 4, 2);
                break;
            }
            case FORMATION2: {
                list = buildTeam(1, 4, 3, 3);
                break;
            }
            case FORMATION3: {
                list = buildTeam(1, 3, 5, 2);
                break;
            }
        }
        return list;
    }

    private ArrayList<Player> buildTeam(int GKNumber, int DFNumber, int MFNumber, int FWNumber) {
        ArrayList<Player> list = new ArrayList<>();
        list.addAll(getPlayers(Position.GK, GKNumber));
        list.addAll(getPlayers(Position.DF, DFNumber));
        list.addAll(getPlayers(Position.MF, MFNumber));
        list.addAll(getPlayers(Position.FW, FWNumber));

        return list;
    }

    // Phương thức lấy số lượng cầu thủ bất kỳ thuộc vị trí được chỉ định
    private ArrayList<Player> getPlayers(Position position, int number) {
        //list chứa các player có cùng position
        ArrayList<Player> positionList = new ArrayList<>();
        for (Player player : players) {
            if (player.getPosition().equals(position)) {
                positionList.add(player);
            }
        }
        //array chứa các player được chọn ngẫu nhiên từ array trên
        ArrayList<Player> pickedList = new ArrayList<>();
        Random rd = new Random();
        for (int i = 1; i <= number; i++) {
            int random = rd.nextInt(positionList.size());
            //lần random đầu tiên
            if (i == 1) {
                pickedList.add(positionList.get(random));
            }
            //lần 2 trở đi
            else {
                //check xem cầu thủ của vòng này đã được pick chưa
                if (pickedList.contains(positionList.get(random))) {
                    //random lại vòng này
                    i--;
                } else {
                    pickedList.add(positionList.get(random));
                }
            }
        }
        return pickedList;
    }


}
