# UETLibz - Thư viện số UET

UETLibz là ứng dụng quản lý thư viện số được phát triển cho trường Đại học Công nghệ - Đại học Quốc gia Hà Nội. Ứng dụng được xây dựng bằng JavaFX với giao diện người dùng hiện đại và thân thiện.

## Video demo
File `video_demo.mp4` hoặc Youtube: https://youtu.be/pIQ7TBqDrws


## Cấu trúc ứng dụng

Ứng dụng được tổ chức theo mô hình MVC (Model-View-Controller) với các thành phần chính:


## Tính năng chính

### Cho người dùng
1. **Đăng nhập**
   - Đăng nhập bằng tài khoản
   - Quản lý thông tin cá nhân

2. **Tìm kiếm sách**
   - Tìm kiếm theo tên
   - Xem chi tiết thông tin sách

3. **Quản lý yêu cầu mượn sách**
   - Gửi yêu cầu mượn sách
   - Gửi yêu cầu trả sách
   - Xem trạng thái yêu cầu
   - Xem danh sách đang mượn

### Cho quản trị viên
1. **Quản lý thư viện**
   - Thêm/sửa/xóa sách
   - Quản lý số lượng sách
   - Cập nhật thông tin sách

2. **Quản lý người dùng**
   - Xem danh sách người dùng
   - Chỉnh sửa thông tin người dùng
   - Xóa người dùng

3. **Quản lý yêu cầu**
   - Duyệt yêu cầu mượn sách, trả sách
   - Xem lịch sử yêu cầu mượn/trả

## Công cụ sử dụng: 

Javafx + SceneBuilder, MySQL Workbench, XAMPP, IntelliJ IDEA

## Cài đặt và chạy
1. Clone repository

2. Cài đặt XAMPP và bật Apache & MySQL.
   
3. Sử dùng MySQL WorkBenche hoặc Vào mục Database có sẵn trong IntelliJ IDEA và thực hiện các bước sau:
   - New > Data Source > MySQL
   - Nhập thông tin kết nối đến database (Host: `localhost`, Port: `3306`, User: `root`, Password: `không có`).
   - Test kết nối bằng cách nhấn Test Connection, nếu thành công sẽ có thông báo "Connection successful". > OK
   - Mở console và `CREAT DATABASE library`
   
4. Cấu hình database trong file `src/main/resources/database.sql`. Import dữ liệu các đầu sách trong thư viện trong file `src/main/resources/sach.csv`. Import dữ liệu người dùng trong file `src/main/resources/members.csv`.


5. Chạy Application hoặc dùng terminal `mvn clean javafx:run` 

