package ru.nabuhiro.java.basic.homeworks.lesson17;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode L1 = new TreeNode(1);
        TreeNode L2 = new TreeNode(2);
        TreeNode L3 = new TreeNode(3);
        root.add(L1, L2, L3);
        TreeNode L1_1 = new TreeNode(4);
        TreeNode L1_2 = new TreeNode(5);
        L1.add(L1_1, L1_2);
        TreeNode L2_1 = new TreeNode(6);
        TreeNode L2_2 = new TreeNode(7);
        TreeNode L2_3 = new TreeNode(8);
        L2.add(L2_1, L2_2, L2_3);
        TreeNode L3_1 = new TreeNode(9);
        TreeNode L3_2 = new TreeNode(10);
        L3.add(L3_1, L3_2);
        printTree(root);
    }

    public static void printTree(TreeNode treeNode) {
        System.out.println(treeNode.getElement());
        for (int i = 0; i < treeNode.getChilds().size(); i++) {
            printTree(treeNode.getChilds().get(i));
        }
    }
}
/*Из Предварительно отсортированного списка (List) сформировать двоичное дерево поиска
Написать рекурсивную функцию поиска в сформированном дереве
Класс должен имплементировать следующий интерфейс
```
public interface SearchTree {
/**
@param element to find
@return element if exists, otherwise - null
/
T find(T element);
List getSortedList();
}
```*/
