package com.jh3.springmvc.layout;


import com.jh3.springmvc.domain.TrampolineHall;

import java.util.Set;


public interface TrampolineHallService {

    public Set<TrampolineHall> getAll();

    public TrampolineHall getByName(String name);
}
