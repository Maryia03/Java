package pl.pollub.zpj.DTOs;

import lombok.*;
import pl.pollub.zpj.models.Kamper;

@RequiredArgsConstructor
@Setter
@Getter
@ToString
public class KamperDTO{
    final private @NonNull String name;
    final private @NonNull double price;

    public KamperDTO(Kamper kamepr) {
        this.name = kamepr.getName();
        this.price = kamepr.getPrice();
    }
    public Kamper toEntity(){
        Kamper kamper =  new Kamper();
        kamper.setName(this.getName());
        kamper.setPrice(this.getPrice());
        return kamper;
    }
}
