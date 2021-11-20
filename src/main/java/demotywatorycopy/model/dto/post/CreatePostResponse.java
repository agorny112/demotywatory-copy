package demotywatorycopy.model.dto.post;

import lombok.Data;

@Data
public class CreatePostResponse {

    private Long id;
    private String topText;
    private String imagePath;
    private String bottomText;
}
