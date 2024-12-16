# Kotlin List Immutability After map()

This example demonstrates an often-overlooked aspect of Kotlin's collection processing functions. The `map` function, while powerful, returns a *new* list, leaving the original list unchanged.  This can lead to unexpected behavior if the user assumes the original list is modified.

## Bug Report
The provided `Bug.kt` file showcases a scenario where a user expects the original list to be modified after using `map`. Instead, `map` creates a new list containing the transformed elements.

## Solution
The solution, presented in `Solution.kt`, clarifies how to achieve the desired outcome.  Instead of modifying the original list (which is immutable in the case of `listOf`),  the code now correctly handles the new list produced by `map`.