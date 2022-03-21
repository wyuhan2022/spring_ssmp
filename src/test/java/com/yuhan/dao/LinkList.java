package com.yuhan.dao;



/**
 * @author Yuhan
 * @create 2022-03-20 14:09
 */
class Nodes{
    public int data; //节点存储的数据
    public Nodes next=null; //指向下一节点的指针
    public Nodes(int data){
        this.data=data;
    }
}

//链表
public class LinkList {
    private Nodes head=null; //初始时链表头指针为空

    /**
     * 向链表尾添加一个节点
     * @param data
     */
    public void addFirst(int data){
        Nodes nodes=new Nodes(data);
        if(head==null){
            head=nodes;
            return;
        }
        nodes.next=head;
        head=nodes;
    }

    /**
     * 向链表头添加一个节点
     * @param data
     */
    public void addLast(int data){
        Nodes nodes=new Nodes(data);
        if(head==null){
            head=nodes;
            return;
        }
        Nodes tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        tail.next=nodes;
    }

    /**
     * 得到链表中节点个数
     * @return
     */
    public int getSize(){
        int size=0;
        for(Nodes cur=head;cur.next!=null;cur=cur.next){
            size++;
        }
        return  size;
    }

    /**
     * 根据节点位置的得到该位置的节点，如果不存在则返回null
     * @param index
     * @return
     */
    private Nodes getPos(int index){
        Nodes cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur;
    }

    /**
     * 向链表index位置添加节点，如果添加成功则返回true，否则false
     * @param index
     * @param data
     * @return
     */
    public boolean addIndex(int index,int data){
        int size=getSize();
        if(index<0||index>size){
            return false;
        }
        if(index==0){
            addFirst(data);
            return true;
        }
        if(index==size){
            addLast(data);
            return true;
        }
        Nodes nodes=new Nodes(data);
        Nodes pre=getPos(index-1);
        nodes.next=pre.next;
        pre.next=nodes;
        return true;
    }

    /**
     * 判断链表中是否有某数据（该例中数据为int类型）
     * @param toFind
     * @return
     */
    public boolean contains(int toFind){
        for(Nodes cur=head;cur.next!=null;cur=cur.next){
            if(cur.data==toFind){
                return true;
            }
        }
        return false;
    }

    /**
     * 移除链表中值为toRemove的节点
     * @param toRemove
     */
    public void remove(int toRemove){
        if(head.data==toRemove){
            head=head.next;
            return;
        }
        Nodes prev=searchPrev(toRemove);
        Nodes toData=prev.next;
        prev.next=toData.next;
    }
    /**
     * 显示链表中的全部数据
     */
    public void display(){
        for(Nodes cur=head;cur.next!=null;cur=cur.next) {
            System.out.println(cur.data + " ");
        }
    }
    /**
     * 找到值为toRemove的节点，如果找到则返回该节点，否则返回null
     * @param toRemove
     * @return
     */
    private Nodes searchPrev(int toRemove){
        for(Nodes cur=head;cur!=null&&cur.next!=null;cur=cur.next){
            if(cur.next.data==toRemove){
                return cur;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addFirst(1);
        linkList.addFirst(2);
        linkList.addFirst(3);
        linkList.addFirst(4);
        linkList.display();
    }
}

