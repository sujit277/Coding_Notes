import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Post } from 'src/app/Models/post';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(private http: HttpClient) { }


  getPosts() {
    return this.http.get<Post[]>('https://jsonplaceholder.typicode.com/posts');
  }

  deletePost(post: Post) {
    return this.http.delete(`https://jsonplaceholder.typicode.com/post/${post.id}`);
  }

}
