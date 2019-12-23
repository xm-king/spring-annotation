package com.xiangmin.custom;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/8/22
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.xiangmin.bean.Color","com.xiangmin.bean.Blue","com.xiangmin.bean.Green"};
    }
}
