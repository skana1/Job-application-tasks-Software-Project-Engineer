//package com.example.tasks;
//
//import java.util.ArrayList;
//
//public class Matrix {
//
//Exercise 4
//    ArrayList<ArrayList<Integer>> matrix;
//    ArrayList<Integer> series;
//
//    public Matrix(ArrayList<ArrayList<Integer>> matrix, ArrayList<Integer> series) {
//        this.matrix = matrix;
//        this.series = series;
//    }
//
//    public ArrayList<ArrayList<Integer>> getMatrix() {
//        return matrix;
//    }
//
//    public void setMatrix(ArrayList<ArrayList<Integer>> matrix) {
//        this.matrix = matrix;
//    }
//
//    public ArrayList<Integer> getSeries() {
//        return series;
//    }
//
//    public void setSeries(ArrayList<Integer> series) {
//        this.series = series;
//    }
//
//    @Override
//    public String toString() {
//        return "Matrix{" +
//                "matrix=" + matrix +
//                ", series=" + series +
//                '}';
//    }
//
//    public  void findCoordinates( ArrayList<ArrayList<Integer>> matrix, ArrayList<Integer> series){
//
//        int seriesSize = series.size();
//        Integer x = null;
//        Integer y = null;
//
//        for (int i = 0; i < matrix.size(); i++){
//            ArrayList<Integer> row = matrix.get(i);
//            for (int j = 0; j < row.size(); j++){
//                int cell = row.get(j);
//                boolean shouldSkipNextCell = false;
//                if(series.contains(cell) && (row.size() - j - 1) <= seriesSize - 1){
//                    x = i;
//                    y = j;
//                    for(int k = 0; k < seriesSize; k++){
//                        System.out.println(" hello" + i + j + k);
//                        int checkCell = row.get(j + 1 + k);
//                        if(!series.contains(checkCell)){
//                            x = null;
//                            y = null;
//                        }
//                    }
//                }
//            }
//        }
//        if(x == null || y == null){
//            System.out.println("Matrica nuk e permban serine tone!");
//        }else {
//            System.out.println("i = "+ x + "j = "+ y);
//        }
//    }
//}
