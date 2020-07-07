package com.company;

import com.sun.tools.javac.util.Pair;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    private static int LAND = 1;
    private static int SEENLAND = 2;

    public static void main(String[] args) {
        //int[] data =new int[]{1,2,3,4,5,6,7,8,9, 10, 11};

        //int[][] data2 = { {2, 4, 6, 8}, {15, 18, 21, 24}, {36, 40, 44, 48} };

//        System.out.println(binSearch(data, 3));
//        System.out.println(binSearch(data, 7));
//        System.out.println(binSearch(data, 14));
//        System.out.println(binSearch(data, 1));
          //System.out.println(binSearch(data, 10));
//        System.out.println(binSearch(data, -1));
//        System.out.println(binSearch(data, 3, 0, data.length -1));
//        System.out.println(binSearch(data, 7, 0, data.length -1));
//        System.out.println(binSearch(data, -1, 0, data.length -1));
//        int[] response = binSearch(data2, 15, 1);
//        System.out.printf("Column %d Row %d\n", response[0] + 1, response[1] + 1);
//        response = binSearch(data2, 15, 2);
//        System.out.printf("Column %d Row %d\n", response[0] + 1, response[1] + 1);


//        SparseVector sparseVector1 = new SparseVector(10);
//        SparseVector sparseVector2 = new SparseVector(10);
//        sparseVector1.put(1, 4);
//        sparseVector1.put(4,2);
//        sparseVector1.put(5,3);
//        sparseVector2.put(1, 7);
//        sparseVector2.put(2, 6);
//        sparseVector2.put(5, 1);

        //double[] sparseVector1Array = new double[]{4,0,0,2,3};
        //double[] sparseVector2Array = new double[]{7,6,0,0};
        //PairExt[] sparseVectorPair1 = new PairExt[]{new PairExt(1,4), new PairExt(3,3), new PairExt(4,2), new PairExt(5,3)};
        //PairExt[] sparseVectorPair2 = new PairExt[]{new PairExt(1,7), new PairExt(2,6), new PairExt(5,1)};

       //long start = System.nanoTime();
       // System.out.printf(" SparseVector1 DotProduct SparseVector2 %f\n", sparseVector1.dotProduct(sparseVector2));
        //calculateTime(start);
//        start = System.nanoTime();
//        System.out.printf(" SparseVector1 DotProduct SparseVector2 %f\n", dotProductArray(sparseVector1Array, sparseVector2Array));
//        calculateTime(start);

        //long start = System.nanoTime();
        //System.out.printf(" SparseVector1 DotProduct SparseVector2 %f\n", dotProduct(sparseVectorPair1, sparseVectorPair2));
        //calculateTime(start);
//
//        Input : mat[][] =
//            {1, 1, 0, 0, 0},
//            {0, 1, 0, 0, 1},
//            {1, 0, 0, 1, 1},
//            {0, 0, 0, 0, 0},
//            {1, 0, 1, 0, 1}
        //long start = System.nanoTime();
        //int[] data = {0, 200, 931, 320, 582, 88, 5};

        //for( int i : quickSort(data)) {
        //    System.out.println(i);
        //}
        //calculateTime(start);

        //start = System.nanoTime();
        //int[] dataNew = {0, 200, 0, 320, 400, 88, 155};



        //quickSort(dataNew, 0, dataNew.length - 1);
        //mergeSort(dataNew, 0, dataNew.length - 1);
        //bubbleSort(dataNew);
        //for (int i : dataNew) {
        //    System.out.println(i);
        //}

//        long start = System.nanoTime();
//        verticalOrder(createTree());
//        calculateTime(start);
//
//        start = System.nanoTime();
//        verticalOrderIterative(createTree());
//        calculateTime(start);
//
//        String[] words = new String[]{"shit", "poop", "puta"};
//
//        HashMap<Character, Character> specialChars = new HashMap<>();
//
//
//
//
//        specialChars.put('1', 'i');
//        specialChars.put('!', 'i');
//        specialChars.put('|', 'i');
//        specialChars.put('0', 'o');



        //TrieNodeExt profanityWords = createTrieMNode(words);

        //checkProfanity("joeeP00p", profanityWords, specialChars);

        //{1, 1, 0, 0, 0},
        //{0, 1, 0, 0, 1},
        //{1, 0, 0, 1, 1},
        //{0, 0, 0, 0, 0},
        //{1, 0, 1, 0, 1}
        //int[][] islands = { {1, 1, 0, 0, 0}, {0, 1, 0, 0, 1}, {1, 0, 0, 1, 1}, {0, 0, 0, 0, 0}, {1, 0, 1, 0, 1} };
        //System.out.printf(" Number of Islands %d\n", findIslands(islands));

//        long start = System.nanoTime();
//        findLongest("aabbccccddeeeeeaabb", 2);
//        calculateTime(start);

        //int[] data = createArray(100000, true);
//        int[] data = {1, 3, 6, 4, 1, 2};
        //long start = System.nanoTime();
        //System.out.printf("missing number: %d\n", findMissingInteger(data));
        //calculateTime(start);
////
////        start = System.nanoTime();
////        System.out.printf("missing number: %d\n", findMissingInteger2(data));
////        calculateTime(start)

        //System.out.printf(buildProducts("bdbaceeceecae"));
//
//        char[][] data2 = {
//                {'5', '3', '0', '0', '7', '0', '0', '0', '0'},
//                {'6', '0', '0', '1', '9', '5', '0', '0', '0'},
//                {'0', '9', '8', '0', '0', '0', '0', '6', '0'},
//                {'8', '0', '0', '0', '6', '0', '0', '0', '3'},
//                {'4', '0', '0', '8', '0', '3', '0', '0', '1'},
//                {'7', '0', '0', '0', '2', '0', '0', '0', '6'},
//                {'0', '6', '0', '0', '0', '0', '2', '8', '0'},
//                {'0', '0', '0', '4', '1', '9', '0', '0', '5'},
//                {'0', '0', '0', '0', '8', '0', '0', '7', '9'}
//        } ;
//
//        try {
//            Sudoku sudoku = new Sudoku(data2);
//        }
//        catch(Exception ex) {
//            System.out.println(ex.fillInStackTrace());
//        }

//        int[] data = {7, 10, 4, 3, 20, 15};
//
//        long start = System.nanoTime();
//        System.out.println(findKthSmallestNumber(data, 4));
//        calculateTime(start);
//
//        start = System.nanoTime();
//        System.out.println(findKthSmallestNumber2(data, 4));
//        calculateTime(start);
//
//        start = System.nanoTime();
//        System.out.println(findKthSmallestNumber3(data, 0, data.length - 1, 4));
//        calculateTime(start);
        //System.out.println(shuffleNumber(130) );

        //System.out.println(familyOfFour(2, "1A 2F 1C"));

        //int[] data = {2, 4, 6, 8, 10};
        //generalizedGCD(5, data);
        //statusCells(data, 2);



//        String[] keywords = {"anacell", "betacellular", "cetracular", "deltacellular", "eurocell"};
//        String[] reviews = {"I love anacell Best services; Best services provided by anacell",
//                "betacellular has great services",
//                "deltacellular provides much better services than betacellular",
//                "cetracular is worse than anacell",
//                "Betacellular is better than deltacellular."};
//
//        long start = System.nanoTime();
//        findMostPopularKWords(reviews, keywords, 2);
//        calculateTime(start);
//        start = System.nanoTime();
//        findMostPopularKWords2(reviews, keywords, 2);
//        calculateTime(start);

//        Set<Integer> elems = new HashSet<>();
//        elems.add(2);
//        elems.add(3);
//        elems.add(4);
//        calculatePowerSet(elems);
//products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"



//        int[][] grid = {
//                {0, 1, 1, 0, 1},
//                {0, 1, 0, 1, 0},
//                {},
//                {0, 1, 0, 0, 0}};
//
//        int[][] grid2 = {{1}};
//        minusDays(grid2);

      // String[] products  = { "bags","baggage","banner","box","cloths"};
      //  suggestedSearchWord(products,  "bags");

//        String[] logs = {"27 85717 7", "2 y xyr fc", "52 314 99", "d 046099 0", "m azv x f", "7e apw c y", "8 hyyq z p", "6 3272401", "c otdk cl", "8 ksif m u"};
//        long start = System.nanoTime();
//        sortLogs(logs);
//        calculateTime(start);
//        start = System.nanoTime();
//        sortLogs2(logs);
//        calculateTime(start);

        //int[] data = {3, 6, 4, 1, 2};
        //bubbleSort(data);
        //System.out.println(data.length);
//        long start = System.nanoTime();
//        findLongest("aabbccccddeeeeeaabb", 2);
//        calculateTime(start);
//        start = System.nanoTime();
//        findLongestV2("aabbccccddeeaabb", 2);
//        calculateTime(start);
        //lexSmallest("rvofqorvfq");
        //System.out.println(generateCombinations("()())()"));
        //checkSumInTree(createTree(), 18);
        //String[] words = {"eat", "ate", "apt", "pat", "tea", "now"};

        //groupAnaGrams(words);
//
//        List<Shipment> shipments = new ArrayList<>();
//        shipments.add(new Shipment(0, 1));
//        shipments.add(new Shipment(2, 3));
//        shipments.add(new Shipment(4, 5));
//        calculatePeakShipment(shipments);
       /* LinkedListExt lle = new LinkedListExt();
        lle.add(1);
        lle.add(2);
        lle.add(3);
        lle.add(4);
        reverseList(lle);*/
       //int[] list = {1,2,3,4,5};
       // sumSubList(list, 1, 3);
        //long start = System.nanoTime();
        //strobogrammaticNumbers(10);
        //calculateTime(start);
        //0 2 3 5 4 1
        /*long start = System.nanoTime();
        Strobogrammatic strob = new Strobogrammatic(5);
        strobogrammaticNumbers(strob,18);
        calculateTime(start);*/

//        long start = System.nanoTime();
//        familyGrams("best buy near me");
//        calculateTime(start);
//        start = System.nanoTime();
//        familyGramsV2("best buy near me");
//        calculateTime(start);

//        for(Map.Entry<String, String[]> family : familyGrams("best buy near me").entrySet()) {
//            System.out.println(family.getKey());
//            for(String ngram : family.getValue())
//                System.out.println(ngram);
//            System.out.println("===================");
//        }
//
//        for(Map.Entry<String, List<String>> family : familyGramsV2("best buy near me").entrySet()) {
//            System.out.println(family.getKey());
//            for(String ngram : family.getValue())
//                System.out.println(ngram);
//            System.out.println("===================");
//        }
        //System.out.println(buildStringTriangle(10));

//        String[] T =  new String[5];
//        T[0] = "test1a";
//        T[1] = "test2"  ;
//        T[2] = "test1b";
//        T[3] = "test1c";
//        T[4] = "test3";
//        String[] R =  new String[5];
//        R[0] = "Wrong answer";
//        R[1] = "OK";
//        R[2] = "Runtime error";
//        R[3] = "OK";
//        R[4] = "Time limit exceeded";
        //countScore(T, R);
        //int[] input = {2, 0, 6, 7, 0, 8, 9};
        //convertArray(input);

        //wordsAverage("Hi my name is Bob");
        /*long start = System.nanoTime();
        System.out.println(validIpV4NotRegex("129.134.1.255"));
        calculateTime(start);
        start = System.nanoTime();
        System.out.println(validIpV4NotRegexV2("129.134.1.255"));
        calculateTime(start);*/

        //int[] prices = {4,11,2,1,7};
        //buyAndSell(prices);
        //long start = System.nanoTime();
        //System.out.println(isWordInBlocks("AAA", "BABETOCAPA"));
        //calculateTime(start);

        //int[][] colors = { {1, 1, 0, 0, 0}, {0, 1, 0, 0, 1}, {1, 0, 0, 1, 1}, {0, 0, 0, 0, 0}, {1, 0, 1, 0, 1} };
        //countBlockWithOne(colors);

//        List<String> wordDict =new ArrayList<>();
//        wordDict.add("apple");
//        wordDict.add("pen");
//        wordDict.add("applepen");
//        wordDict.add("pine");
//        wordDict.add("pineapple");
//        wordBreak1("pineapplepenapple", wordDict);
        //lexSmallestV2("zzyiggiyss");

//        int[] set = {8, 34, 4, 12, 5, 2, 14, 45, 2, 8, 25, 1};
//        long start = System.nanoTime();
//        isSubSetSumV1(set, set.length, 30);
//        calculateTime(start);
//        start = System.nanoTime();
//        isSubSetSumV2(set, set.length, 30);
//        calculateTime(start);
//        List<Either> eithers =Arrays.asList(
//                new Either(1),
//                new Either(Arrays.asList(
//                        new Either(2),
//                        new Either(Arrays.asList(
//                                new Either(3),
//                                new Either(8)
//                        ))
//                )
//                ),
//                new Either(4),
//                new Either(5));
//
//        System.out.println(flattenEither(eithers));
        //int[] set = {10, 10, 11, 20, 22, 20};
        //BetterProgrammerTask.Change change = BetterProgrammerTask.getCorrectChange(164);
        //System.out.println(solution("baaabbaabbba"));
//
//    avoid 2 letters together and choose the minor cost
//    Example test:   ('abccbd', [0, 1, 2, 3, 4, 5])
//    WRONG ANSWER (got 0 expected 2)
//
//    Example test:   ('aabbcc', [1, 2, 1, 2, 1, 2])
//    WRONG ANSWER (got 0 expected 3)
//
//    Example test:   ('aaaa', [3, 4, 5, 6])
//    WRONG ANSWER (got 0 expected 12)
//
//    Example test:   ('ababa', [10, 5, 10, 5, 10])
//    OK
//
//    Detected some errors.
        int[] C = {3, 4, 5, 6};
        System.out.println(costToDelete("aaaa", C));

    }




    private static int binSearch(int[] data, int numberSearched) {
        int mid = data.length/2;
        int cycles = 0;
        while( mid < data.length) {
            ++cycles;
            if (numberSearched == data[mid]) {
                System.out.printf("Cycles %d:\n", cycles);
                return mid;
            }
            else if (numberSearched > data[mid]) {
                mid = mid + mid/2;
            }
            else {
                if (mid != 0) {
                    mid = mid/2;
                }
                else
                {
                    break;
                }

            }
        }
        System.out.printf("Cycles %d:\n", cycles);
        return -1;
    }

    private static int binSearch(int[]data, int numberSearched, int low, int high) {
        int index = -1;
        while (low <= high) {
            //++cycles;
            int mid = (low + high) / 2;
            if (numberSearched > data[mid]) {
                low = mid + 1;
            }

            if (numberSearched < data[mid]) {
                high = mid -1;
            }

            if (numberSearched == data[mid]) {
                index = mid;
                break;
            }
        }
        return index;
    }



    private static double dotProductArray(double[] sparseVector1, double[] sparseVector2) {
        return (sparseVector1.length <= sparseVector2.length) ? calculateSumDotProduct(sparseVector1, sparseVector2) : calculateSumDotProduct(sparseVector2, sparseVector1);
    }



    private static double calculateSumDotProduct(double[] sparseVector1, double[] sparseVector2) {
        double sum = 0;
        for (int i = 0; i < sparseVector1.length; i++ ) {
            if (sparseVector1[i] != 0 && sparseVector2[i] != 0) {
                sum = sum + (sparseVector1[i] * sparseVector2[i]);
            }
        }
        return sum;
    }

