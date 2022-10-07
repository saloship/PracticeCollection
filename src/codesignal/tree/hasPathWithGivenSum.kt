package codesignal.tree

fun main() {
    val tree = Tree(5, Tree(7, null, null), null)
    println(hasPathWithGivenSum().solution(tree, 12))
}

class hasPathWithGivenSum {
    // Given a binary tree t and an integer s, determine whether there is a root to leaf path in t such that the sum of vertex values equals s.

    fun solution(t: Tree<Int>?, s: Int): Boolean {
        if (t == null)
            return false
        return isPathWithGivenSum(t, s, 0)
    }

    fun isPathWithGivenSum(node: Tree<Int>?, pathSum: Int, currentSum: Int): Boolean {
        var newSum = currentSum + node!!.value
        if (node.left == null && node.right == null) {
            return newSum == pathSum
        }
        return node.left?.let { isPathWithGivenSum(it, pathSum, newSum) } ?: false || node.right?.let {
            isPathWithGivenSum(
                it,
                pathSum,
                newSum
            )
        }?: false
    }

}