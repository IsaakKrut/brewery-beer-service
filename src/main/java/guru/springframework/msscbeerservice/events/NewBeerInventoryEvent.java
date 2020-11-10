package guru.springframework.msscbeerservice.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;

public class NewBeerInventoryEvent extends BeerEvent {
    public NewBeerInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
