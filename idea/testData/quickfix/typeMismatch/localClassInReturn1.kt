// "Change return type of current function 'foo' to 'U'" "true"
interface T
interface U

fun foo() {
    open class A: T
    class B: A(), U

    return <caret>B()
}