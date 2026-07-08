# 75. Sort Colors

## Problem Statement

Given an array `nums` containing only `0`, `1`, and `2`, sort the array **in-place** without using any built-in sorting function.

* `0` represents **Red**
* `1` represents **White**
* `2` represents **Blue**

### Example

**Input**

```text
nums = [2,0,2,1,1,0]
```

**Output**

```text
[0,0,1,1,2,2]
```

---

# Approach

I solved this problem using the **Dutch National Flag Algorithm**, which sorts the array in a single traversal using three pointers.

## Idea

Instead of comparing every element multiple times like Bubble Sort, I divide the array into four regions:

```text
| 0s | 1s | Unknown | 2s |
```

I maintain three pointers:

* **low** → Points to the position where the next `0` should be placed.
* **mid** → Traverses the array and processes the current element.
* **high** → Points to the position where the next `2` should be placed.

Initially:

```text
low = 0
mid = 0
high = n - 1
```

---

## Algorithm

While `mid <= high`:

### Case 1: `nums[mid] == 0`

* Swap `nums[mid]` with `nums[low]`.
* Increment both `low` and `mid`.

Reason:
The `0` is now in its correct position, and the element swapped from the `low` position has already been processed.

---

### Case 2: `nums[mid] == 1`

* Simply increment `mid`.

Reason:
`1` already belongs in the middle section, so no swapping is required.

---

### Case 3: `nums[mid] == 2`

* Swap `nums[mid]` with `nums[high]`.
* Decrement `high`.
* Do **not** increment `mid`.

Reason:
The element that comes from the `high` position has not been processed yet, so it must be checked in the next iteration.

---

# Dry Run

Input:

```text
[2,0,2,1,1,0]
```

Initial pointers:

```text
low = 0
mid = 0
high = 5
```

### Step 1

```
2 found

Swap with high

[0,0,2,1,1,2]

high--
```

### Step 2

```
0 found

Swap with low

low++
mid++
```

### Step 3

```
0 found

Swap with low

low++
mid++
```

### Step 4

```
2 found

Swap with high

[0,0,1,1,2,2]

high--
```

### Step 5

```
1 found

mid++
```

### Step 6

```
1 found

mid++
```

Now `mid > high`, so the array is completely sorted.

---

# Why don't we increment `mid` after swapping with `high`?

Consider the following example:

```text
Before:

[0,1,2,0]
     ↑
    mid
       ↑
      high
```

After swapping:

```text
[0,1,0,2]
     ↑
    mid
```

The new element at `mid` is `0`, which has not been processed yet.

If we increment `mid`, we would skip this element, resulting in an incorrect solution.

Therefore, we only decrement `high` and process `mid` again.

---

# Complexity Analysis

**Time Complexity:** `O(n)`

* Every element is processed at most once.

**Space Complexity:** `O(1)`

* Only three pointers and one temporary variable are used.

---

# Key Takeaways

* Uses the **Dutch National Flag Algorithm**.
* Solves the problem in a **single traversal**.
* No extra array is required.
* More efficient than Bubble Sort (`O(n²)`), as it runs in **O(n)** time.
