package Tree;

public void remove(E e) {
         root = remove(root,e);
    }

    /**
     * 删除以node为根节点且值为e的节点
     * 返回删除后的二叉树根节点
     * @param node
     * @return
     */
    private Node remove(Node node,E e) {
        if (node == null)
            return null;
        if (e.compareTo(node.data) < 0) {
            node.left = remove(node.left,e);
        }
        if (e.compareTo(node.data) > 0) {
            node.right = remove(node.right,e);
        }
        // 此时node就为需要删除的节点
        else {
            // 若此时节点只有一边孩子
            if (node.left != null && node.right == null) {
                Node leftNode = node.left;
                size --;
                node.left = null;
                return leftNode;
            }
            if (node.right != null && node.left == null) {
                Node rightNode = node.right;
                size --;
                node.right = null;
                return rightNode;
            }
            if (node.left != null && node.right != null) {
                // 找到前驱或后继节点
                Node successor = getMinNode(node.right);
                successor.left = node.left;
                successor.right = removeMinNode(node.right);
                node.left = node.right = null;
                return successor;
            }
        }
        return node;
    }
