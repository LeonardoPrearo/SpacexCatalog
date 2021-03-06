package com.example.spacexcatalog.BLL.Mapper.Abstraction;

import java.util.List;

public interface GenericResponseMapper <E,D>{

    D asDTO (E entity);

    List<D> asDTOList (List<E> entities);
}
