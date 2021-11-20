package demotywatorycopy.model.dto.post;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class GetPostResponse {

    private Long id;
    private String topText;
    private String imagePath;
    private String bottomText;
}
