# Bài tập thực hành kiểm thử với JUnit  
**Chủ đề:** Phân tích dữ liệu điểm số học sinh

## 1. Mô tả bài toán
Chương trình Java xây dựng lớp `StudentAnalyzer` để xử lý danh sách điểm số học sinh (từ 0 đến 10), gồm hai chức năng:

- Đếm số học sinh đạt loại **Giỏi** (điểm >= 8.0)
- Tính **điểm trung bình hợp lệ** của danh sách điểm

Yêu cầu xử lý:
- Bỏ qua các điểm không hợp lệ (điểm < 0 hoặc > 10)
- Nếu danh sách rỗng hoặc không có điểm hợp lệ thì trả về 0

---

## 2. Cấu trúc thư mục
unit-test/
├── src
│ ├── Main.java
│ └── StudentAnalyzer.java
└── test
└── StudentAnalyzerTest.java

markdown
Sao chép mã

- `src/`: chứa mã nguồn Java
- `test/`: chứa mã nguồn kiểm thử đơn vị bằng JUnit

---

## 3. Cách chạy chương trình
- Mở file `Main.java`
- Chạy chương trình (Run)

Chương trình sẽ in ra:
- Danh sách điểm
- Số lượng học sinh loại giỏi
- Điểm trung bình hợp lệ

---

## 4. Kiểm thử đơn vị với JUnit
Chương trình được kiểm thử bằng **JUnit 5** cho hai phương thức:

- `countExcellentStudents()`
- `calculateValidAverage()`

Các trường hợp kiểm thử:
- Danh sách có cả điểm hợp lệ và không hợp lệ
- Danh sách toàn bộ hợp lệ
- Danh sách rỗng
- Danh sách chỉ chứa điểm < 0 hoặc > 10

### Cách chạy test:
- Mở file `StudentAnalyzerTest.java`
- Nhấn **Run (▶)** để chạy kiểm thử
- Kết quả: tất cả test đều **PASS**

---

## 5. Công nghệ sử dụng
- Java
- JUnit 5
- IntelliJ IDEA
- Git & GitHub