class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c=mergeArr(nums1, nums2);
        int n=c.length;
        if(n%2==0)  return (c[n/2 - 1] + c[n/2])/2.0;
        else return c[n/2];
    }

    public static int[] mergeArr(int[] nums1, int[] nums2)
    {
        int n=nums1.length;
        int m=nums2.length;
        int[] c=new int[n+m];
        int i = 0, j = 0, k = 0;
    
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j])
                c[k++] = nums1[i++];
            else
                c[k++] = nums2[j++];
        }
        
        while (i < n) c[k++] = nums1[i++];
        while (j < m) c[k++] = nums2[j++];
        return c;
    }
}