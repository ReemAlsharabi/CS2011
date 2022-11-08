class BST
{

    Node root;
    
    public void insert(int key)
    {
        root = insertRecursive(root, key);
    }
    public Node insertRecursive(Node n, int key)
    {
        if (n==null)
            return new Node(key);
        else if(n.data < key)
        {
            n.right = insertRecursive(n.right, key);
            return n;
        }
        else
        {
            n.left = insertRecursive(n.left, key);
            return n;
        }
    }
    public int max()
    {
        return max(root);
    }
    public int max(Node n)
    {
        if (n==null)
            return -1;
        Node current = n;
        while (current.right != null)
            current = current.right;
        return current.data;
    }
    public Node search(int data)
    {
        return search(root, data);
    }
    public Node search(Node n, int data)
    {
        if (n==null)
            return null;
        else if(n.data < data)
            return search(n.right, data);
        else
            return search(n.left, data);
    }
    public int size()
    {
        return size(root);
    }
    public int height()
    {
        return height(root);
    }
    public int sum()
    {
        return sum(root);
    }
    public void inOrder()
    {
        inOrder(root);
    }
    public void preOrder()
    {
        preOrder(root);
    }
    public void postOrder()
    {
        postOrder(root);
    }
    public int size(Node n)
    {
        if (n == null)
            return 0;
        else
            return 1+size(n.left)+size(n.right);
    }
    public int height(Node n)
    {
        if (n == null)
            return -1;
        else
            return 1 + Math.max(height(n.left), height(n.right));
    }
    public void inOrder(Node n)
    {
        if (n==null)
            return;
    	else
        {
        	inOrder(n.left);
        	System.out.print(n.data + " ");
        	inOrder(n.right);
        }
        	
    }
    public void preOrder(Node n)
    {
        if (n==null)
            return;
    	else
        {
        	System.out.print(n.data + " ");
        	preOrder(n.left);
        	preOrder(n.right);
        }
    }
    public void postOrder(Node n)
    {
        if (n==null)
            return;
    	else
        {
        	postOrder(n.left);
        	postOrder(n.right);
        	System.out.print(n.data + " ");
        }
    }
    public int sum(Node n)
    {
        int sum = 0;
        
        if (n==null)
            return sum;
        else
        {
            sum = sum+n.data;
            return sum + sum(n.left) + sum(n.right);

        }
    }
}
