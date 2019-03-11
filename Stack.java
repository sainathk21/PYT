	public class Stack 
	{
		private int top;
		private int[] stack;

		public static void main(String[] args)
		{
			Stack myStack = new Stack(12);
			//Begin test operations
			myStack.push(4);
			myStack.pop();
			myStack.push(3);
			myStack.push(5);
			myStack.push(2);
			myStack.inc(3,1);
			myStack.pop();
			myStack.push(1);
			myStack.inc(2,2);
			myStack.push(4);
			myStack.pop();
			myStack.pop();
		}

		Stack(int size)
		{
			stack = new int[size];
			top = 0;
		}


		void push(int data)
		{
			top++;	
			stack[top] = data;
			System.out.println(stack[top]);
			
		}

		void pop()
		{
			int temp = stack[top];
			top--;
			if(top==0)
			{
			    System.out.println("EMPTY");
			}
			else
			{
			    System.out.println(stack[top]);    
			}
			
		}

		void inc(int e, int k)
		{
			for(int i=1; i<e+1;i++)
			{
				stack[i]+=k;
			}
			System.out.println(stack[top]);
		}
	}
