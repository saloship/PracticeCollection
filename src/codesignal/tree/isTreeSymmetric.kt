package codesignal.tree

class isTreeSymmetric {

    fun solution(t: Tree<Int>?): Boolean {
        if (t == null) return true
        return isEqual(t.left, t.right)
    }

    fun isEqual(t1: Tree<Int>?, t2: Tree<Int>?):Boolean {
        if(t1 == null && t2 == null) return true
        if(t1 == null || t2 == null) return false

        return (t1.value == t2.value) &&
                isEqual(t1.left, t2.right) &&
                isEqual(t2.left, t1.right)
    }
}