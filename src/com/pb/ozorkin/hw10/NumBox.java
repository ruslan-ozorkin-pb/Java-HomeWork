package com.pb.ozorkin.hw10;



 public class NumBox <T extends Number> {
        private final T [] numbers;

        @SuppressWarnings("unchecked")
        public NumBox(int size) {
            numbers = (T[]) new Number[size];
        }

        public void add(int index, T num) throws ArrayIndexOutOfBoundsException {
            if(index > numbers.length) { throw new ArrayIndexOutOfBoundsException();
            } else numbers[index] = num;
        }

        public T get(int index){
            return numbers[index];
        }

        public int length(){
            int count = 0;
            for(T i : numbers){
                if(!(i == null)){
                    count++;
                } else count+=0;
            }
            return count;
        }

        public double average(){
            return sum()/length();
        }

        public double sum() {
            double sum = 0.0;
            for(T i : numbers){
                if(i == null){
                    sum+=0;
                } else sum+=i.doubleValue();
            }
            return sum;
        }

        public T max(){
            T max = numbers[0];
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i].doubleValue() > max.doubleValue()) {
                    max = numbers[i];
                }
            }
            return max;
        }

     public int getSize(){
         return numbers.length;}

    }

