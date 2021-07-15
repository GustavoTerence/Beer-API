package digital.Innovation.beerstock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {

    SKOL("Skol"),
    COLORADA("Colorada"),
    BRAHMA("Brahma"),
    HEINEKEN("Heineken"),
    STELA("Stela");

    private final String description;
}
