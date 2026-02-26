import java.util.*;

public class b6 {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        List<Medicine> list = new ArrayList<>();

        while (true) {
            System.out.println("\n--- HỆ THỐNG KÊ ĐƠN THUỐC ---");
            System.out.println("1. Thêm thuốc vào đơn (Cộng dồn nếu trùng)");
            System.out.println("2. Điều chỉnh số lượng (Xóa nếu = 0)");
            System.out.println("3. Xóa thuốc theo mã");
            System.out.println("4. In hóa đơn & Thanh toán");
            System.out.println("5. Tìm thuốc giá rẻ (< 50.000 VNĐ)");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Nhập mã thuốc: ");
                    String id = sc.nextLine().trim();

                    // Kiểm tra thuốc đã tồn tại chưa
                    Medicine existingMed = list.stream()
                            .filter(m -> m.getDrugId().equalsIgnoreCase(id))
                            .findFirst().orElse(null);

                    if (existingMed != null) {
                        System.out.print("Thuốc đã có. Nhập số lượng cộng thêm: ");
                        int addQty = Integer.parseInt(sc.nextLine());
                        existingMed.setQuantity(existingMed.getQuantity() + addQty);
                        System.out.println("=> Đã cập nhật số lượng.");
                    } else {
                        System.out.print("Nhập tên thuốc: ");
                        String name = sc.nextLine().trim();
                        System.out.print("Nhập đơn giá: ");
                        double price = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhập số lượng: ");
                        int qty = Integer.parseInt(sc.nextLine());
                        list.add(new Medicine(id, name, price, qty));
                        System.out.println("=> Đã thêm thuốc mới.");
                    }
                    break;

                case "2":
                    System.out.print("Nhập mã thuốc cần chỉnh: ");
                    String editId = sc.nextLine().trim();
                    Medicine medToEdit = list.stream()
                            .filter(m -> m.getDrugId().equalsIgnoreCase(editId))
                            .findFirst().orElse(null);

                    if (medToEdit != null) {
                        System.out.print("Nhập số lượng mới: ");
                        int newQty = Integer.parseInt(sc.nextLine());
                        if (newQty <= 0) {
                            list.remove(medToEdit);
                            System.out.println("=> Số lượng = 0, đã xóa khỏi đơn.");
                        } else {
                            medToEdit.setQuantity(newQty);
                            System.out.println("=> Đã cập nhật.");
                        }
                    } else {
                        System.out.println("Không tìm thấy mã thuốc!");
                    }
                    break;

                case "3":
                    System.out.print("Nhập mã thuốc muốn xóa: ");
                    String delId = sc.nextLine().trim();
                    boolean removed = list.removeIf(m -> m.getDrugId().equalsIgnoreCase(delId));
                    System.out.println(removed ? "=> Đã xóa." : "=> Không tìm thấy mã.");
                    break;

                case "4":
                    System.out.println("\n" + "=".repeat(60));
                    System.out.printf("%-10s | %-15s | %-10s | %-8s | %-10s\n", "MÃ", "TÊN", "GIÁ", "SL", "THÀNH TIỀN");
                    System.out.println("-".repeat(60));

                    double totalBill = 0;
                    for (Medicine m : list) {
                        double subTotal = m.getUnitPrice() * m.getQuantity();
                        totalBill += subTotal;
                        System.out.printf("%-10s | %-15s | %,10.0f | %-8d | %,10.0f\n",
                                m.getDrugId(), m.getDrugName(), m.getUnitPrice(), m.getQuantity(), subTotal);
                    }

                    System.out.println("-".repeat(60));
                    System.out.printf("TỔNG CỘNG: %,45.0f VNĐ\n", totalBill);
                    System.out.println("=".repeat(60));

                    list.clear(); // Xóa sạch đơn sau khi in
                    System.out.println("=> Đã thanh toán và làm mới đơn thuốc.");
                    break;

                case "5":
                    System.out.println("\n--- THUỐC GIÁ RẺ (< 50,000 VNĐ) ---");
                    list.stream()
                            .filter(m -> m.getUnitPrice() < 50000)
                            .forEach(m -> System.out.printf("%s - %s: %,.0f VNĐ\n", m.getDrugId(), m.getDrugName(), m.getUnitPrice()));
                    break;

                case "0":
                    return;

                default:
                    System.out.println("Lựa chọn sai!");
            }
        }
    }
}