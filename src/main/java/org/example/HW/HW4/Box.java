package org.example.HW.HW4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Box<T extends Fruit> implements Iterable<T>{
    private ArrayList<T> inBox=new ArrayList<>()  ;

    public void add(T fruit) { // FIXME Должен быть дженерик!
        // FIXME Реализовать добавления фрукта
        try {this.inBox.add( fruit);


        }catch (Exception e){
        throw new UnsupportedOperationException();
        }
    }

    public int getWeight() {
        // FIXME Реализовать подсчет суммарного веса
        try {int show=0;
            for (T fruit:this.inBox) {
                show+=fruit.getWeight();
            }
            return (show);
        } catch (Exception e) {
            throw new UnsupportedOperationException();
        }
    }
    public  void  move(Box<? super T> another) { // FIXME Должен быть дженерик!
        // FIXME Реализовать пересыпание
        try {
            forEach(another::add);
            this.inBox.clear();
        } catch (Exception e){
            throw new UnsupportedOperationException();
        }

    }


    @Override
    public Iterator<T> iterator() {
        Iterator tt=new Iterator<T>() {
            private int curs= 0;
            @Override
            public boolean hasNext() {
                if (curs<inBox.size()){
                    return true;
                }
                return false;
            }

            @Override
            public T next() {
                if(hasNext()){
                    return (inBox.get(curs++));
                }
                return null;
            }
        };
        return (tt);
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }
}


