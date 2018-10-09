import java.util.Scanner

class TowerOfHanoi {

    fun solve(n: Int, start: String, auxiliary: String, end: String) {
        if (n == 1) {
            println("$start -> $end")
        } else {
            solve(n - 1, start, end, auxiliary)
            println("$start -> $end")
            solve(n - 1, auxiliary, start, end)
        }
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val towerOfHanoi = TowerOfHanoi()
            print("Enter number of discs: ")
            val scanner = Scanner(System.`in`)
            val discs = scanner.nextInt()
            towerOfHanoi.solve(discs, "A", "B", "C")
        }
    }
}