# Technical Test

## Language/Framework Assessment

1) = I've been paid to write production quality code with it.
2) = Appreciable experience outside of production
3) = Light experience / can follow logic
4) = I could write a Hello World web application if I had a tutorial. 

- __JQuery__  => 1
- __Python__  => 2
- __PHP__     => 4
- __Scala__   => 1
- __Clojure__ => 3
- __Haskell__ => 4
- __Golang__  => 4
- __Node.js__ => 1
- __Ruby__    => 1
- __Perl__    => 4
- __Java__    => 1
- __Angular__ => 1
- __Chef.__   => 4

## Running
#### HexToBase64
```
sbt "run-main com.signalpath.HexToBase64 ${arg}"
```

#### SpecialMath
```
sbt "run-main com.signalpath.SpecialMath ${arg}"
```
As for the case of calculating SpecialMath 90... That's TBD pending on how long it takes my machine to run 
the calculation. One of two things should happen in theory: 1) It will work and be a silly large number
or 2) It will exceed Long.MAX_VALUE, causing an overflow, and wrap around Long.MIN_VALUE

## Tests
```
sbt test
```