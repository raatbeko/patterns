package structuralPatterns.decorator;

public abstract class TreeDecorator implements ChristmasTree {
    private final ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
