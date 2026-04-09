package utils;

//Custom Exception: Tự tạo class lỗi riêng để dễ dàng gom và bắt lỗi cho toàn bộ Game
public class GameException extends Exception {
    public GameException(String message) {
        super(message);
    }
}