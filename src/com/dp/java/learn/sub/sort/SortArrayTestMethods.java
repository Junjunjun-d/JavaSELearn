package com.dp.java.learn.sub.sort;


public class SortArrayTestMethods {
	// 选择排序打印输出
	public static void selectionSort() {
		int[] intArray = { 9, 8, 2, 41, 36, 1 };
		PrintOutIntArray.printArray(SelectioSortArray.sortArray(intArray));
	}
	// 冒泡排序打印输出
	public static void bubblingSort() {
		PrintOutIntArray.printArray(SelectioSortArray.sortArray(GetRandomArray
				.getArrays()));
	}



}
