package demotywatorycopy.controller;

import demotywatorycopy.model.dto.post.CreatePostRequest;
import demotywatorycopy.model.dto.post.CreatePostResponse;
import demotywatorycopy.service.post.CreatePostService;
import demotywatorycopy.service.post.GetPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/posts")
public class PostController {

    @Autowired
    private CreatePostService createPostService;
    @Autowired
    private GetPostService getPostService;

    @PostMapping
//    @ResponseStatus(value = HttpStatus.CREATED, reason = "Post Created")
    public ResponseEntity<CreatePostResponse> createNewPost(@Valid @RequestBody CreatePostRequest postToAdd) {
        return new ResponseEntity<CreatePostResponse>(createPostService.addPost(postToAdd),HttpStatus.CREATED);
    }

//    @GetMapping
//    @ResponseStatus(value = HttpStatus.OK, reason = "Posts Recieved")
//    public List<Post> getAllPosts() {
//        return getPostService.getAllPosts();
//    }




}
