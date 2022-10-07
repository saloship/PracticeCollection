package codesignal.tree

class Tree<T>(
    var value: T,
    var left: Tree<T>? = null,
    var right: Tree<T>? = null
)