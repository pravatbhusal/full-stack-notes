import { NextApiRequest, NextApiResponse } from "next";
import prisma from '../../prisma/client';

type PostProps = {
  title: string;
}

const handler = async (req: NextApiRequest, res: NextApiResponse) => {
  if (req.method === 'GET') {
    try {
      // Get prisma to fetch all of the posts
      const posts = await prisma.post.findMany();
      return res.status(200).json(posts); 
    } catch (error) {
      return res.status(500).json(error);
    }
  }
  if (req.method === 'POST') {
    // Use prisma to create a new post
    try {
      const post: PostProps = JSON.parse(req.body);
      if (!post.title) return res.status(400).json({ error: 'Title is required' });
      const newPost = await prisma.post.create({
        data: {
          title: post.title
        }
      });
      return res.status(200).json(newPost);
    } catch (error) {
      return res.status(500).json(error);
    }
  }
}

export default handler;
