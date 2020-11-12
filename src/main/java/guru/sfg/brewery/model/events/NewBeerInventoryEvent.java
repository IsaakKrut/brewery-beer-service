package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.BeerDto;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewBeerInventoryEvent extends BeerEvent {
    public NewBeerInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
