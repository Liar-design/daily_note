import java.util.Arrays;

/*
 * @Author: Rooter
 * @Date: 2022-03-29 22:48:54
 * @LastEditors: Rooter
 * @LastEditTime: 2022-03-30 22:46:33
 */
/**
 * 给你一个整数数组 citations ，其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。
 * 根据维基百科上 h 指数的定义：h 代表“高引用次数”，一名科研人员的 h指数是指他（她）的 （n 篇论文中）总共有 h 篇论文分别被引用了至少 h 次。且其余的 n - h 篇论文每篇被引用次数 不超过 h 次。
 * 如果 h 有多种可能的值，h 指数 是其中最大的那个。
 * 
 * 输入：citations = [3,0,6,1,5] [0,1,3,5,6]
 * 输出：3 
 * 解释：给定数组表示研究者总共有 5 篇论文，每篇论文相应的被引用了 3, 0, 6, 1, 5 次。
 * 由于研究者有 3 篇论文每篇 至少 被引用了 3 次，其余两篇论文每篇被引用 不多于 3 次，所以她的 h 指数是 3。
 * 
 * 输入：citations = [1,3,1] [1,1,3]
 * 输出：1
 */
public class HIndex {
    public static int hIndex(int[] citations) {
                Arrays.sort(citations);
                int h = 0, i = citations.length - 1; 
                while (i >= 0 && citations[i] > h) {
                    h++; 
                    i--;
                }
                return h;
            }
    public static void main(String[] args) {
        int[] nums = {1,3,1};
        System.out.println(hIndex(nums));
    }
}