package com.learn.algorithm;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 8; // Số con hậu
        List<List<String>> solutions = solveNQueens(n);
        printSolutions(solutions);
    }

    // Hàm chính để tìm tất cả cách đặt N con hậu
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        int[] board = new int[n]; // Lưu vị trí của hậu trên từng hàng (chỉ lưu cột)
        solve(0, n, board, solutions);
        return solutions;
    }

    // Hàm đệ quy để đặt hậu vào từng hàng
    private static void solve(int row, int n, int[] board, List<List<String>> solutions) {
        if (row == n) {
            solutions.add(generateBoard(board, n)); // Nếu đặt xong thì thêm vào danh sách kết quả
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board)) { // Kiểm tra vị trí có an toàn không
                board[row] = col; // Đặt hậu
                solve(row + 1, n, board, solutions); // Đệ quy cho hàng tiếp theo
                board[row] = -1; // Quay lui
            }
        }
    }

    // Kiểm tra xem có thể đặt hậu vào (row, col) hay không
    private static boolean isSafe(int row, int col, int[] board) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false; // Cùng cột hoặc cùng đường chéo
            }
        }
        return true;
    }

    // Chuyển mảng `board[]` thành danh sách chuỗi thể hiện bàn cờ
    private static List<String> generateBoard(int[] board, int n) {
        List<String> boardConfig = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder(".".repeat(n));
            row.setCharAt(board[i], 'Q');
            boardConfig.add(row.toString());
        }
        return boardConfig;
    }

    // In kết quả
    private static void printSolutions(List<List<String>> solutions) {
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}