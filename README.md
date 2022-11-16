Reproducer for `No value passed for parameter 'mustExist'`

To reproduce:

* `./gradlew :compileAppleMainKotlinMetadata`

You should get an error like so:

```
> Task :compileAppleMainKotlinMetadata FAILED
e: file:///Users/mbonnin/git/test-okio/src/commonMain/kotlin/Main.kt:7:42 No value passed for parameter 'mustExist'

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileAppleMainKotlinMetadata'.
> Compilation finished with errors

```

Reverting kotlin to `1.7.21` fixes the issue