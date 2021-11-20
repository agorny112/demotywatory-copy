package demotywatorycopy.model.dto.post;

import lombok.Data;
import lombok.Getter;


@Getter
public class GetPostResponse {

    private Long id;
    private String topText;
    private String imagePath;
    private String bottomText;
}
