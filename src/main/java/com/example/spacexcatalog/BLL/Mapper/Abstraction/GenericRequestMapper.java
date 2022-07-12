package com.example.spacexcatalog.BLL.Mapper.Abstraction;

import java.util.List;

public interface GenericRequestMapper <E,D>{

    E asEntity (D dto);

    List<E> asEntityList (List<D> entities);
}