/*    private static double dotProduct(PairExt[] sparseVector1, PairExt[] sparseVector2) {
        return  (sparseVector1.length <= sparseVector2.length) ? calculateSumDotProduct(sparseVector1, sparseVector2) : calculateSumDotProduct(sparseVector2, sparseVector1);
    }*/


/*    private static double calculateSumDotProduct(PairExt<Double>[] sparseVector1, PairExt<Double>[] sparseVector2) {
        double sum = 0;
        int j = 0;
        int i = 0;
        while (i < sparseVector1.length) {
            int position = sparseVector1[i].getPosition();
            int position2 =  sparseVector2[j].getPosition();
            double value = sparseVector1[i].getValue();
            double value2 = sparseVector2[j].getValue();
            if (position == position2 && value != 0 && value2 != 0) {
                sum = sum + (value * value2);
                ++j;
                ++i;
            }
            else if (position > position2) { ++j; } else { ++i; }

        }
        return sum;
    }*/

    private static int findIslands(int[][] islands) {
        int numberIslands = 0;
        int col = 0;
        int row = 0;
        int maxCol = islands[row].length;
        int maxRow = islands.length;
        boolean[][] discoveredPartIsland = new boolean[maxRow][maxCol];
        while (row < maxRow) {
            if (islands[row][col] == 1) {
                if (!discoveredPartIsland[row][col]) {
                    ++numberIslands;
                }
                if (isAdjacentPartIsland(col + 1, row, maxCol, maxRow, islands, discoveredPartIsland)) { discoveredPartIsland[row][col + 1] = true; }//right
                if (isAdjacentPartIsland(col - 1, row, maxCol, maxRow, islands, discoveredPartIsland)) { discoveredPartIsland[row][col - 1] = true; }//left
                if (isAdjacentPartIsland(col, row + 1, maxCol, maxRow, islands, discoveredPartIsland)) { discoveredPartIsland[row + 1][col] = true; }//down
                if (isAdjacentPartIsland(col, row - 1, maxCol, maxRow, islands, discoveredPartIsland)) { discoveredPartIsland[row - 1][col] = true; }//up
                //if (isAdjacentPartIsland(col - 1, row + 1, maxCol, maxRow, islands, discoveredPartIsland)) { discoveredPartIsland[row + 1][col - 1] = true; }//downLeft
                //if (isAdjacentPartIsland(col + 1, row + 1, maxCol, maxRow, islands, discoveredPartIsland)) { discoveredPartIsland[row + 1][col + 1] = true; }//downRight

            }

            if (col < maxCol - 1) {
                ++col;
            }
            else {
                ++row;
                col = 0;
            }
        }

        return  numberIslands;

    }

    private static boolean isAdjacentPartIsland(int col, int row, int maxCol, int maxRow, int[][] islands, boolean[][] discoveredPartIsland) {
        return (col >= 0 && col < maxCol && row < maxRow  && row >=0  && !discoveredPartIsland[row][col] && islands[row][col] == 1);
    }

    private static int findIslandsV2(int[][] islands) {
        int numberIslands = 0;
        int maxCol = islands[0].length;
        int maxRow = islands.length;
        boolean[][] discoveredPartIsland = new boolean[maxRow][maxCol];
        boolean[][] visited = new boolean[maxRow][maxCol];
        Stack<Integer> stackElems = new Stack<>();
        Stack<Pair<Integer, Integer>> stackPositions = new Stack<>();
        stackElems.push(islands[0][0]);
        stackPositions.push(new Pair<>(0, 0));
        visited[0][0] = true;
        while (!stackElems.empty()) {
            int elem = stackElems.pop();
            Pair<Integer, Integer> coordinate = stackPositions.pop();
            if (elem == 1 && !discoveredPartIsland[coordinate.fst][coordinate.snd]) {
                ++numberIslands;
                discoveredPartIsland[coordinate.fst][coordinate.snd] = true;
            }
            if (coordinate.snd - 1 >= 0 && !visited[coordinate.fst][coordinate.snd-1]) {
                stackElems.push(islands[coordinate.fst][coordinate.snd-1]);
                stackPositions.push(new Pair<>(coordinate.fst, coordinate.snd-1));
                if (elem == 1 && islands[coordinate.fst][coordinate.snd-1] == 1)
                    discoveredPartIsland[coordinate.fst][coordinate.snd-1] = true;
                visited[coordinate.fst][coordinate.snd-1] = true;
            }

            if (coordinate.snd + 1 < maxCol && !visited[coordinate.fst][coordinate.snd+1]) {
                stackElems.push(islands[coordinate.fst][coordinate.snd+1]);
                stackPositions.push(new Pair<>(coordinate.fst, coordinate.snd+1));
                if (elem == 1 && islands[coordinate.fst][coordinate.snd+1] == 1)
                    discoveredPartIsland[coordinate.fst][coordinate.snd+1] = true;
                visited[coordinate.fst][coordinate.snd+1] = true;
            }
            if (coordinate.fst + 1 < maxRow && !visited[coordinate.fst+1][coordinate.snd]) {
                stackElems.push(islands[coordinate.fst+1][coordinate.snd]);
                stackPositions.push(new Pair<>(coordinate.fst+1, coordinate.snd));
                if (elem == 1 && islands[coordinate.fst+1][coordinate.snd] == 1)
                    discoveredPartIsland[coordinate.fst+1][coordinate.snd] = true;
                visited[coordinate.fst+1][coordinate.snd] = true;
            }
            if (coordinate.fst - 1 >= 0 && !visited[coordinate.fst-1][coordinate.snd]) {
                stackElems.push(islands[coordinate.fst-1][coordinate.snd]);
                stackPositions.push(new Pair<>(coordinate.fst-1, coordinate.snd));
                if (elem == 1 && islands[coordinate.fst-1][coordinate.snd] == 1)
                    discoveredPartIsland[coordinate.fst-1][coordinate.snd] = true;
                visited[coordinate.fst-1][coordinate.snd] = true;

            }

        }
        return numberIslands;
    }


    private static int[] quickSort(int[] data) {
        int lengthArray = data.length;

        if (lengthArray <= 1) {
            return data;
        }

        if (lengthArray == 2) {
            return (data[0] > data[1]) ? swapData(data, 0, 1) : data;
        }

        int pivotCol = (lengthArray / 2  + lengthArray % 2) - 1 ;
        int leftMarkCol = 0;
        int rightMarkCol = lengthArray - 2;
        int lastPos = lengthArray - 1;

        data = swapData(data, lastPos, pivotCol);

        pivotCol = lastPos;

        while (leftMarkCol < rightMarkCol) {
            while (data[leftMarkCol] < data[pivotCol] && leftMarkCol < lengthArray -1 ){leftMarkCol++;}

            while (data[rightMarkCol] > data[pivotCol] &&  rightMarkCol > 0 ){rightMarkCol--;}

            if (leftMarkCol < rightMarkCol) {
                data = swapData(data, leftMarkCol, rightMarkCol);
            }
        }

        data = swapData(data, leftMarkCol, pivotCol);

        int[] pivotArr = {data[leftMarkCol]};
        return concatArray(
                    concatArray(
                        quickSort(sliceArray(data, 0, leftMarkCol - 1)),
                        pivotArr
                    ),
                    quickSort(sliceArray(data, leftMarkCol + 1, data.length -1))
                    );
    }


    private static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = low - 1;
        while(low < high) {
            if (data[low] < pivot) {
                ++i;
                data[i] = data[i] + data[low];
                data[low] = data[i] - data[low];
                data[i] = data[i] - data[low];
            }
            low++;
        }
        data[i + 1] = data[i + 1] + data[high];
        data[high] = data[i + 1] - data[high];
        data[i + 1] = data[i + 1] - data[high];
        return i + 1;
    }

    private static void quickSort(int[] data, int low, int high) {
        if (low < high) {
            int partitionCalculated = partition(data, low, high);
            quickSort(data, partitionCalculated + 1, high);
            quickSort(data, low, partitionCalculated - 1);
        }

    }

    private static int[] swapData(int[] data, int col1, int col2) {
        data[col1] = data[col1] + data[col2];
        data[col2] = data[col1] - data[col2];
        data[col1] = data[col1] - data[col2];
        return data;
    }

    private static void swapData(String[] data, int col1, int col2, String key) {
        data[col2] = data[col1];
        data[col1] = key;
    }

    private static int[] concatArray(int[] arr1, int[] arr2) {
        int lengthArr1 = arr1.length;
        int[] arrResults = new int[lengthArr1 + arr2.length];
        for(int i=0; i < lengthArr1; i++) {
            arrResults[i] = arr1[i];
        }
        for(int j = lengthArr1; j < lengthArr1 + arr2.length; j++ ) {
            arrResults[j] = arr2[j-lengthArr1];
        }
        return arrResults;
    }

    private static int[] sliceArray(int[] data, int low, int high) {
        if (low >= 0 && high < data.length) {
            int[] resultArray = new int[high - low + 1 ];
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = data[low++];
            }
            return resultArray;
        }
        return data;
    }


    private static void mergeSort(int[] data, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(data, low, mid);
            mergeSort(data, mid + 1, high);
            merge(data, low, mid, high) ;
        }
    }

    private static void merge(int[] data, int low, int mid, int high) {
        int[] leftValue = sliceArray(data, low, mid);
        int[] rightValue = sliceArray(data, mid+1, high);

        int maxLeft = leftValue.length;
        int maxRight = rightValue.length;
        int elemsLeft = 0;
        int elemsRight = 0;
        int elemsMergedArray = low;


        while (elemsLeft < maxLeft && elemsRight < maxRight) {
            if (leftValue[elemsLeft] < rightValue[elemsRight]) {
                data[elemsMergedArray] = leftValue[elemsLeft];
                ++elemsLeft;
            }
            else {
                data[elemsMergedArray] = rightValue[elemsRight];
                ++elemsRight;
            }
            ++elemsMergedArray;
        }

        while (elemsLeft < maxLeft) {
            data[elemsMergedArray] = leftValue[elemsLeft];
            ++elemsMergedArray;
            ++elemsLeft;
        }

        while (elemsRight < maxRight) {
            data[elemsMergedArray] = rightValue[elemsRight];
            ++elemsMergedArray;
            ++elemsRight;
        }

    }


    private static void selectionSort(int[] data) {
        int lowerValue = Integer.MAX_VALUE;
        int pivot = 0;
        int colLower = -1;
        while (pivot < data.length - 1 ) {
            for (int i =pivot; i < data.length; i++ ) {
                if (data[i] < lowerValue) {
                    lowerValue = data[i];
                    colLower = i;
                }
            }
            if (colLower != - 1) {
                int temp = data[pivot];
                data[pivot] = lowerValue;
                data[colLower] = temp;
                colLower = -1;
                lowerValue = Integer.MAX_VALUE;
            }
            ++pivot;
        }
    }

    private static void bubbleSort(int[] data) {
        boolean swapped;
        do {
            swapped = false;
            for (int i =0; i < data.length - 1; i++ ) {
                if (data[i] > data[i + 1]) {
                    data[i] = data[i] + data[i + 1];
                    data[i + 1] = data[i] - data[i + 1];
                    data[i] = data[i] - data[i + 1];
                    swapped = true;
                }
            }
        } while (swapped);
    }


    private static List<List<Integer>> verticalOrderIterative(TreeNode root) {
        int[] range = new int[2];
        createRanges(root, range, 0);

        List<List<Integer>> response = new LinkedList<>();

        List<Integer> colParts = new LinkedList<>();

        for(int i = range[0]; i <= range[1]; i++) {
            colParts.add(i);
            response.add(new LinkedList<>());
        }

        Stack<PairExt<TreeNode>> nodeStack = new Stack<>();
        nodeStack.push(new PairExt<>(0, root));
        while(!nodeStack.empty()) {
            PairExt<TreeNode> node  = nodeStack.pop();
            response.get(colParts.indexOf(node.getPosition())).add(node.getValue().val);

            if (node.getValue().left != null) {
                nodeStack.push(new PairExt<>(node.getPosition() - 1, node.getValue().left));
            }

            if (node.getValue().right != null) {
               nodeStack.push(new PairExt<>(node.getPosition() + 1, node.getValue().right));
            }


        }

        return response;
    }

    private static void createRanges(TreeNode root, int range[], int x) {
        if (root != null) {
            range[0] = Math.min(range[0], x);
            range[1] = Math.max(range[1], x);
            createRanges(root.left, range, x - 1);
            createRanges(root.right, range, x + 1);
        }
    }

