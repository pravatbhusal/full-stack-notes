import Link from 'next/link';
import DashboardLink from './components/DashboardLink';

export default function Home() {
  return (
    <main className="p-8">
      <DashboardLink />
    </main>
  );
}
