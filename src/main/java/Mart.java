import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Builder
@Getter
@ToString
public class Mart {
    private Map<String,Corner> corner;
}
