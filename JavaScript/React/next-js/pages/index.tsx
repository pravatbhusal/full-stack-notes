import Link from 'next/link';

export default function Home() {
  return (
    <main className="py-8 px-48">
      {/* Use Tailwind CSS to render a Link component as a green rounded button with white text */}
      <Link
        className="bg-teal-700 text-white font-medium py-2 px-4 rounded-md"
        href="/dashboard">
          Go to dashboard
      </Link>
    </main>
  );
}
