------
# 题目图解，在项目的wiki

------
### 1. 数组（essay)    
|编号| 题目        |思路|
|--------: | -------- |-------- |
|66| 加一     |暴力|
|121| 买卖股票的最佳时机 I        | |
|122| 买卖股票的最佳时机 II        | |
|167| 两数之和 II - 输入有序数组| |
|169| 求众数|(排序（冒泡）求中间数)| |
|217| 存在重复元素|（对数组进行排序，然后比较 第i位 与 第i+1位 。看是否相同。注:用暴力算法会超时）|
|268| 缺失数字|(升序,循环比较 i 与nums[i] 是否相等)	|					
|283| 移动零|（先将非0数移到首部，尾部补零）|			
|628| 三个数的最大乘积|（看注释）|			 
|53| 最大子序和| |
|566| 重塑矩阵|（看注释）|				 
|867| 转置矩阵 (2个for循环)| |
|905| 按奇偶校验排序数组|(改进:左右索引，双指针)|					
|766| 托普利茨矩阵|(主要判断 : matrix[i][j] != matrix[i+1][j+1] 是否正确 )|				
|118| 杨辉三角| |		
|448| 找到所有数组中消失的数字| |
|219| 存在重复元素 II | |
|888| 公平的糖果交换| |
|832| 翻转图像||
	
### 2. 数组（middle)
|编号| 题目        |思路|
|--------: | --------  |--------: |
|11 | 盛最多水的容器|(双指针法)一个头一个尾，小的向中间移动一格 |
|59|螺旋矩阵 II|（看源码 |
|287|寻找重复数|二分法|
|48|旋转图像||
|442| 数组中重复的数据||
|950|按递增顺序显示卡牌||

### 3. 链表（essay)
|编号| 题目        |思路|
|--------: | --------  |-------- |
|237 | 删除链表中的节点| |	
|876 | 链表的中间结点| (双指针)快指针走2步，慢指针走1步。快指针到终点时，慢指针为中间。|
|141|环形链表|（看注释）|
|21|合并两个有序链表| |
|203|移除链表元素||
|234|回文链表||

### 4. 链表（middle)
|编号| 题目        |思路|
|--------: | --------  |--------: |
|24 | 两两交换链表中的节点| （看注释）|
|328|奇偶链表|（看注释）|
|148|排序链表||
|147|对链表进行插入排序||	

### 5. 字符串 （essay)
|编号| 题目        |思路|
|--------: | --------  |:-------- |
|709 | 转换成小写字母|（看注释）|
|344| 反转字符串|原char数组倒序循环，放在新char数组中|
|657|机器人能否返回原点|（看注释）|
|557|反转字符串中的单词 III||
|520|检测大写字母||
### 6. 字符串 （middle)
|编号| 题目        |思路|
|--------: | --------  |--------: |
| | | |

### 7. twopoint （essay)
|编号| 题目        |思路|
|--------: | --------  |:--------|
| 349| 两个数组的交集 | 看源码 |
| 350| 两个数组的交集 II| 看源码 |
|345|反转字符串中的元音字母||
|125|验证回文串||

### 8. twopoint （middle)
|编号| 题目        |思路|
|--------: | --------  |:--------|
|80|删除排序数组中的重复项 II|

### 9. hash （essay)
|编号| 题目        |思路|
|--------: | --------  |--------: |
|136|只出现一次的数字|哈希表 or 位运算 |
|771|宝石与石头||
|28| 实现strStr()|

### 10. 字符串 （middle)
|编号| 题目        |思路|
|--------: | --------  |--------: |
| 75|颜色分类 |排序|

### 11. DP 
|编号| 题目        |思路|
|--------: | --------  |--------: |
|70|爬楼梯||
		

### other 
|编号| 题目        |思路|
|--------: | --------  |--------: |
|844|比较含退格的字符串|stack or point|
|704|二分查找| |
|654| 最大二叉树| |
|104| 二叉树的最大深度| |
|110| 平衡二叉树||
|226| 翻转二叉树||
|617| 合并二叉树||
|155| 最小栈||
|108| 将有序数组转换为二叉搜索树||
|513|找树左下角的值||
|429|N叉树的层序遍历||
|102|二叉树的层次遍历||
|107|二叉树的层次遍历 II||
|515|在每个树行中找最大值||
|894|所有可能的满二叉树||__`**``**`__
|114| 二叉树展开为链表||
|637| 二叉树的层平均值||
|199|二叉树的右视图||
|100|相同的树||
|46|全排列||
|112|路径总和||
|342|4的幂||
|231|2的幂||
|106|从中序与后序遍历序列构造二叉树||
|105|从前序与中序遍历序列构造二叉树||
|109|有序链表转换二叉搜索树||
|860|柠檬水找零||
|455|分发饼干||
|392|判断子序列||
|763|划分字母区间||
|690|员工的重要性||
|103|二叉树的锯齿形层次遍历|bfs|
|111| 二叉树的最小深度|bfs|
|207|课程表|bfs,拓扑排序|
|210|课程表 II|bfs,拓扑排序|
|938| 二叉搜索树的范围和|dfs|

		
###  剑指offer
|编号| 题目        |思路|
|--------: | --------  |--------: |
| |二维数组中的查找| |
| |替换空格| |
| |从尾到头打印链表| |
| |跳台阶||
| |斐波那契数列|
| |矩形覆盖||
| |变态跳台阶||
||调整数组顺序使奇数位于偶数前面||
||链表中倒数第k个结点||
||反转链表||
||合并两个排序的链表||
||树的子结构||
||二叉树的镜像||
||最小栈||
||栈的压入，弹出序列||




