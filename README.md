<div align="center">

# 🐍 Game Rắn Săn Mồi (Snake Game) Nâng Cấp
**Bài tập lớn cuối kỳ môn Lập trình Java**

</div>

---

### 👥 Thông tin nhóm (Team Members)

| STT | Họ và tên | Mã sinh viên | Vai trò / Nhiệm vụ | Link GitHub |
| :---: | --- | :---: | --- | --- |
| 1 | Nguyễn Thị Thu Sương | 3120225132 | Nhóm trưởng, Xử lý logic | [ntthusuong812-crypto](https://github.com/ntthusuong812-crypto) |
| 2 | Nguyễn Thị Cẩm Tú | 3120225169 | Thiết kế giao diện, Đồ họa | [camtunguyenthi2k7-max](https://github.com/camtunguyenthi2k7-max) |
| 3 | Hoàng Thanh Thanh | 3120225139 | Xử lý lưu trữ, Bảng xếp hạng | [hoangthanhthanh2007qt-cloud](https://github.com/hoangthanhthanh2007qt-cloud) |

---

### 📝 Giới thiệu dự án
Đây là phiên bản nâng cấp của trò chơi Rắn Săn Mồi huyền thoại, được phát triển nhằm mục tiêu áp dụng kiến thức Lập trình hướng đối tượng (OOP) và xử lý giao diện Java Swing. Ứng dụng tích hợp các thuật toán AI di chuyển ngẫu nhiên và hệ thống lưu trữ điểm số bền vững, mang lại trải nghiệm giải trí thú vị và thách thức cho người chơi.

### ✨ Các chức năng chính
- [x] **Di chuyển thông minh:** Rắn di chuyển 4 hướng, hỗ trợ thuật toán đi xuyên tường (Wrap-around).
- [x] **Hệ thống AI:** Chướng ngại vật (Quái vật) tự động tuần tra ngẫu nhiên trên bản đồ để tăng độ khó.
- [x] **Quản lý Kỷ lục (CRUD):** Xem, sửa tên và xóa kỷ lục trực tiếp trên bảng xếp hạng (JTable).
- [x] **Lưu trữ bảo mật:** Sử dụng File I/O nhị phân (.dat) giúp bảo toàn dữ liệu và chống gian lận điểm số.
- [x] **Bắt lỗi chặt chẽ:** Ứng dụng Biểu thức chính quy (Regex) và Custom Exception để xử lý nhập liệu.
- [x] **Đa phương tiện:** Tích hợp âm thanh ăn mồi, nhạc nền và hiệu ứng đồ họa xoay đầu rắn linh hoạt.

### 💻 Công nghệ & Thư viện sử dụng (Technologies)
* **Ngôn ngữ:** Java (JDK 17+)
* **Kiến trúc:** Model - View - Controller (MVC)
* **Giao diện:** Java Swing, AWT (Graphics2D)
* **Lưu trữ:** Binary File Storage (.dat)
* **Công cụ khác:** Git, GitHub, IntelliJ IDEA / Eclipse

### 📂 Cấu trúc thư mục
Mã nguồn được tổ chức chặt chẽ theo mô hình MVC:
```text

📦 src
┣ 📂 model       # Chứa SnakeModel, PlayerRecord (Thực thể & Dữ liệu)
┣ 📂 view        # Chứa SnakeView, MainMenuView (Giao diện đồ họa)
┣ 📂 controller  # Chứa SnakeController (Xử lý logic, Timer, KeyListener)
┣ 📂 utils       # Chứa SoundManager, FileStorage, Custom Exception
┗ 📜 Main.java   # File Entry-point khởi chạy ứng dụng
```

### 🚀 Hướng dẫn cài đặt và chạy (Installation)
Clone repository này về máy:
* git clone https://github.com/ntthusuong812-crypto/game-ran-san-moi-java
* git clone https://github.com/hoangthanhthanh2007qt-cloud/game-ran-san-moi-java
* git clone https://github.com/camtunguyenthi2k7-max/game-ran-san-moi-java
2. Chuẩn bị môi trường:

Đảm bảo máy tính đã cài đặt JDK 17 trở lên.

Các file âm thanh (.wav) và hình ảnh (.png) cần đặt đúng trong thư mục sounds/ và images/.

3. Chạy ứng dụng:

Mở project bằng IDE hoặc Eclipse.

Tìm file src/Main.java.

Nhấn chuột phải chọn Run 'Main' để bắt đầu trò chơi.

### 📸 Ảnh chụp màn hình (Screenshots)

![Màn hình Chính](menu_chinh.png)

![Màn hình Game](man_hinh_game.png)

![Màn hình Bảng xếp hạng](bang_xep_hang.png)

![Màn hình Thông báo lỗi](thong_bao_loi.png)
