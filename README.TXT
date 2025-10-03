24. A HashMap is a data structure that stores key-value pairs.
It allows you to quickly look up a value using its key.
25. HashMap<String?, Integer>
26. size()
27. public void enterNumber(String name, String number)
    {
        map.put(name, number);
    }
    
    public String lookupNumber(String name)
    {
        return map.get(name);
    }
28. The new value replaces the old value for that key
29. Both key-value pairs are stored seperately in the map
30. public boolean detectKey()
    {
        if (map.containsKey("Heh")) {
            System.out.println("Key exists");
            return true;
        }else{
            System.out.println("Key does not exist");
            return false;
        }
    }
31. returns null
32. for (String key : map.keySet())
{
    System.out.println(key);
}
33. 