/*    private static List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> response = new LinkedList<>();
        if (root != null) {
            HashMap<Integer, List<PairExt<Integer>>> grid = new LinkedHashMap<>();
            buildGrid(grid, root, 0, 0);
            grid.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEachOrdered(x -> response.add(convertValues(x.getValue())));

        }
        return response;
    }*/

/*    private static List<Integer> convertValues(List<PairExt<Integer>> pairs) {
        List<Integer> values =  new LinkedList<>();
        for (PairExt<Integer> pair: pairs) {
            values.add(pair.getValue());
        }
        return values;
    }*/

    private static void buildGrid(HashMap<Integer, List<PairExt<Integer>>> grid, TreeNode root, int x, int y) {
        if (root != null) {
            List<PairExt<Integer>> elems = (grid.containsKey(x)) ? grid.get(x) : new LinkedList<>();
            addElements(elems, y, root.val);
            //elems.add(root.val);
            grid.put(x, elems);
            buildGrid(grid, root.left, x-1, y- 1);
            buildGrid(grid, root.right, x+1, y-1);
        }
    }

    private static void addElements(List<PairExt<Integer>> elems, int position, int val) {
        elems.add(new PairExt(position, val));

        Collections.sort(elems, new Comparator<PairExt>() {
            @Override
            public int compare(PairExt pairExt1, PairExt pairExt2) {
                if (pairExt1.getPosition() != pairExt2.getPosition() ) {
                    return Integer.compare(pairExt2.getPosition(), pairExt1.getPosition());
                } else {
                    return Integer.compare((int) pairExt2.getValue(), (int) pairExt1.getValue());
                }
            }
        });

    }

    private static int heightTree(TreeNode root) {
        if (root != null && (root.left != null || root.right != null)) {
            return 1 + heightTree(root.left) + heightTree(root.right);
        }
        return 0;
    }

    private static void levelOrderTransversal(TreeNode root) {
        for(int i=0; i < heightTree(root) ; i++ ) {
            printLevelOrderTransversal(root, i);
        }
    }

    private static void printLevelOrderTransversal(TreeNode root, int level) {
        if (root != null) {
            if (level == 0) { System.out.println(root.val); }
            else{
                printLevelOrderTransversal(root.left, level - 1);
                printLevelOrderTransversal(root.right, level - 1);
            }
        }
    }



    private static TreeNode createTree() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(4);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(19);

        return root;
    }

    private static void calculateTime(long startTime) {
        long finish = System.nanoTime();
        long timeElapsed = finish - startTime;  //in millis
        System.out.printf("Duration %d:\n", timeElapsed);
    }

    private static TrieNodeExt createTrieMNode(String[] words) {

        HashMap<String, TrieNodeExt> hashMapRoot = new HashMap<>();

        TrieNodeExt root = new TrieNodeExt("", new HashMap<>(), false);

        for(String word : words) {
            TrieNodeExt node  = root;
            for(int i =0; i < word.length(); i++) {
                char letter = word.charAt(i);
                boolean isEndOfWord = ( i + 1 == word.length());
                node = node.insert(String.valueOf(letter), isEndOfWord);
            }
        }
        return root;
    }

    private static boolean checkProfanity(String username, TrieNodeExt profanityWords, HashMap<Character, Character> specialChars) {
        TrieNodeExt current = profanityWords;
        TrieNodeExt previous;
        String usernameLoweCase = username.toLowerCase();
        for(int i = 0; i < username.length(); i++) {
            char letter = usernameLoweCase.charAt(i);
            previous =  current;
            current = current.search(String.valueOf(specialChars.getOrDefault(letter, letter)));
            if (current != null && current.getIsEndOfWord()) {
                return true;
            }
            else {
                if (current == null) {
                    current = previous;
                }
            }
        }
        return false;
    }


    private static String findLongest(String inputData, int sequenceNumber) {
        String candidate;
        String longestString = "";
        int rightPoint;
        int leftPoint;

        for(int i =0; i < inputData.length();) {
            if (i + sequenceNumber < inputData.length()) {
                candidate = inputData.substring(i, i + sequenceNumber);
                if (candidate.charAt(0) == candidate.charAt(1)) {

                    rightPoint = searchSliceR(candidate.charAt(0), inputData.substring(i + sequenceNumber));
                    if (rightPoint != 0) {
                        int startPosition = i + sequenceNumber;
                        String rightPart = candidate + inputData.substring(startPosition, startPosition + rightPoint);
                        if (rightPart.length() > longestString.length()) {
                            longestString = rightPart;
                        }
                    }

                    leftPoint = searchSliceL(candidate.charAt(0), inputData.substring(0, i), i -1);
                    if (leftPoint != i ) {
                        String reversed = reverse(i -1 , leftPoint, inputData );
                        if (!reversed.isEmpty()) {
                            String leftPart = candidate + reversed;
                            if (leftPart.length() > longestString.length()) {
                                longestString = leftPart;
                            }
                        }
                    }
                }
                i = i + sequenceNumber;
            }
            else {
                break;
            }
        }

        return longestString;
    }

    private static String findLongestV2(String inputData, int sequenceNumber) {
        int fastPointer;
        String longestString = "";
        int dataLength = inputData.length();
        //forward
        for (int i = 0; i < dataLength; i += sequenceNumber) {
            fastPointer = i + sequenceNumber;
            if (i + sequenceNumber >= dataLength || fastPointer >= dataLength)
                break;
            String block = inputData.substring(i, i + sequenceNumber);
            if (areSame(block)) {
                String nextBlock = "";
                for (int j = fastPointer ; j < dataLength; j++) {
                    nextBlock = nextBlock + inputData.charAt(j);
                    if (!areSame(nextBlock))
                        break;
                    block = block + inputData.charAt(j);
                }

            }
            if (block.length() > longestString.length() )
                longestString = block;
        }
        //reverse
        for (int  i = inputData.length() -1 ; i > 0 ; i-= sequenceNumber) {
            fastPointer = i - sequenceNumber;
            if (i - sequenceNumber < 0 || fastPointer < 0)
                break;
            String block = inputData.substring(i - sequenceNumber, i );
            if (areSame(block)) {
                String nextBlock = "";
                for (int j = fastPointer; j > 0; j--) {
                    nextBlock = nextBlock + inputData.charAt(j);
                    if (!areSame(nextBlock))
                        break;
                    block = block + inputData.charAt(j);
                }
            }
            if (block.length() > longestString.length() )
                longestString = block;
        }
        return longestString;
    }

    private static boolean areSame(String arr)
    {
        char first = arr.charAt(0);
        for (int i = 1; i < arr.length(); i++)
            if (arr.charAt(i) != first)
                return false;
        return true;
    }

    private static int searchSliceR(Character partCandidate, String subInputData) {
        Character pivot = null;
        for(int i = 0; i < subInputData.length(); i++) {
            if (i == 0) {
                if (partCandidate == subInputData.charAt(0)) {
                    return 0;
                }
                else {
                    pivot = subInputData.charAt(0);
                }
            }
            else {
                if (pivot != subInputData.charAt(i)) {
                    return i;
                }
            }
        }
        return subInputData.length() - 1;
    }

    private static int searchSliceL(Character partCandidate, String subInputData, int end) {
        Character pivot = null;
        for(int i = end; i >= 0; i--) {
            if (i == end ) {
                if (partCandidate == subInputData.charAt(end)) {
                    return end;
                }
                else {
                    pivot = subInputData.charAt(end);
                }
            }
            else {
                if (pivot != subInputData.charAt(i)) {
                    return i + 1;
                }
            }
        }
        return 0;
    }

    private static  String reverse (int end, int begin, String inputData) {
        String reversed = "";
        if (end != begin) {
            for (int i = end; i >= begin; i--) {
                reversed = reversed + String.valueOf(inputData.charAt(i));
            }
        }
        return reversed;
    }


