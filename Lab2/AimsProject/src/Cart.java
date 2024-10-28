public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Đĩa đã được thêm");
        } else {
            System.out.println("Giỏ hàng gần đầy");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int n= -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                n = i;
                break;
            }
        }
        if (n != -1) {
            for (int i = n; i < qtyOrdered - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            qtyOrdered--;
        } else {System.out.println("Không tìm thấy");
        }
    }
    public double totalCost() {
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost(); // Giả sử có phương thức getCost()
        }
        return total;
    }
}