public static String reverseString(String str)
{
    String inputString = str;
    StringBuilder builder = new StringBuilder();
    
    if(str == null)
        return null;
    
    for(int i = inputString.length() - 1; i >= 0; i--)
        builder.append(inputString.charAt(i));
    
    return builder.toString();
}