//- A shelf is made of 1 'a' part.
//- A stool is made of 1 'b' top and 3 'c' legs.
//- A table is made of 1 'd' top and 4 'e' legs.

    private static String buildProducts(String parts) {
        int acumA = 0;
        int acumB = 0;
        int acumC = 0;
        int acumD = 0;
        int acumE = 0;

        for (int i = 0;  i < parts.length(); i++) {
             switch (parts.charAt(i)) {
                 case 'a' : ++acumA;
                    break;
                 case 'b' : ++acumB;
                     break;
                 case 'c' : ++acumC;
                     break;
                 case 'd' : ++acumD;
                     break;
                 case 'e' : ++acumE;
                     break;
             }
        }

        return "{\"Shelf\" :" +  acumA + ", \"Stool\" : "  + countProductComplete(acumB, acumC, 3) + ", \"Table\" : " +  countProductComplete(acumD, acumE, 4) + "}";
    }

    private static int countProductComplete(int partA, int partB, int minPiecesPartB) {
        if (partA >= 1 && partB >= minPiecesPartB ) {
            int maxPiecesPartB = partA * minPiecesPartB;
            return (partB >= maxPiecesPartB ) ? partA : partB / minPiecesPartB;
        }
        return 0;
    }

//    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//    Given A = [1, 2, 3], the function should return 4.
//
//    Given A = [−1, −3], the function should return 1.

    private static int findMissingInteger(int[] A) {
        int target = 1;

        Arrays.sort(A);
        int high = A.length - 1;
        for(;target <= 100000; target++) {
            if (binSearch(A, target, 0, high) == -1 ) {
                break;
            }
        }
        return target;
    }

    private static int findMissingInteger2(int[] A) {
        int target = 1;
        for(;target <= 100000; target++) {
            if (searchValue(A, target ) == -1 ) {
                break;
            }
        }
        return (target <= 100000) ? target : -1;
    }

    private static int[] createArray(int numberElems, boolean mix) {
        int[] values = new int[numberElems];
        Random random = new Random();
        for(int i = 0; i < numberElems; i++) {
            int randomInteger =  (mix) ? -1000000 + (int) (Math.random() * ((1000000 - (-1000000)) + 1)) : random.nextInt(1000000);
            values[i] = (mix) ? randomInteger : randomInteger;
        }
        return values;
    }

    private static int searchValue(int[] A, final int target ) {
        return IntStream.range(0, A.length)
                .filter(i -> target == A[i])
                .findFirst()
                .orElse(-1);
    }

    private static int findKthSmallestNumber(int[] numbers, int k) {
        int length = numbers.length;
        int[] acums = new int[length];
        for (int i = 0; i < length; i++) {
            for(int j= i + 1; j < length; j++) {
                if (numbers[i] >= numbers[j]) {
                    acums[i] = acums[i] + 1;
                }
                else {
                    acums[j] = acums[j] + 1;
                }
            }
            if (acums[i] == k - 1) {
                return numbers[i];
            }
        }
        return Integer.MAX_VALUE;
    }

    private static int findKthSmallestNumber2(int[] numbers, int k) {
        quickSort(numbers, 0, numbers.length - 1);
        return numbers[k-1];
    }

    private static int findKthSmallestNumber3(int[] data, int low, int high, int k) {
        if (k > 0 && k <=  high - low + 1) {
            int partitionCalculated = partition(data, low, high);

            if (partitionCalculated - 1 == k -1 ) {
                return data[partitionCalculated - 1];
            }

            if (partitionCalculated - 1 > k -1) {
                return findKthSmallestNumber3(data, low, partitionCalculated - 1, k);
            }

            return findKthSmallestNumber3(data, partitionCalculated + 1, high, k - partitionCalculated + low - 1);
        }
        return Integer.MAX_VALUE;
    }



    private static int shuffleNumber(int A) {
        String numberAsString = Integer.toString(A);
        String shuffle = String.valueOf(numberAsString.charAt(0));
        int last = numberAsString.length() -1;
        for(int i = 1; i < last; i =  i + 2)
        {
            shuffle = shuffle + String.valueOf(numberAsString.charAt(last)) + String.valueOf(numberAsString.charAt(i));
            numberAsString = shuffle + numberAsString.substring(i + 1, last );

        }
        return (shuffle.length() != numberAsString.length()) ? Integer.parseInt(shuffle + numberAsString.charAt(last)) : Integer.parseInt(shuffle );
    }

    private static int familyOfFour(int N, String S) {
        char[] cols = {'A', 'B',  'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K'};
        int numberOfFamiliesWithFour = 0;

        for (int i = 1; i <= N;  i ++) {
            int previous = -1 ;
            int countFamily = 0;
            for(int j= 1; j < cols.length - 1; j++) {
                String seat = String.valueOf(i) + String.valueOf(cols[j]);
                if (!S.contains(seat)) {
                    if ((previous == -1 || j - previous == 1)) {
                        if (cols[j] == 'C' || cols[j] == 'G') {
                            countFamily = (countFamily > 0) ? countFamily + 1 : 1;
                        }
                        else {
                            ++countFamily;
                        }
                    }
                    else {
                        countFamily = 1;
                    }
                }
                else {
                    countFamily = 0;
                }

                if (countFamily == 4) {
                    ++numberOfFamiliesWithFour;
                    countFamily = 0;
                }
                previous = j;
            }
        }
        return numberOfFamiliesWithFour;
    }

    private static int[] statusCells(int[] states, int days) {
        int previous, next;
        int length = states.length;
        for (int i = 1; i <= days; i++) {
            int[] cellsMutation = new int[length];
            for(int j= 0; j < length; j++) {
                previous = (j == 0 ) ? 0 : states[j - 1];
                next = (j == length - 1) ? 0 : states[j + 1];
                cellsMutation[j] = (previous != next) ? 1 : 0;
            }
            states = cellsMutation;
        }
        return states;
    }


    public static int generalizedGCD(int num, int[] arr)
    {
        int gdc = -1;
        for (int i = 1; i <= num; i++) {
            int j=0;
            for ( ;j < arr.length; j++) {
                if ( arr[j] % i != 0) {
                    break;
                }
            }
            if (j == arr.length) {
                gdc = i;
            }
        }
        return gdc;
    }

    private  static String[] findMostPopularKWords(String[] reviews, String[] keywords, int K) {
        HashMap<String, Integer> counterByKeywords = new HashMap<>();
        LinkedHashMap<String, Integer> kKeywords = new LinkedHashMap<>();
        String[] keywordMostPopulars = new String[K];

        for (String keyword : keywords) {
            counterByKeywords.put(keyword, 0);
            for(String review : reviews) {
                if (review.toLowerCase().contains(keyword)) {
                    int counter = counterByKeywords.get(keyword) + 1;
                    counterByKeywords.put(keyword, counter);
                }
            }
        }

        counterByKeywords.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(K).forEachOrdered(x -> kKeywords.put(x.getKey(), x.getValue()));

        int currentCounter = -1;
        int i = 0;
        for (Map.Entry<String, Integer> entry : kKeywords.entrySet()) {
            String keyInEntry = entry.getKey();
            if (entry.getValue() > currentCounter) {
                switch (i) {
                    case 0:
                        keywordMostPopulars[i] = keyInEntry;
                        break;
                    case 1:
                        swapData(keywordMostPopulars, 0, i, keyInEntry);
                        break;
                }
            }
            else {
                if (entry.getValue() == currentCounter) {
                    if (keywordMostPopulars[0].length() > keyInEntry.length() ) {
                        swapData(keywordMostPopulars, 0, i, keyInEntry);
                    }
                    else {
                        if (keywordMostPopulars[0].length() == keyInEntry.length() ) {
                            if (keywordMostPopulars[0].compareTo(keyInEntry) > 0 ) {
                                swapData(keywordMostPopulars, 0, i, keyInEntry);
                            }
                        }
                        else {
                            keywordMostPopulars[i] = keyInEntry;
                        }
                    }
                }
                else {
                    keywordMostPopulars[i] = keyInEntry;
                }
            }
            ++i;
            currentCounter = entry.getValue();
        }
        return keywordMostPopulars;
    }

    private  static String[] findMostPopularKWords2(String[] reviews, String[] keywords, int K) {
        HashMap<String, Integer> counterByKeywords = new HashMap<>();

        for (String keyword : keywords) {
            counterByKeywords.put(keyword, 0);
            for(String review : reviews) {
                if (review.toLowerCase().contains(keyword)) {
                    counterByKeywords.put(keyword, counterByKeywords.getOrDefault(keyword, 0) + 1);
                }
            }
        }

        List<String> ls = new ArrayList<>(counterByKeywords.keySet());
        Collections.sort(ls, (a,b)-> (counterByKeywords.get(a)).equals(counterByKeywords.get(b))? a.compareTo(b): counterByKeywords.get(b) - counterByKeywords.get(a));
        return ls.subList(0,K).toArray(new String[K]);
    }

    private static Set<Set<Integer>> calculatePowerSet(Set<Integer> list) {
        int size = list.size();
        Set<Set<Integer>> powerSet = new HashSet<>();
        powerSet.add(Collections.EMPTY_SET);
        if (size == 0) {
            return powerSet;
        }
        Integer[] elems = list.toArray(new Integer[size]);
        int end = (int) Math.pow(2, size) - 1;
        for (int i=1; i<= end; i++) {
            boolean[] bits = calculateBits(i);
            Set<Integer> setElems = new HashSet<>();
            for(int j = 0; j < size; j++ ) {
                if(bits[j]) {
                    setElems.add(elems[j]);
                }
            }
            powerSet.add(setElems);
        }
        return powerSet;
    }

    private static boolean[] calculateBits(int number) {
        boolean[] bits = new boolean[32];
        for (int i = 31; i >= 0; i--) {
            bits[i] = (number & (1 << i)) != 0;
        }
        return  bits;
    }

    private static int minusDays(int[][] grid) {
        int maxRow = grid.length;
        int countDays = 0;
        if(maxRow > 0 && grid[0].length > 0) {
            int maxCol = grid[0].length;
            Queue<Coordinates> queue = new LinkedList<>();
            int countTransformeds, countZombies;
            do {
                countTransformeds = 0;
                countZombies = 0;
                boolean[][] visited = new boolean[maxRow][maxCol];
                boolean[][] recentlyTransformed = new boolean[maxRow][maxCol];
                queue.add(new Coordinates(0,0));
                visited[0][0] = true;
                while (!queue.isEmpty()) {
                    Coordinates coordinates = queue.poll();
                    if (grid[coordinates.x][coordinates.y] == 1 && !recentlyTransformed[coordinates.x][coordinates.y]) {
                        ++countZombies;
                    }
                    List<Coordinates> adjacents = calculateAdjacents(coordinates, maxRow, grid[coordinates.x].length);
                    for(Coordinates adjacent : adjacents) {
                        if (grid[coordinates.x][coordinates.y] == 1 &&
                            !recentlyTransformed[coordinates.x][coordinates.y] &&
                            grid[adjacent.x][adjacent.y]  == 0) {
                                grid[adjacent.x][adjacent.y] = 1;
                                recentlyTransformed[adjacent.x][adjacent.y] = true;
                                ++countTransformeds;
                        }

                        if (!visited[adjacent.x][adjacent.y]) {
                            visited[adjacent.x][adjacent.y] = true;
                            queue.add(adjacent);
                        }
                    }
                }
                if (countTransformeds != 0 && countZombies != 0 ) {
                    ++countDays;
                }
            } while (countTransformeds +  countZombies < maxCol * maxRow);
        }
        return countDays;

    }

    private static List<Coordinates> calculateAdjacents(Coordinates coordinate, int maxRow, int maxCol) {
        List<Coordinates> coordinates = new ArrayList<>();
        if (coordinate.y + 1 < maxCol) {
            coordinates.add(new Coordinates(coordinate.x, coordinate.y + 1)); //right
        }
        if (coordinate.y - 1 >= 0) {
            coordinates.add(new Coordinates(coordinate.x, coordinate.y - 1)); //left
        }
        if (coordinate.x - 1 >= 0) {
            coordinates.add(new Coordinates(coordinate.x - 1, coordinate.y)); //up
        }
        if (coordinate.x + 1 < maxRow) {
            coordinates.add(new Coordinates(coordinate.x + 1, coordinate.y)); //down
        }
        return coordinates;
    }

    private static List<List<String>> suggestedSearchWord(String[] products, String searchWord) {
        List<List<String>> suggests = new ArrayList<>();
        Trie root = new Trie();
        for (String product : products) {
            root.insert(root, product);
        }
        Trie curr = root;
        for (int i = 0; i < searchWord.length(); i++) {
            if (curr != null) {
                curr = curr.search(String.valueOf(searchWord.charAt(i)));
                List<String> sortedWords = new ArrayList<>();
                if (curr != null && curr.key != null)
                    sortedWords.add(curr.key);
                preOrder(curr, sortedWords);
                suggests.add(sortedWords);
            }
            else
                break;
        }
        return suggests;

    }

    private static void preOrder(Trie curr, List<String> sortedWords)
    {
        if (curr == null || sortedWords.size() == 3 ) {
            return;
        }

        for (int i = 0; i < 26; i++)
        {
            if (curr.character[i] != null)
            {
                if (curr.character[i].key != null) {
                    sortedWords.add(curr.character[i].key);
                }
                preOrder(curr.character[i], sortedWords);
            }
        }
    }

    private static String[] sortLogs(String[] logs) {
        if (logs == null) {
            return logs;
        }

        if (logs.length < 2) {
            return logs;
        }

        List<String> digitLog = new ArrayList<>();
        List<Pair<String, String>> letterLog = new ArrayList<>();
        for(String log : logs) {
            String[] words = log.split(" ");
            String separatedData = String.join(" ", Arrays.copyOfRange(words, 1, words.length) );
            if (separatedData.matches(".*\\d.*")) {
                digitLog.add(log);
            }
            else {
                Pair<String, String> pair = new Pair<>(words[0], separatedData);
                letterLog.add(pair);
            }
        }
        Collections.sort(letterLog, (a,b)->  (a.snd).equals(b.snd) ? a.fst.compareTo(b.fst) : a.snd.compareTo(b.snd));

        int i = 0;
        String[] response = new String[logs.length];
        for(Pair<String, String> logLetter : letterLog) {
            StringBuilder sb = new StringBuilder();
            sb.append(logLetter.fst).append(" ").append(logLetter.snd);
            response[i++] = sb.toString();
        }

        for(String digitLetter : digitLog) {
            response[i++] = digitLetter;
        }
        return response;
    }

    private static String[] sortLogs2(String[] logs) {
        if (logs == null) {
            return logs;
        }

        if (logs.length < 2) {
            return logs;
        }

        Comparator<Pair<String, String>> comparator = new PairComparator();
        PriorityQueue<Pair<String, String>> priorityQueue = new PriorityQueue<>(logs.length, comparator);
        List<String> digitLog = new ArrayList<>();
        for(String log : logs) {
            int firstBlackSpace = log.indexOf(' ');
            String logKey =  log.substring(0, firstBlackSpace);
            String separatedData = log.substring(firstBlackSpace + 1);
            if (separatedData.matches(".*\\d.*")) {
                digitLog.add(log);
            }
            else {
                Pair<String, String> pair = new Pair<>(logKey, separatedData);
                priorityQueue.add(pair);
            }
        }

        String[] response = new String[logs.length];
        int i = 0;
        while (priorityQueue.size() != 0) {
            Pair<String, String> logLetter = priorityQueue.remove();
            StringJoiner sj = new StringJoiner(" ");
            sj.add(logLetter.fst).add(logLetter.snd);
            response[i++] = sj.toString();
        }


        for(String digitLetter : digitLog) {
            response[i++] = digitLetter;
        }
        return response;
    }

    private  static String lexSmallest(String s) {
        int fastPointer;
        List<Integer> listRepeatedAndBigger = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            fastPointer = i + 1;
            boolean repeated = false;
            boolean biggerThan = false;

            for (int j = fastPointer; j < s.length(); j++ ) {
                if (s.charAt(i) == s.charAt(j) && !repeated) {
                    repeated = true;
                }
                if (s.charAt(i) > s.charAt(j)) {
                    biggerThan = true;
                }

                if (repeated && biggerThan) {
                    break;
                }
            }
            if (repeated && biggerThan) {
                listRepeatedAndBigger.add(i);
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i= 0; i < s.length(); i++ ) {
            if (!listRepeatedAndBigger.contains(i))
                sb.append(s.charAt(i));
        }

        return String.valueOf(sb.toString().charAt(0));
    }

    private static String removeUnbalancedParentheses(String input) {
        Stack<Integer> positions = new Stack<>();
        for( int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(')
                positions.add(i);
            else
                if(!positions.isEmpty())
                    positions.pop();
                else
                    positions.add(i);
        }

        if (!positions.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++)
                if (!positions.contains(i))
                    sb.append(String.valueOf(input.charAt(i)));
            return sb.toString();
        }
        return input;
    }

    private static List<String> generateCombinations(String input) {
        if (input.isEmpty())
            return Collections.EMPTY_LIST;
        List<String> combinations = new ArrayList<>();
        return combinations;
    }

    private static boolean checkSumInTree(TreeNode root, int k) {
        if (root != null)
            return checkSumInTree(root, k, 0);
        else
            return false;
    }

    private static boolean checkSumInTree(TreeNode node, int k, int acum) {
        if (node == null )
            return false;
        if (isLeaf(node) && acum + node.val == k)
            return true;
        else
            if (acum + node.val > k)
                return false;
            else
                return checkSumInTree(node.left, k, acum + node.val) || checkSumInTree(node.right, k, acum + node.val);
    }

    private static boolean isLeaf(TreeNode node) {
        return (node != null && node.right == null && node.left == null);
    }


    private static List<List<String>> groupAnaGrams(String[] words) {
        List<List<String>> anagrams = new ArrayList<>();
        Map<KeyArrays, List<String>> detectWords = new HashMap<>();
        for (String word : words) {
            int[] count = new int[26];
            for(int i=0; i < count.length; i++)
                count[i] = 0;
            for(int j = 0 ; j < word.length(); j++ )
                count[word.charAt(j) - 'a'] += 1;
            KeyArrays key = new KeyArrays(count);
            List<String> elems = detectWords.getOrDefault(key, new ArrayList<>());
            elems.add(word);
            detectWords.put(key, elems);
        }

        for(Map.Entry<KeyArrays, List<String>> detectWord : detectWords.entrySet()) {
            anagrams.add(detectWord.getValue());
        }

        return anagrams;
    }

    private static String buildKey(int[] count) {
        String key = "";
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                char[] repeat = new char[count[i]];
                Arrays.fill(repeat, (char)(i + 'a'));
                key += new String(repeat);
            }
        }
        return key;
    }





