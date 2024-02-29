## Fast Forward
Fast forward merge can occur when there is a linear path from the current branch tip to the target branch.
- Create New Branch -> adds some commits -> integrate it into the main line with fast-forward merge
![Step 1 ](/'Clone%the%repositories.png')
## 3 Way merge
Similar of Fast forward merge, but it requires a 3-way merge because main progresses while the feature is in-progress. This is a common scenario for large features or when several developers are working on a project simultaneously.
- Checkout on develop branch (Child) -> make some commits -> checkout on main(Parent) branch -> make some commits -> merge in the develop (Child) branch

