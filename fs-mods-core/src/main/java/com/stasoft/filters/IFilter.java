package com.stasoft.filters;

import com.stasoft.models.Mod;
import com.stasoft.params.FilterParams;

import java.util.List;

public interface IFilter {
    List<Mod> filter(FilterParams filterParams);
}