//                 TI  TO
//    Shipment 1: [ 1, 3 ]  1 -> 3
//    Shipment 2: [ 2, 4 ]  2 -> 4
//    Shipment 3: [ 0, 6 ]  0 -> 6

//                  TI  TO
//    Shipment 1: [ 0, 1 ]  0 -> 1
//    Shipment 2: [ 2, 3 ]  2 -> 3
//    Shipment 3: [ 4, 5 ]  4 -> 5



    private static int calculatePeakShipment(List<Shipment> shipments) {

        int maxShipment = 0;
        int min = Integer.MAX_VALUE;
        int max = -1;
        for (Shipment shipment : shipments) {
            if (shipment.in < min)
                min = shipment.in;
            if (shipment.out > max)
                max =  shipment.out;
        }

        return maxShipment;
    }

    private static LinkedListExt reverseList(LinkedListExt list) {
        int repetitions = list.size;

        while(repetitions > 0) {
            int count = 1;
            LinkedListExt.NodeExt node = list.head;
            while (count < repetitions) {
                if (node.next != null) {
                    node.value = node.value + node.next.value;
                    node.next.value = node.value - node.next.value;
                    node.value  = node.value - node.next.value;
                    node = node.next;
                }
                ++count;
            }
            --repetitions;
        }
        return list;
    }

    private static int sumSubList(int[] list, int i, int j) {
        if (i < 0 || j >= list.length)
            return -1;

        int sum = 0;

        for (int k = i; k < j; k++)
            sum += list[k];
        return sum;
    }

    private static String[] strobogrammaticNumbers(Strobogrammatic strob, int n) {
        return strob.getWithNDigits(n);
    }


    private static boolean validCommandsOnStack(int n, int[] sequence) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i <= n; i++) {
            stack.push(i);
            if (i == sequence[j]) {
                stack.pop();
                ++j;
            }
        }

        while (!stack.isEmpty() && j <= n) {
            int value = stack.pop();
            if (value != sequence[j])
                return false;
            j++;
        }

        return stack.isEmpty();
    }


    private static Map<String, String[]> familyGrams(String query) {
        Map<String, String[]> response = new LinkedHashMap<>();
        if (query == null)
            return response;

        String[] data = query.split(" ");

        if (data.length == 0)
            return response;
        else {
            response.put("1gram", data);
            if (data.length == 1)
                return response;
        }

        for(int i = 1; i < data.length; i++) {
            Set<String> elems = new LinkedHashSet<>();
            for (int j= 0; j < data.length; j++) {
                if (j + i < data.length)
                    elems.add(String.join(" ", Arrays.copyOfRange(data, j, j + i + 1)));
            }
            String key = Integer.toString(i + 1) + "gram";
            response.put(key, elems.toArray(new String[0]));
        }

        return response;

    }

    private static Map<String, List<String>> familyGramsV2(String query) {
        Map<String, List<String>> response = new LinkedHashMap<>();
        if (query == null)
            return response;

        String[] data = query.split(" ");

        if (data.length == 0)
            return response;
        else {
            response.put("1gram", Arrays.asList(data));
            if (data.length == 1)
                return response;
        }

        for (int j= 0; j < data.length; j++) {
            int i = 1;
            while (j + i < data.length) {
                String key = Integer.toString(i + 1) + "gram";
                List<String> elems = response.getOrDefault(key, new LinkedList<>());
                elems.add(String.join(" ", Arrays.copyOfRange(data, j, j + i + 1)));
                response.put(key, elems);
                ++i;
            }
        }


        return response;

    }

    private static void printTriangle(int depth) {
        final String STAR = "*";
        final String SPACE = " ";
        for(int i = 0; i < depth; i++) {
            int numberOfStars = 1;
            int numberOfSpaces = 2 * (depth - 1 -i)  ;
            if (i != 0)
                numberOfStars = 2 * i;
             else
                --numberOfSpaces;

            printSpaces(numberOfSpaces, SPACE);
            for (int j = 0; j < (2 * numberOfStars - 1) ; j++)
                if(j % 2 == 0)
                    System.out.print(STAR);
                else
                    System.out.print(SPACE);
            printSpaces(numberOfSpaces, SPACE);
            System.out.println();
        }
    }


    private static void printSpaces(int numberOfSpaces, String space) {
        for (int j = 0; j < numberOfSpaces  ; j++)
            System.out.print(space);
    }

    private static String buildStringTriangle(int depth) {
        final String STAR = "*";
        final String SPACE = " ";
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < depth; i++) {
            int numberOfStars = 1;
            int numberOfSpaces = 2 * (depth - 1 -i)  ;
            if (i != 0)
                numberOfStars = 2 * i;
            else
                --numberOfSpaces;

            sb.append(buildSpaces(numberOfSpaces, SPACE));
            for (int j = 0; j < (2 * numberOfStars - 1) ; j++)
                if(j % 2 == 0)
                    sb.append(STAR);
                else
                    sb.append(SPACE);
            sb.append(buildSpaces(numberOfSpaces, SPACE));
            sb.append("\n");
        }
        return sb.toString();
    }
    private static String buildSpaces(int numberOfSpaces, String space) {
        final StringBuilder sb = new StringBuilder();
        for (int j = 0; j < numberOfSpaces  ; j++)
            sb.append(space);
        return sb.toString();
    }

    public static int countScore(String[] T, String[] R) {
        Map<String, Boolean> groups = new HashMap<>();
        int countOkIndividualTests = 0;
        int countIndividuals = 0;
        final String OK = "OK";
        for (int i = 0; i < T.length; i++) {
            String nameTest = T[i];
            Character lastCharacter = nameTest.charAt(nameTest.length() -1);
            if (lastCharacter >= 'a' && lastCharacter <= 'z') {
                String nameGroup = nameTest.substring(0, nameTest.length() - 1);
                boolean testStatus = R[i].equals(OK);
                boolean testGroupStatus = groups.getOrDefault(nameGroup, true);
                groups.put(nameGroup, testGroupStatus && testStatus);
            }
            else {
                 if (R[i].equals(OK))
                     ++countOkIndividualTests;
                 ++ countIndividuals;
            }

        }
        int countGroupsOK = Collections.frequency(new ArrayList<> (groups.values()) , true);
        double result = ((countGroupsOK + countOkIndividualTests) * 100.0 ) / (countIndividuals + groups.size());
        int resultInt = (int) result;
        int decimalPartAsUnit = (int )((result-resultInt) * 10);
        if (resultInt % 10 < decimalPartAsUnit)
            ++resultInt;
        return resultInt;
    }

    private static void convertArray(int[] input) {
        for(int i = 0; i < input.length; i++) {
            int proxIndex = i + 1;
            if (input[i] == 0 && proxIndex < input.length) {
                int current = input[proxIndex];
                for(int j =  proxIndex; j < input.length; j++)
                    if (j + 1 < input.length) {
                        current = current + input[j + 1];
                        input[j + 1] = current - input[j + 1];
                        current = current - input[j + 1];
                    }
                ++i;
                input[i] = 0;
            }

        }

    }


    private static Map<String, Integer> countFollowres(List<List<String>> input) {
        Map<String, Integer> counterFollowers = new HashMap<>();
        for(List<String> followers : input)
            for(String follower : followers)
                if (counterFollowers.containsKey(follower))
                    counterFollowers.put(follower, counterFollowers.get(follower) + 1);
                else
                    counterFollowers.put(follower, 0);
        return counterFollowers;
    }

    private static boolean validIpV4NotRegex(String ip) {
        if (ip == null)
            return false;
        if (ip.isEmpty())
            return false;
        String[] blocks = ip.split("\\.");
        if(blocks.length < 4)
            return false;
        for(String block : blocks)
            try {
                if (block.length() > 3 || Integer.parseInt(block) > 255)
                    return false;
            }
            catch(NumberFormatException nfe) {
                return false;
            }
         return true;
    }

    private static boolean validIpV4NotRegexV2(String ip) {
        if (ip == null)
            return false;
        if (ip.isEmpty() )
            return false;
        int countPoints = 0;
        String block = "";
        for(int i = 0; i < ip.length(); i++) {
            if (ip.charAt(i) == '.') {
                ++countPoints;
                try {
                    if (block.length() > 3 || Integer.parseInt(block) > 255)
                        return false;
                }
                catch(NumberFormatException nfe) {
                    return false;
                }
                block = "";
            }
            else
                block += ip.charAt(i);
        }


        return (countPoints == 3);
    }

    private static  double wordsAverage(String input) {
        if (input == null)
            return 0;
        if (input.isEmpty())
            return 0;
        int wordCount = 0;
        int spaceCount = 0;
        int inputLength = input.length();
        for(int i = 0; i < inputLength; i ++) {
            if (input.charAt(i) == ' ') {
                ++wordCount;
                ++spaceCount;
            }
        }
        ++wordCount;
        return (1.0 * inputLength - spaceCount) / wordCount;
    }

    private static int buyAndSell(int[] priceByDay) {
        if (priceByDay == null)
            return 0;
        if (priceByDay.length < 2)
            return 0;

        int highestPrice = Integer.MIN_VALUE;
        int lowestPrice = Integer.MAX_VALUE;
        int bestDayToBuy = -1;
        int bestDayToSell = -1;
        int lastBestProfit = -1;
        for (int i = 0; i < priceByDay.length; i++) {
            if(priceByDay[i] < lowestPrice && i < priceByDay.length  - 1)
            {
                bestDayToBuy = i;
                if ( bestDayToSell != -1 && bestDayToBuy > bestDayToSell) {
                    if (highestPrice - lowestPrice > lastBestProfit)
                        lastBestProfit = highestPrice - lowestPrice;
                    highestPrice = Integer.MIN_VALUE;
                }
                lowestPrice = priceByDay[i];

            }
            if (priceByDay[i] > highestPrice && i > 0 ) {
                highestPrice = priceByDay[i];
                bestDayToSell = i;
            }


        }
        if (bestDayToBuy <= bestDayToSell) {
            int profit = priceByDay[bestDayToSell] - priceByDay[bestDayToBuy];
            return (profit > 0) ? (profit > lastBestProfit) ? profit : lastBestProfit : (lastBestProfit != -1) ? lastBestProfit: 0;

        }
        else
            return 0;
    }

    //BODOTO
    //((BO), (DO), (TO))
    //((BA), (BE), (TC)

    private static boolean isWordInBlocks(String word, String blocks) {
        if(blocks.length()/2 < word.length())
            return false;

        List<String> combinations = new ArrayList<>();
        combinations.add(blocks);
        for(int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            boolean foundTheLetter = false;
            List<String> nextCombinations = new ArrayList<>();
            for(String combination : combinations) {
                List<Integer> positions  = new ArrayList<>();
                for (int index = combination.indexOf(letter); index >= 0; index = combination.indexOf(letter, index + 1)) {
                    positions.add(index);
                }
                for(Integer position : positions) {
                    int partnerPosition = position / 2;
                    StringBuilder sb = new StringBuilder(combination);
                    sb.deleteCharAt(position);
                    sb.deleteCharAt(partnerPosition * 2);
                    nextCombinations.add(sb.toString());
                }
                foundTheLetter = foundTheLetter || (positions.size() > 0);
            }

            if (!foundTheLetter)
                return foundTheLetter;
            else
            {
                combinations = nextCombinations;
            }
        }
        return true;
    }



    private static void markAsSeen(List<Integer> island, int[][] grid, int i, int j, int i0, int j0) {
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[i].length - 1) {
            return;
        }
        if (grid[i][j] == LAND) {
            island.add(i - i0);
            island.add(j - j0);
            grid[i][j] = SEENLAND;
            markAsSeen(island, grid, i + 1, j, i0, j0);
            markAsSeen(island, grid, i - 1, j, i0, j0);
            markAsSeen(island, grid, i, j + 1, i0, j0);
            markAsSeen(island, grid, i, j - 1, i0, j0);
        }
    }

    public static int numDistinctIslands(int[][] grid) {
        Set<List<Integer>> seenIslands = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == LAND) {
                    List<Integer> currentIsland = new ArrayList<>();
                    markAsSeen(currentIsland, grid, i, j, i, j);
                    if (!seenIslands.contains(currentIsland)) {
                        seenIslands.add(currentIsland);
                    }
                }
            }
        }
        return seenIslands.size();
    }

    private static int countBlacks(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[i].length - 1) {
            return 0;
        }
        if (grid[i][j] == LAND) {
            grid[i][j] = SEENLAND;
            return 1 + countBlacks(grid, i + 1, j) +
                       countBlacks(grid, i - 1, j) +
                       countBlacks(grid, i, j + 1) +
                       countBlacks(grid, i, j - 1);

        }
        return 0;
    }
    public static int countBlockWithOne(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++)
                if (grid[i][j] == LAND)
                    count += countBlacks( grid, i, j);
        }
        return count;
    }


    public static List<String> wordBreak1(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        if( s.length() <= 0) return res;
        Set<String> dic = new HashSet<>(wordDict);

        backTrack1(res,"",s,dic,0);

        return res;
    }
    //TLE
    private static void backTrack1(List<String> res, String path, String s, Set<String> dic, int idx ){
        if(idx==s.length()){
            res.add(path);
            return;
        }
        for(int i=idx;i<s.length();i++){
            String cur=s.substring(idx,i+1);
            if(dic.contains(cur)){
                if(idx==0)  backTrack1(res, cur,s,dic,i+1);
                else backTrack1(res, path+" "+ cur,s,dic,i+1);
            }
        }
    }


    public static String lexSmallestV2(String input) {
        Map<Character, Integer[]>  letterPositions = new HashMap<>();
        Set<Character>  letters = new TreeSet<>();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            letters.add(letter);
            if (!letterPositions.containsKey(letter)) {
                Integer[] positions = new Integer[2];
                letterPositions.put(letter, positions);
                positions[0] = i;
            }
            else {
                Integer[] positions = letterPositions.get(letter);
                positions[1] = i;
                letterPositions.put(letter, positions);
            }
        }
        for(Character letter: letters) {
            Integer[] positions = letterPositions.get(letter);
            Set<Integer> endPositions = new TreeSet<>();
            endPositions.add(positions[0]);
            for(Map.Entry<Character, Integer[]> letterPosition : letterPositions.entrySet()) {
                if (letter != letterPosition.getKey() && positions[0] < letterPosition.getValue()[1])
                    endPositions.add(letterPosition.getValue()[1]);
                else
                if (letter != letterPosition.getKey())
                    break;
            }
            if (endPositions.size() == letters.size())
                return String.valueOf(input.charAt(positions[0]));
        }
        return String.valueOf(input.charAt(0));
    }

    private static  boolean isSubSetSumV1(int[] set, int length, int sum) {
        if (set == null)
            return false;
        if (set.length == 0)
            return false;
        if (length == 1)
            return set[0] == sum;
        for(int i = 0; i < length - 1; i++)
            for (int j = i + 1; j < length; j++)
                if ((set[i] + set[j]) == sum)
                    return true;
        return false;
    }

    private static  boolean isSubSetSumV2(int[] set, int length, int sum) {
        if (set == null)
            return false;
        if (set.length == 0)
            return false;
        if (length == 1)
            return set[0] == sum;

        if (sum > 0 && length == 0)
            return false;
        else
            if (sum == 0)
                return true;
            else
                return isSubSetSumV2(set, length - 1, sum) || isSubSetSumV2(set, length - 1, sum - set[length -1]);

    }

    private static List<Integer> flattenEither(List<Either> eithers) {
        List<Integer> flattenNumbers = new ArrayList<>();
        flattenEither(eithers, flattenNumbers);
        return flattenNumbers;
    }


    private static void flattenEither(List<Either> eithers, List<Integer> integers) {
        for (Either either : eithers)
            if (either.isInt())
                integers.add(either.getInt());
            else
                flattenEither(either.getList(), integers);

    }

    public static int minMoveOfTheString(String S) {
        if (S == null)
            return 0;
        if (S.length() < 3)
            return 0;
        int countRepetition = 0;
        int move = 0;
        char lastChar = ' ';
        for (int i = 0; i < S.length(); i++)
            if (lastChar != ' ') {
                if (lastChar == S.charAt(i))
                    ++countRepetition;
                else {
                    lastChar = S.charAt(i);
                    countRepetition = 1;
                }
                if (countRepetition == 3) {
                    StringBuilder sb = new StringBuilder(S);
                    int positionToChange = i - 1;
                    if ( i + 1 < S.length() )
                        if (S.charAt(i +1) == lastChar)
                            positionToChange = i;

                    sb.setCharAt(positionToChange ,( lastChar == 'a') ? 'b' : 'a');
                    S = sb.toString();
                    lastChar = S.charAt(i);
                    countRepetition = 1;
                    ++move;
                }
            }
            else {
                lastChar = S.charAt(i);
                countRepetition = 1;
            }

        return move;
    }

