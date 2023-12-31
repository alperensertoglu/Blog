package com.alperensertoglu.alperensertoglu.mapper;

import com.alperensertoglu.alperensertoglu.dto.request.CategorySaveRequestDto;
import com.alperensertoglu.alperensertoglu.repository.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICategoryMapper {

    ICategoryMapper INSTANCE = Mappers.getMapper(ICategoryMapper.class);

    Category fromDto(final CategorySaveRequestDto dto);

    CategorySaveRequestDto fromCategory(final Category category);
}
