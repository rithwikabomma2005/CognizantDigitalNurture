package financialforecasting;

import java.util.*;

public class FinancialForecast {

    public static void main(String[] args) {
        // Historical revenue data (in crores)
        Map<Integer, Double> revenueData = new LinkedHashMap<>();
        revenueData.put(2020, 120.0);
        revenueData.put(2021, 135.5);
        revenueData.put(2022, 150.0);
        revenueData.put(2023, 160.0);

        System.out.println("Historical Revenue Data:");
        for (Map.Entry<Integer, Double> entry : revenueData.entrySet()) {
            System.out.println(entry.getKey() + ": ₹" + entry.getValue() + " Cr");
        }

        // Calculate year-on-year growth
        List<Double> growthRates = new ArrayList<>();
        List<Double> values = new ArrayList<>(revenueData.values());

        for (int i = 1; i < values.size(); i++) {
            double growth = values.get(i) - values.get(i - 1);
            growthRates.add(growth);
        }

        // Average growth
        double averageGrowth = growthRates.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        double lastRevenue = values.get(values.size() - 1);
        double forecast = lastRevenue + averageGrowth;

        int nextYear = Collections.max(revenueData.keySet()) + 1;

        System.out.println("\n📈 Forecasted Revenue for " + nextYear + ": ₹" + String.format("%.2f", forecast) + " Cr");
    }
}
