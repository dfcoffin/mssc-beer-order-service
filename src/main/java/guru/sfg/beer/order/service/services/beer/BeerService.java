package guru.sfg.beer.order.service.services.beer;

import guru.sfg.beer.order.service.services.beer.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by Donald F. Coffin on 07/14/2019 at 20:09
 */
public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);

    Optional<BeerDto> getBeerByUpc(String upc);

}