//
//    avoid 2 letters together and choose the minor cost
//    Example test:   ('abccbd', [0, 1, 2, 3, 4, 5])
//    WRONG ANSWER (got 0 expected 2)
//
//    Example test:   ('aabbcc', [1, 2, 1, 2, 1, 2])
//    WRONG ANSWER (got 0 expected 3)
//
//    Example test:   ('aaaa', [3, 4, 5, 6])
//    WRONG ANSWER (got 0 expected 12)
//
//    Example test:   ('ababa', [10, 5, 10, 5, 10])
//    OK (expected value 0)
//
//    Detected some errors.
    public  static int costToDelete(String S, int[] C) {
        char pivotChar = ' ';
        Map<Character, Set<Integer>> repeatedCharPositions = new HashMap<>();
        Map<Character, Integer> charCosts = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if (pivotChar != ' ') {
                if (pivotChar == currentChar) {
                    Set<Integer> costPerpositions = repeatedCharPositions.getOrDefault(currentChar, new HashSet<>());
                    costPerpositions.add(C[i]);
                    costPerpositions.add(C[i - 1]);
                    repeatedCharPositions.put(currentChar, costPerpositions);
                } else
                    pivotChar = currentChar;
                charCosts.put(pivotChar, charCosts.getOrDefault(pivotChar, 0) + C[i]);

            }
            else {
                pivotChar = currentChar;
                charCosts.put(pivotChar, charCosts.getOrDefault(pivotChar, 0) + C[i]);
            }

        }
        return calculateCost(repeatedCharPositions, charCosts);
    }


    private static int calculateCost(Map<Character, Set<Integer>> repeatedChars, Map<Character, Integer> charCosts ) {
        int cost = 0;
        for(Map.Entry<Character, Set<Integer>> repeatedChar : repeatedChars.entrySet() ) {
            int minValuePerChar = Integer.MAX_VALUE;
            int costAllChar = charCosts.get(repeatedChar.getKey());
            for(Integer costPerCharPoistion: repeatedChar.getValue()) {
                if (costAllChar - costPerCharPoistion < minValuePerChar)
                    minValuePerChar = costAllChar - costPerCharPoistion;
            }
            cost += minValuePerChar;
        }
        return cost;
    }





}
