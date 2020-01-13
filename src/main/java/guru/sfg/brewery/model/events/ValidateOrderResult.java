package guru.sfg.brewery.model.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by Donald F. Coffin on 01/13/2020 at 00:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ValidateOrderResult {
    private UUID orderId;
    private Boolean isValid;
}
