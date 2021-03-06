package demotywatorycopy.model.dto.post;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreatePostRequest {

    @NotNull
    private String topText;
    @NotNull
    private String imagePath;
    @NotNull
    private String bottomText;
}
