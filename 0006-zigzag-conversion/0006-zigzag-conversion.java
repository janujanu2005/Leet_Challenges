class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows) return s;
        StringBuilder[] row=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++) row[i]=new StringBuilder();
        int cRow=0;
        boolean down=false;
        for(char c:s.toCharArray())
        {
            row[cRow].append(c);
            if(cRow==0 || cRow==numRows-1)  down=!down;
            cRow+= down? 1:-1;
        }
        StringBuilder sb=new StringBuilder();
        for(StringBuilder r:row) sb.append(r);
        return sb.toString();
    }
}