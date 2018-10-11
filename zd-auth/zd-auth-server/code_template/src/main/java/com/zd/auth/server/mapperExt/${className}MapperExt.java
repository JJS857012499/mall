<#include"/java_copyright.include">
<#assign className=table.className>
<#assign classNameLower=className?uncap_first>
        package ${basepackage}.mapperExt;
        {basepackage}.entity.${className};

public interface ${className}MapperExt {

	${className} selectByPrimaryKeyWithCache(${table.idColumn.javaType} ${table.idColumn.columnNameFirstLower});

    List<${className}> select${className}List(${className} ${table.classNameFirstLower});

    List<${className}> select${className}ListPage(${className} ${table.classNameFirstLower}, RowBounds rowBounds);

}
