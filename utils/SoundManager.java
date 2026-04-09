package utils;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundManager {
    private static Clip backgroundClip;

    // Hàm phát tiếng động 1 lần (Ăn mồi, Chết)
    public static void playSound(String filePath) {
        try {
            File soundPath = new File(filePath);
            if (soundPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } else {
                System.out.println("Không tìm thấy file âm thanh: " + filePath);
            }
        } catch (Exception e) {
            System.out.println("Lỗi phát âm thanh: " + e.getMessage());
        }
    }

    // Hàm phát nhạc nền (Lặp vô tận)
    public static void playBackgroundMusic(String filePath) {
        try {
            if (backgroundClip != null && backgroundClip.isRunning()) {
                backgroundClip.stop();
            }
            
            File soundPath = new File(filePath);
            if (soundPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundPath);
                backgroundClip = AudioSystem.getClip();
                backgroundClip.open(audioInput);
                backgroundClip.loop(Clip.LOOP_CONTINUOUSLY); 
                backgroundClip.start();
            } else {
                System.out.println("Không tìm thấy file nhạc nền: " + filePath);
            }
        } catch (Exception e) {
            System.out.println("Lỗi nhạc nền: " + e.getMessage());
        }
    }

    // Hàm tắt nhạc nền
    public static void stopBackgroundMusic() {
        if (backgroundClip != null && backgroundClip.isRunning()) {
            backgroundClip.stop();
        }
    }
}