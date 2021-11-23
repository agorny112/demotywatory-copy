package demotywatorycopy.service.post;

import demotywatorycopy.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletePostService {

    @Autowired
    private PostRepository postRepository;

    public void deletePost(Long id) {
        postRepository.delete(postRepository.findById(id).orElseThrow(RuntimeException::new));
    }
}
