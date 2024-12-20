import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/Models/post';
import { PostService } from 'src/app/Services/Post/post.service';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {

  posts: Post[] = [];
  constructor(private postService: PostService) { }

  ngOnInit(): void {
    this.getPosts();
  }

  getPosts() {
    this.postService.getPosts().subscribe((posts) => {
      this.posts = posts;
    })
  }

  deletePost(post: Post) {
    this.posts = this.posts.filter((p) => p.id !== post.id);
    this.postService.deletePost(post).subscribe();
  }

}
