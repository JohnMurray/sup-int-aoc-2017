import org.specs2.mutable.Specification

class Day1 extends Specification {

  "aoc tests" >> {
    "test case 1" >> {
      aoc.solveCaptcha("11") must_== 2
    }

    "test case 2" >> {
      aoc.solveCaptcha("1") must_== 0
    }

    "example cases 1" >> {
      aoc.solveCaptcha("1122") must_== 3
    }
    "example cases 2" >> {
      aoc.solveCaptcha("1111") must_== 4
    }
    "example cases 3" >> {
      aoc.solveCaptcha("1234") must_== 0
    }
    "example cases 4" >> {
      aoc.solveCaptcha("91212129") must_== 9
    }
    "example cases 5" >> {
      aoc.solveCaptcha("9121442129") must_== 13
    }
  }

}
