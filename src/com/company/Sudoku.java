package com.company;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;

public class Sudoku {
    private char[][] board;
    private List<List<Character>> availableInSubgrid;
    private final int subGridSize;
    private boolean[][] visited;
    private HashMap<Integer, List<Character>> verticeH;
    private HashMap<Integer, List<Character>> verticeV;
    private final char EMPTY_CELL_VALUE = '0';

    public Sudoku(int numVertices) {
        board = new char[numVertices][numVertices];
        this.verticeH = new HashMap<>();
        this.verticeV = new HashMap<>();
        this.availableInSubgrid = new LinkedList<>();
        for(int i = 0; i < numVertices ; i++) {
            List<Character> elemsH = verticeH.getOrDefault(i, new LinkedList<>());
            List<Character> elemsV = verticeV.getOrDefault(i, new LinkedList<>());
            List<Character> elemsAvailable = new LinkedList<>();
            for(int j = 0; j < numVertices; j++) {
                board[i][j] = EMPTY_CELL_VALUE;
                char value = Integer.toString(j + 1).charAt(0);
                elemsH.add(value);
                elemsV.add(value);
                elemsAvailable.add(value);
            }
            this.verticeH.put(i, elemsH);
            this.verticeV.put(i, elemsV);
            this.availableInSubgrid.add(elemsAvailable);
        }
        this.visited = new boolean[numVertices][numVertices];
        this.subGridSize = (int) Math.sqrt(numVertices);
    }

    public Sudoku(char[][] data) throws Exception {
        this(data.length);
        for(int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length; j++) {
                putVertice(i, j, data[i][j]);

            }
        }
    }

    public void putVertice(int x, int y, char value) throws Exception  {
        if (!isValueInVertices(x, y, value ) &&  !isValueInSubGrid(x, y, value)) {
            board[x][y] = value;
            visited[x][y] = true;
        }
        else {
            throw new Exception("Data Failure");
        }

    }

    public void removeVertice(int x, int y) {
        Character value = board[x][y];
        int subGridNumber = x / this.subGridSize;
        board[x][y] = EMPTY_CELL_VALUE;
        visited[x][y] = false;
        verticeH.get(x).add(value);
        verticeV.get(y).add(value);
        availableInSubgrid.get(subGridNumber).add(value);
    }

    public void addEdge(int x, int y) {

    }

    public boolean isEdge(int x, int y) {
        return false;
    }

    private boolean isValueInSubGrid(int x, int y, char value) {
        if (value == EMPTY_CELL_VALUE) {
            return false;
        }
        int subGridNumber = subGridSize * (x / subGridSize) + y/subGridSize;
        List<Character> elems = availableInSubgrid.get(subGridNumber);
        if (elems.contains(value)) {
            elems.remove(new Character(value));
            return false;
        }
        return true;
    }

    private boolean isValueInVertices(int x, int y, char value) {
        if (value == EMPTY_CELL_VALUE) {
            return false;
         }
        List<Character> elemH =  verticeH.get(x);
        List<Character> elemV =  verticeV.get(y);
        if (elemH.contains(value) && elemV.contains(value)) {
            Character valueC = new Character(value);
            elemH.remove(valueC);
            elemV.remove(valueC);
            return false;
        }
        else {
            return true;
        }

    }


}
