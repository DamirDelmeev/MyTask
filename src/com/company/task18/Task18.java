package com.company.task18;

public class Task18 {
    /**
     * Найти максимальный элемент(ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие.
     * Гарантируется что после удаления в матрице останется хотя бы один элемент.
     * <a href="https://github.com/elefus/epam-core-04-2018/wiki/Представление-матриц">Представление матриц</a>
     *
     * Формат входных данных:
     * N - целое число (0 < N < 10)
     * N ^ 2 целых чисел (Integer.MIN_VALUE < element < Integer.MAX_VALUE)
     *
     * Формат выходных данных:
     * В результате выполнения задания в выходной поток должна быть выведена преобразованная матрица.
     * Так как матрица в результате преобразования может перестать быть квадратной - несколько изменяется формат её представления:
     * N (целое число) - количество строк
     * M (целое число) - количество столбцов
     * N * M целых чисел, являющихся элементами матрицы
     *
     * ---------------------------------------------------------------------------------------------------
     * Примеры выполнения задания:
     *
     * Входные данные:
     *  3
     *  2  1 -3
     * -2  3  2
     * -1  0  0
     *
     * Выходные данные:
     *  2
     *  2
     *  2 -3
     * -1  0
     *
     *
     *
     * Входные данные:
     *  4
     *  3 -2 -4  1
     *  1  4  4  2
     * -1  0 -3  1
     *  0  2  1  3
     *
     * Выходные данные:
     *  3
     *  2
     *  3  1
     * -1  1
     *  0  3
     */
}
