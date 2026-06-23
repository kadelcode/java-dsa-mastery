# Conventional Commits

This repository follows the Conventional Commits specification.

Format:

<type>(scope): description

Example:

feat(arrays): implement binary search

---

## Commit Types

### feat

New functionality.

Example:

feat(linkedlist): implement singly linked list

---

### fix

Bug fixes.

Example:

fix(stack): handle empty stack pop

---

### docs

Documentation changes.

Example:

docs(java): add collections overview

---

### test

Tests only.

Example:

test(queue): add enqueue tests

---

### refactor

Code restructuring without behavior changes.

Example:

refactor(graph): simplify traversal logic

---

### build

Build-related changes.

Example:

build(maven): configure compiler plugin

---

### ci

CI/CD changes.

Example:

ci(github-actions): add build workflow

---

### chore

Repository maintenance.

Example:

chore(gitignore): update ignored files

---

## Scope Guidelines

Use meaningful scopes.

Examples:

java
oop
arrays
linkedlist
stack
queue
trees
graphs
sorting
searching
dp
docs
build

---

## Good Examples

feat(arrays): implement prefix sum
docs(graphs): add BFS notes
test(trees): add BST tests
build(maven): configure surefire plugin

---

## Bad Examples

update code
fix stuff
changes
work in progress

Commit messages should clearly communicate intent.
