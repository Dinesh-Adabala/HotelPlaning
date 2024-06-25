package model;

import java.util.List;

public class Node {
    String key;
    String value;
    List<Node> nodeList;

    @Override
    public String toString() {
        return "Node{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", nodeList=" + nodeList +
                '}';
    }
}
