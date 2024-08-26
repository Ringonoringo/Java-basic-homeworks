package ru.nabuhiro.java.basic.homeworks.lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeNode {
    private Integer element;
    private List<TreeNode> childs;

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public List<TreeNode> getChilds() {
        return childs;
    }

    public void setChilds(List<TreeNode> childs) {
        this.childs = childs;
    }
    public TreeNode(Integer element){
        this.element = element;
        this.childs = new ArrayList<>();
    }
    public void add(TreeNode... TreeNodes){
        this.childs.addAll(Arrays.asList(TreeNodes));
    }
}
