package com.zooplus.jrex.dia3

import arrow.core.Either

data class Demo(var x: Int)

fun validate(x: Demo): Either<Error, Demo> {
    if (x.x < 5) {
        return Either.Left(Error.BAD_LENGTH)
    } else if (x.x % 2 == 0) {
        return Either.Left(Error.IS_ODD)
    }
    return Either.Right(x) //Or x.right()

}

fun main() {

    val a: Either<Error, Demo> = validate(Demo(5))
    println(a)

}
