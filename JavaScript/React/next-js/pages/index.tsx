import Link from 'next/link';
import Blog from './components/Blog';

export default function Home() {
  // Use React + Tailwind CSS to render a Link component as a green rounded button with white text
  const renderCreatePostLink = () => (
    <Link
      className="bg-teal-700 text-white font-medium py-2 px-4 rounded-md"
      href="/admin">
      Create a post
    </Link>
  );
  return (
    <main className="p-8">
      <h1>All of my Blog's posts:</h1>
      <Blog />
      <div className="flex items-center">
        <span className="mr-2">Click here to create a new blog post:</span>
        {renderCreatePostLink()}
      </div>
    </main>
  );
}