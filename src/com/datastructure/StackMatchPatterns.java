package com.datastructure;

import java.util.*;

public class StackMatchPatterns {

    private static final Map<Character, Character> matchingParamMap = new HashMap<>();
    private static final Set<Character> openingParamSet = new HashSet<>();

    static {
        matchingParamMap.put('(', ')');
        matchingParamMap.put('{', '}');
        matchingParamMap.put('[', ']');
        openingParamSet.addAll(matchingParamMap.values());
    }

    public boolean hasMatchingParans(String input){

        Stack<Character> paranStack = new Stack<>();

        for(int i=0; i<input.length(); i++){
            Character character = input.charAt(i);
            if(openingParamSet.contains(character)){
                try {
                    paranStack.push(character);
                } catch (StackOverflowException e) {
                    e.printStackTrace();
                }
            }
            if(matchingParamMap.containsKey(character)){

            }
        }
        return false;
    }
}
