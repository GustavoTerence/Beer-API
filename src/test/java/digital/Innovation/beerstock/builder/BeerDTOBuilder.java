package digital.Innovation.beerstock.builder;

import digital.Innovation.beerstock.dto.BeerDTO;
import digital.Innovation.beerstock.enums.BeerType;
import lombok.Builder;

@Builder
public class BeerDTOBuilder {
    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Brahma";

    @Builder.Default
    private String brand = "Skol";

    @Builder.Default
    private int max = 50;

    @Builder.Default
    private int quantity = 10;

    @Builder.Default
    private BeerType type = BeerType.COLORADA;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
}
