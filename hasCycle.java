//创造一个环
    public void creatCycle(){
        Node cur=this.head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=this.head.next;
    }
    //判断是否为环
    //fast走两步走三步的区别？
    public boolean hasCycle(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                break;
            }
        }
        if (fast!=null&&slow!=null&&fast==slow){
            return true;
        }
        return false;
    }
