//package Trees;
//
//public class Tree {
//
//    private static class node{
//        int data;
//        node left, right;
//
//        public node(int data) {
//            this.data = data;
//        }
//    }
//
//    public void insert(int value){
//        if (value <= data){
//            if (left == null){
//                left = new node(value);
//            }else{
//                left.insert(value);
//            }
//        }else{
//            if (right == null){
//                right = new node(value);
//            }else{
//                right.insert(value);
//            }
//        }
//    }
//
//    public boolean isContains(int value){
//        if (value == data){
//            return true;
//        }else if (value < data){
//            if (left == null){
//                return false;
//            }else{
//                return left.isContains(value);
//            }
//        }else{
//            if (right == null){
//                return false;
//            }else{
//                return right.isContains(value);
//            }
//        }
//    }
//
//    public void printInorder(){
//        if (left != null){
//            left.printInorder();
//        }
//        System.out.println(data);
//        if (right != null){
//            right.printInorder();
//        }
//        System.out.println(data);
//    }
//}
