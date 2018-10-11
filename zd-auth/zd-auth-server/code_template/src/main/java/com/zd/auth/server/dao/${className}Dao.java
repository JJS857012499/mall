import org.springframework.stereotype.Repository;

<#include"/java_copyright.include">
        <#assign className=table.className>
        <#assign classNameLower=className?uncap_first>
        package ${basepackage}.dao;
        {basepackage}.entity.${className};
        {basepackage}.mapper.${className}Mapper;
        {basepackage}.mapperExt.${className}MapperExt;

@Repository
public class ${className}Dao {
	
	@Autowired
    private ${className}Mapper ${classNameLower}Mapper;
	
	@Autowired
    private ${className}MapperExt ${classNameLower}MapperExt;
	
	public int insertSelective(${className} ${table.classNameFirstLower}){
		return ${classNameLower}Mapper.insertSelective(${table.classNameFirstLower});
	}
	
	public ${className} selectByPrimaryKey(${table.idColumn.javaType} ${table.idColumn.columnNameFirstLower}){
		return ${classNameLower}Mapper.selectByPrimaryKey(${table.idColumn.columnNameFirstLower});
	}

	public ${className} selectByPrimaryKeyWithCache(${table.idColumn.javaType} ${table.idColumn.columnNameFirstLower}){
		return ${classNameLower}MapperExt.selectByPrimaryKeyWithCache(${table.idColumn.columnNameFirstLower});
	}
	
	public int updateByPrimaryKeySelective(${className} ${table.classNameFirstLower}){
		return ${classNameLower}Mapper.updateByPrimaryKeySelective(${table.classNameFirstLower});
	}

	/**
	 * 根据${table.classNameFirstLower}对象中的不为空的属性值作为条件进行 and 的查询
	 * 
	 * @param ${table.classNameFirstLower}
	 * @return
	 */
	public List<${className}> select${className}List(${className} ${table.classNameFirstLower}){
		return ${classNameLower}MapperExt.select${className}List(${table.classNameFirstLower});
	}

	/**
	 * 根据${table.classNameFirstLower}对象中的不为空的属性值作为条件进行 and 的分页查询
	 * 
	 * @param ${table.classNameFirstLower}
	 * @param rowBounds
	 * @return
	 */
	public List<${className}> select${className}ListPage(${className} ${table.classNameFirstLower}, RowBounds rowBounds){
		return ${classNameLower}MapperExt.select${className}ListPage(${table.classNameFirstLower}, rowBounds);
	}
	
}
