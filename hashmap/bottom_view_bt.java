import java.util.*;

// Definition of Tree Node
class bottom_view_bt {

    static class Node {
        int data;
        int hd;  // Horizontal Distance
        Node left, right;

        public Node(int key) {
            this.data = key;
            this.hd = Integer.MAX_VALUE;
            this.left = this.right = null;
        }
    }

    // Helper function for Bottom View
    public static void bottomViewHelper(Node root, int curr, int hd, TreeMap<Integer, int[]> m) {
        if (root == null) return;

        // If no node exists at this horizontal distance (hd), add the current node's data and height to the map
        if (!m.containsKey(hd)) {
            m.put(hd, new int[]{root.data, curr});  // Store data and height
        } else {
            int[] p = m.get(hd);
            // Update the map if the current node's height is greater or equal (it is lower or same in the tree)
            if (p[1] <= curr) {
                p[1] = curr;      // Update height
                p[0] = root.data;  // Update the data (value of the node)
            }
            m.put(hd, p);  // Put the updated values back in the map
        }

        // Recurse to the left child
        bottomViewHelper(root.left, curr + 1, hd - 1, m);

        // Recurse to the right child
        bottomViewHelper(root.right, curr + 1, hd + 1, m);
    }

    // Function to print the Bottom View of the binary tree
    public static void printBottomView(Node root) {
        TreeMap<Integer, int[]> m = new TreeMap<>();
        bottomViewHelper(root, 0, 0, m);

        // Print the Bottom View
        System.out.println("Bottom View:");
        for (int val[] : m.values()) {
            System.out.print(val[0] + " ");
        }
        System.out.println();
    }

    // Function to print the Top View of the binary tree
    public static void printTopView(Node root) {
        if (root == null) return;

        // Map to store topmost node at each horizontal distance
        Map<Integer, Integer> topViewMap = new TreeMap<>();

        // Queue to hold nodes along with their horizontal distance
        Queue<NodeHD> queue = new LinkedList<>();
        queue.add(new NodeHD(root, 0));

        while (!queue.isEmpty()) {
            NodeHD temp = queue.poll();
            Node currentNode = temp.node;
            int hd = temp.hd;

            // Insert into the map if the horizontal distance is not yet present (first occurrence)
            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, currentNode.data);
            }

            // Enqueue left and right children with updated horizontal distances
            if (currentNode.left != null) {
                queue.add(new NodeHD(currentNode.left, hd - 1));
            }
            if (currentNode.right != null) {
                queue.add(new NodeHD(currentNode.right, hd + 1));
            }
        }

        // Print the Top View from the map
        System.out.println("Top View:");
        for (Map.Entry<Integer, Integer> entry : topViewMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();
    }

    // Class to store a node along with its horizontal distance for Top View
    static class NodeHD {
        Node node;
        int hd;  // Horizontal Distance

        public NodeHD(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    // Driver code to test the above functions
    public static void main(String[] args) {
        // Creating the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    

        // Printing the Top View of the binary tree
        printTopView(root);

        // Printing the Bottom View of the binary tree
        printBottomView(root);
    }
}
