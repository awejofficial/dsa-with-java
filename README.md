# dsa-with-java

> **Learn Data Structures & Algorithms (DSA) in Java — practical, clean, and beginner-friendly.**

**Repository purpose**

This repo collects Java implementations of common data structures and algorithms, organized by topic so learners (and contributors) can read, run, and test solutions quickly. It's built as a lightweight starter that also contains a minimal Java API service (Spring Boot) to demonstrate how algorithm code can be packaged and run in a real project.

---

## Quick highlights

* Organized by topic: `arrays`, `linkedlist`, `stack`, `queue`, `trees`, `graphs`, `dp`, `sorting`, `searching`, etc.
* Each solution follows a simple pattern: clear file name, short problem statement, clean code, and a `main()` or test showing usage.
* Minimal Spring Boot API starter included — useful if you want to expose solutions over HTTP or deploy to Cloud Run.

---

## Getting started

### Prerequisites

* Java 11+ (or the version specified in `pom.xml`)
* Maven
* An IDE (IntelliJ, VS Code) or a terminal

### Run the project

Server should run automatically when starting a workspace. To run manually, from the project root run:

```bash
mvn spring-boot:run
```

You can also run individual classes from your IDE (look for classes with `main()` methods) or run tests via:

```bash
mvn test
```

---

## Project structure (actual)

Your project structure may differ slightly as this repo is being built while learning. A typical structure may look like this:

```
src/
  main/
    java/com/awej/dsa/
      arrays/          # problems related to arrays
      linkedlist/      # problems related to linked list
      stack/           # stack implementation and problems
      queue/           # queue problems
      trees/           # binary trees, BST, etc.
      graphs/          # graph traversal and algorithms
      dp/              # dynamic programming
      sorting/         # sorting algorithms
      searching/       # searching algorithms
      api/             # minimal Spring Boot controllers (optional)
  test/
    java/...           # unit tests for solutions
pom.xml
README.md
```

*(Note: since this repo grows while learning, the folder names and arrangement may change a little, but overall the idea is to keep solutions grouped by topic.)*

---

## How to add a solution (contributor-friendly)

1. Pick a topic folder (or create it if missing).
2. Create a new Java class named like `ProblemName_Topic.java` or `Topic_ProblemShortName.java` (examples below).
3. At the top of the file include a 2–3 line problem statement and expected input/output.
4. Provide a `main()` with a short example, and add JUnit tests under `src/test/java` when possible.
5. Follow simple style: small methods, meaningful variable names, and brief comments explaining tricky parts.

**Example file name suggestions**

* `arrays/TwoSum.java`
* `trees/LevelOrderTraversal.java`
* `dp/Knapsack01.java`

---

## Examples

* `arrays/TwoSum.java` — two-pointer or hashmap approach
* `sorting/MergeSort.java` — recursive merge sort
* `graphs/BFSShortestPath.java` — BFS for shortest path in unweighted graph

(Actual files live under the `src` folder — open them to see sample usage.)

---

## Using the Spring Boot API starter

This repository includes a minimal Java API service starter based on Google Cloud Run Quickstart. It is optional — primarily included so you can learn how to serve algorithm endpoints.

* Start the server: `mvn spring-boot:run`
* Open `http://localhost:8080` (or the port shown in logs) to see any example endpoints under `src/main/java/.../api`.

---

## Contributing

* Fork → create a feature branch → implement → add tests → open a Pull Request.
* Add a short description of the algorithm in the PR and which input cases you verified.
* Keep implementations readable — prefer clarity over cleverness.

---

## Coding conventions

* Java 11+ features are allowed (var, streams) but avoid excessive cleverness.
* Keep methods short; split large logic into helper methods.
* Write small unit tests showing correctness for edge cases.

---

## License

This repo is available under the MIT License — see `LICENSE` (or add one if missing).

---

## Contact / About the author

If you have questions or want to collab: open an issue or PR. Maintainer: **Awej** — student learning DSA alongside the Apna Coll
