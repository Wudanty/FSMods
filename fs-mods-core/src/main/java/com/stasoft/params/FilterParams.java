package com.stasoft.params;

import com.stasoft.enums.MachineType;

import java.util.List;

public class FilterParams {
    private List<ITag> tags;

    public static void main(String[] args){
        ITag itag = MachineType.ANIMAL;
        System.out.println(itag.getClass().getSimpleName());
    }
}
