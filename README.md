# UETLibz - Thư viện số UET

UETLibz là ứng dụng quản lý thư viện số được phát triển cho trường Đại học Công nghệ - Đại học Quốc gia Hà Nội. Ứng dụng được xây dựng bằng JavaFX với giao diện người dùng hiện đại và thân thiện.

## Cấu trúc ứng dụng

Ứng dụng được tổ chức theo mô hình MVC (Model-View-Controller) với các thành phần chính:

### Backend
- `Library.backend`: Chứa các model và logic xử lý dữ liệu
  - `Login.Model`: Quản lý thông tin người dùng và xác thực
  - `bookModel`: Quản lý thông tin sách
  - `Request`: Xử lý các yêu cầu mượn/trả sách
  - `Session`: Quản lý phiên đăng nhập

### Frontend
- `Library.ui`: Chứa các giao diện người dùng
  - `Admin`: Giao diện dành cho quản trị viên
  - `User`: Giao diện dành cho người dùng
  - `LogIn`: Giao diện đăng nhập
  - `PopUpWindow`: Các cửa sổ popup
  - `Utils`: Các tiện ích giao diện

## Tính năng chính

### Cho người dùng
1. **Đăng nhập**
   - Đăng nhập bằng tài khoản
   - Đăng ký tài khoản mới
   - Quản lý thông tin cá nhân

2. **Tìm kiếm sách**
   - Tìm kiếm theo tên, tác giả, thể loại
   - Xem chi tiết thông tin sách
   - Lọc kết quả tìm kiếm

3. **Quản lý yêu cầu mượn sách**
   - Gửi yêu cầu mượn sách
   - Xem trạng thái yêu cầu
   - Xem lịch sử mượn/trả sách

### Cho quản trị viên
1. **Quản lý thư viện**
   - Thêm/sửa/xóa sách
   - Quản lý số lượng sách
   - Cập nhật thông tin sách

2. **Quản lý người dùng**
   - Xem danh sách người dùng
   - Quản lý quyền truy cập
   - Khóa/mở khóa tài khoản

3. **Quản lý yêu cầu**
   - Duyệt/từ chối yêu cầu mượn sách
   - Xem lịch sử mượn/trả
   - Gửi thông báo cho người dùng

## Công nghệ sử dụng:
JavaFX, MySQL

## Yêu cầu hệ thống
- Java 17 trở lên
- MySQL Server
- XAMPP
- Maven

## Cài đặt và chạy
1. Clone repository
2. Cấu hình database trong file `src/main/resources/database.properties`
3. Chạy lệnh `mvn clean javafx:run`

