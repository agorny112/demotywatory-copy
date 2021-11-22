package demotywatorycopy.model.dto.post;

import lombok.Data;

import java.util.List;

@Data
public class GetAllPostsResponse {
    private List<GetPostResponse> posts;
}
