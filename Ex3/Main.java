import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        CompletableFuture<String> xacThuc = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Xac thuc khach hang xong");
            return "Khach hop le";
        });

        CompletableFuture<String> xuatVe = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Xuat ve xem phim xong");
            return "Ve da duoc xuat";
        });

        CompletableFuture<String> ketQua = xacThuc.thenCombine(xuatVe, (a, b) -> {
            return a + " - " + b;
        });

        System.out.println("He thong hoan thanh: " + ketQua.join());
    }
}