package com.bit.Impl;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/29 19:24
 * @Description:
 */
public interface Sequence {
     boolean add(int pos,Object data);
    Object remove(Object index);
    Object search(int index);
    Object set(int index,Object newData);
    Object get(int index);
    boolean contains(Object data);
    int size();
    Object[] toArray();
    void display();
    void clear();

}
package com.bit.dao;

import com.bit.Impl.Sequence;

import java.util.Arrays;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/29 19:24
 * @Description:
 */
public class SequenceArrayImpl implements Sequence {
    private Object[] elemDate;
    private int usedSize;
    public static final int DEFAULT_CAPACITY=10;
    public SequenceArrayImpl(){
        this.elemDate=new Object[DEFAULT_CAPACITY];
        this.usedSize=0;
    }
    private boolean isFull(){
        return this.usedSize==this.elemDate.length;
    }

    @Override
    public boolean add(int pos,Object data) {
        //1.判断pos的合法性，放入数据后是否会溢出
        if(pos<0||pos>this.usedSize){
            return false;
        }
        if(isFull()){
            this.elemDate=
                    Arrays.copyOf(this.elemDate,this.elemDate.length*2);
        }
        //2.挪数据
        for (int i=this.usedSize-1;i>=pos;i--){
            this.elemDate[i+1]=this.elemDate[i];
        }
        //3.放入数据 size++
        this.elemDate[pos]=data;
        this.usedSize++;
        return true;
    }
    private boolean isEmpyy(){
         return this.usedSize==0;
    }

    @Override
    public Object search(int index) {
        if(index == 0){
            throw new UnsupportedOperationException();
        }
        if(isEmpyy()){
            return -1;
        }
        for (int i=0;i<this.usedSize;i++){
            if(this.elemDate[i].equals(index)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Object remove(Object index) {
       //int key=search(index);
        //if (key==-1)

        return null;
    }

    @Override
    public Object set(int index, Object newData) {
        return null;
    }

    @Override
    public Object get(int index) {
        if (index<0||index>=this.usedSize){
            return null;}
        return this.elemDate[index];
    }

    @Override
    public boolean contains(Object data) {
        if(data == null){
            throw new UnsupportedOperationException();
        }
        if(isEmpyy()){
            return false;
        }
        for (int i=0;i<this.usedSize;i++){
            if(this.elemDate[i].equals(data)){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.usedSize;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void display() {
        for (int i=0;i<this.usedSize;i++){
            System.out.print(this.elemDate[i]+" ");
        }
        System.out.println();
    }

    @Override
    public void clear() {
        for (int i=0;i<this.usedSize;i++){
            this.elemDate[i]=null;
        }
       this.usedSize=0;
    }
}
package com.bit.main;

import com.bit.dao.SequenceArrayImpl;

/**
 * @Author: BaiMiao
 * @Date: 2019/10/29 21:08
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        SequenceArrayImpl sequence=new SequenceArrayImpl();
        for(int i=0;i<10;i++){
            sequence.add(i,i);
        }
        sequence.display();
        sequence.add(10,"bit");
        sequence.display();
    }
}
