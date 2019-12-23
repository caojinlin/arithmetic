package com.study.arithmetic.binarytree.printer;

/**
 * 
 * @author MJ Lee
 *
 */
public final class BinaryTrees {

	private BinaryTrees() {
	}

	public static void print(BinaryTreeInfo tree) {
		print(tree, null);
	}

	public static void println(BinaryTreeInfo tree) {
		println(tree, null);
	}

	public static void print(BinaryTreeInfo tree, PrintStyle style) {
		if (tree == null || tree.root() == null) return;
		printer(tree, style).print();
	}

	public static void println(BinaryTreeInfo tree, PrintStyle style) {
		if (tree == null || tree.root() == null) return;
		printer(tree, style).println();
	}

	public static String printString(BinaryTreeInfo tree) {
		return printString(tree, null);
	}

	public static String printString(BinaryTreeInfo tree, PrintStyle style) {
		if (tree == null || tree.root() == null) return null;
		return printer(tree, style).printString();
	}

	private static AbstractPrinter printer(BinaryTreeInfo tree, PrintStyle style) {
		if (style == PrintStyle.INORDER) return new InorderAbstractPrinter(tree);
		return new LevelOrderAbstractPrinter(tree);
	}

	public enum PrintStyle {
		LEVEL_ORDER, INORDER
	}
}