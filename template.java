/*
ID: USERNAME_GOES_HERE
LANG: JAVA
TASK: ${NAME}
*/

import java.io.*;
import java.util.*;

public class ${NAME}
{
	public static void solve()
	{
	    
		
		
	}


	public static InputReader in = new InputReader("${NAME}");
	public static PrintWriter out;
	public static void main(String[] args) throws IOException
	{
		out = new PrintWriter(new BufferedWriter(new FileWriter("${NAME}.out")));
		long startTime = System.currentTimeMillis();

		solve();
		
		long endTime = System.currentTimeMillis();
		System.out.printf("Took %.2f sec\n", (endTime - startTime) / 1000.0);

		out.close();
	}
	
	//reader by Petr Mitrichev
	static class InputReader
	{
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(String fileName)
		{
			try
			{
				reader = new BufferedReader(new FileReader(new File(fileName + ".in")), 32768);
			} catch (Exception ex)
			{
				throw new NullPointerException("Input file does not exist! Put it in the project folder.");
			}
			tokenizer = null;
		}

		public String next()
		{
			while (tokenizer == null || !tokenizer.hasMoreTokens())
			{
				try
				{
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e)
				{
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt()
		{
			return Integer.parseInt(next());
		}

		public double nextDouble()
		{
			return Double.parseDouble(next());
		}

		public long nextLong()
		{
			return Long.parseLong(next());
		}
		
		/**
		 * When you call next(), that entire line will be skipped.
		 * No flushing buffers.
		 * Doesn't work when you want to scan the remaining line.
		 * @return entire line
		 */
		public String nextLine()
		{
			String str = "";
			try
			{
				str = reader.readLine();
			} catch (IOException e)
			{
				throw new RuntimeException(e);
			}
			return str;
		}
	}
}
