import { useRouter } from "next/router";
import { useState } from "react";

type Post = {
  title: string;
}

export default function Admin() {
  const [title, setTitle] = useState('');
  const router = useRouter();

  // Creates a post into the database, then redirects back to the home page
  const createPost = async (post: Post) => {
    const res = await fetch('api/posts', {
      method: 'POST',
      body: JSON.stringify(post)
    });
    if (!res.ok) {
      console.error('Error fetching posts.');
    }
    router.back();
  };

  // Use React + Tailwind CSS to render a button component as a green rounded button with white text
  const renderCreatePostButton = () => (
    <button
      className="bg-teal-700 text-white font-medium py-2 px-4 rounded-md"
      type="submit">
      Create post
    </button>
  );

  const onSubmitPost = () => {
    const post = { title };
    createPost(post);
  };

  return (
    <form onSubmit={onSubmitPost}>
      <label className="mr-2">Blog title:</label>
      <input
        className="mr-2 text-black"
        type="text"
        onChange={(e) => setTitle(e.target.value)}
        value={title}
      />
      {renderCreatePostButton()}
    </form>
  );
}