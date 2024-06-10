package lab1;

public class Task5 {

    public static void main(String[] args) {
        String[] transactions = {
                "Пополнение через банкомат ~ +1000",
                "Оплата интернета ~ -500",
                "Кафе ~ -300",
                "Зарплата ~ +15000",
                "Штраф за парковку ~ -2500",
                "Подарок ~ +2000"
        };

        int totalAmount = calculateTotalAmount(transactions);

        System.out.println("Итоговая сумма на счету составляет " + totalAmount + ".");
    }

    public static int calculateTotalAmount(String[] transactions) {
        int totalAmount = 0;

        for (String transaction : transactions) {
            String[] parts = transaction.split(" ~ ");
            int amount = Integer.parseInt(parts[1]);

            totalAmount += amount;
        }

        return totalAmount;
    }
}