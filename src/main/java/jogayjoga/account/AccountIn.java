package jogayjoga.account;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record AccountIn (
    String name,
    String email,
    String password
) {
    
}
