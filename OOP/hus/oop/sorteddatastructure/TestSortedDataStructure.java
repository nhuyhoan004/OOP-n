package hus.oop.sorteddatastructure;

import java.util.Random;

public class TestSortedDataStructure {
    public static void main(String[] args) {
        /* TODO
        - Hoàn thiện code chương trình theo mẫu đã cho.
        - Viết code để test cho tất cả các hàm test bên dưới.

        - Thực hiện chạy từng hàm test theo format:
              Tên test:
              Kết quả chạy chương trình.

          Lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_SortedDataStructure>.txt (Ví dụ, NguyenVanA_123456_SortedDataStructure.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_SortedDataStructure>.zip (Ví dụ, NguyenVanA_123456_SortedDataStructure.zip),
          nộp lên classroom.
         */
        System.out.println("Test SortedArrayList:");
        testSortedArrayList();

        System.out.println("\nTest SortedLinkedList:");
        testSortedLinkedList();
    }

    public static void testSortedArrayList() {
        /* TODO
         - Sinh ngẫu nhiên ra 1 số tự nhiên nằm trong đoạn [20, 30], lưu giá trị và biến n.
         - Sinh ngẫu nhiên ra n số tự nhiên nằm trong đoạn [10, 100], cho vào SortedArrayList.
             - In ra danh sách các số tự nhiên theo định dạng [a1, a2, ... an] trên 1 dòng.
               Mỗi lần thêm phần tử vào in ra danh sách các phần tử trên 1 dòng.
             - Sinh ngẫu nhiên ra các số tự nhiên, test kiểm tra xem giá trị đó có nằm trong list hay không,
               nếu có chỉ số của nó trong danh sách là gì.
         */
        Random rand = new Random();
        int n = rand.nextInt(11) + 20;  // n trong đoạn [20, 30]
        MySortedArrayList sortedArrayList = new MySortedArrayList();

        for (int i = 0; i < n; i++) {
            int value = rand.nextInt(91) + 10;  // Sinh giá trị trong đoạn [10, 100]
            sortedArrayList.add(value);
            System.out.println(sortedArrayList);  // In danh sách sau mỗi lần thêm
        }

        // Kiểm tra sự tồn tại của một số ngẫu nhiên
        int searchValue = rand.nextInt(91) + 10;
        int index = sortedArrayList.binarySearch(searchValue);
        if (index != -1) {
            System.out.println("Giá trị " + searchValue + " có trong danh sách tại vị trí: " + index);
        } else {
            System.out.println("Giá trị " + searchValue + " không có trong danh sách.");
        }
    }

    public static void testSortedLinkedList() {
        /* TODO
         - Sinh ngẫu nhiên ra 1 số tự nhiên nằm trong đoạn [20, 30], lưu giá trị và biến n.
         - Sinh ngẫu nhiên ra n số tự nhiên nằm trong đoạn [10, 100], cho vào SortedLinkedList.
             - In ra danh sách các số tự nhiên theo định dạng [a1, a2, ... an] trên 1 dòng.
               Mỗi lần thêm phần tử vào in ra danh sách các phần tử trên 1 dòng.
             - Sinh ngẫu nhiên ra các số tự nhiên, test kiểm tra xem giá trị đó có nằm trong list hay không,
               nếu có chỉ số của nó trong danh sách là gì.
         */
        Random rand = new Random();
        // Sinh ngẫu nhiên n và giá trị n
        int n = rand.nextInt(11) + 20;  // n trong đoạn [20, 30]
        MySortedLinkedList sortedLinkedList = new MySortedLinkedList();

        // Sinh ngẫu nhiên n số tự nhiên trong đoạn [10, 100] và thêm vào SortedLinkedList
        for (int i = 0; i < n; i++) {
            int value = rand.nextInt(91) + 10;  // Sinh giá trị trong đoạn [10, 100]
            sortedLinkedList.add(value);
            System.out.println(sortedLinkedList);  // In danh sách sau mỗi lần thêm
        }

        // Kiểm tra sự tồn tại của một số ngẫu nhiên
        int searchValue = rand.nextInt(91) + 10;
        int index = sortedLinkedList.binarySearch(searchValue);
        if (index != -1) {
            System.out.println("Giá trị " + searchValue + " có trong danh sách tại vị trí: " + index);
        } else {
            System.out.println("Giá trị " + searchValue + " không có trong danh sách.");
        }
    }
}
