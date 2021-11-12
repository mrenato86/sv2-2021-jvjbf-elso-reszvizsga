package teahouse;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TeaHouse {

    private String name;
    private final List<Tea> teas;
    private LocalTime openTime;
    private LocalTime closeTime;

    public TeaHouse(String name, LocalTime openTime, LocalTime closeTime) {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.teas = new ArrayList<>(List.of(new Tea("Kamillavirágzat", 1256, Sort.HERBAL_TEA),
                                            new Tea("Cseresznyés álom", 1745, Sort.FRUIT_TEA)));
    }

    public String getName() {
        return name;
    }

    public List<Tea> getTeas() {
        return new ArrayList<>(teas);
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void addTea(Tea tea) {
        teas.add(tea);
    }

    public void setActionPrices(Sort sort, int percent) {
        for (Tea tea : teas) {
            if (tea.getSort() == sort) {
                tea.setPrice((int) (tea.getPrice() * (1 - percent / 100.)));
            }
        }
    }

    public double getAveragePrice() {
        double sum = 0;
        for (Tea tea : teas) {
            sum += tea.getPrice();
        }
        return sum / teas.size();
    }
}
