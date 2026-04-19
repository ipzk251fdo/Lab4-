package task3;

import java.util.ArrayList;
import java.util.List;

public class LightElementNode extends LightNode {
    private String tagName;
    private List<LightNode> children = new ArrayList<>();

    public LightElementNode(String tagName) {
        this.tagName = tagName;
    }

    public void addChild(LightNode node) {
        children.add(node);
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public String getOuterHTML() {
        StringBuilder sb = new StringBuilder("<" + tagName + ">");
        for (LightNode child : children) {
            sb.append(child.getOuterHTML());
        }
        sb.append("</" + tagName + ">");
        return sb.toString();
    }
}