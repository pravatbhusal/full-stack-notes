import { useEffect, useState } from 'react';

type Post = {
  id: number;
  title: string;
}

export default function Blog() {
  const [posts, setPosts] = useState<Post[]>([]);

  // Returns all of the posts from the database
  const getPosts = async (): Promise<Post[]> => {
    const res = await fetch('api/posts');
    if (!res.ok) {
      console.error('Error fetching posts.');
    }
    return res.json();
  };

  const setBlogPosts = async () => {
    const posts = await getPosts();
    setPosts(posts);
  };

  useEffect(() => {
    setBlogPosts();
  }, []);

  const renderPosts = () => {
    return posts.map(post => (
      <div className="my-2">{post.title}</div>
    ));
  };

  return (
    <div className="py-2">
      {renderPosts()}
    </div>
  );
}